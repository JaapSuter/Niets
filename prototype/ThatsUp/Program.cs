using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Net.Sockets;
namespace ThatsUp
{
    class Program
    {
        static void Main()
        {
            using (var socket = new Socket(SocketType.Stream, ProtocolType.IPv4))
            {
                var endPoint = new DnsEndPoint("bin-short.whatsapp.net", 5222);
                socket.Connect(endPoint);
                socket.Send(Encoding.Unicode.GetBytes("WA\x00\x04"));
                
                streamstart = ET.Element("{http://etherx.jabber.org/streams}stream")
                streamstart.set("to", "s.whatsapp.net")
                streamstart.set("resource", "iPhone-2.8.2-5222")
                self.send(streamstart)

                Console.ReadKey();
            }
        }

        static void NoMain()
        {
            var md5 = MD5.Create();

            var imei = "603938931484000";
            var number = "6045646511";
            number = "6043135227";
            // GET /v1/exist.php?cc=1&in=6043135227&udid=3a65f5bd7256642f90efe085190c038a HTTP/1.1
            var cc = "1";
            var ua = "User-Agent:WhatsApp/2.6.7 iPhone_OS/5.0.1 Device/Unknown_(iPhone4,1)";
            ua = "User-Agent:WhatsApp/2.8.1504 Android/2.3.4 Device/HTC-HTC_Desire";
            ua = "User-Agent:WhatsApp/2.8.3 iPhone_OS/4.2.1 Device/iPhone_3G";
            var udid = Encoding.Default.GetString(md5.ComputeHash(Encoding.Default.GetBytes(imei.Reverse().ToArray())));
            udid = "3a65f5bd7256642f90efe085190c038a";

            var baseUri = new Uri("https://r.whatsapp.net/");
            var relativeUri = String.Format("/v1/exist.php?cc={0}&in={1}&udid={2}", Uri.EscapeDataString(cc), Uri.EscapeDataString(number), Uri.EscapeDataString(udid));
            var req = WebRequest.CreateHttp(new Uri(baseUri, relativeUri));
            req.KeepAlive = true;
            req.ProtocolVersion = HttpVersion.Version11;
            req.Method = "GET";
            req.UserAgent = ua;
            //req.ContentType = "application/x-www-form-urlencoded";
            //req.ContentLength = bytes.Length;

            // Stream reqStream = req.GetRequestStream();
            // reqStream.Write(bytes, 0, bytes.Length);
            // reqStream.Close();
            var response = (HttpWebResponse)req.GetResponse();
            Console.WriteLine(response);
        }
    }
}


// curl --data-urlencode cc="1" --data-urlencode me="+16043135227" --data-urlencode s="Unicornz" -A "WhatsApp/2.6.7 iPhone_OS/5.0.1 Device/Unknown_(iPhone4,1)" -H "Accept: */*" -H "Accept-Language: en-us" -H "Accept-Encoding: gzip, deflate" -L -k -v https://s.whatsapp.net/client/iphone/u.php
// curl --data-urlencode cc="1" --data-urlencode in="16043135227" --data-urlencode udid="abcd" -A "WhatsApp/2.6.7 iPhone_OS/5.0.1 Device/Unknown_(iPhone4,1)" -H "Accept: */*" -H "Accept-Language: en-us" -H "Accept-Encoding: gzip, deflate" -L -k -v https://r.whatsapp.net:443/v1/exist.php
