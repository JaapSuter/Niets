package cryptix.sasl.otp;

// $Id: OTPDigest.java,v 1.3 2001/06/11 08:20:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.math.BigInteger;
import java.security.MessageDigest;

import cryptix.sasl.SaslUtil;
import org.apache.log4j.Category;

/**
 * This object encapsulates the concrete implementation of the Message
 * Digest Algorithm instance used by an incarnation of an OTP session.
 *
 * @version $Revision: 1.3 $
 * @since draft-burdis-cat-sasl-srp-04
 */
final class OTPDigest
{
	// Constants and variables
	// --------------------------------------------------------------------------

	private static Category cat = Category.getInstance(OTPDigest.class);

	/**
	 * The size of the output (in bytes) of the underlying OTP message digest
	 * algorithm.
	 */
	private int digestLength;

	/**
	 * The root of all instances of the underlying OTP message digest
	 * algorithm.<p>
	 *
	 * In this code of the OTP protocol we use Sun's SHA implementation.
	 * In later version this will change to use any provider's
	 * implementation but we shall add some verification tests (known
	 * test vectors) to ensure it is reliable.
	 */
	private MessageDigest md;

   private String digestName;

	// Constructor(s)
	// --------------------------------------------------------------------------

	/**
	 * Trivial private constructor to enforce Singleton pattern.
	 */
	private OTPDigest
      (
         MessageDigest md,
         String mdaName
      )
	{
		super();

      this.md = md;
      this.digestName = mdaName;

		// theoretically we could get the size of the output by invoking
		//
      //		int len = md.getDigestLength();
		//
		// but this is not guaranteed to always work; so instead we do it the
		// hard way.

		digestLength = md.digest().length;
	}

	// Class methods
	// -------------------------------------------------------------------------

   /**
    *
    *
    */
   static OTPDigest
   getInstance
      (
         String mdaName
      )
   {
		MessageDigest result = null;
		try
		{
			result = MessageDigest.getInstance(mdaName);
		}
		catch (Exception e)
		{
			cat.error(mdaName+" message digest not available");
			throw new RuntimeException(mdaName+" message digest not available");
		}

		MessageDigest sha;
		try
		{
			sha = (MessageDigest) result.clone();
		}
		catch (CloneNotSupportedException e)
		{
			cat.error("Digest implementation does not support cloning");
			throw new RuntimeException("Digest implementation not cloneable");
		}

		// check test vectors here
		// ...
		//

		return new OTPDigest(result,mdaName);
   }

	// Instance methods
	// -------------------------------------------------------------------------

   /**
    * Return the size of the output, in bytes, of the message digest algorithm.
    *
    * @return the size in bytes of the digest output.
    */
   int
   getDigestLength()
   {
      return digestLength;
   }

   String
   getDigestName()
   {
      return digestName;
   }

	/**
	 * Returns a new instance of the OTP message digest algorithm --which is
	 * SHA-1 by default, but could be anything else provided the proper
	 * conditions as specified in the OTP specifications.
	 *
	 * @return a new instance of the underlying OTP message digest algorithm.
	 * @exception RuntimeException if the implementation of the message digest
	 * algorithm does not support cloning.
	 */
	MessageDigest
	newDigest()
	{
		MessageDigest result = null;
		try
		{
			result = (MessageDigest) md.clone();
		}
		catch (CloneNotSupportedException e)
		{
			cat.error("Message Digest algorithm implementation does not support cloning");
			throw new RuntimeException("Message Digest implementation not cloneable");
		}

		return result;
	}
}