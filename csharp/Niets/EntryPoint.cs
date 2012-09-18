// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Net.Sockets;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Linq;

namespace Niets
{
    class EntryPoint
    {
        private static void Delog(string hex)
        {
            var decoded = FunXmpp.Decode(Xmpp.Unhexlify(hex).Select(c => (byte)c).ToArray());            
            Console.WriteLine(decoded);
        }

        private static void Main(string[] args)
        {
            FunXmppTest.Run();

            TestSaslMD5();

            Delog("f80c5d38fafc0b31363034333133353232378a43fc0c313334373837343539382d32a21b9dfc0a313334373837353833308805f801f8037fbdad");
            Delog("f80774388a942bbdb6");
            Delog("f80b99bda79409523723fc0a3133343638343030333530fc0a31333738333736303335");
            Delog("f80c5d38fafc0b31363034353634363531318a43fc0c313334373932363534352d31a21b9dfc0a3133343739323635333688fc0133f805f80565bdae61fc0f4a6161702042422039333030204857f80383bdadf80216fc054767686879f80825bdab388a92fc14323031322d30392d31385430303a30323a31365a66f805babd4e92fc1132303132303931385430303a30323a3136");
            
            using (var tc = new TcpClient())
            {
                const string host = "bin-short.whatsapp.net";
                const int port = 5222;
            
                tc.Connect(host, port);

                // "WhatsApp/{0} BlackBerryVersion/{1} BlackBerryDevice/{2}"
                using (var ns = tc.GetStream())
                {
                    var
                    data = FunXmpp.Encode("<stream:stream to='s.whatsapp.net' resource='iPhone-2.8.2-5222'/>", prefixLength: true, prefixWhatsAppHeader: true);
                    ns.Write(data, 0, data.Length);
                    data = FunXmpp.Encode("<stream:features><receipt_acks /></stream:features>", prefixLength: true);
                    ns.Write(data, 0, data.Length);                    
                    data = FunXmpp.Encode("<auth xmlns='urn:ietf:params:xml:ns:xmpp-sasl' mechanism='DIGEST-MD5-1' />", prefixLength: true);
                    ns.Write(data, 0, data.Length);

                    using (var ms = new MemoryStream())
                    using (var br = new BinaryReader(ms))
                    {
                        for (int i = 0; i < 6; ++i)
                        {
                            var recv = Receive(ns, ms, br);
                            Console.WriteLine(recv);

                            var xe = Xmpp.Parse(recv).Root;
                            if (xe.Name.LocalName == "challenge")
                            {
                                var challenger = Encoding.UTF8.GetString(Convert.FromBase64String(xe.Value));
                                var parameters = challenger.Split(',').Select(x => x.Split('=')).ToDictionary(x => x[0], x => x[1].Trim('"'));

                                var username = "61416905612"; // "16045646511";
                                var cnonce = "aa7415ff-BA5E-1018-2012-f3f188f6678a"; // Guid.NewGuid().ToString();
                                var realm = "s.whatsapp.net";
                                var imei = "603938931484000"; // "004401136493463"
                                var nonce = parameters["nonce"];
                                var nc = "00000001";
                                var qop = parameters["qop"];
                                var password = Xmpp.Hexlify(MD5.Create().ComputeHash(imei.Reverse().Select(c => (byte)c).ToArray()));

                                var challengee = ResponseForSaslMD5(username, cnonce, realm, password, nonce, nc, qop);
                                challengee = Convert.ToBase64String(Encoding.UTF8.GetBytes(challengee));

                                data = FunXmpp.Encode(String.Format("<response xmlns='urn:ietf:params:xml:ns:xmpp-sasl'>{0}</response>", challengee), prefixLength: true);
                                ns.Write(data, 0, data.Length);

                                recv = Receive(ns, ms, br);
                                Console.WriteLine(recv);
                                recv = Receive(ns, ms, br);
                                Console.WriteLine(recv);
                                recv = Receive(ns, ms, br);
                                Console.WriteLine(recv);

                                data = FunXmpp.Encode(String.Format("<response xmlns='urn:ietf:params:xml:ns:xmpp-sasl'>{0}</response>", challengee), prefixLength: true);
                                ns.Write(data, 0, data.Length);
                                                
                                var deviceMac = "30:69:4B:06:21:C5";
                                var apMac = "00:25:9C:05:C2:E0";                                             
                                var id = "1347906999-1";
                                var dst = "16043135227";
                                var message = "Foobarfoobar";
                                data = FunXmpp.Encode(String.Format("<message id='{0}' to='{1}@s.whatsapp.net' type='chat'><x xmlns='jabber:x:event'><server /></x><body>{2}</body></message>",
                                    id, dst, message), prefixLength: true);
                                ns.Write(data, 0, data.Length);

                                Console.WriteLine(FunXmpp.Decode(data.Skip(2).ToArray()));

                                recv = Receive(ns, ms, br);
                                Console.WriteLine(recv);
                                recv = Receive(ns, ms, br);
                                Console.WriteLine(recv);
                                recv = Receive(ns, ms, br);
                                Console.WriteLine(recv);
                            }
                        }
                    }
                }
            }
        }

        private static string Receive(NetworkStream ns, MemoryStream ms, BinaryReader br)
        {
            const int lenSizeInBytes = 2;
            ms.SetLength(lenSizeInBytes);
            ns.Read(ms.GetBuffer(), 0, lenSizeInBytes);

            

            int len = br.ReadBigEndian16();
            ms.SetLength(len);
            ms.Position = 0;
            ns.Read(ms.GetBuffer(), 0, len);
            var recv = FunXmpp.Decode(ms.ToArray());
            return recv;
        }

        private static void TestSaslMD5()
        {
            var username = "test";
            var cnonce = "05E0A6E7-0B7B-4430-9549-0FE1C244ABAB";
            var realm = "osXstream.local";
            var nonce = "392616736";
            var nc = "00000001";
            var qop = "auth";
            var password = "secret";

            var rspExpected = "37991b870e0f6cc757ec74c47877472b";
            var rspCalculated = ResponseForSaslMD5(username, cnonce, realm, password, nonce, nc, qop);
            Console.WriteLine(rspExpected + "\n" + rspCalculated);
            return;
        }

        private static string ResponseForSaslMD5(string username, string cnonce, string realm, string password, string nonce, string nc, string qop)
        {
            var md5 = MD5.Create();

            var ha1pre = md5.ComputeHash(Encoding.UTF8.GetBytes(String.Format("{0}:{1}:{2}", username, realm, password)));
            var ha1 = md5.ComputeHash(Combine(ha1pre, Encoding.UTF8.GetBytes(String.Format(":{0}:{1}", nonce, cnonce))));
            var ha2 = md5.ComputeHash(Encoding.UTF8.GetBytes(String.Format("AUTHENTICATE:xmpp/{0}", realm)));
            var response = md5.ComputeHash(Encoding.UTF8.GetBytes(String.Format("{0}:{1}:{2}:{3}:{4}:{5}", Xmpp.Hexlify(ha1), nonce, nc, cnonce, qop, Xmpp.Hexlify(ha2))));
            var challengee = String.Format("username={0},nonce={1},digest-uri=xmpp/{2},realm={2},qop={3},cnonce={4},nc=00000001,response={5}",
                username, nonce, realm, qop, cnonce, Xmpp.Hexlify(response));

            return challengee;                                
        }

        private static byte[] Combine( params byte[][] arrays )
        {
            byte[] rv = new byte[ arrays.Sum( a => a.Length ) ];
            int offset = 0;
            foreach ( byte[] array in arrays ) {
                System.Buffer.BlockCopy( array, 0, rv, offset, array.Length );
                offset += array.Length;
            }
            return rv;
        }
    }
}

