package cryptix.sasl;

// $Id: SaslParams.java,v 1.6 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * An interface containing constants and canonical names used throughout this
 * SASL implementation.
 *
 * @version $Revision: 1.6 $
 * @since draft-burdis-cat-srp-sasl-04
 */
public interface SaslParams
{
   // SASL data element size limits
   // -------------------------------------------------------------------------

   /**
    * The size limit, in bytes, of a SASL OS (Octet Sequence) element.
    *
    * @since draft-burdis-cat-sasl-srp-04
    */
   int ONE_BYTE_HEADER_LIMIT = 255;

   /**
    * The size limit, in bytes, of both a SASL MPI (Multi-Precision Integer)
    * element and a SASL Text element.
    *
    * @since draft-burdis-cat-sasl-srp-04
    */
   int TWO_BYTE_HEADER_LIMIT = 65535;

   /**
    * The size limit, in bytes, of a SASL EOS (Extended Octet Sequence)
    * element.
    *
    * @since draft-burdis-cat-sasl-srp-04
    */
   int FOUR_BYTE_HEADER_LIMIT = 2147483383;

   /**
    * The size limit, in bytes, of a SASL Buffer.
    *
    * @since draft-burdis-cat-sasl-srp-04
    */
   int BUFFER_LIMIT = 2147483643;

   // Canonical names of SASL mechanisms
   // -------------------------------------------------------------------------

   String ANONYMOUS_MECHANISM = "ANONYMOUS";
   String CRAM_MD5_MECHANISM =  "CRAM-MD5";
   String OTP_MECHANISM =       "OTP";
   String PLAIN_MECHANISM =     "PLAIN";
   String SM2_MECHANISM =       "SM2";
   String SRP_MECHANISM =       "SRP";

   // Canonical names of Message Digest algorithms
   // -------------------------------------------------------------------------

   String SHA_MDA =        "SHA-1";
   String MD5_MDA =        "MD5";
   String RIPEMD_160_MDA = "RIPEMD-160";

   // Canonical names of Integrity Protection algorithms
   // -------------------------------------------------------------------------

   String HMAC_MD5_IALG = "HMACwithMD5";
   String HMAC_SHA_IALG = "HMACwithSHA";

   // Canonical names of Symmetric Block Cipher algorithms
   // -------------------------------------------------------------------------

   String AES_CALG =      "AES";
   String RIJNDAEL_CALG = "Rijndael";
   String TWOFISH_CALG =  "Twofish";

   // Property names
   // -------------------------------------------------------------------------

   /** Name of username property. */
   String USERNAME = "cryptix.sasl.username";

   /** Name of password property. */
   String PASSWORD = "cryptix.sasl.password";

   /** Name of authentication information provider packages. */
   String AUTH_INFO_PROVIDER_PKGS = "crytix.sasl.auth.info.provider.pkgs";
}
