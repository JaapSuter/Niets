package test;

// $Id: HelloClient.java,v 1.3 2001/11/02 11:11:06 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.security.Security;
import javax.security.sasl.Sasl;

public class HelloClient implements Runnable
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   // Class methods
   // -------------------------------------------------------------------------

   public static void main(String[] ignored) {
      Security.addProvider(new cryptix.jce.provider.CryptixCrypto());
      Sasl.setSaslClientFactory(new cryptix.sasl.ClientFactory());

      if (System.getSecurityManager() == null)
         System.setSecurityManager(new RMISecurityManager());

      int limit = 5;
      Thread[] workers = new Thread[limit];
      for (int i = 0; i < limit; i++) {
         workers[i] = new Thread(new HelloClient(), "worker-"+String.valueOf(i+1));
         workers[i].start();
      }
   }

   // Instance methods
   // -------------------------------------------------------------------------

   public void run() {
      try {
         Hello obj = (Hello) Naming.lookup("/HelloServant");
         String message = obj.sayHello();
         System.out.println("Eureka: "+String.valueOf(message));
      } catch (Exception x) {
         System.out.println("HelloClient exception: "+String.valueOf(x));
         x.printStackTrace(System.err);
      }
   }
}