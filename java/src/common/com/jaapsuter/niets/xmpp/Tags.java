// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets.xmpp;

import com.jaapsuter.niets.Assert;

public final class Tags {

    public static final int List = 0xf8;
    public static final int LongList = 0xf9;
    public static final int Jid = 0xfa;
    public static final int Unknown = 0xfb;
    public static final int String = 0xfc;
    public static final int LongString = 0xfd;
    public static final int Extended = 0xfe;

    public static int EnsureValid(int i) {
        Assert.IsTrue(i >= List && i <= Extended && i != Unknown, "Invalid binary tag in Xmpp: " + Integer.toHexString(i));
        return i;
    }

    private Tags() {}
}
