// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

import com.jaapsuter.niets.md5.*;
import com.jaapsuter.niets.xmpp.*;

public class Niets {
    public static void run() {
       MD5Sasl.test();
       Decoder.test();       
    }
}
