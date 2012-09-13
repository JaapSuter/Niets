package cryptix.sasl.plain;

// $Id: PasswordFile.java,v 1.4 2001/10/16 11:04:17 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.UserAlreadyExistsException;

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
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

import org.apache.log4j.Category;

/**
 *
 *
 * @version $Revision: 1.4 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class PasswordFile implements PlainParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(PasswordFile.class);
   private static String DEFAULT_FILE;
   static
   {
      DEFAULT_FILE = System.getProperty(PASSWORD_FILE, DEFAULT_PASSWORD_FILE);
   }

   private Hashtable entries;
   private File passwdFile;
   private String[] last_params;
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
      passwdFile = new File(fileName);
      update();
   }

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   public synchronized void add(String user, String passwd, String[] attributes)
   throws IOException {
      checkCurrent();
      if (entries.containsKey(user)) {
         throw new UserAlreadyExistsException(user);
      }

      if (attributes.length != 5) {
         throw new IllegalArgumentException("Wrong number of attributes");
      }

      // create the new entry
      String[] fields = new String[7];
      fields[0] = user;
      fields[1] = passwd;
      System.arraycopy(attributes, 0, fields, 2, 5);
      entries.put(user, fields);

      savePasswd();
   }

   public synchronized void changePasswd(String user, String passwd)
   throws IOException {
      checkCurrent();
      if (!entries.containsKey(user)) {
         throw new NoSuchUserException(user);
      }

      String[] fields = (String[])entries.get(user); // get the existing entry
      fields[1] = passwd; // modify the password field
      entries.remove(user); // delete the existing entry
      entries.put(user, fields); // add the new entry

      savePasswd();
   }

   public synchronized String[] lookup(String user) throws IOException {
      checkCurrent();
      if (!entries.containsKey(user)) {
         throw new NoSuchUserException(user);
      }

      return (String[]) entries.get(user);
   }

   public synchronized boolean contains(String s) throws IOException {
      checkCurrent();
      return entries.containsKey(s);
   }

   //----------------------------------------------------------------//

   private synchronized void update() throws IOException {
      lastmod = passwdFile.lastModified();
      readPasswd(new FileInputStream(passwdFile));
   }

   private void checkCurrent() throws IOException {
      if (passwdFile.lastModified() > lastmod) {
         update();
      }
   }

   private synchronized void readPasswd(InputStream in) throws IOException {
      BufferedReader din = new BufferedReader(new InputStreamReader(in));
      String line;
      entries = new Hashtable();
      String[] fields = new String[7];
      while((line = din.readLine()) != null) {
         StringTokenizer st = new StringTokenizer(line,":",true);
         try {
            fields[0] = st.nextToken(); // username
            st.nextToken();

            fields[1] = st.nextToken(); // passwd
            if (fields[1].equals(":")) {
               fields[1] = "";
            } else {
               st.nextToken();
            }

            fields[2] = st.nextToken(); // uid
            if (fields[2].equals(":")) {
               fields[2] = "";
            } else {
               st.nextToken();
            }

            fields[3] = st.nextToken(); // gid
            if (fields[3].equals(":")) {
               fields[3] = "";
            } else {
               st.nextToken();
            }

            fields[4] = st.nextToken(); // gecos
            if (fields[4].equals(":")) {
               fields[4] = "";
            } else {
               st.nextToken();
            }

            fields[5] = st.nextToken(); // dir
            if (fields[5].equals(":")) {
               fields[5] = "";
            } else {
               st.nextToken();
            }

            fields[6] = st.nextToken(); // shell
            if (fields[6].equals(":")) {
               fields[6] = "";
            }
         } catch (NoSuchElementException ignored) {
            continue;
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
