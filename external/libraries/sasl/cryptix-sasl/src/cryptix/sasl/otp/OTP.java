
package cryptix.sasl.otp;

// $Id: OTP.java,v 1.4 2001/06/11 08:20:56 raif Exp $
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

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;

import javax.security.sasl.SaslException;

import org.apache.log4j.Category;

/**
 * A Factory class that returns OTP Singletons that know all OTP-related
 * mathematical computations and protocol-related operations for both the
 * client- and server-sides.
 *
 * @version $Revision: 1.4 $
 */
public final class OTP
   implements OTPParams
{
	// Constants and variables
	// --------------------------------------------------------------------------

	private static Category cat = Category.getInstance(OTP.class);

   /**
    * The map of already instantiated SRP algorithm instances.
    */
   private static final Hashtable algorithms = new Hashtable();

	/**
	 * A source of strong randomness.
	 */
	private static final Random prng = new SecureRandom();

   /* Mechanism-specific stuff here */

	/**
	 * The underlying OTP message digest algorithm.
	 */
	private OTPDigest mda;

	/**
	 * The canonical name of the algorithm specifications of this object.
	 */
	private String otpName;

	// Constructor(s)
	// --------------------------------------------------------------------------

	/**
	 * Trivial private constructor to enforce Singleton pattern.
	 */
	private OTP
      (
         String mdaName,
         OTPDigest mda
      )
	{
		super();

      otpName = "OTP-"+mdaName;
      this.mda = mda;
	}

	// Class methods
	// -------------------------------------------------------------------------

   /**
    * Return an instance of this object that uses the designated message digest
    * algorithm as its digest function.
    *
    * @return an instance of this object for the designated digest name.
    */
   public static OTP
   instance
      (
         String mdaName
      )
   {
      if (mdaName != null)
      {
         mdaName = mdaName.trim();
      }

      if (mdaName == null || mdaName.equals(""))
      {
         mdaName = DEFAULT_DIGEST_NAME;
      }

      OTP result = (OTP) algorithms.get(mdaName);
      if (result == null)
      {
         OTPDigest mda = OTPDigest.getInstance(mdaName);
         result = new OTP(mdaName, mda);
         algorithms.put(mdaName, result);
      }
      return result;
   }

   public static void
   validateAlgorithm
      (
         String algorithm
      )
      throws SaslException
   {
      if (!algorithm.equalsIgnoreCase("MD4") &&
          !algorithm.equalsIgnoreCase("MD5") &&
          !algorithm.equalsIgnoreCase("SHA-1"))
      {
         throw new SaslException("validateAlgorithm: "+ERR_ALGO_UNSUPPORTED);
      }
   }

   public static void
   validateSeed
      (
         String seed
      )
      throws SaslException
   {
      int length = seed.length();
      if(length <= 0 || length > MAX_SEED_LENGTH)
      {
         throw new SaslException("validateSeed: "+ERR_SEED_SIZE);
      }
      for(int i = 0; i < length; i++)
      {
         char c = seed.charAt(i);

         // Unfortunately, they allow '$' and '_'
         if(!Character.isDigit(c) && !Character.isLetter(c))
         {
            cat.warn("The character=>"+seed.charAt(i)+"<= is invalid.");
            throw new SaslException("validateSeed: "+ERR_SEED_ALPHANUM);
         }
      }
   }

   public static void
   validateSequenceNumber
      (
         String seq
      )
      throws SaslException
   {
      int i = 0;
      try
      {
         i = Integer.parseInt(seq);
         if (i < 0)
         {
            throw new SaslException("validateSequence: "+ERR_SEQUENCE_NUMBER);
         }
      }
      catch (Exception x)
      {
         throw new SaslException("validateSequence",x);
      }
   }
	// Instance methods
	// -------------------------------------------------------------------------

   /**
    *
    *
    * @return the full name of this OTP protocol instance.
    */
   public String
   getOTPName()
   {
      return otpName;
   }

   public String
   getOTPDigestName()
   {
      return mda.getDigestName();
   }

   public byte[]
   hashIterator
      (
         String seed,
         String password,
         int seqnum
      )
      throws SaslException
   {
      String phrase   = new String(seed + new String(password));
      byte[] response = null;
      byte[] temp     = phrase.getBytes();

      for (int i = 0; i < seqnum; i++)
      {
         response = this.digest(temp);
         temp = response;
      }
      return response;
   }

   public String
   wordResponse
      (
         String seed,
         String password,
         int seqnum
      )
      throws SaslException
   {
      byte[] response = hashIterator(seed,password,seqnum);
      long l = OTPUtil.convertBytesToLong(response);
      return new String(WORD+COLON+OTPDictionary.convertHashToWords(l));
   }

   public String
   hexResponse
      (
         String seed,
         String password,
         int seqnum
      )
      throws SaslException
   {
      byte[] response = hashIterator(seed,password,seqnum);
      return new String(HEX+COLON+OTPUtil.convertBytesToHex(response));
   }

   public String
   initWordResponse
      (
         String seed,
         String password,
         int seqnum
      )
      throws SaslException
   {
      String curOTP = wordResponse(seed,password,seqnum);
      String newParams =
         new String(this.getOTPDigestName()+
                    SPACE+
                    (new Integer(MAX_SEQUENCE_NUMBER)).toString()+
                    SPACE+
                    seed);
      String newOTP = wordResponse(seed,password,MAX_SEQUENCE_NUMBER);
      return new String(INIT_WORD+COLON+curOTP+COLON+newParams+COLON+newOTP);
   }

   public String
   initHexResponse
      (
         String seed,
         String password,
         int seqnum
      )
      throws SaslException
   {
      String curOTP = hexResponse(seed,password,seqnum);
      String newParams =
         new String(this.getOTPDigestName()+
                    SPACE+
                    (new Integer(MAX_SEQUENCE_NUMBER)).toString()+
                    SPACE+
                    seed);
      String newOTP = hexResponse(seed,password,MAX_SEQUENCE_NUMBER);
      return new String(INIT_HEX+COLON+curOTP+COLON+newParams+COLON+newOTP);
   }


	// Message Digest algorithm related methods
	// -------------------------------------------------------------------------

	/**
	 * Returns a new instance of the OTP message digest algorithm --which is
	 * SHA-1 by default, but could be anything else provided the proper
	 * conditions as specified in the OTP specifications.
	 *
	 * @return a new instance of the underlying OTP message digest algorithm.
	 * @exception RuntimeException if the implementation of the message digest
	 * algorithm does not support cloning.
	 */
	public MessageDigest
	newDigest()
	{
		return mda.newDigest();
	}

	/**
	 * Convenience method to return the result of digesting the designated input
	 * with a new instance of the OTP message digest algorithm.
	 *
	 * @param src some bytes to digest.
	 * @return the bytes constituting the result of digesting the designated
	 * input with a new instance of the OTP message digest algorithm.
	 */
	public byte[]
	digest
      (
         byte[] src
      )
	{
		return newDigest().digest(src);
	}

	/**
	 * Convenience method to return the result of digesting the designated input
	 * with a new instance of the OTP message digest algorithm.
	 *
	 * @param src a String whose bytes (using the default platform encoding) are
	 * to be digested.
	 * @return the bytes constituting the result of digesting the designated
	 * input with a new instance of the OTP message digest algorithm.
	 */
	public byte[]
	digest
      (
         String src
      )
	{
		byte[] ba = null;
		ba = src.getBytes();

		return digest(ba);
	}

	// Other methods
	// -------------------------------------------------------------------------
}