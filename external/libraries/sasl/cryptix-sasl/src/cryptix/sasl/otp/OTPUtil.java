
package cryptix.sasl.otp;

// $Id: OTPUtil.java,v 1.3 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/*
 * Copyright (c) 2001 Invisible Worlds, Inc.  All rights reserved.
 *
 * The contents of this file are subject to the Blocks Public License (the
 * "License"); You may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.invisible.net/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.  See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 */

import javax.security.sasl.SaslException;

/**
 * An OTP-specific utility class.
 *
 * @version $Revision: 1.3 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public class OTPUtil
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Trivial private constructor to enforce Singleton pattern. */
   private OTPUtil()
   {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   static long
   convertBytesToLong
      (
         byte hash[]
      )
   {
      long result = 0L;
      for(int k = 0; k < 8; ++k)
         result = (result << 8) | (hash[k] & 0xff);

      return result;
   }

   static String
   convertBytesToHex
      (
         byte hash[]
      )
   {
      StringBuffer sb = new StringBuffer(16);
      for (int i = 0; i < 8; i++)
      {
         int val = hash[i] & 0xFF;
         if (val < 16)
            sb.append('0');

         sb.append(Integer.toHexString(val));
      }

      return sb.toString();
   }

   static byte[]
   convertLongToBytes
      (
         long l
      )
   {
      byte[] result = new byte[8];
      for (int i = 7; i >= 0; i--)
      {
         result[i] = (byte)(l & 0xFF);
         l >>= 8;
      }

      return result;
   }

   static byte[]
   convertHexToBytes
      (
         String hash
      )
      throws SaslException
   {
      byte[] result = new byte[8];
      if (hash.length() != 16)
         throw new SaslException("Illegal hash" + hash.length());

      for(int i = 0; i < 16; i+=2)
         result[i/2] = (byte) Integer.parseInt(hash.substring(i, i+2), 16);

      return result;
   }
}