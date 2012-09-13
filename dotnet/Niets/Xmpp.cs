using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.Linq;
using System.Xml.Schema;

namespace Niets
{
    static class Xmpp
    {
        public const string NamespaceTrouble = ":";
        public const string NamespaceSubst = "_";            
            
        public static XDocument Parse(string xml)
        {
            using (var sr = new StringReader(xml.Replace(NamespaceTrouble, NamespaceSubst)))
            using (var xr = new XmlTextReader(sr) { Namespaces = false, Normalization = false })
            {
                return XDocument.Load(xr);
            }
        }

        public static string Hexlify(string str)
        {
            return Hexlify(Encoding.UTF8.GetBytes(str));
        }

        public static string Hexlify(byte[] bytes)
        {
            return bytes.Select(x => Convert.ToString(x, 16).PadLeft(2, '0')).Aggregate((s, t) => s + t);
        }

        public static string Unhexlify(string hex)
        {
            var len = hex.Length / 2;
            var sb = new StringBuilder(len, len);
            for (int i = 0; i < len; ++i)
                sb.Append((char)Convert.ToByte(hex.Substring(i * 2, 2), 16));
            return sb.ToString();
        }
    }        
}