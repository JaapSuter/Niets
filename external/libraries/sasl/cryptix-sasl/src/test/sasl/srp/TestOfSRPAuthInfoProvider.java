package test.sasl.srp;

// $Id: TestOfSRPAuthInfoProvider.java,v 1.1 2001/09/25 09:39:08 raif Exp $
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

import cryptix.sasl.AuthInfoServices;
import cryptix.sasl.AuthException;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.srp.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Regression test for SRP authentication provider (password file based).
 *
 * @version $Revision: 1.1 $
 * @since version 0.8.9
 */
public class TestOfSRPAuthInfoProvider extends TestCase {

   // Constants and variables
   // -------------------------------------------------------------------------

   private AuthInfoServices authenticator = new SRPAuthInfoProvider();
   private Random prng = new Random();
   private Map credentials;
   private Map context, user1, user2, user3, user4;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public TestOfSRPAuthInfoProvider(String name) {
      super(name);
   }

   // Class methods
   // -------------------------------------------------------------------------

   public static void main(String[] args) {
      TestRunner.run(suite());
   }

   public static Test suite() {
      TestSuite result = new TestSuite("SRP AuthInfo provider regression tests");

      result.addTest(new TestOfSRPAuthInfoProvider("test4UsersNotThere"));
      result.addTest(new TestOfSRPAuthInfoProvider("testAdd3Users"));
      result.addTest(new TestOfSRPAuthInfoProvider("test3UsersAreThere"));
      result.addTest(new TestOfSRPAuthInfoProvider("testAddUser4"));
      result.addTest(new TestOfSRPAuthInfoProvider("test4UsersAreThere"));

      return result;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   public void test4UsersNotThere() {
      Map credentials;
      try {
         credentials = authenticator.lookup(user1);
         fail();
      } catch (AuthException x) {
         assertTrue(true);
      }

      try {
         credentials = authenticator.lookup(user2);
         fail();
      } catch (AuthException x) {
         assertTrue(true);
      }

      try {
         credentials = authenticator.lookup(user3);
         fail();
      } catch (AuthException x) {
         assertTrue(true);
      }

      try {
         credentials = authenticator.lookup(user4);
         fail();
      } catch (AuthException x) {
         assertTrue(true);
      }
   }

   public void testAdd3Users() {
      try {
         authenticator.update(user1);
         assertTrue(true);
      } catch (AuthException x) {
         x.printStackTrace(System.err);
         fail();
      }

      try {
         authenticator.update(user2);
         assertTrue(true);
      } catch (AuthException x) {
         x.printStackTrace(System.err);
         fail();
      }

      try {
         authenticator.update(user3);
         assertTrue(true);
      } catch (AuthException x) {
         x.printStackTrace(System.err);
         fail();
      }
   }

   public void test3UsersAreThere() {
      Map credentials;
      try {
         credentials = authenticator.lookup(user1);
         String salt = (String) credentials.get(SRPParams.SALT_FIELD);
         assertTrue(salt.equals((String) user1.get(SRPParams.SALT_FIELD)));
      } catch (AuthException x) {
         fail();
      }

      try {
         credentials = authenticator.lookup(user2);
         String salt = (String) credentials.get(SRPParams.SALT_FIELD);
         assertTrue(salt.equals((String) user2.get(SRPParams.SALT_FIELD)));
      } catch (AuthException x) {
         fail();
      }

      try {
         credentials = authenticator.lookup(user3);
         String salt = (String) credentials.get(SRPParams.SALT_FIELD);
         assertTrue(salt.equals((String) user3.get(SRPParams.SALT_FIELD)));
      } catch (AuthException x) {
         fail();
      }
   }

   public void testAddUser4() {
      try {
         authenticator.update(user4);
         assertTrue(true);
      } catch (AuthException x) {
         x.printStackTrace(System.err);
         fail();
      }
   }

   public void test4UsersAreThere() {
      test3UsersAreThere();
      try {
         authenticator.activate(context);
      } catch (AuthException x) {
         x.printStackTrace(System.err);
         fail();
      }

      try {
         Map credentials = authenticator.lookup(user4);
         String salt = (String) credentials.get(SRPParams.SALT_FIELD);
         assertTrue(salt.equals((String) user4.get(SRPParams.SALT_FIELD)));
      } catch (AuthException x) {
         fail();
      }
   }

   protected void setUp() throws Exception {
      context = new HashMap();
      context.put(SRPParams.PASSWORD_FILE, "./t_srp_passwd");
      try {
         authenticator.activate(context);
      } catch (AuthException x) {
         x.printStackTrace(System.err);
         fail();
      }

      byte[] salt = new byte[10];

      user1 = new HashMap();
      user1.put(SaslParams.USERNAME, "user1");
      user1.put(SaslParams.PASSWORD, "password1");
      user1.put(SRPParams.CONFIG_NDX_FIELD, "1");
      prng.nextBytes(salt);
      user1.put(SRPParams.SALT_FIELD, SaslUtil.tob64(salt));
      user1.put(SRPParams.MD_NAME_FIELD, SaslParams.MD5_MDA);

      user2 = new HashMap();
      user2.put(SaslParams.USERNAME, "user2");
      user2.put(SaslParams.PASSWORD, "password2");
      user2.put(SRPParams.CONFIG_NDX_FIELD, "2");
      prng.nextBytes(salt);
      user2.put(SRPParams.SALT_FIELD, SaslUtil.tob64(salt));
      user2.put(SRPParams.MD_NAME_FIELD, SaslParams.SHA_MDA);

      user3 = new HashMap();
      user3.put(SaslParams.USERNAME, "user3");
      user3.put(SaslParams.PASSWORD, "password3");
      user3.put(SRPParams.CONFIG_NDX_FIELD, "3");
      prng.nextBytes(salt);
      user3.put(SRPParams.SALT_FIELD, SaslUtil.tob64(salt));
      user3.put(SRPParams.MD_NAME_FIELD, SaslParams.MD5_MDA);

      user4 = new HashMap();
      user4.put(SaslParams.USERNAME, "user4");
      user4.put(SaslParams.PASSWORD, "password4");
      user4.put(SRPParams.CONFIG_NDX_FIELD, "4");
      prng.nextBytes(salt);
      user4.put(SRPParams.SALT_FIELD, SaslUtil.tob64(salt));
      user4.put(SRPParams.MD_NAME_FIELD, SaslParams.SHA_MDA);
   }

   protected void tearDown() throws Exception {
      context = null;
      user1 = user2 = user3 = user4 = null;
   }
}
