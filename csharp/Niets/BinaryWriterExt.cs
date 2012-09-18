// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
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