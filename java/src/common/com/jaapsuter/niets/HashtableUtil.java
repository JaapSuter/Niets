package com.jaapsuter.niets;

import java.util.Hashtable;

public class HashtableUtil {

    private HashtableUtil() {}

    public static String get(Hashtable ht, String key) {
        return (String) ht.get(key);
    }
}
