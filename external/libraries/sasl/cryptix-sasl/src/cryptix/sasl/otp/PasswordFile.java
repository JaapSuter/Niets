package cryptix.sasl.otp;

// $Id: PasswordFile.java,v 1.9 2001/10/18 09:54:03 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

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
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.apache.log4j.Category;

/**
 *
 *
 * @version $Revision: 1.9 $
 */
public class PasswordFile implements OTPParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(PasswordFile.class);

   private static String DEFAULT_FILE;
   static {
      DEFAULT_FILE = System.getProperty(PASSWORD_FILE, DEFAULT_PASSWORD_FILE);
   }

   private Hashtable entries;
   private File passwdFile;
   private long lastmod;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public PasswordFile() throws IOException {
      this(DEFAULT_FILE);
   }

   public PasswordFile(File pwFile) throws IOException {
      this(pwFile.getAbsolutePath());
   }

   public PasswordFile(String fileName) throws IOException {
      this.passwdFile = new File(fileName);
      update();
   }

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   public synchronized void
//   add(String user, String algorithm, int seqnum, String seed, String lastHash)
   add(String user, String algorithm, String seqnum, String seed, String lastHash)
   throws IOException {
      cat.debug("==> add()");

      checkCurrent();
      if (entries.containsKey(user))  // check if the entry exists
         throw new UserAlreadyExistsException(user);

      String[] fields = new String[5]; // create the new entry
      fields[0] = user;
      fields[1] = algorithm;
//      fields[2] = new Integer(seqnum).toString();
      fields[2] = seqnum;
      fields[3] = seed;
      fields[4] = lastHash;
      entries.put(user, fields);
      savePasswd();

      cat.debug("<== add()");
   }

   public synchronized void
   change(String user, String algorithm, String sequence, String seed,
          String newOTP) throws IOException {
      cat.debug("==> changePasswd()");

      checkCurrent();
      if (!entries.containsKey(user)) { // check if the entry exists
         throw new NoSuchUserException(user);
      }

      String[] fields = (String[]) entries.get(user); // get the existing entry
      fields[1] = algorithm; // modify fields
      fields[2] = sequence;
      fields[3] = seed;
      fields[4] = newOTP;
      entries.remove(user); // delete the existing entry
      entries.put(user, fields); // add the new entry
      savePasswd();

      cat.debug("<== changePasswd()");
   }

   public synchronized String[] lookup(String user) throws IOException {
      cat.debug("==> lookup()");

      checkCurrent();
      if (entries.containsKey(user)) {
         throw new NoSuchUserException(user);
      }

      cat.debug("<== lookup()");
      return (String[]) entries.get(user);
   }

   public synchronized boolean contains(String user) throws IOException {
      cat.debug("==> contains(\""+user+"\")");

      checkCurrent();
      boolean result = entries.containsKey(user);

      cat.debug("<== contains() --> "+result);
      return result;
   }

   private synchronized void update() throws IOException {
      lastmod = passwdFile.lastModified();
      readPasswd(new FileInputStream(passwdFile));
   }

   private void checkCurrent() throws IOException {
      if ((passwdFile.lastModified() > lastmod)) {
         update();
      }
   }

   private synchronized void readPasswd(InputStream in) throws IOException {
      BufferedReader din = new BufferedReader(new InputStreamReader(in));
      String line;
      entries = new Hashtable();
      while ((line = din.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(line, ":");
         String[] fields = new String[5];
         try {
            fields[0] = st.nextToken(); // userid
            fields[1] = st.nextToken(); // algorithm
            fields[2] = st.nextToken(); // sequence
            fields[3] = st.nextToken(); // seed
            fields[4] = st.nextToken(); // lastHash
         } catch (NoSuchElementException x) {
            throw new IOException("Password file corrupt: "+String.valueOf(x));
         }

         entries.put(fields[0], fields);
      }
   }

   private synchronized void savePasswd() throws IOException {
      cat.debug("==> savePasswd()");

      if (passwdFile != null) {
         FileOutputStream fos = new FileOutputStream(passwdFile);
         PrintWriter pw = null;
         try {
            pw = new PrintWriter(fos);
            String key;
            String[] fields;
            StringBuffer sb;
            Enumeration keys = entries.keys();
            while (keys.hasMoreElements()) {
               key = (String) keys.nextElement();
               fields = (String[]) entries.get(key);
               sb = new StringBuffer(fields[0]);
               for (int i = 1; i < fields.length; i++) {
                  sb.append(":"+fields[i]);
               }

               pw.println(sb.toString());
            }
         } finally {
            if (pw != null) {
               try {
                  pw.flush();
               } finally {
                  pw.close();
               }
            }

            if (fos != null) {
               try {
                  fos.close();
               } catch (IOException ignored) {
               }
            }

            lastmod = passwdFile.lastModified();
         }
      }

      cat.debug("<== savePasswd()");
   }
}
