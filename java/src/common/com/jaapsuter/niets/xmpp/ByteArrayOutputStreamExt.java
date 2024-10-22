// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
package com.jaapsuter.niets.xmpp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class ByteArrayOutputStreamExt extends ByteArrayOutputStream {

    public ByteArrayOutputStreamExt()
    {

    }

    private void writeBigEndian16(OutputStream output, int n) throws IOException {
        output.write((byte) (n >> 8));
        output.write((byte) (n));
    }

    public void writeBigEndian24(OutputStream output, int n) throws IOException {
        output.write((byte)(n >> 16));
        output.write((byte)(n >> 8));
        output.write((byte)(n));
    }


}
