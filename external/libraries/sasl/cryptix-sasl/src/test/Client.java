package test;

// $Id: Client.java,v 1.6 2001/11/02 11:09:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.jce.provider.CryptixCrypto;

import java.io.OutputStream;
import java.net.URL;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.security.sasl.Sasl;

import org.apache.log4j.Category;

/**
 * A basic client-side test class to exercise SASL mechanisms.<p>
 *
 * The <tt>main()</tt> method accepts two arguments: the first is the number
 * of threads and the second is the port number on which the server is
 * listening.
 *
 * @version $Revision: 1.6 $
 * @since draft-burdis-cat-sasl-srp-04
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class Client implements Runnable
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(Client.class);

   String port;
   String mechanism;

   // Constructor(s)
   // -------------------------------------------------------------------------

   private Client(String mechanism, String port) {
      super();

      this.mechanism = mechanism;
      this.port = port;
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * A simple test client that connects to the test server over SASL
    * connections.
    *
    * @param args[0] the name of the SASL mechanism to exercise.
    * @param args[1] the number of working threads to exercise simultaneously.
    * @param args[2] port number where to connect to the server.
    */
   public static void main(String[] args) throws Exception {
      Security.addProvider(new CryptixCrypto());
      Sasl.setSaslClientFactory(new cryptix.sasl.ClientFactory());

      String mechanism = args[0];
      int limit = Integer.parseInt(args[1]);
      String port = args[2];

      cat.info("Starting...");
      ArrayList threads = new ArrayList();
      ListIterator it = threads.listIterator();
      while (limit-- > 0)
         it.add(new Thread(new Client(mechanism, port), "C"+String.valueOf(limit)));

      it = threads.listIterator();
      while (it.hasNext())
         ((Thread) it.next()).start();

      boolean loop = true;
      do {
         try {
            Thread.currentThread().sleep(3000);
         } catch (InterruptedException x) {
            cat.warn(x);
         }

         it = threads.listIterator();
         while (it.hasNext())
            loop &= ((Thread) it.next()).isAlive();
      } while (loop);


      cat.info("Exiting...");
   }

   // Instance methods
   // -------------------------------------------------------------------------

   public void run() {
      String name = Thread.currentThread().getName();
      cat.info("Client "+name+" starting...");
      try {
         URL url = new URL("http://test:test@localhost:"+port+"/");
         SaslConnection channel = new SaslConnection(mechanism, url);

         byte[] result;
         String message;

         channel.connect();
         message = "There is more than one way to do it";
         channel.send(message.getBytes("ASCII"));
         result = channel.receive();

         // write another string re-using the same session!
         channel.reconnect();
         message = "1 if by land. 2 if by sea...";
         channel.send(message.getBytes("ASCII"));
         result = channel.receive();
      } catch (Exception x) {
         cat.fatal(x);
         x.printStackTrace(System.err);
      }

      cat.info("Client "+name+" shutdown...");
   }
}
