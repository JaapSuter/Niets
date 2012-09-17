package com.jaapsuter.niets;

public class Assert {

    public static void Equal(Object lhs, Object rhs)
    {
        if (lhs == null && rhs == null)
            return;
        if (lhs != null && lhs.equals(rhs))
            return;

        throw new Error("Test failure...");
    }

    private Assert() {}

}
