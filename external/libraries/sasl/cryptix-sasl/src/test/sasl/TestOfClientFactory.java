package test.sasl;

// $Id: TestOfClientFactory.java,v 1.1 2001/06/16 16:47:32 raif Exp $
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

import cryptix.sasl.*;
import java.util.Hashtable;
import javax.security.sasl.Sasl;

/**
 * Regression test for Cryptix SASL factories.
 *
 * @version $Revision: 1.1 $
 * @since version 0.8.9
 */
public class TestOfClientFactory extends TestCase {

	// Constants and variables
	// -------------------------------------------------------------------------

	// Constructor(s)
	// -------------------------------------------------------------------------

	public TestOfClientFactory(String name) {
		super(name);
	}

	// Class methods
	// -------------------------------------------------------------------------

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		return new TestSuite(TestOfClientFactory.class);
	}

   private static boolean includes(String[] sa, String n) {
      for (int i = 0; i < sa.length; i++)
         if (n.equals(sa[i]))
            return true;
      return false;
   }

	// Instance methods
	// -------------------------------------------------------------------------

	public void testGetClientMechanismsWithNullProperties() {
	   String[] mechanisms = new ClientFactory().getMechanismNames(null);

	   // should see all mechanisms
	   if (!includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (!includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (!includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (!includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	public void testGetClientMechanismsForNoPlaintext() {
	   Hashtable p = new Hashtable();
	   p.put(Sasl.POLICY_NOPLAINTEXT, "true");
	   String[] mechanisms = new ClientFactory().getMechanismNames(p);

	   // should see all mechanisms except PLAIN
	   if (!includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (!includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (!includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	public void testGetClientMechanismsForNoActive() {
	   Hashtable p = new Hashtable();
	   p.put(Sasl.POLICY_NOACTIVE, "true");
	   String[] mechanisms = new ClientFactory().getMechanismNames(p);

	   // should see all mechanisms except PLAIN & CRAM-MD5
	   if (!includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (!includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (!includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	public void testGetClientMechanismsForNoDictionary() {
	   Hashtable p = new Hashtable();
	   p.put(Sasl.POLICY_NODICTIONARY, "true");
	   String[] mechanisms = new ClientFactory().getMechanismNames(p);

	   // should see all mechanisms except PLAIN & CRAM-MD5
	   if (!includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (!includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (!includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	public void testGetClientMechanismsForNoAnonymous() {
	   Hashtable p = new Hashtable();
	   p.put(Sasl.POLICY_NOANONYMOUS, "true");
	   String[] mechanisms = new ClientFactory().getMechanismNames(p);

	   // should see all mechanisms except ANONYMOUS
	   if (!includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (!includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (!includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	public void testGetClientMechanismsForNoForwardSecrecy() {
	   Hashtable p = new Hashtable();
	   p.put(Sasl.POLICY_FORWARD_SECRECY, "true");
	   String[] mechanisms = new ClientFactory().getMechanismNames(p);

	   // should see all mechanisms except ANONYMOUS,PLAIN & CRAM-MD5
	   if (!includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (!includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (!includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	public void testGetClientMechanismsForPassCredentials() {
	   Hashtable p = new Hashtable();
	   p.put(Sasl.POLICY_PASS_CREDENTIALS, "true");
	   String[] mechanisms = new ClientFactory().getMechanismNames(p);

	   // should see none
	   if (includes(mechanisms, SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SRP_MECHANISM);

	   if (includes(mechanisms, SaslParams.SM2_MECHANISM+"-"+SaslParams.SRP_MECHANISM))
	      fail(SaslParams.SM2_MECHANISM);

	   if (includes(mechanisms, SaslParams.OTP_MECHANISM))
	      fail(SaslParams.OTP_MECHANISM);

	   if (includes(mechanisms, SaslParams.CRAM_MD5_MECHANISM))
	      fail(SaslParams.CRAM_MD5_MECHANISM);

	   if (includes(mechanisms, SaslParams.PLAIN_MECHANISM))
	      fail(SaslParams.PLAIN_MECHANISM);

	   if (includes(mechanisms, SaslParams.ANONYMOUS_MECHANISM))
	      fail(SaslParams.ANONYMOUS_MECHANISM);

	   assertTrue(true);
	}

	protected void setUp() throws Exception {
   }
}