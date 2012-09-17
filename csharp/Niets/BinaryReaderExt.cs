using System.IO;

namespace Niets
{
    static class BinaryReaderExt
    {
        public static int ReadBigEndian24(this BinaryReader br)
        {
            return (br.ReadByte() << 16) | (br.ReadByte() << 8) | br.ReadByte();
        }

        public static int ReadBigEndian16(this BinaryReader br)
        {
            return (br.ReadByte() << 8) | br.ReadByte();
        }

        public static int PeekByte(this BinaryReader br)
        {
            var ret = br.ReadByte();
            br.BaseStream.Seek(-1, SeekOrigin.Current);
            return ret;
        }
    }
}