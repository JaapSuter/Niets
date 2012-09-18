// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

import java.util.Hashtable;

public class HashtableUtil {

    private HashtableUtil() {}

    public static String get(Hashtable ht, String key) {
        return (String) ht.get(key);
    }
}
