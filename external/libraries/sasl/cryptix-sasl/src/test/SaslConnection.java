package test;

// $Id: SaslConnection.java,v 1.6 2001/11/02 11:09:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslInputStream;
import cryptix.sasl.SaslOutputStream;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.srp.SRPParams;

import java.io.EOFException;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.StringTokenizer;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.*;

import org.apache.log4j.Category;

/**
 * A sample client-side protocol driver.
 *
 * @version $Revision: 1.6 $
 * @since draft-burdis-cat-sasl-srp-04
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class SaslConnection
{
   // Constants and variables
   // --------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SaslConnection.class);

   private String[] mechanisms;

   private boolean connected;
   private String id;
   private String service;
   private String serverName;
   private int port;
   private CallbackHandler cbh;
   private Hashtable properties;
   private String mechanism;
   private transient Socket socket;

   private SaslClient client;

   private InputStream in;
   private OutputStream out;
   private InputStream secureIn;
   private OutputStream secureOut;

   // Constructor(s)
   // --------------------------------------------------------------------------

   public SaslConnection(String m, URL url) throws SaslException, IOException {
      super();

      mechanisms = new String[] { m };
      String userInfo = url.getUserInfo();
      properties = new Hashtable();
      int ndx = userInfo.indexOf(':');
      if (ndx == -1)
         id = userInfo;
      else {
         id = userInfo.substring(0, ndx);
         properties.put(SaslParams.PASSWORD, userInfo.substring(ndx+1));
      }

      service = url.getProtocol();
      serverName = url.getHost();
      port = url.getPort();
      properties.put(SaslParams.USERNAME, id);
      properties.put(Sasl.CLIENT_PKGS, "cryptix.sasl");
      properties.put(SRPParams.SRP_REPLAY_DETECTION, "true");
      properties.put(SRPParams.SRP_INTEGRITY_PROTECTION, "true");
      properties.put(SRPParams.SRP_CONFIDENTIALITY, "true");
      cbh = new SimpleCallbackHandler();

      disconnect();
   }

   // Class methods
   // -------------------------------------------------------------------------

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
      cat.debug("Expecting "+String.valueOf(length)+" byte(s) from the stream...");
      byte[] result = new byte[length + 4];
      System.arraycopy(header, 0, result, 0, 4);
      check = in.read(result, 4, length);
      if (check == -1)
         throw new EOFException();
      else if (check != length)
         throw new IOException();

      return result;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Returns <tt>true</tt> if the communications link with the end-point has
    * been established; <tt>false</tt> otherwise.
    *
    * @return <tt>true</tt> or <tt>false</tt> depending on wether the
    * communications link with the end-point has been established or not.
    */
   public boolean isConnected() {
      return connected;
   }

   public void connect() throws IOException {
      if (connected)
         return;

      socket = new Socket(serverName, port);
      in = socket.getInputStream();
      out = socket.getOutputStream();

      // authentication layer ----------------------------------------------

      out.write(mechanism.getBytes("ASCII"));
      out.write(0x00);

      byte[] challenge, response;

      if (client.hasInitialResponse()) {
         response = client.evaluateChallenge(null);
         out.write(response);
      }

      while (!client.isComplete()) {
         challenge = mungeSaslBuffer(in);
         response = client.evaluateChallenge(challenge);
         if (response != null)
            out.write(response);
         else if (!client.isComplete())
            // is null. only valid if client authentication is complete
            throw new RuntimeException("Response null but client incomplete");
         else
            break;
      }

      secureIn =  new SaslInputStream( client, in );
      secureOut = new SaslOutputStream(client, out);

      connected = true;
   }

   /**
    * Returns an input stream that reads from this open connection.
    *
    * @return an input stream that reads from this open connection.
    * @exception IOException if an I/O error occurs while creating the input
    * stream.
    * @exception IllegalStateException if this method was invoked before the
    * connection was opened; ie. the authentication phase has not yet occured.
    */
   public InputStream getInputStream() throws IOException {
      if (!connected)
         throw new IllegalStateException();

      return secureIn;
   }

   /**
    * Returns an output stream that writes to this connection.
    *
    * @return an output stream that writes to this connection.
    * @exception IOException if an I/O error occurs while creating the output
    * stream.
    * @exception IllegalStateException if this method was invoked before the
    * connection was opened; ie. the authentication phase has not yet occured.
    */
   public OutputStream getOutputStream() throws IOException {
      if (!connected)
         throw new IllegalStateException();

      return secureOut;
   }

   public void send(byte[] message) throws IOException {
//      cat.debug("Outgoing message (hex): "+SaslUtil.dumpString(message));
      cat.debug("Outgoing message (str): "+new String(message));
      secureOut.write(message);
   }

   public byte[] receive() throws IOException {
      int first = secureIn.read();
      int limit = secureIn.available();
      byte[] result = new byte[limit+1];
      result[0] = (byte) first;
      secureIn.read(result, 1, limit);

//      cat.debug("Incoming response (hex): "+SaslUtil.dumpString(result));
      cat.debug("Incoming response (str): "+new String(result));
      return result;
   }

   /**
    * Sets the <i>connected</i> field to false and instantiates a new
    * underlying mechanism client object.
    */
   public void disconnect() throws IOException {
      cat.debug("==> disconnect()");
      connected = false;
      client = Sasl.createSaslClient(
         mechanisms, id, service, serverName, properties, cbh);

      if (client == null)
         throw new RuntimeException("Unable to create SASL client");

      mechanism = client.getMechanismName();
      cat.info("Chosen mechanism: "+mechanism);

      cat.debug("<== disconnect()");
   }

   public void reconnect() throws IOException {
      disconnect();
      connect();
   }
}
