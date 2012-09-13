package test.sasl.srp;

// $Id: TestOfSRPPrimitives.java,v 1.3 2001/11/02 11:11:47 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import cryptix.sasl.SaslUtil;
import cryptix.sasl.srp.*;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.util.Random;
import javax.crypto.SecretKey;

/**
 * Regression test for SRP cryptographic primitives.
 *
 * @version $Revision: 1.3 $
 * @since version 0.8.9
 */
public class TestOfSRPPrimitives extends TestCase {

   // Constants and variables
   // -------------------------------------------------------------------------

   private Random prng;
   private String user, password, pFile, p2File, cFile;
   private PasswordFile tpasswd;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public TestOfSRPPrimitives(String name) {
      super(name);
   }

   // Class methods
   // -------------------------------------------------------------------------

   public static void main(String[] args) {
      TestRunner.run(suite());
   }

   public static Test suite() {
      return new TestSuite(TestOfSRPPrimitives.class);
   }

   // Instance methods
   // -------------------------------------------------------------------------

   public void testSRPWithDefaultDigest() throws IOException {
      exerciseAlgorithm(SRP.instance(null)); // should use SHA-1 (160-bit)
   }

   public void testSRPWithMD5() throws IOException {
      exerciseAlgorithm(SRP.instance("MD5"));
   }

   private void exerciseAlgorithm(SRP srp) throws IOException {
      File f = new File(pFile);
      if (!f.exists()) {
         if (f.createNewFile())
            f.deleteOnExit();
      } else if (!f.isFile())
         throw new RuntimeException("File object (./test) exists but is not a file");
      else if (!f.canRead() || !f.canWrite())
         throw new RuntimeException("File (./test) exists but is not accessible");

      tpasswd = new PasswordFile(pFile, p2File, cFile);
      if (!tpasswd.contains(user)) {
         byte[] testSalt = new byte[10];
         prng.nextBytes(testSalt);
         tpasswd.add(user, password, testSalt, "1");
      } else
         tpasswd.changePasswd(user, password);

      // ===================================================================

      String[] entry = tpasswd.lookup(user, srp.getAlgorithm());
      BigInteger v = new BigInteger(1, SaslUtil.fromb64(entry[0]));
      byte[] s = SaslUtil.fromb64(entry[1]);

      String[] mpi = tpasswd.lookupConfig(entry[2]);
      BigInteger N = new BigInteger(1, SaslUtil.fromb64(mpi[0]));
      BigInteger g = new BigInteger(1, SaslUtil.fromb64(mpi[1]));

      KeyPair serverKP = srp.generateServerKeyPair(N, g, v);
      KeyPair clientKP = srp.generateClientKeyPair(N, g);

      SecretKey K1 = srp.generateServerSecretKey(
            serverKP, // b, B
            ((SRPPublicKey) clientKP.getPublic()).getExponent(), // A
            v);

      MessageDigest sha = srp.newDigest();
      sha.update(s);
      sha.update(srp.userHash(user, password));

      BigInteger x = new BigInteger(1, sha.digest());
      SecretKey K2 = srp.generateClientSecretKey(
            clientKP, // a, A
            ((SRPPublicKey) serverKP.getPublic()).getExponent(), // B
            x);

      assertTrue(SaslUtil.areEqual(K1.getEncoded(), K2.getEncoded()));

      // ===================================================================

      String L = "integrity=hmac-md5,replay detection"; // available options
      String o = "integrity=hmac-md5,replay detection"; // chosen options

      MessageDigest ckhash = srp.newDigest();
      ckhash.update(
         srp.xor(srp.digest(SaslUtil.trim(N)), srp.digest(SaslUtil.trim(g))));
      ckhash.update(srp.digest(user));
      ckhash.update(s);
      ckhash.update(((SRPPublicKey) clientKP.getPublic()).getExponentBytes()); // A
      ckhash.update(((SRPPublicKey) serverKP.getPublic()).getExponentBytes()); // B
      ckhash.update(K1.getEncoded());
      ckhash.update(srp.digest(L));

      byte[] serverExpects = ckhash.digest();

      MessageDigest hash = srp.newDigest();
      hash.update(((SRPPublicKey) clientKP.getPublic()).getExponentBytes()); // A
      hash.update(serverExpects);
      hash.update(K1.getEncoded());
      hash.update(srp.digest(user));
      hash.update(srp.digest(user)); // authorizationID
      hash.update(srp.digest(o));

      byte[] serverResult = hash.digest();

      // ===================================================================

      hash = srp.newDigest();
      hash.update(
         srp.xor(srp.digest(SaslUtil.trim(N)), srp.digest(SaslUtil.trim(g))));
      hash.update(srp.digest(user));
      hash.update(s);
      hash.update(((SRPPublicKey) clientKP.getPublic()).getExponentBytes()); // A
      hash.update(((SRPPublicKey) serverKP.getPublic()).getExponentBytes()); // B
      hash.update(K2.getEncoded());
      hash.update(srp.digest(L));

      byte[] clientResult = hash.digest();

      ckhash = srp.newDigest();
      ckhash.update(((SRPPublicKey) clientKP.getPublic()).getExponentBytes()); // A
      ckhash.update(clientResult);
      ckhash.update(K2.getEncoded());
      ckhash.update(srp.digest(user));
      ckhash.update(srp.digest(user)); // authorizationID
      ckhash.update(srp.digest(o));

      byte[] clientExpects = ckhash.digest();

      assertTrue(SaslUtil.areEqual(clientResult, serverExpects));
      assertTrue(SaslUtil.areEqual(serverResult, clientExpects));
   }

   protected void setUp() throws Exception {
      prng = new Random();
      user = "test";
      password = "test";
      pFile = "./test";
      p2File = "./test2";
      cFile = "etc/tpasswd.conf";
      tpasswd = null;
   }

   protected void tearDown() throws Exception {
      prng = null;
      new File(pFile).delete(); // remove ./test file
      user = password = pFile = p2File = cFile = null;
   }
}
