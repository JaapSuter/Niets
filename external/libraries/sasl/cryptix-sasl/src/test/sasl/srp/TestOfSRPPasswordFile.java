package test.sasl.srp;

// $Id: TestOfSRPPasswordFile.java,v 1.2 2001/06/24 12:13:02 raif Exp $
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
 * Regression test for SRP password file.
 *
 * @version $Revision: 1.2 $
 * @since version 0.8.9
 */
public class TestOfSRPPasswordFile extends TestCase {

	// Constants and variables
	// -------------------------------------------------------------------------

   private Random prng;
   private String user, password, pFile, p2File, cFile;
   private PasswordFile tpasswd;

	// Constructor(s)
	// -------------------------------------------------------------------------

	public TestOfSRPPasswordFile(String name) {
		super(name);
	}

	// Class methods
	// -------------------------------------------------------------------------

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		return new TestSuite(TestOfSRPPasswordFile.class);
	}

	// Instance methods
	// -------------------------------------------------------------------------

	public void testPasswordWithDefaultDigest() throws IOException {
	   exerciseFile(SRP.instance(null));
   }

	public void testPasswordWithMD5() throws IOException {
	   exerciseFile(SRP.instance("MD5"));
   }

   private void exerciseFile(SRP srp) throws IOException {
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
		byte[] salt = SaslUtil.fromb64(entry[1]);

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
		sha.update(salt);
		sha.update(srp.userHash(user, password));

		BigInteger x = new BigInteger(1, sha.digest());
		SecretKey K2 = srp.generateClientSecretKey(
				clientKP, // a, A
				((SRPPublicKey) serverKP.getPublic()).getExponent(), // B
				x);

		if (SaslUtil.areEqual(K1.getEncoded(), K2.getEncoded()))
		   assertTrue(true);
		else
		   fail();
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