package test;

// $Id: Server.java,v 1.7 2001/11/02 11:09:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.jce.provider.CryptixCrypto;
import cryptix.sasl.SaslInputStream;
import cryptix.sasl.SaslOutputStream;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.srp.PasswordFile;
import cryptix.sasl.srp.SRPParams;

import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.security.Provider;
import java.security.Security;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslServer;

import org.apache.log4j.Category;

/**
 * A basic server-side test class to exercise SASL mechanisms that exchange
 * their response/challenge in SASL Buffers. At the time of testing this code,
 * only two such mechanisms are included in the library: SRP and SM2!<p>
 *
 * The <tt>main()</tt> method accepts two arguments: the first is the number
 * in milliseconds for the read timeout operation, and the second is the port
 * number on which to listen.
 *
 * @version $Revision: 1.7 $
 * @since draft-burdis-cat-sasl-srp-04
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class Server implements Runnable
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(Server.class);

   private static final Hashtable pool = new Hashtable();

   private static int port;
   private static int timeout;
   private static long counter = 0L;
   private static String user = "test";
   private static String password = "test";

   private ServerSocket server;

   // Constructor(s)
   // -------------------------------------------------------------------------

   Server(ServerSocket ss) {
      super();

      server = ss;
      listen();
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * A simple test server that handles SASL connections. Use Ctrl-C to kill it.
    * It should activate a shutdown thread that will orderly close all live
    * worker threads before exiting.
    *
    * @param args[0] timeout, in millis, for client connections.
    * @param args[1] port number where to listen for incoming connections.
    */
   public static final void main(String[] args) throws IOException {
      Security.addProvider(new CryptixCrypto());
      Sasl.setSaslServerFactory(new cryptix.sasl.ServerFactory());

         cat.info("1. Updating 'test' user password info");
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
         if (!tpasswd.contains(user)) {
            cat.info("Adding test user...");
            byte[] testSalt = new byte[10];
            new Random().nextBytes(testSalt);
            tpasswd.add(user, password, testSalt, "1");
            cat.info("Added test user...");
         } else {
            cat.info("Updating test user...");
            tpasswd.changePasswd(user, password);
            cat.info("Updated test user...");
         }

         tpasswd.savePasswd();
         tpasswd = null;

      timeout = Integer.valueOf(args[0]).intValue();
      port = Integer.valueOf(args[1]).intValue();
      final ServerSocket ss = new ServerSocket(port);
      new Server(ss);

      cat.info("Server ready...");

      Runtime.getRuntime().addShutdownHook(
         new Thread() {
            public void run() {
               cat.info("Started shutdown...");

               try {
                  cat.info("Closing server socket...");
                  ss.close();
                  cat.info("Closed server socket...");
               } catch (IOException ignored) {
                  cat.warn("Exception while shutting down. Ignored...", ignored);
               }

               cat.info("Interrupting "+String.valueOf(pool.size())+" waiting connection thread(s)...");
               Iterator it = pool.entrySet().iterator();
               while (it.hasNext()) {
                  Thread t = (Thread)((Map.Entry) it.next()).getValue();
                  String name = t.getName();
                  cat.info("Interrupting connection "+name+"...");
                  try {
                     t.interrupt();
                     t.join();
                  } catch (Exception ignored) {
                     cat.warn("Exception ("+ignored.getMessage()+") while interrupting/joining "+name+". Ignored...");
                     ignored.printStackTrace(System.err);
                  }

                  cat.info("Interrupted connection "+name+"...");
               }

               cat.info("Completed shutdown. Exiting...");
            }
         }
      );
   }

   private static final byte[] mungeSaslBuffer(InputStream in)
   throws IOException {
      byte[] header = new byte[4];
      int check = in.read(header);
      if (check == -1)
         throw new EOFException();
      else if (check != 4)
         throw new IOException();

      int length = (header[0] & 0xFF) << 24 |
                   (header[1] & 0xFF) << 16 |
                   (header[2] & 0xFF) <<  8 |
                   (header[3] & 0xFF);
      byte[] result = new byte[length + 4];
      System.arraycopy(header, 0, result, 0, 4);
      check = in.read(result, 4, length);
      if (check == -1)
         throw new EOFException();
      else if (check != length)
         throw new IOException();

      return result;
   }

   // Runnable interface methods implementation
   // -------------------------------------------------------------------------

   public void run() {
      Socket socket;
      try {
         socket = server.accept();
      } catch (IOException x) {
         cat.fatal("run(). Server shutdown...", x);
         return;
      }

      listen();

      InputStream in;
      OutputStream out;
      InputStream secureIn;
      OutputStream secureOut;
      try {
         socket.setSoTimeout(timeout);
         socket.setTcpNoDelay(true);

         in = socket.getInputStream();
         out = socket.getOutputStream();
         int c;
         StringBuffer sb = new StringBuffer();
         while ((c = in.read()) != 0x00)
            sb.append((char) c);

         String mechanism = sb.toString();
         cat.info("Requested authentication mechanism: "+mechanism);

         Hashtable properties = new Hashtable();
         properties.put(Sasl.SERVER_PKGS, "cryptix.sasl");
         properties.put(SRPParams.SRP_REPLAY_DETECTION, "true");
         properties.put(SRPParams.SRP_INTEGRITY_PROTECTION, "true");
         properties.put(SRPParams.SRP_CONFIDENTIALITY, "true");

         SaslServer server = Sasl.createSaslServer(mechanism, null, null, properties, null);
         if (server == null)
            throw new RuntimeException("Unable to find "+mechanism+" SASL mechanism");

         byte[] response, challenge;

         do {
            response = mungeSaslBuffer(in);
            challenge = server.evaluateResponse(response);
            if (challenge != null)
               out.write(challenge);
            else if (!server.isComplete())
               // is null. only valid if server authentication is complete
               throw new RuntimeException("Challenge null but server incomplete");
            else
               break;
         } while (!server.isComplete());

         cat.info("************** Connection authenticated....");

         secureIn =  new SaslInputStream( server, in );
         secureOut = new SaslOutputStream(server, out);

         byte[] rpcCall, retValue;

         rpcCall = receive(secureIn);
         retValue = call(rpcCall);
         send(retValue, secureOut);

      } catch (Exception x) {
         cat.error("Exception while processing connection", x);
      } finally {
         cat.info("Connection shutdown...");
         try {
            socket.close();
         } catch (IOException ignored) {
            cat.warn("Exception ("+ignored.getMessage()+") while shutting down the connection. Ignored...");
         }

         pool.remove(Thread.currentThread().getName());
      }
   }

   // other Instance methods
   // -------------------------------------------------------------------------

   void listen() {
      String name = "CONN-"+String.valueOf(++counter);
      Thread t = new Thread(this, name);
      pool.put(name, t);
      t.start();
   }

   private void send(byte[] message, OutputStream out) throws IOException {
//      cat.debug("Outgoing message (hex): "+SaslUtil.dumpString(message));
      cat.debug("Outgoing message (str): "+new String(message));
      out.write(message);
   }

   private byte[] receive(InputStream in) throws IOException {
      int first = in.read();
      int limit = in.available();
      byte[] result = new byte[limit+1];
      result[0] = (byte) first;
      in.read(result, 1, limit);

//      cat.debug("Incoming response (hex): "+SaslUtil.dumpString(result));
      cat.debug("Incoming response (str): "+new String(result));
      return result;
   }

   private byte[] call(byte[] request) {
      return "ok".getBytes();
   }
}
