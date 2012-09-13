package cryptix.sasl.srp;

// $Id: CALG.java,v 1.1 2001/06/25 21:04:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.ConfidentialityException;
import cryptix.sasl.SaslUtil;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.sasl.SaslException;

import org.apache.log4j.Category;

/**
 * A Factory class that returns CALG (Confidentiality Algorithm) instances that
 * operate as described in the draft-burdis-cat-sasl-srp-04. Specifically the
 * following description, from the specs, is relevant:<p>
 *
 * <pre>
 * The designated CALG block cipher should be used in OFB (Output
 * Feedback Block) mode in the ISO variant, as described in [16],
 * algorithm 7.20.
 *
 * Let k be the block size of the chosen symmetric cipher algorithm;
 * e.g. for AES this is 128 bits or 16 octets.  The OFB mode used shall
 * be of length/size k.
 *
 * It is recommended that Block ciphers operating in OFB mode be used
 * with an Initial Vector (the mode's IV).  For the SASL mechanisms
 * described in this document, the IV shall be an all-zero octet
 * sequence of size k.
 *
 * In such a mode of operation - OFB with key re-use - the IV, which
 * need not be secret, must be changed.  Otherwise an identical
 * keystream results; and, by XORing corresponding ciphertexts, an
 * adversary may reduce cryptanalysis to that of a running-key cipher
 * with one plaintext as the running key.  To counter the effect of
 * fixing the IV to an all-zero octet sequence, the sender should use a
 * one k-octet sequence as the value of its first block, constructed as
 * follows:
 *
 * o  the first (most significant) (k-2) octets are random,
 *
 * o  the octets at position #k-1 and #k, assuming the first octet is
 *    at position #1, are exact copies of those at positions #1 and #2
 *    respectively.
 *
 * The input data to the confidentiality protection algorithm shall be
 * a multiple of the symmetric cipher block size k.  When the input
 * length is not a multiple of k octets, the data shall be padded
 * according to the following scheme (described in [17] which itself is
 * based on RFC1423 [18]):

 *    Assuming the length of the input is l octets, (k - (l mod k))
 *    octets, all having the value (k - (l mod k)), shall be appended
 *    to the original data.  In other words, the input is padded at the
 *    trailing end with one of the following sequences:
 *
 *                    01 -- if l mod k = k-1
 *                   02 02 -- if l mod k = k-2
 *                             ...
 *                             ...
 *                             ...
 *                 k k ... k k -- if l mod k = 0
 *
 *    The padding can be removed unambiguously since all input is
 *    padded and no padding sequence is a suffix of another.  This
 *    padding method is well-defined if and only if k < 256 octets,
 *    which is the case with symmetric block ciphers today, and in the
 *    forseeable future.
 *
 * The output of this stage, when it is active, is:
 *
 *    at the sending side: CALG(K, ENCRYPT)( bytes(p1) )
 *
 *    at the receiving side: CALG(K, DECRYPT)( bytes(p1) )
 *
 * If the receiver, after decrypting the first block, finds that the
 * last two octets do not match the value of the first two, it MUST
 * signal an exception and abort the exchange.
 * </pre>
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public final class CALG
{
	// Constants and variables
	// --------------------------------------------------------------------------

	private static Category cat = Category.getInstance(CALG.class);

	public static final int ENCRYPT = Cipher.ENCRYPT_MODE;
	public static final int DECRYPT = Cipher.DECRYPT_MODE;

	private static final Random prng = new Random();

   private String algorithm;
   private Cipher cipher;
   private boolean encrypting;
   private int blockSize;
	private boolean firstBlock = true;
	private byte[] iv;

	// Constructor(s)
	// --------------------------------------------------------------------------

	/** Trivial private constructor to enforce Singleton pattern. */
	private CALG(String algorithm, int blockSize, Cipher cipher, boolean encrypting)
	throws SaslException {
		super();

		this.algorithm = algorithm;
		this.blockSize = blockSize;
		this.cipher = cipher;
		this.encrypting = encrypting;

		iv = new byte[blockSize];
		if (encrypting) { // build first block
		   prng.nextBytes(iv);
		   iv[blockSize-2] = (byte) iv[0];
		   iv[blockSize-1] = (byte) iv[1];
	   }
	}

	// Class methods
	// -------------------------------------------------------------------------

   /**
    * Returns an instance of a SASL-SRP CALG implementation.
    *
    * @param algorithm the name of the symmetric cipher algorithm.
    * @param K the shared secret.
    * @param mode whether this CALG is used for encryption or decryption.
    * @return an instance of this object.
    */
   public static synchronized CALG
   getInstance(String algorithm, SecretKey K, int mode)
   throws SaslException {
	   String alias = SRPUtil.toProviderName(algorithm);
	   Cipher cipher;
	   int blockSize;
 	   try {
   	   cipher = Cipher.getInstance(alias+"/OFB/PKCS7");
   	   blockSize = cipher.getBlockSize();
 	   } catch (NoSuchAlgorithmException x) {
		   cat.error(x);
   	   throw new SaslException("getInstance()", x);
 	   } catch (NoSuchPaddingException x) {
		   cat.error(x);
   	   throw new SaslException("getInstance()", x);
 	   }

 	   try {
 	      SecretKey sk = new SecretKeySpec(K.getEncoded(), alias);
 	      IvParameterSpec iv = new IvParameterSpec(new byte[blockSize]);
   	   cipher.init(mode, sk, iv);
 	   } catch (InvalidKeyException x) {
   	   throw new SaslException("getInstance()", x);
 	   } catch (InvalidAlgorithmParameterException x) {
   	   throw new SaslException("getInstance()", x);
 	   }

      return new CALG(alias, blockSize, cipher, mode == ENCRYPT);
   }

	// Instance methods
	// -------------------------------------------------------------------------

	/**
	 * Encrypts or decrypts, depending on the mode already set, a designated
	 * array of bytes and returns the result.
	 *
	 * @param data the data to encrypt/decrypt
	 * @return the decrypted/encrypted result.
	 * @exception ConfidentialityException if an exception occurs duirng the
	 * process.
	 */
	public byte[] doFinal(byte[] data) throws ConfidentialityException {
		cat.debug("==> doFinal()");
	   cat.debug(encrypting ? "plaintext:  " : "ciphertext: "+SaslUtil.dumpString(data));

      byte[] t, result;
		try {
         if (encrypting && firstBlock) {
            firstBlock = false;
            t = new byte[data.length+blockSize];
            System.arraycopy(iv,   0, t, 0,         blockSize);
            System.arraycopy(data, 0, t, blockSize, data.length);
         } else
            t = data;

   	   t = cipher.doFinal(t);

    	   if (!encrypting && firstBlock) {
            firstBlock = false;
    	      result = new byte[t.length-blockSize];
    	      System.arraycopy(t, 0,         iv,     0, blockSize);
    	      System.arraycopy(t, blockSize, result, 0, t.length-blockSize);
    	      if (iv[0] != iv[blockSize-2] || iv[1] != iv[blockSize-1])
    	         throw new RuntimeException("Incorrect IV");
    	   } else
    	      result = t;

 	   } catch (IllegalBlockSizeException x) {
   	   throw new ConfidentialityException("crypt()", x);
 	   } catch (BadPaddingException x) {
   	   throw new ConfidentialityException("crypt()", x);
 	   } catch (Exception x) {
   	   throw new ConfidentialityException("crypt()", x);
 	   }

		cat.debug(encrypting ? "ciphertext: " : "plaintext:  "+SaslUtil.dumpString(result));
		cat.debug("<== doFinal()");
		return result;
	}
}