package cryptix.sasl;

// $Id: SaslUtil.java,v 1.2 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.
//
// This product includes software developed by Tom Wu and Eugene Jhong for the
// SRP Distribution (http://srp.stanford.edu/srp/).
//
// Copyright (c) 1997-1999  The Stanford SRP Authentication Project.
// All Rights Reserved.
//
// Please see LICENSE.SRP for a copy of the license for this software.

import java.math.BigInteger;
import java.security.MessageDigest;
import javax.security.sasl.SaslException;

/**
 *
 *
 * @version $Revision: 1.2 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public class SaslUtil
   implements SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   public static final char[] TABLE =
      "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz./"
      .toCharArray();

   // Constructor(s)
   // -------------------------------------------------------------------------

   private SaslUtil()
   {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   /* From the Cryptix 3.1 ArrayUtil class */
   public static boolean
   areEqual
      (
         byte[] a,
         byte[] b
      )
   {
      int aLength = a.length;
      if (aLength != b.length)
         return false;

      for (int i = 0; i < aLength; i++)
         if (a[i] != b[i])
            return false;

      return true;
   }

   public static boolean
   validEmailAddress
      (
         String address
      )
   {
      // need to do better than this
      return (address.indexOf("@") != -1);
   }

   // Base64 methods
   // -------------------------------------------------------------------------

   public static String
   tob64
      (
         byte[] buffer
      )
   {
      boolean notleading = false;
      int len = buffer.length, pos = len % 3, c;
      byte b0 = 0, b1 = 0, b2 = 0;
      StringBuffer sb = new StringBuffer();

      switch(pos)
      {
         case 1:
            b2 = buffer[0];
            break;
         case 2:
            b1 = buffer[0];
            b2 = buffer[1];
            break;
      }

      do
      {
         c = (b0 & 0xfc) >>> 2;
         if (notleading || c != 0)
         {
           sb.append(TABLE[c]);
           notleading = true;
         }
         c = ((b0 & 3) << 4) | ((b1 & 0xf0) >>> 4);
         if (notleading || c != 0)
         {
           sb.append(TABLE[c]);
           notleading = true;
         }

         c = ((b1 & 0xf) << 2) | ((b2 & 0xc0) >>> 6);
         if (notleading || c != 0)
         {
           sb.append(TABLE[c]);
           notleading = true;
         }

         c = b2 & 0x3f;
         if (notleading || c != 0)
         {
           sb.append(TABLE[c]);
           notleading = true;
         }

         if (pos >= len)
           break;
         else
           try
           {
             b0 = buffer[pos++];
             b1 = buffer[pos++];
             b2 = buffer[pos++];
           }
           catch (ArrayIndexOutOfBoundsException e)
           {
             break;
           }
      } while (true);

      if (notleading)
        return sb.toString();
      else
        return "0";
   }

   public static byte[]
   fromb64
      (
         String str
      )
      throws NumberFormatException
   {
      int len = str.length();
      if (len == 0)
         throw new NumberFormatException("Empty Base64 string");

      byte[] a = new byte[len + 1];
      char c;
      int i, j;

      for(i = 0; i < len; ++i)
      {
         c = str.charAt(i);
         try
         {
            for(j = 0; c != TABLE[j]; ++j)
               ;
         }
         catch(Exception e)
         {
            throw new NumberFormatException("Illegal Base64 character");
         }

         a[i] = (byte) j;
      }

      i = len - 1;
      j = len;
      try
      {
         while(true)
         {
            a[j] = a[i];
            if(--i < 0)
               break;

            a[j] |= (a[i] & 3) << 6;
            --j;
            a[j] = (byte)((a[i] & 0x3c) >>> 2);
            if(--i < 0)
               break;

            a[j] |= (a[i] & 0xf) << 4;
            --j;
            a[j] = (byte)((a[i] & 0x30) >>> 4);
            if(--i < 0)
               break;

            a[j] |= (a[i] << 2);

            // Nasty, evil bug in Microsloth's Java interpreter under
            // Netscape:  The following three lines of code are supposed
            // to be equivalent, but under the Windows NT VM (Netscape3.0)
            // using either of the two commented statements would cause
            // the zero to be placed in a[j] *before* decrementing j.
            // Weeeeird.
            a[j-1] = 0;
            --j;

            // a[--j] = 0;
            // --j; a[j] = 0;
            if(--i < 0)
               break;
         }
      }
      catch (Exception ignored)
      {
      }

      try
      {
         while(a[j] == 0)
            ++j;
      }
      catch (Exception e)
      {
         return new byte[1];
      }

      byte[] result = new byte[len - j + 1];
      System.arraycopy(a, j, result, 0, len - j + 1);

      return result;
   }

   // Visualisation methods
   // -------------------------------------------------------------------------

   /**
    * Treats the input as the MSB representation of a number, and lop off
    * leading zero elements. For efficiency, the input is simply returned if no
    * leading zeroes are found.
    *
    * @param in the byte array to trim.
    * @return the byte array with no leading 0-bytes.
    */
   public static byte[]
   trim
      (
         BigInteger n
      )
   {
      byte[] in = n.toByteArray();
      if(in.length == 0 || in[0] != 0)
         return in;

      int len = in.length;
      int i = 1;
      while(in[i] == 0 && i < len)
         ++i;

      byte[] ret = new byte[len - i];
      System.arraycopy(in, i, ret, 0, len - i);
      return ret;
   }

   /**
    * Returns a hexadecimal dump of the trimmed bytes of a BigInteger.
    *
    * #param x the BigInteger to display.
    * @return the string representation of the BigInteger.
    */
   public static final String dump(BigInteger x) {
      return dumpString(SaslUtil.trim(x));
   }

   /** Returns the context of the designated hash as a string. */
   public static final String dump(MessageDigest md) {
      String result;
      try {
//         byte[] result = ((MessageDigest) sha.clone()).digest();
//         cat.debug("=== hash --"+title+": "+SaslUtil.dumpString(result));
         result = dumpString(((MessageDigest) md.clone()).digest());
      } catch (Exception ignored) {
         result = "...";
      }

      return result;
   }

   // from cryptix.util.core.Hex
   // -------------------------------------------------------------------------

   /**
    * Dump a byte array as a string, in a format that is easy to read for
    * debugging. The string <i>m</i> is prepended to the start of each line.<p>
    *
    * If offset and length are omitted, the whole array is used. If m is omitted,
    * nothing is prepended to each line.
    *
    * @param data the byte array to be dumped
    * @param offset the offset within <i>data</i> to start from
    * @param length the number of bytes to dump
    * @param m a string to be prepended to each line
    * @return a String containing the dump.
    */
   public static String
   dumpString
      (
         byte[] data,
         int offset,
         int length,
         String m
      )
   {
      if (data == null)
         return m + "null\n";

      StringBuffer sb = new StringBuffer(length * 3);
      if (length > 32)
         sb.append(m).append("Hexadecimal dump of ").append(length).append(" bytes...\n");

      // each line will list 32 bytes in 4 groups of 8 each
      int end = offset + length;
      String s;
      int l = Integer.toString(length).length();
      if (l < 4)
         l = 4;
      for ( ; offset < end; offset += 32) {
         if (length > 32) {
            s = "         " + offset;
            sb.append(m).append(s.substring(s.length()-l)).append(": ");
         }

         int i = 0;
         for ( ; i < 32 && offset + i + 7 < end; i += 8)
            sb.append(toString(data, offset + i, 8)).append(' ');

         if (i < 32)
            for ( ; i < 32 && offset + i < end; i++)
               sb.append(byteToString(data[offset + i]));

         sb.append('\n');
      }
      return sb.toString();
   }

   public static String
   dumpString
      (
         byte[] data
      )
   {
      return (data == null) ? "null\n" : dumpString(data, 0, data.length, "");
   }

   public static String
   dumpString
      (
         byte[] data,
         String m
      )
   {
      return (data == null) ? "null\n" : dumpString(data, 0, data.length, m);
   }

   public static String
   dumpString
      (
         byte[] data,
         int offset,
         int length
      )
   {
      return dumpString(data, offset, length, "");
   }

   private static final char[] hexDigits =
      { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };

   /**
    * Returns a string of hexadecimal digits from a byte array. Each byte is
    * converted to 2 hex symbols.<p>
    *
    * If offset and length are omitted, the whole array is used.
    */
   public static String
   toString
      (
         byte[] ba,
         int offset,
         int length
      )
   {
      char[] buf = new char[length * 2];
      int j = 0;
      int k;
      for (int i = offset; i < offset + length; i++)
      {
         k = ba[i];
         buf[j++] = hexDigits[(k >>> 4) & 0x0F];
         buf[j++] = hexDigits[ k        & 0x0F];
      }
      return new String(buf);
   }

   public static String
   toString
      (
         byte[] ba
      )
   {
      return toString(ba, 0, ba.length);
   }

   /**
    * Returns a string of 2 hexadecimal digits (most significant digit first)
    * corresponding to the lowest 8 bits of <i>n</i>.
    */
   public static String
   byteToString
      (
         int n
      )
   {
      char[] buf = { hexDigits[(n >>> 4) & 0x0F], hexDigits[n & 0x0F] };
      return new String(buf);
   }
}