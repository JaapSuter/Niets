package com.jaapsuter.niets.xmpp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class ByteArrayInputStreamExt extends ByteArrayInputStream {

    public ByteArrayInputStreamExt(byte[] bytes)
    {
        super(bytes);
    }

    public int peek() {
        mark(1);
        int ret = read();
        reset();
        return ret;
    }

    public int readBigEndian16() {
        return ((int) read() << 8) | (int) read();
    }

    public int readBigEndian24() {
        return ((int) read() << 16) | ((int) read() << 8) | (int) read();
    }

    public int readTag() {
        return Tags.EnsureValid(read());
    }

    public String readUtf8String(int length) throws IOException, UnsupportedEncodingException {
        byte[] bytes = new byte[length];
        read(bytes);
        return new String(bytes, "UTF-8");
    }
}
