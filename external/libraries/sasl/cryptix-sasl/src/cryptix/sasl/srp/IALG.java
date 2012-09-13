package cryptix.sasl.srp;

// $Id: IALG.java,v 1.1 2001/06/25 21:04:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.sasl.SaslException;

import org.apache.log4j.Category;

/**
 * A Factory class that returns IALG (Integrity Algorithm) instances that
 * operate as described in the draft-burdis-cat-sasl-srp-04.
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public final class IALG implements Cloneable
{
	// Constants and variables
	// --------------------------------------------------------------------------

	private static Category cat = Category.getInstance(IALG.class);

   private String algorithm;
   private Mac hmac;

	// Constructor(s)
	// --------------------------------------------------------------------------

	/** Trivial private constructor to enforce Singleton pattern. */
	private IALG(String algorithm, Mac hmac) {
		super();

		this.algorithm = algorithm;
		this.hmac = hmac;
	}

	// Class methods
	// -------------------------------------------------------------------------

   /**
    * Returns an instance of a SASL-SRP IALG implementation.
    *
    * @param algorithm the name of the HMAC algorithm.
    * @param K the shared secret.
    * @return an instance of this object.
    */
   public static synchronized IALG getInstance(String algorithm, SecretKey K)
   throws SaslException {
	   String alias = SRPUtil.toProviderName(algorithm);
	   Mac hmac;
 	   try {
   	   hmac = Mac.getInstance(alias);
 	   } catch (NoSuchAlgorithmException x) {
		   cat.error(x);
   	   throw new SaslException("getInstance()", x);
 	   }

 	   try {
 	      SecretKey sk = new SecretKeySpec(K.getEncoded(), alias);
   	   hmac.init(sk);
 	   } catch (InvalidKeyException x) {
   	   throw new SaslException("getInstance()", x);
 	   }

      return new IALG(alias, hmac);
   }

   // Cloneable interface implementation
   // -------------------------------------------------------------------------

   public Object clone() throws CloneNotSupportedException {
      return new IALG(algorithm, (Mac) hmac.clone());
   }

	// Instance methods
	// -------------------------------------------------------------------------

   public void update(byte[] data) {
      hmac.update(data);
   }

	public byte[] doFinal() {
		return hmac.doFinal();
	}
}