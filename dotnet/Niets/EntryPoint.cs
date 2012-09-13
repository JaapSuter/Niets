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
        private static void Main(string[] args)
        {
            FunXmppTest.Run();

            TestSaslMD5();
            
            using (var tc = new TcpClient())
            {
                const string host = "bin-short.whatsapp.net";
                const int port = 5222;
            
                tc.Connect(host, port);

                using (var ns = tc.GetStream())
                {
                    var
                    data = FunXmpp.Encode("<stream:stream to='s.whatsapp.net' resource='iPhone-2.8.2-5222'/>", prefixLength: true, prefixWhatsAppHeader: true);
                    ns.Write(data, 0, data.Length);
                    data = FunXmpp.Encode("<stream:features><receipt_acks /></stream:features>", prefixLength: true);
                    ns.Write(data, 0, data.Length);                    
                    data = FunXmpp.Encode("<auth xmlns='urn:ietf:params:xml:ns:xmpp-sasl' mechanism='DIGEST-MD5-1' />", prefixLength: true);
                    ns.Write(data, 0, data.Length);

                    const int lenSizeInBytes = 2;
                    using (var ms = new MemoryStream())
                    using (var br = new BinaryReader(ms))
                    {
                        for (int i = 0; i < 6; ++i)
                        {
                            ms.SetLength(lenSizeInBytes);
                            ns.Read(ms.GetBuffer(), 0, lenSizeInBytes);

                            int len = br.ReadBigEndian16();
                            ms.SetLength(len);
                            ms.Position = 0;
                            ns.Read(ms.GetBuffer(), 0, len);
                            var recv = FunXmpp.Decode(ms.ToArray());
                            Console.WriteLine(recv);

                            var xe = Xmpp.Parse(recv).Root;
                            if (xe.Name.LocalName == "challenge")
                            {
                                var challenger = Encoding.UTF8.GetString(Convert.FromBase64String(xe.Value));
                                var parameters = challenger.Split(',').Select(x => x.Split('=')).ToDictionary(x => x[0], x => x[1].Trim('"'));
                                
                                var username = "61416905612";
                                var cnonce = Guid.NewGuid().ToString();
                                var realm = "s.whatsapp.net";
                                var imei = "603938931484000";
                                var nonce = parameters["nonce"];
                                var nc = "00000001";
                                var qop = parameters["qop"];
                                var password = Xmpp.Hexlify(MD5.Create().ComputeHash(imei.Reverse().Select(c => (byte)c).ToArray()));

                                var challengee = ResponseForSaslMD5(username, cnonce, realm, password, nonce, nc, qop);
                                challengee = Convert.ToBase64String(Encoding.UTF8.GetBytes(challengee));

                                data = FunXmpp.Encode(String.Format("<response xmlns='urn:ietf:params:xml:ns:xmpp-sasl'>{0}</response>", challengee), prefixLength: true);
                                ns.Write(data, 0, data.Length);
                            }
                        }
                    }
                }
            }
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

