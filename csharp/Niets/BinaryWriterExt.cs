using System.IO;

namespace Niets
{
    static class BinaryWriterExt
    {
        public static void WriteBigEndian24(this BinaryWriter bw, int n)
        {
            bw.Write((byte)(n >> 16));
            bw.Write((byte)(n >> 8));
            bw.Write((byte)(n));
        }

        public static void WriteBigEndian16(this BinaryWriter bw, int n)
        {
            bw.Write((byte)(n >> 8));
            bw.Write((byte)(n));
        }
    }
}