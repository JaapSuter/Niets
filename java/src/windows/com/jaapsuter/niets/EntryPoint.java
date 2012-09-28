// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com
package com.jaapsuter.niets;

import java.util.Date;

public class EntryPoint
{
    public static void main(String[] args)
    {
        try {
            Niets.run();

            NetworkThread nt = new NetworkThread("61416905612", "Another message sent at: " + new Date().toString(), new NetworkEventHandler() {
                public void log(String msg) {
                    System.out.println(msg);
                }
            });

            nt.start();
            final int sleepMs = 2234;
            Thread.sleep(sleepMs);
            nt.join();
        }
        catch (Exception e) {
            Assert.IsTrue(false, e.getMessage());
        }
    }
}