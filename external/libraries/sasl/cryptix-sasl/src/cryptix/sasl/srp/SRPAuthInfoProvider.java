package cryptix.sasl.srp;

// $Id: SRPAuthInfoProvider.java,v 1.1 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.AuthInfoServices;
import cryptix.sasl.AuthException;
import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

/**
 * The SRP mechanism authentication information provider implementation.
 *
 * @version $Revision: 1.1 $
 * @since   0.8.9
 */
public class SRPAuthInfoProvider
implements AuthInfoServices, SaslParams, SRPParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private PasswordFile passwordFile = null;

   // Constructor(s)
   // -------------------------------------------------------------------------

   // implicit 0-args constrcutor

   // Class methods
   // -------------------------------------------------------------------------

   // AuthInfoServices interface implementation
   // -------------------------------------------------------------------------

   public void activate(Map context) throws AuthException {
      try {
         if (context == null)
            passwordFile = new PasswordFile();
         else {
            String pfn = (String) context.get(PASSWORD_FILE);
            if (pfn == null)
               passwordFile = new PasswordFile();
            else
               passwordFile = new PasswordFile(pfn);
         }
      } catch (IOException x) {
         throw new AuthException("activate()", x);
      }
   }

	public void passivate() throws AuthException {
      passwordFile = null;
   }

	public boolean contains(String userName) throws AuthException {
      if (passwordFile == null)
         throw new AuthException("contains()", new IllegalStateException());

      boolean result = false;
      try {
         result = passwordFile.contains(userName);
      } catch (IOException x) {
         throw new AuthException("contains()", x);
      }

      return result;
   }

	public Map lookup(Map userID) throws AuthException {
      if (passwordFile == null)
         throw new AuthException("lookup()", new IllegalStateException());

      Map result = new HashMap();
      try {
         String userName = (String) userID.get(USERNAME);
         if (userName == null)
            throw new NoSuchUserException("");

         String mdName = (String) userID.get(MD_NAME_FIELD);

         String[] data = passwordFile.lookup(userName, mdName);
         result.put(USER_VERIFIER_FIELD, data[0]);
         result.put(SALT_FIELD, data[1]);
         result.put(CONFIG_NDX_FIELD, data[2]);
      } catch (Exception x) {
         if (x instanceof AuthException)
            throw (AuthException) x;
         else
            throw new AuthException("lookup()", x);
      }

      return result;
   }

	public void update(Map userCredentials) throws AuthException {
      if (passwordFile == null)
         throw new AuthException("update()", new IllegalStateException());

      try {
         String userName = (String) userCredentials.get(USERNAME);
         String password = (String) userCredentials.get(PASSWORD);
         String salt =     (String) userCredentials.get(SALT_FIELD);
         String config =   (String) userCredentials.get(CONFIG_NDX_FIELD);
         if (salt == null || config == null)
            passwordFile.changePasswd(userName, password);
         else
            passwordFile.add(userName, password, SaslUtil.fromb64(salt), config);
      } catch (Exception x) {
         if (x instanceof AuthException)
            throw (AuthException) x;
         else
            throw new AuthException("update()", x);
      }
   }

	public Map getConfiguration(String mode) throws AuthException {
      if (passwordFile == null)
         throw new AuthException("update()", new IllegalStateException());

      Map result = new HashMap();
      try {
         String[] data = passwordFile.lookupConfig(mode);
         result.put(SHARED_MODULUS, data[0]);
         result.put(FIELD_GENERATOR, data[1]);
      } catch (Exception x) {
         if (x instanceof AuthException)
            throw (AuthException) x;
         else
            throw new AuthException("lookup()", x);
      }

      return result;
   }
}
