// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

public final class Assert {

    public static void IsTrue(boolean b, String message)
    {
        if (!b)
            Throw(message);
    }

    public static void Fail(Exception e)
    {
        Throw(e.getMessage());
    }

    public static void Equal(Object lhs, Object rhs)
    {
        if (lhs == null && rhs == null)
            return;
        if (lhs != null && lhs.equals(rhs))
            return;

        Throw("Objects not equal: " + (lhs == null ? "null" : lhs.toString()) + " != "
                                    + (rhs == null ? "null" : rhs.toString()) + " != " );
    }

    private static void Throw(String message)
    {
        try
        {
            throw new Throwable();
        }
        catch (Throwable t)
        {
            message = "Assert failure: " + message;
            System.out.println(message);
            t.printStackTrace();
            throw new Error(message);
        }
    }

    private Assert() {}

}
