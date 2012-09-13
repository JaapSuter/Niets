using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Linq;

namespace Niets
{
    class FunXmpp
    {
        public static byte[] Encode(string xml, bool prefixLength, bool prefixWhatsAppHeader = false)
        {
            var capacityHighEstimate = xml.Length;
            using (var ms = new MemoryStream(capacityHighEstimate))
            using (var bw = new BinaryWriter(ms))
            {
                if (prefixWhatsAppHeader)
                {
                    const byte major = 1;
                    const byte minor = 1;
                    bw.Write((byte)'W');
                    bw.Write((byte)'A');
                    bw.Write(major);
                    bw.Write(minor);
                }

                var prefixLengthPosition = (int)ms.Position;
                if (prefixLength)
                {
                    const int dummyLengthPlaceholder = 0;
                    bw.WriteBigEndian16(dummyLengthPlaceholder);
                }

                var xd = Xmpp.Parse(xml);
                EncodeElement(bw, xd.Root);

                if (prefixLength)
                {
                    const int sizeOfLengthInBytes = 2;
                    bw.Seek(prefixLengthPosition, SeekOrigin.Begin);
                    bw.WriteBigEndian16((int)(ms.Length - (sizeOfLengthInBytes + prefixLengthPosition)));
                }

                return ms.ToArray();
            }
        }

        public static string Decode(byte[] data)
        {
            using (var ms = new MemoryStream(data))
            using (var br = new BinaryReader(ms))            
                return Decode(br);
        }

        private enum Tag : byte
        {
            List = 0xf8,
            LongList = 0xf9,
            String = 0xfc,
            LongString = 0xfd,
            Extended = 0xfe,
            Jid = 0xfa,
        }

        private static void EncodeElement(BinaryWriter bw, XElement xe)
        {
            var attribs = xe.Attributes().ToArray();
            var elems = xe.Elements().ToArray();
            var hasElements = elems.Length > 0;
            var hasText = !hasElements && xe.Value.Length > 0;

            var count = 1 + 2 * attribs.Length + ((hasElements || hasText) ? 1 : 0);

            bw.Write((byte)Tag.List);
            bw.Write((byte)count);
            EncodeString(bw, xe.Name.LocalName);

            foreach (var attrib in attribs)
                EncodeAttribute(bw, attrib);

            if (hasElements)
            {
                EncodeListOrStringPrefix(bw, Tag.List, elems.Length);

                foreach (var elem in elems)
                    EncodeElement(bw, elem);                    
            }
            else if (hasText)
            {
                EncodeString(bw, xe.Value);
            }
        }

        private static void EncodeAttribute(BinaryWriter bw, XAttribute xa)
        {
            EncodeString(bw, xa.Name.LocalName);
            EncodeString(bw, xa.Value);
        }

        private static void EncodeString(BinaryWriter bw, string str)
        {
            byte constant = 0;
            if (_XmppToFun.TryGetValue(str, out constant))
            {
                bw.Write(constant);
            }
            else
            {
                var atIdx = str.IndexOf('@');
                if (atIdx >= 0)
                {
                    EncodeJid(bw, str.Substring(0, atIdx), str.Substring(atIdx + 1));
                }
                else
                {
                    var bytes = Encoding.UTF8.GetBytes(str);
                    EncodeListOrStringPrefix(bw, Tag.String, bytes.Length);
                    bw.Write(bytes);
                }
            }
        }

        private static void EncodeJid(BinaryWriter bw, string node, string domain)
        {
            bw.Write((byte)Tag.Jid);
            EncodeString(bw, node);
            EncodeString(bw, domain);
        }

        private static void EncodeListOrStringPrefix(BinaryWriter bw, Tag tag, int count)
        {
            switch (tag)
            {
                case Tag.List:
                    if (count <= byte.MaxValue)
                    {
                        bw.Write((byte)Tag.List);
                        bw.Write((byte)count);
                    }
                    else
                    {
                        bw.Write((byte)Tag.LongList);
                        bw.WriteBigEndian16(count);
                    }
                    break;
                case Tag.String:
                    if (count <= byte.MaxValue)
                    {
                        bw.Write((byte)Tag.String);
                        bw.Write((byte)count);
                    }
                    else
                    {
                        bw.Write((byte)Tag.LongString);
                        bw.WriteBigEndian24(count);
                    }
                    break;
                default:
                    throw new Exception("EncodeListOrStringPrefix only accepts list and string as its tags.");                    
            }
        }

        private static string Decode(BinaryReader br)
        {
            var tag = br.ReadByte();
            var count = 0;
            switch ((Tag)tag)
            {
                case Tag.List:
                    count = br.ReadByte();
                    return DecodeListOrElement(br, count);
                case Tag.LongList:
                    count = br.ReadBigEndian16();
                    return DecodeListOrElement(br, count);
                case Tag.String:
                    count = br.ReadByte();
                    return Encoding.UTF8.GetString(br.ReadBytes(count));
                case Tag.LongString:
                    count = br.ReadBigEndian24();
                    return Encoding.UTF8.GetString(br.ReadBytes(count));
                case Tag.Jid:
                    return Decode(br) + '@' + Decode(br);
                case Tag.Extended:
                    const byte offset = 0xf5;
                    return DecodeSymbol(br.ReadByte() + offset);
                default:
                    return DecodeSymbol(tag);
            }
        }

        private static string DecodeListOrElement(BinaryReader br, int count)
        {
            var tag = br.PeekByte();
            if (tag == (byte)Tag.List || tag == (byte)Tag.LongList)
            {
                return Enumerable.Range(0, count).Aggregate(String.Empty, (s, i) => s + Decode(br));
            }
            else
            {
                var name = Decode(br);
                var hasChildren = (count % 2) == 0;
                var numAttribs = (count - 1) / 2;

                var sb = new StringBuilder();
                sb.Append('<');
                sb.Append(name);
                
                for (int i = 0; i < numAttribs; ++i)
                {
                    sb.Append(" ");
                    sb.Append(Decode(br));
                    sb.Append("=\"");
                    sb.Append(Decode(br));
                    sb.Append("\"");
                }

                sb.Append('>');

                if (hasChildren)
                    sb.Append(Decode(br));

                sb.Append("</");
                sb.Append(name);
                sb.Append('>');
                
                return sb.ToString();
            }
        }
        
        private static string DecodeSymbol(int b)
        {
            return _FunToXmpp[b];
        }
        
        private static bool ParseProtocolHeader(BinaryReader br, out Version version)
        {
            version = null;

            if (br.ReadChar() != 'W') return false;
            if (br.ReadChar() != 'A') return false;

            var major = br.ReadChar();
            var minor = br.ReadChar();
            var build = br.ReadChar();

            version = new Version(major, minor, build);

            return true;
        }

        private static readonly string[] _FunToXmpp = new string[]
        {
            "invalid:0", "stream:stream", "invalid:2", "invalid:3", "invalid:4", "1", "1.0", "ack",
            "action", "active", "add", "all", "allow", "apple", "audio", "auth", "author",
            "available", "bad-request", "base64", "Bell.caf", "bind", "body", "Boing.caf",
            "cancel", "category", "challenge", "chat", "clean", "code", "composing",
            "config", "conflict", "contacts", "create", "creation", "default", "delay",
            "delete", "delivered", "deny", "DIGEST-MD5", "DIGEST-MD5-1", "dirty", "en",
            "enable", "encoding", "error", "expiration", "expired", "failure", "false",
            "favorites", "feature", "field", "free", "from", "g.us", "get", "Glass.caf",
            "google", "group", "groups", "g_sound", "Harp.caf",
            "http://etherx.jabber.org/streams", "http://jabber.org/protocol/chatstates",
            "id", "image", "img", "inactive", "internal-server-error", "iq", "item",
            "item-not-found", "jabber:client", "jabber:iq:last", "jabber:iq:privacy",
            "jabber:x:delay", "jabber:x:event", "jid", "jid-malformed", "kind", "leave",
            "leave-all", "list", "location", "max_groups", "max_participants",
            "max_subject", "mechanism", "mechanisms", "media", "message", "message_acks",
            "missing", "modify", "name", "not-acceptable", "not-allowed", "not-authorized",
            "notify", "Offline Storage", "order", "owner", "owning", "paid", "participant",
            "participants", "participating", "fail", "paused", "picture", "ping", "PLAIN",
            "platform", "presence", "preview", "probe", "prop", "props", "p_o", "p_t",
            "query", "raw", "receipt", "receipt_acks", "received", "relay", "remove",
            "Replaced by new connection", "request", "resource", "resource-constraint",
            "response", "result", "retry", "rim", "s.whatsapp.net", "seconds", "server",
            "session", "set", "show", "sid", "sound", "stamp", "starttls", "status",
            "stream:error", "stream:features", "subject", "subscribe", "success",
            "system-shutdown", "s_o", "s_t", "t", "TimePassing.caf", "timestamp", "to",
            "Tri-tone.caf", "type", "unavailable", "uri", "url",
            "urn:ietf:params:xml:ns:xmpp-bind", "urn:ietf:params:xml:ns:xmpp-sasl",
            "urn:ietf:params:xml:ns:xmpp-session", "urn:ietf:params:xml:ns:xmpp-stanzas",
            "urn:ietf:params:xml:ns:xmpp-streams", "urn:xmpp:delay", "urn:xmpp:ping",
            "urn:xmpp:receipts", "urn:xmpp:whatsapp", "urn:xmpp:whatsapp:dirty",
            "urn:xmpp:whatsapp:mms", "urn:xmpp:whatsapp:push", "value", "vcard", "version",
            "video", "w", "w:g", "w:p:r", "wait", "x", "xml-not-well-formed", "xml:lang",
            "xmlns", "xmlns:stream", "Xylophone.caf", "account", "digest", "g_notify",
            "method", "password", "registration", "stat", "text", "user", "username",
            "event", "latitude", "longitude", "true", "after", "before", "broadcast",
            "count", "features", "first", "index", "invalid-mechanism", "last", "max",
            "offline", "proceed", "required", "sync", "elapsed", "ip", "microsoft", "mute",
            "nokia", "off", "pin", "pop_mean_time", "pop_plus_minus", "port", "reason",
            "server-error", "silent", "timeout", "lc", "lg", "bad-protocol", "none",
            "remote-server-timeout", "service-unavailable", "w:p", "w:profile:picture",
            "notification"
        };

        private static readonly Dictionary<string, byte> _XmppToFun = new Dictionary<string, byte>();

        static FunXmpp()
        {
            for (int i = 0; i < _FunToXmpp.Length; ++i)
            {
                _XmppToFun[_FunToXmpp[i]] = (byte)i;
                _XmppToFun[_FunToXmpp[i].Replace(Xmpp.NamespaceTrouble, Xmpp.NamespaceSubst)] = (byte)i;
            }
        }
    }
}
