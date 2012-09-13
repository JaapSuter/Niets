package cryptix.sasl.srp;

// $Id: SRP.java,v 1.5 2001/11/02 11:05:51 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;

import javax.crypto.SecretKey;

import org.apache.log4j.Category;

/**
 * A Factory class that returns SRP Singletons that know all SRP-related
 * mathematical computations and protocol-related operations for both the client-
 * and server-sides.
 *
 * @version $Revision: 1.5 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public final class SRP
implements SRPParams, SaslParams
{
   // Constants and variables
   // --------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SRP.class);

   /** The map of already instantiated SRP algorithm instances. */
   private static final HashMap algorithms = new HashMap();

   /** A source of strong randomness. */
   private static final Random prng = new SecureRandom();

   /** Size of the ephemeral public keys in bits. */
   private static final int PUBLIC_KEY_SIZE = 64;

   /** The underlying SRP message digest algorithm. */
   private SRPDigest mda;

   /** Canonical name of the message digest algorithm of this instance. */
   private String mdName;

   // Constructor(s)
   // --------------------------------------------------------------------------

   /** Trivial private constructor to enforce Singleton pattern. */
   private SRP(String mdName, SRPDigest mda) {
      super();

      this.mdName = mdName;
      this.mda = mda;
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * Returns an instance of this object that uses the designated message
    * digest algorithm as its digest function.
    *
    * @return an instance of this object for the designated digest name.
    */
   public static synchronized SRP instance(String mdName) {
      if (mdName != null)
         mdName = mdName.trim();

      if (mdName == null || mdName.equals(""))
         mdName = SRP_DEFAULT_DIGEST_NAME;

      SRP result = (SRP) algorithms.get(mdName);
      if (result == null) {
         SRPDigest mda = SRPDigest.getInstance(mdName);
         result = new SRP(mdName, mda);
         algorithms.put(mdName, result);
      }

      return result;
   }

   /**
    * Generates the server-side private and public key-pair, given the shared
    * public modulus <tt>n</tt> and the generator <tt>g</tt>.
    *
    * @param N the shared public modulus.
    * @param g the field generator.
    * @param v the user's verifier.
    * @return a <tt>java.security.KeyPair</tt> that contains both the private
    * (b) as well as the public (B) keys of the server in the SRP exchange.
    */
   public static KeyPair
   generateServerKeyPair(BigInteger N, BigInteger g, BigInteger v) {
      cat.debug("==> generateServerKeyPair()");

      BigInteger b, B;

      do {
         b = new BigInteger(PUBLIC_KEY_SIZE, prng);
      } while (b.compareTo(BigInteger.ONE) <= 0);

      cat.debug("b: "+SaslUtil.dump(b));

      B = v.add(g.modPow(b, N));
      if (B.compareTo(N) >= 0)
         B = B.subtract(N);

      cat.debug("B: "+SaslUtil.dump(B));

      KeyPair result =
         new KeyPair(new SRPPublicKey(N, g, B), new SRPPrivateKey(N, g, b));

      cat.debug("<== generateServerKeyPair()");
      return result;
   }

   /**
    * Generates the client-side private and public key-pair, given the shared
    * public modulus <tt>n</tt> and the generator <tt>g</tt>.
    *
    * @param N the shared public modulus.
    * @param g the field generator.
    * @return a <tt>java.security.KeyPair</tt> that contains both the private
    * (a) as well as the public (A) keys of the client in the SRP exchange.
    */
   public static KeyPair generateClientKeyPair(BigInteger N, BigInteger g) {
      cat.debug("==> generateClientKeyPair()");

      BigInteger a, A;
      do {
         a = new BigInteger(PUBLIC_KEY_SIZE, prng);
      } while (a.compareTo(BigInteger.ONE) <= 0);

      cat.debug("a: "+SaslUtil.dump(a));

      A = g.modPow(a, N);
      cat.debug("A: "+SaslUtil.dump(A));

      KeyPair result =
         new KeyPair(new SRPPublicKey(N, g, A), new SRPPrivateKey(N, g, a));

      cat.debug("<== generateClientKeyPair()");
      return result;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   /** @return the message digest algorithm name used by this instance. */
   public String getAlgorithm() {
      return mdName;
   }

   /**
    * @return the full name (including the "SRP-" prefix) of this SRP mechanism
    * instance.
    */
   public String getSRPName() {
      return SRP_MECHANISM+"-"+mdName;
   }

   /**
    * Used by the server-side in the SRP exchenage, this method generates a
    * session key suitable for symmetric encryption of the exchange between the
    * client and server after authentication is successfully concluded.
    *
    * @param sKP the server's key-pair.
    * @param A the client's public key.
    * @param v the user's verifier.
    * @return the session key <tt>K</tt>.
    */
   public SecretKey
   generateServerSecretKey(KeyPair sKP, BigInteger A, BigInteger v) {
      cat.debug("==> generateSessionKey(server)");

      BigInteger N = ((SRPPublicKey) sKP.getPublic()).getModulus();
      BigInteger B = ((SRPPublicKey) sKP.getPublic()).getExponent();
      BigInteger b = ((SRPPrivateKey) sKP.getPrivate()).getBase();

      byte[] bBytes = SaslUtil.trim(B);
      byte[] uhash = digest(bBytes);
      byte[] ub4 = new byte[] { uhash[0], uhash[1], uhash[2], uhash[3] };

      BigInteger u = new BigInteger(1, ub4);
      BigInteger S = A.multiply(v.modPow(u, N)).mod(N).modPow(b, N);
      cat.debug("S: "+SaslUtil.dump(S));
      byte[] sBytes = SaslUtil.trim(S);

      byte[] key = mda.digestInterleaved(sBytes);
      cat.debug("K: "+SaslUtil.dumpString(key));

      SRPSecretKey result = new SRPSecretKey(key);
      cat.debug("<== generateSessionKey(server)");
      return result;
   }

   /**
    * Used by the client-side in the SRP exchenage, this method generates a
    * session key suitable for symmetric encryption of the exchange between the
    * client and server after authentication is successfully concluded.
    *
    * @param cKP the client's key-pair.
    * @param B the server's public key.
    * @param x the digest output of [salt || username || password].
    * @return the session key <tt>K</tt>.
    */
   public SecretKey
   generateClientSecretKey(KeyPair cKP, BigInteger B, BigInteger x) {
      cat.debug("==> generateSessionKey(client)");

      BigInteger N = ((SRPPublicKey) cKP.getPublic()).getModulus();
      BigInteger g = ((SRPPublicKey) cKP.getPublic()).getGenerator();
      BigInteger a = ((SRPPrivateKey) cKP.getPrivate()).getBase();
      BigInteger base = B;

      BigInteger v = g.modPow(x, N);

      byte[] uhash = digest(SaslUtil.trim(base));
      byte[] ub4 = new byte[] { uhash[0], uhash[1], uhash[2], uhash[3] };

      BigInteger u = new BigInteger(1, ub4);
      BigInteger sum = x.multiply(u);
      if (base.compareTo(v) < 0)
         base = base.add(N);

      base = base.subtract(v);
      BigInteger S = base.modPow(sum.add(a), N);
      cat.debug("S: "+SaslUtil.dump(S));
      byte[] sBytes = SaslUtil.trim(S);

      byte[] key = mda.digestInterleaved(sBytes);
      cat.debug("K: "+SaslUtil.dumpString(key));

      SRPSecretKey result = new SRPSecretKey(key);
      cat.debug("<== generateSessionKey(client)");
      return result;
   }

   // Message Digest algorithm related methods
   // -------------------------------------------------------------------------

   /**
    * Returns a new instance of the SRP message digest algorithm --which is
    * SHA-1 by default, but could be anything else provided the proper
    * conditions as specified in the SRP specifications.
    *
    * @return a new instance of the underlying SRP message digest algorithm.
    * @exception RuntimeException if the implementation of the message digest
    * algorithm does not support cloning.
    */
   public MessageDigest newDigest() {
      return mda.newDigest();
   }

   /**
    * Convenience method to return the result of digesting the designated input
    * with a new instance of the SRP message digest algorithm.
    *
    * @param src some bytes to digest.
    * @return the bytes constituting the result of digesting the designated
    * input with a new instance of the SRP message digest algorithm.
    */
   public byte[] digest(byte[] src) {
      return newDigest().digest(src);
   }

   /**
    * Convenience method to return the result of digesting the designated input
    * with a new instance of the SRP message digest algorithm.
    *
    * @param src a String whose bytes (using the default platform encoding) are
    * to be digested.
    * @return the bytes constituting the result of digesting the designated
    * input with a new instance of the SRP message digest algorithm.
    */
   public byte[] digest(String src) {
      byte[] ba = null;
      ba = src.getBytes();

      return digest(ba);
   }

   // Other methods
   // -------------------------------------------------------------------------

   /**
    * Convenience method to XOR N bytes from two arrays; N being the output size
    * of the SRP message digest algorithm.
    *
    * @param a the first byte array.
    * @param b the second one.
    * @return N bytes which are the result of the XOR operations on the first N
    * bytes from the designated arrays. N is the size of the SRP message digest
    * algorithm; eg. 20 for SHA-1.
    */
   public byte[] xor(byte[] a, byte[] b) {
      return SRPUtil.xor(a, b, mda.getDigestLength());
   }

   public byte[] userHash(String U, String p) {
      return digest(U + ":" + p);
   }

   public byte[]
   generateServerEvidence(BigInteger A, byte[] M, byte[] K,
                          String U, String I, String o) {
      MessageDigest hash = newDigest();
      byte[] aBytes = SaslUtil.trim(A);
      hash.update(aBytes);
      hash.update(M);
      hash.update(K);
      hash.update(digest(U));
      hash.update(digest(I));
      hash.update(digest(o));

      return hash.digest();
   }

   public byte[]
   generateClientEvidence(BigInteger N, BigInteger g, String U, byte[] s,
                          BigInteger A, BigInteger B, byte[] K, String L) {
      MessageDigest hash = newDigest();
      byte[] nBytes = SaslUtil.trim(N);
      byte[] gBytes = SaslUtil.trim(g);
      byte[] aBytes = SaslUtil.trim(A);
      byte[] bBytes = SaslUtil.trim(B);

      byte[] dnb = digest(nBytes);
      byte[] dgb = digest(gBytes);
      byte[] xb = xor(dnb, dgb);

      hash.update(xb);
      hash.update(digest(U));
      hash.update(s);
      hash.update(aBytes);
      hash.update(bBytes);
      hash.update(K);
      hash.update(digest(L));

      return hash.digest();
   }
}
