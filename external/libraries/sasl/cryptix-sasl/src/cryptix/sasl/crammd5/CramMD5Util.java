package cryptix.sasl.crammd5;

// $Id: CramMD5Util.java,v 1.2 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslUtil;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import javax.security.sasl.SaslException;

/**
 * A CRAM-MD5-specific utility class.
 *
 * @version $Revision: 1.2 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class CramMD5Util
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   private CramMD5Util()
   {
      // static methods only
   }

   // Class methods
   // -------------------------------------------------------------------------

   static byte[]
   createMsgID()
   {
      // <process-ID.clock@hostname>
      StringBuffer buf = new StringBuffer();
      String encoded = SaslUtil.tob64(Thread.currentThread().getName().getBytes());
      buf.append("<"+encoded.substring(0, encoded.length())+".");
      buf.append(String.valueOf(System.currentTimeMillis())+"@");
      String hostname = "localhost";
      try
      {
         hostname = InetAddress.getLocalHost().getHostAddress();
      }
      catch (UnknownHostException ignored)
      {
      }

      return buf.append(hostname+">").toString().getBytes();
   }

   static byte[]
   createHMac
      (
         char[] passwd,
         byte[] data
      )
      throws SaslException
   {
      try
      {
         byte[] password = (new String(passwd)).getBytes();
         SecretKeySpec k = new SecretKeySpec(password,"HMACwithMD5");
         Mac mac = Mac.getInstance("HMAC-MD5");
         mac.init(k);
         mac.update(data);

         return mac.doFinal();
      }
      catch (NoSuchAlgorithmException e)
      {
         throw new SaslException("createHMac()", e);
      }
      catch (InvalidKeyException e)
      {
         throw new SaslException("createHMac()", e);
      }
   }
}