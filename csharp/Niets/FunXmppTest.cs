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
    class FunXmppTest
    {
        struct TestData
        {
            public TestData(string xmpp, string fun)
            {
                _Xmpp = xmpp;
                _Fun = fun.Select(c => (byte)c).ToArray();
            }

            public void Run()
            {
                var decoded = FunXmpp.Decode(_Fun);

                var x0 = Xmpp.Parse(_Xmpp).Normalize().ToString();
                var x1 = Xmpp.Parse(decoded).Normalize().ToString();

                Debug.Assert(x0 == x1, String.Format("Error, XML doesn't compare equal:\n{0}\n{1}\n", x0, x1));

                var encoded = FunXmpp.Encode(_Xmpp, prefixLength: false, prefixWhatsAppHeader: false);

                Debug.Assert(_Fun.SequenceEqual(encoded), String.Format("Error, byte-encoded XMPP doesn't compare equal:\n{0}\n{1}\n", _Fun, encoded));

                var recoded = Xmpp.Parse(FunXmpp.Decode(encoded)).Normalize().ToString();

                Debug.Assert(x0 == recoded, String.Format("Error, recoded encoded doesn't compare equal:\n{0}\n{1}\n", x0, recoded));
            }

            private string _Xmpp;
            private byte[] _Fun;            
        }

        private static void Test()
        {
            TestData[] testData = new TestData[]
            {
                new TestData("<foo />", Xmpp.Unhexlify("f801fc03" + Xmpp.Hexlify("foo"))),
                new TestData("<stream:stream from='s.whatsapp.net'/>", "\u00f8\u0003\u0001\u0038\u008a"),
                new TestData("<message to='12345678912@s.whatsapp.net' type='chat' id='1343064803-1'><x xmlns='jabber:x:event'><server /></x><body>Okay</body></message>",
                             "\u00f8\u0008]\u00a0\u00fa\u00fc\u000b12345678912\u008a\u00a2\u001bC\u00fc\u000c1343064803-1\u00f8\u0002\u00f8\u0004\u00ba\u00bdO\u00f8\u0001\u00f8\u0001\u008c\u00f8\u0002\u0016\u00fc\u0004Okay"),
                new TestData("<message from='01234567890@s.whatsapp.net' " +
                                 "id='1339831077-7' " +
                                 "type='chat' " +
                                 "t='1339848755'>" +
                            "<notify xmlns='urn:xmpp:whatsapp' " +
                                    "name='Unicorn' />" +
                            "<request xmlns='urn:xmpp:receipts' />" +
                            "<body>Pqrst</body>" +
                        "</message>",
                        "\u00f8\u000a\u005d\u0038\u00fa\u00fc\u000b01234567890\u008a" +
                                    "\u0043\u00fc\u000c1339831077-7" +
                                    "\u00a2\u001b" +
                                    "\u009d\u00fc\u000a1339848755" +
                            "\u00f8\u0003" +
                                "\u00f8\u0005\u0065\u00bd\u00ae" +
                                            "\u0061\u00fc\u0007Unicorn" +
                                "\u00f8\u0003\u0083\u00bd\u00ad" +
                                "\u00f8\u0002\u0016" +
                                    "\u00fc\u0005Pqrst"),

                       new TestData(String.Format("<message>{0}</message>", new String('x', 255)),
                        String.Format("\u00f8\u0002\u005d\u00fc\u00ff{0}", new String('x', 255))),

                        new TestData(String.Format("<message>{0}</message>", new String('x', 1025)),
                        String.Format("\u00f8\u0002\u005d\u00fd\u0000\u0004\u0001{0}", new String('x', 1025))),

            

                       new TestData("<stream:stream to='s.whatsapp.net' resource='Unicor-n.z.4-8623' />", "\u00f8\u0005\u0001\u00a0\u008a\u0084\u00fc\u0011Unicor-n.z.4-8623"),

                       new TestData("<stream:stream to='s.whatsapp.net' resource='Unicor-n.z.4-8623' />",
                        "\u00f8\u0005\u0001\u00a0\u008a\u0084\u00fc\u0011Unicor-n.z.4-8623"),

                       new TestData("<stream:features><receipt_acks /></stream:features>",
                        "\u00f8\u0002\u0096\u00f8\u0001\u00f8\u0001\u007e"),

                       new TestData("<message to='00622222222@s.whatsapp.net' " +
                                 "type='chat' " +
                                 "id='1343676064-1'>" +
                            "<x xmlns='jabber:x:event'>" +
                                "<server />" +
                            "</x>" +
                            "<body>" +
                                "Hi there!" +
                            "</body>" +
                        "</message>",
                        "\u00f8\u0008]\u00a0\u00fa\u00fc\u000b00622222222\u008a" +
                                 "\u00a2\u001b" +
                                 "C\u00fc\u000c1343676064-1" +
                            "\u00f8\u0002" +
                                "\u00f8\u0004\u00ba\u00bdO" +
                                    "\u00f8\u0001" +
                                        "\u00f8\u0001\u008c" +
                                "\u00f8\u0002\u0016" +
                                    "\u00fc\u0009Hi there!"),
                        
            new TestData("<response xmlns='urn:ietf:params:xml:ns:xmpp-sasl'>dXNlcm5hbWU9IjYxNDE2OTA1NjEyIixyZWFsbT0icy53aGF0c2FwcC5uZXQiLG5vbmNlPSI4MzYxNTU2ODg3MzIiLGNub25jZT0iNWJiMTgxOTktOTRkMy00NjEzLWIzNTUtNGNkZDc4ZjM1NDcxIixuYz0wMDAwMDAwMSxxb3A9YXV0aCxkaWdlc3QtdXJpPSJ4bXBwL3Mud2hhdHNhcHAubmV0IixyZXNwb25zZT00MDFjNzg3NjNiNjcxNTQ3NTdiNDhiYmRiZTRiOGE4ZCxjaGFyc2V0PXV0Zi04</response>",
                         Xmpp.Unhexlify("f80486bda7fd00012864584e6c636d356862575539496a59784e4445324f5441314e6a4579496978795a57467362543069637935336147463063324677634335755a5851694c473576626d4e6c505349344d7a59784e5455324f4467334d7a49694c474e756232356a5a5430694e574a694d5467784f546b744f54526b4d7930304e6a457a4c57497a4e5455744e474e6b5a4463345a6a4d314e44637849697875597a30774d4441774d4441774d53787862334139595856306143786b6157646c6333517464584a7050534a34625842774c334d756432686864484e6863484175626d5630496978795a584e776232357a5a5430304d44466a4e7a67334e6a4e694e6a63784e5451334e5464694e446869596d52695a5452694f4745345a43786a6147467963325630505856305a693034")),
            };

            foreach (var td in testData)
            {
                td.Run();
            }
        }

        public static void Run()
        {
            // Console.Write(FunXmpp.Decode(Unhexlify("f80501a08a84fc116950686f6e652d322e382e322d353232320008f80296f801f8017e0007f8050fbda75a2a").Select(c => (byte)c).ToArray()));
            Test();
        }
    }
}
