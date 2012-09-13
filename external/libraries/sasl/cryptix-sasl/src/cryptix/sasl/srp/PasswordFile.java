package cryptix.sasl.srp;

// $Id: PasswordFile.java,v 1.9 2001/10/16 11:04:17 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.
//
// This product includes software developed by Tom Wu and Eugene Jhong for the
// SRP Distribution (http://srp.stanford.edu/srp/).
//
// Copyright (c) 1997-1999  The Stanford SRP Authentication Project.
// All Rights Reserved.
//
// Please see LICENSE.SRP for a copy of the license for this software.

import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.UserAlreadyExistsException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.apache.log4j.Category;

/**
 * The Cryptix implementation of the SRP password files.<p>
 *
 * For SRP, there are three (3) files:
 * <ol>
 *    <li>The password configuration file: tpasswd.conf. It contains the pairs
 *    <N,g> indexed by a number for each pair used for a user. By default, this
 *    file's pathname is constructed from the base password file pathname by
 *    prepending it with the ".conf" suffix.</li>
 *    <li>The base password file: tpasswd. It contains the related password
 *    entries for all the users with values computed using SRP's default
 *    message digest algorithm: SHA-1 (with 160-bit output block size).</li>
 *    <li>The extended password file: tpasswd2. Its name is ALWAYS constructed
 *    by adding the suffix "2" to the fully qualified pathname of the base
 *    password file. It contains, in addition to the same fields as the base
 *    password file, albeit with a different verifier value, an extra field
 *    identifying the message digest algorithm used to compute this (verifier)
 *    value.</li>
 * </ol>
 *
 * This implementation assumes the following message digest algorithm codes:
 * <ul>
 *    <li>1: RIPEMD-128.</li>
 *    <li>2: RIPEMD-160.</li>
 *    <li>3: SHA-256.</li>
 *    <li>4: SHA-384.</li>
 *    <li>5: SHA-512.</li>
 * </ul>
 *
 * @version $Revision: 1.9 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class PasswordFile implements SRPParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(PasswordFile.class);

   // names of property keys used in this class
   private static final String USER_FIELD =      "user";
   private static final String VERIFIERS_FIELD = "verifier";
   private static final String SALT_FIELD =      "salt";
   private static final String CONFIG_FIELD =    "config";

   private static String DEFAULT_FILE;
   static {
      DEFAULT_FILE = System.getProperty(PASSWORD_FILE, DEFAULT_PASSWORD_FILE);
   }

   /** The SRP algorithm instances used by this object. */
   private static HashMap srps;
   static {
      String[] names = new String[] { // optional
         SRP_MD5_NAME,
         SRP_RIPEMD_128_NAME, SRP_RIPEMD_160_NAME,
         SRP_SHA_256_NAME, SRP_SHA_384_NAME, SRP_SHA_512_NAME };
      HashMap map = new HashMap(names.length+1);
      map.put("0", SRP.instance(SRP_DEFAULT_DIGEST_NAME)); // MUST exist
      for (int i = 0; i < names.length; i++)
         try {
            map.put(String.valueOf(i+1), SRP.instance(names[i]));
         } catch (Exception x) {
            cat.warn("Exception while instantiating an SRP with \""
               +names[i]+".\" Ignored...");
         }

      srps = map;
   }

   private String confName, pwName, pw2Name;
   private File configFile, passwdFile, passwd2File;
   private long lastmodConfigFile, lastmodPasswdFile, lastmodPasswd2File;

   private HashMap entries = new HashMap();
   private HashMap configurations = new HashMap();

   // default N values to use when creating a new password.conf file
   private static final BigInteger[] Nsrp = new BigInteger[] {
      // lifted from draft-burdis-cat-srp-sasl-04
      // 2048
      new BigInteger(
         "AC6BDB41324A9A9BF166DE5E1389582FAF72B6651987EE07FC3192943DB56050"+
         "A37329CBB4A099ED8193E0757767A13DD52312AB4B03310DCD7F48A9DA04FD50"+
         "E8083969EDB767B0CF6095179A163AB3661A05FBD5FAAAE82918A9962F0B93B8"+
         "55F97993EC975EEAA80D740ADBF4FF747359D041D5C33EA71D281E446B14773B"+
         "CA97B43A23FB801676BD207A436C6481F1D2B9078717461A5B9D32E688F87748"+
         "544523B524B0D57D5EA77A2775D2ECFA032CFBDBF52FB3786160279004E57AE6"+
         "AF874E7303CE53299CCC041C7BC308D82A5698F3A8D0C38271AE35F8E9DBFBB6"+
         "94B5C803D89F7AE435DE236D525F54759B65E372FCD68EF20FA7111F9E4AFF73",
         16),
      // 1536
      new BigInteger(
         "9DEF3CAFB939277AB1F12A8617A47BBBDBA51DF499AC4C80BEEEA9614B19CC4D"+
         "5F4F5F556E27CBDE51C6A94BE4607A291558903BA0D0F84380B655BB9A22E8DC"+
         "DF028A7CEC67F0D08134B1C8B97989149B609E0BE3BAB63D47548381DBC5B1FC"+
         "764E3F4B53DD9DA1158BFD3E2B9C8CF56EDF019539349627DB2FD53D24B7C486"+
         "65772E437D6C7F8CE442734AF7CCB7AE837C264AE3A9BEB87F8A2FE9B8B5292E"+
         "5A021FFF5E91479E8CE7A28C2442C6F315180F93499A234DCF76E3FED135F9BB",
         16),
      // 1280
      new BigInteger(
         "D77946826E811914B39401D56A0A7843A8E7575D738C672A090AB1187D690DC4"+
         "3872FC06A7B6A43F3B95BEAEC7DF04B9D242EBDC481111283216CE816E004B78"+
         "6C5FCE856780D41837D95AD787A50BBE90BD3A9C98AC0F5FC0DE744B1CDE1891"+
         "690894BC1F65E00DE15B4B2AA6D87100C9ECC2527E45EB849DEB14BB2049B163"+
         "EA04187FD27C1BD9C7958CD40CE7067A9C024F9B7C5A0B4F5003686161F0605B",
         16),
      // 1024
      new BigInteger(
         "EEAF0AB9ADB38DD69C33F80AFA8FC5E86072618775FF3C0B9EA2314C9C256576"+
         "D674DF7496EA81D3383B4813D692C6E0E0D5D8E250B98BE48E495C1D6089DAD1"+
         "5DC7D7B46154D6B6CE8EF4AD69B15D4982559B297BCF1885C529F566660E57EC"+
         "68EDBC3C05726CC02FD4CBF4976EAA9AFD5138FE8376435B9FC61D2FC0EB06E3",
         16),
      // 768
      new BigInteger(
         "B344C7C4F8C495031BB4E04FF8F84EE95008163940B9558276744D91F7CC9F40"+
         "2653BE7147F00F576B93754BCDDF71B636F2099E6FFF90E79575F3D0DE694AFF"+
         "737D9BE9713CEF8D837ADA6380B1093E94B6A529A8C6C2BE33E0867C60C3262B",
         16),
      // 640
      new BigInteger(
         "C94D67EB5B1A2346E8AB422FC6A0EDAEDA8C7F894C9EEEC42F9ED250FD7F0046"+
         "E5AF2CF73D6B2FA26BB08033DA4DE322E144E7A8E9B12A0E4637F6371F34A207"+
         "1C4B3836CBEEAB15034460FAA7ADF483",
         16),
      // 512
      new BigInteger(
         "D4C7F8A2B32C11B8FBA9581EC4BA4F1B04215642EF7355E37C0FC0443EF756EA"+
         "2C6B8EEB755A1C723027663CAA265EF785B8FF6A9B35227A52D86633DBDFCA43",
         16),
      // 384
      new BigInteger(
         "8025363296FB943FCE54BE717E0E2958A02A9672EF561953B2BAA3BAACC3ED57"+
         "54EB764C7AB7184578C57D5949CCB41B",
         16),
      // 264
      new BigInteger(
         "115B8B692E0E045692CF280B436735C77A5A9E8A9E7ED56C965F87DB5B2A2ECE3",
         16)
   };

   // Constructor(s)
   // -------------------------------------------------------------------------

   public PasswordFile() throws IOException {
      this(DEFAULT_FILE);
   }

   public PasswordFile(File pwFile) throws IOException {
      this(pwFile.getAbsolutePath());
   }

   public PasswordFile(String pwName) throws IOException {
      this(pwName, pwName+"2", pwName+".conf");
   }

   public PasswordFile(String pwName, String confName) throws IOException {
      this(pwName, pwName+"2", confName);
   }

   public PasswordFile(String pwName, String pw2Name, String confName)
   throws IOException {
      this.pwName =   pwName;
      this.pw2Name =  pw2Name;
      this.confName = confName;

      readOrCreateConf();
      update();
   }

   // Class methods
   // -------------------------------------------------------------------------

   // SRP password configuration file methods
   // -------------------------------------------------------------------------

   public synchronized boolean containsConfig(String index) throws IOException {
      cat.debug("==> containsConfig(\""+index+"\")");

      checkCurrent();
      boolean result = configurations.containsKey(index);

      cat.debug("<== containsConfig() --> "+result);
      return result;
   }

   public synchronized String[] lookupConfig(String index) throws IOException {
      cat.debug("==> lookupConfig(\""+index+"\")");

      checkCurrent();

      String[] result = null;
      if (configurations.containsKey(index))
         result = (String[]) configurations.get(index);

      cat.debug("<== lookupConfig()");
      return result;
   }

   // SRP base and extended password configuration files methods
   // -------------------------------------------------------------------------

   public synchronized boolean contains(String user) throws IOException {
      cat.debug("==> contains(\""+user+"\")");

      checkCurrent();
      boolean result = entries.containsKey(user);

      cat.debug("<== contains() --> "+result);
      return result;
   }

   public synchronized void
   add(String user, String passwd, byte[] salt, String index)
   throws IOException {
      cat.debug("==> add()");

      checkCurrent();

      if (entries.containsKey(user))
         throw new UserAlreadyExistsException(user);

      HashMap fields = new HashMap(4);
      fields.put(USER_FIELD,      user); // 0
      fields.put(VERIFIERS_FIELD, newVerifiers(salt, user, passwd, index)); // 1
      fields.put(SALT_FIELD,      SaslUtil.tob64(salt)); // 2
      fields.put(CONFIG_FIELD,    index); // 3

      entries.put(user, fields);
      savePasswd();

      cat.debug("<== add()");
   }

   public synchronized void changePasswd(String user, String passwd)
   throws IOException {
      cat.debug("==> changePasswd()");

      checkCurrent();

      if (!entries.containsKey(user))
         throw new NoSuchUserException(user);

      HashMap fields = (HashMap) entries.get(user);
      byte[] salt;
      try {
         salt = SaslUtil.fromb64((String) fields.get(SALT_FIELD));
      } catch (NumberFormatException x) {
         throw new IOException("Password file corrupt");
      }

      String index = (String) fields.get(CONFIG_FIELD);
      fields.put(VERIFIERS_FIELD, newVerifiers(salt, user, passwd, index));
      entries.put(user, fields);
      savePasswd();

      cat.debug("<== changePasswd()");
   }

   public synchronized void savePasswd() throws IOException {
      cat.debug("==> savePasswd()");

      FileOutputStream f1 = new FileOutputStream(passwdFile);
      FileOutputStream f2 = new FileOutputStream(passwd2File);
      PrintWriter pw1 = null;
      PrintWriter pw2 = null;
      try {
         pw1 = new PrintWriter(f1, true);
         pw2 = new PrintWriter(f2, true);
         this.writePasswd(pw1, pw2);
      } finally {
         if (pw1 != null) {
            try {
               pw1.flush();
            } finally {
               pw1.close();
            }
         }

         if (pw2 != null) {
            try {
               pw2.flush();
            } finally {
               pw2.close();
            }
         }

         if (f1 != null) {
            try {
               f1.close();
            } catch (IOException ignored) {
            }
         }

         if (f2 != null) {
            try {
               f2.close();
            } catch (IOException ignored) {
            }
         }
      }

      lastmodPasswdFile = passwdFile.lastModified();
      lastmodPasswd2File = passwd2File.lastModified();

      cat.debug("<== savePasswd()");
   }

   /**
    * Returns the triplet: verifier, salt and configuration file index, of a
    * designated user, and a designated message digest algorithm name, as an
    * array of strings.
    *
    * @param user the username.
    * @param mdName the canonical name of the SRP's message digest algorithm.
    * @return a string array containing, in this order, the verifier, the salt
    * and the index in the password configuration file of the MPIs N and g
    * of the designated user.
    */
   public synchronized String[] lookup(String user, String mdName)
   throws IOException {
      cat.debug("==> lookup(\""+user+"\", \""+mdName+"\")");

      checkCurrent();

      if (!entries.containsKey(user))
         throw new NoSuchUserException(user);

      HashMap fields = (HashMap) entries.get(user);
      String U =           (String) fields.get(USER_FIELD);
      HashMap verifiers = (HashMap) fields.get(VERIFIERS_FIELD);
      String salt =        (String) fields.get(SALT_FIELD);
      String index =       (String) fields.get(CONFIG_FIELD);
      String verifier = (String) verifiers.get(SRPUtil.nameToID(mdName));

      String[] result = new String[] { verifier, salt, index };
      cat.debug("<== lookup()");
      return result;
   }

   // Other instance methods
   // -------------------------------------------------------------------------

   private synchronized void readOrCreateConf() throws IOException {
      cat.debug("==> readOrCreateConf()");

      configurations.clear();
      FileInputStream fis;

      cat.debug("About to read "+String.valueOf(confName));
      configFile = new File(confName);
      lastmodConfigFile = configFile.lastModified();
      try {
         fis = new FileInputStream(configFile);
         readConf(fis);
      } catch (FileNotFoundException x) { // create a default one
         cat.info("About to create a new .conf file with default values...");
         String g = SaslUtil.tob64(SaslUtil.trim(new BigInteger("2")));
         String index, N;
         for (int i = 0; i < Nsrp.length; i++) {
            index = String.valueOf(i+1);
            N = SaslUtil.tob64(SaslUtil.trim(Nsrp[i]));
            configurations.put(index, new String[] {N, g});
         }

         FileOutputStream f0 = null;
         PrintWriter pw0 = null;
         try {
            f0 = new FileOutputStream(configFile);
            pw0 = new PrintWriter(f0, true);
            this.writeConf(pw0);
         } finally {
            if (pw0 != null)
               pw0.close();
            else if (f0 != null)
               f0.close();
         }

         lastmodConfigFile = configFile.lastModified();
      }

      cat.debug("<== readOrCreateConf()");
   }

   private void readConf(InputStream in) throws IOException {
      BufferedReader din = new BufferedReader(new InputStreamReader(in));
      String line, index, N, g;
      StringTokenizer st;
      while ((line = din.readLine()) != null) {
         st = new StringTokenizer(line, ":");
         try {
            index = st.nextToken();
            N = st.nextToken();
            g = st.nextToken();
         } catch (NoSuchElementException x) {
            throw new IOException("SRP password configuration file corrupt");
         }

         configurations.put(index, new String[] {N, g});
      }
   }

   private void writeConf(PrintWriter pw) throws IOException {
      String ndx;
      String[] mpi;
      StringBuffer sb;
      for (Iterator it = configurations.keySet().iterator(); it.hasNext(); ) {
         ndx = (String) it.next();
         mpi = (String[]) configurations.get(ndx);
         sb = new StringBuffer()
            .append(ndx).append(":").append(mpi[0]).append(":").append(mpi[1]);

         pw.println(sb.toString());
      }
   }

   private HashMap
   newVerifiers(byte[] salt, String username, String password, String index)
   throws IOException {
      cat.debug("==> newVerifiers(salt, \""+String.valueOf(username)+"\", \""+String.valueOf(password)+"\", "+String.valueOf(index)+")");

      String[] mpi = (String[]) configurations.get(index);
      BigInteger N = new BigInteger(1, SaslUtil.fromb64(mpi[0]));
      BigInteger g = new BigInteger(1, SaslUtil.fromb64(mpi[1]));

      HashMap result = new HashMap(6);
      MessageDigest hash;
      BigInteger x, v;
      String verifier, digestID;
      SRP srp;

      for (int i = 0; i < srps.size(); i++) {
         digestID = String.valueOf(i);
         srp = (SRP) srps.get(digestID);
         hash = srp.newDigest();
         hash.update(salt);
         hash.update(srp.userHash(username, password));
         x = new BigInteger(1, hash.digest());
         v = g.modPow(x, N);
         verifier = SaslUtil.tob64(v.toByteArray());

         result.put(digestID, verifier);
      }

      cat.debug("<== newVerifiers()");
      return result;
   }

   private synchronized void update() throws IOException {
      cat.debug("==> update()");

      entries.clear();

      FileInputStream fis;

      cat.debug("About to [over-]write "+String.valueOf(pwName));
      passwdFile = new File(pwName);
      lastmodPasswdFile = passwdFile.lastModified();
      try {
         fis = new FileInputStream(passwdFile);
         readPasswd(fis);
      } catch (FileNotFoundException x) {
         cat.warn("update(): "+String.valueOf(x)+". Ignored...");
      }

      cat.debug("About to [over-]write "+String.valueOf(pw2Name));
      passwd2File = new File(pw2Name);
      lastmodPasswd2File = passwd2File.lastModified();
      try {
         fis = new FileInputStream(passwd2File);
         readPasswd2(fis);
      } catch (FileNotFoundException x) {
         cat.warn("update(): "+String.valueOf(x)+". Ignored...");
      }

      cat.debug("<== update()");
   }

   private void checkCurrent() throws IOException {
      if (passwdFile.lastModified() > lastmodPasswdFile
            || passwd2File.lastModified() > lastmodPasswd2File)
         update();
   }

   private void readPasswd(InputStream in) throws IOException {
      BufferedReader din = new BufferedReader(new InputStreamReader(in));
      String line, user, verifier, salt, index;
      StringTokenizer st;
      while ((line = din.readLine()) != null) {
         st = new StringTokenizer(line, ":");
         try {
            user     = st.nextToken();
            verifier = st.nextToken();
            salt     = st.nextToken();
            index    = st.nextToken();
         } catch (NoSuchElementException x) {
            throw new IOException("SRP base password file corrupt");
         }

         HashMap verifiers = new HashMap(6);
         verifiers.put("0", verifier);

         HashMap fields = new HashMap(4);
         fields.put(USER_FIELD,      user);
         fields.put(VERIFIERS_FIELD, verifiers);
         fields.put(SALT_FIELD,      salt);
         fields.put(CONFIG_FIELD,    index);

         entries.put(user, fields);
      }
   }

   private void readPasswd2(InputStream in) throws IOException {
      BufferedReader din = new BufferedReader(new InputStreamReader(in));
      String line, digestID, user, index, verifier;
      StringTokenizer st;
      HashMap fields, verifiers;
      while ((line = din.readLine()) != null) {
         st = new StringTokenizer(line, ":");
         try {
            digestID = st.nextToken();
            user     = st.nextToken();
            verifier = st.nextToken();
         } catch (NoSuchElementException x) {
            throw new IOException("SRP extended password file corrupt");
         }

         fields = (HashMap) entries.get(user);
         if (fields != null) {
            verifiers = (HashMap) fields.get(VERIFIERS_FIELD);
            verifiers.put(digestID, verifier);
         }
      }
   }

   private void writePasswd(PrintWriter pw1, PrintWriter pw2)
   throws IOException {
      String user, digestID;
      HashMap fields, verifiers;
      StringBuffer sb1, sb2;
      Iterator j, i = entries.keySet().iterator();
      while (i.hasNext()) {
         user = (String) i.next();
         fields = (HashMap) entries.get(user);
         if (!user.equals((String) fields.get(USER_FIELD)))
            throw new IOException("Inconsistent SRP password data");

         verifiers = (HashMap) fields.get(VERIFIERS_FIELD);
         sb1 = new StringBuffer()
            .append(user).append(":")
            .append((String) verifiers.get("0")).append(":")
            .append((String) fields.get(SALT_FIELD)).append(":")
            .append((String) fields.get(CONFIG_FIELD));

         pw1.println(sb1.toString());

         // write extended information
         j = verifiers.keySet().iterator();
         while (j.hasNext()) {
            digestID = (String) j.next();
            if (!"0".equals(digestID)) {
               // #0 is the default digest, already present in tpasswd!
               sb2 = new StringBuffer()
                  .append(digestID).append(":")
                  .append(user).append(":")
                  .append((String) verifiers.get(digestID));

               pw2.println(sb2.toString());
            }
         }
      }
   }
}
