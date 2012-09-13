package test;

// $Id: HelloImpl.java,v 1.4 2001/11/02 11:11:06 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.rmi.SaslClientSocketFactory;
import cryptix.sasl.rmi.SaslServerSocketFactory;
import cryptix.sasl.srp.PasswordFile;
import cryptix.sasl.srp.SRPParams;

import java.io.File;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;
import java.security.Security;
import java.util.Random;
import javax.security.sasl.Sasl;

import org.apache.log4j.Category;

public class HelloImpl implements Hello
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(HelloImpl.class);

   private int counter = 0;

   // Constructor(s)
   // -------------------------------------------------------------------------

   // remote Instance methods
   // -------------------------------------------------------------------------

   public synchronized String sayHello() throws RemoteException {
      cat.debug("==> sayHello()");

      counter++;
      String result = "["+String.valueOf(counter)+"] Hello World...";

      cat.debug("<== sayHello()");
      return result;
   }

   // Class methods
   // -------------------------------------------------------------------------

   public static void main(String[] args) {
      Security.addProvider(new cryptix.jce.provider.CryptixCrypto());
      Sasl.setSaslServerFactory(new cryptix.sasl.ServerFactory());

      if (args != null && args.length == 1 && "DEBUG".equals(args[0]))
         System.getProperties().setProperty("DEBUG", "xxx");

      try {
         String user = InetAddress.getLocalHost().getHostAddress();

         cat.info("1. Updating user password info");
         cat.info("Checking existence of password file. Creating it if new...");
         String pFile = System.getProperty(SRPParams.PASSWORD_FILE, "./etc/tpasswd");
         cat.info("SRP password file: \""+pFile+"\"");
         File f = new File(pFile);
         if (!f.exists()) {
            cat.info("Creating new file \""+f.getCanonicalPath()+"\"");
            if (f.createNewFile())
               f.deleteOnExit();
         } else if (!f.isFile())
            throw new RuntimeException("File object ("+pFile+") exists but is not a file");
         else if (!f.canRead() || !f.canWrite())
            throw new RuntimeException("File ("+pFile+") exists but is not accessible");

         f = null;

         PasswordFile tpasswd = new PasswordFile(pFile);
         String password = "rmi";
         if (!tpasswd.contains(user)) {
            cat.info("Adding RMI user...");
            byte[] testSalt = new byte[10];
            new Random().nextBytes(testSalt);
            tpasswd.add(user, password, testSalt, "1");
            cat.info("Added RMI user...");
         } else {
            cat.info("Updating RMI user...");
            tpasswd.changePasswd(user, password);
            cat.info("Updated RMI user...");
         }

         tpasswd.savePasswd();
         tpasswd = null;


         cat.info("2. Installing a security manager");
         if (System.getSecurityManager() == null) {
            cat.info("Installing the RMISecurityManager...");
            System.setSecurityManager(new RMISecurityManager());
            cat.info("Installed the RMISecurityManager...");
         } else {
            cat.info("Security manager already installed...");
         }


         cat.info("3. Exporting the servant object");
         Naming.rebind(
            "/HelloServant",
            UnicastRemoteObject.exportObject(
               new HelloImpl(),
               0,
               new SaslClientSocketFactory(),
               new SaslServerSocketFactory()));

         cat.info("HelloServant bound in registry and ready to accept remote invocation(s)...");

      } catch (Exception x) {
         cat.error("HelloImpl exception: ", x);
      }
   }
}
