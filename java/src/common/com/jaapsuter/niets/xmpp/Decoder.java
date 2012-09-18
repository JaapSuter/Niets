package com.jaapsuter.niets.xmpp;

import com.jaapsuter.niets.Assert;
import com.jaapsuter.niets.StringUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;

public final class Decoder {

    public static Object decode(byte[] bytes) throws IOException, UnsupportedEncodingException {
        return decode(new ByteArrayInputStreamExt(bytes));
    }

    private static Object decode(ByteArrayInputStreamExt br) throws IOException, UnsupportedEncodingException {
        int tag = br.read();
        switch (tag)
        {
            case Tags.List:
                return decodeListOrElement(br, br.read());
            case Tags.LongList:
                return decodeListOrElement(br, br.readBigEndian16());
            case Tags.String:
                return br.readUtf8String(br.read());
            case Tags.LongString:
                return br.readUtf8String(br.readBigEndian24());
            case Tags.Jid:
                return decode(br).toString() + '@' + decode(br).toString();
            case Tags.Extended:
                final int offset = 0xf5;
                return Symbols.get(br.read() + offset);
            default:
                return Symbols.get(tag);
        }
    }

    private static Object decodeListOrElement(ByteArrayInputStreamExt br, int count) throws IOException, UnsupportedEncodingException {
        int tag = br.peek();
        if (tag == Tags.List || tag == Tags.LongList)
        {
            Object[] children = new Object[count];
            for (int i = 0; i < count; ++i)
                children[i] = decode(br);
            return children;
        }
        else
        {
            final String name = decode(br).toString();
            final boolean hasChildren = (count % 2) == 0;
            final int numAttribs = (count - 1) / 2;

            Hashtable attribs = new Hashtable();
            Object children = null;

            for (int i = 0; i < numAttribs; ++i)
                attribs.put(decode(br), decode(br));

            if (hasChildren)
                children = decode(br);

            return new Element(name, attribs, children);
        }
    }

    public static void test() {

        try {
            Object obj;
            obj = decode(StringUtil.hexStringToByteArray("f80c5d38fafc0b31363034333133353232378a43fc0c313334373837343539382d32a21b9dfc0a313334373837353833308805f801f8037fbdad"));
            System.out.println(obj);
            obj = decode(StringUtil.hexStringToByteArray("f80774388a942bbdb6"));
            System.out.println(obj);
            obj = decode(StringUtil.hexStringToByteArray("f80b99bda79409523723fc0a3133343638343030333530fc0a31333738333736303335"));
            System.out.println(obj);
            obj = decode(StringUtil.hexStringToByteArray("f80c5d38fafc0b31363034353634363531318a43fc0c313334373932363534352d31a21b9dfc0a3133343739323635333688fc0133f805f80565bdae61fc0f4a6161702042422039333030204857f80383bdadf80216fc054767686879f80825bdab388a92fc14323031322d30392d31385430303a30323a31365a66f805babd4e92fc1132303132303931385430303a30323a3136"));
            System.out.println(obj);
        }
        catch (Exception e) {
            Assert.IsTrue(false, e.getMessage());
        }
    }

    private Decoder() {};
}
