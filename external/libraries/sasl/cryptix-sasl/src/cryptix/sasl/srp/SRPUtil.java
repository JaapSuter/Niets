package cryptix.sasl.srp;

// $Id: SRPUtil.java,v 1.3 2001/06/24 12:13:02 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslUtil;

/**
 * A SRP-specific utility class.
 *
 * @version $Revision: 1.3 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public class SRPUtil
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Trivial private constructor to enforce Singleton pattern. */
   private SRPUtil() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   static final byte[] xor(byte[] b1, byte[] b2, int length) {
      byte[] result = new byte[length];
      for(int i = 0; i < length; ++i)
         result[i] = (byte) (b1[i] ^ b2[i]);

      return result;
   }

   /**
    * Returns a string representing the decimal value of an integer
    * identifying the message digest algorithm to use for the SRP
    * computations.
    *
    * @param mdName the canonical name of a message digest algorithm.
    * @return a string representing the decimal value of an ID for that
    * algorithm.
    */
   static final String nameToID(String mdName) {
      if (SRPParams.SRP_SHA_NAME.equals(mdName))
         return "0";
      else if (SRPParams.SRP_SHA1_NAME.equals(mdName))
         return "0";
      else if (SRPParams.SRP_SHA_160_NAME.equals(mdName))
         return "0";
      else if (SRPParams.SRP_MD5_NAME.equals(mdName))
         return "1";
      else if (SRPParams.SRP_RIPEMD_128_NAME.equals(mdName))
         return "2";
      else if (SRPParams.SRP_RIPEMD_160_NAME.equals(mdName))
         return "3";
      else if (SRPParams.SRP_SHA_256_NAME.equals(mdName))
         return "4";
      else if (SRPParams.SRP_SHA_384_NAME.equals(mdName))
         return "5";
      else if (SRPParams.SRP_SHA_512_NAME.equals(mdName))
         return "6";

      return "0";
   }

   // TODO: re-visit. implement a Proxy to hide provider specifics.
   /**
    * Returns a string representing the JCE Provider-name for the designated
    * crypto algorithm.
    *
    * @param name a name of a crypto algorithm.
    * @return the string representing provider-specific name/alias.
    */
   static final String toProviderName(String name) {
      if (name == null)
         return "";

      name = name.trim();
      if (SRPParams.HMAC_SHA1.equals(name))
         return "HMAC-SHA";
      else if (SRPParams.HMAC_MD5.equals(name))
         return "HMAC-MD5";
//      else if (SRPParams.HMAC_RIPEMD_160.equals(name))
//         return "HMAC-RIPEMD160";
      else if (SRPParams.AES.equals(name))
         return "Rijndael";
      else if (SRPParams.CAST5.equals(name))
         return "CAST5";
      else if (SRPParams.BLOWFISH.equals(name))
         return "Blowfish";

      return "";
   }
}