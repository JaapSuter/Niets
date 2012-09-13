package cryptix.sasl.rmi;

// $Id: SaslClientSocketFactory.java,v 1.3 2001/10/17 09:59:20 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslInputStream;
import cryptix.sasl.SaslOutputStream;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.rmi.server.RMIClientSocketFactory;

import javax.security.sasl.SaslClient;

import org.apache.log4j.Category;

/**
 * A <tt>SaslClientSocketFactory</tt> instance is used by the RMI runtime in
 * order to obtain client sockets for RMI calls. A remote object can be
 * associated with a <tt>SaslClientSocketFactory</tt> when it is created/exported
 * via the constructors or <tt>exportObject()</tt> methods of
 * {@link java.rmi.server.UnicastRemoteObject} and {@link java.rmi.activation.Activatable}.<p>
 *
 * A <tt>RMIClientSocketFactory</tt> instance associated with a remote object
 * will be downloaded to clients when the remote object's reference is
 * transmitted in an RMI call. This <tt>SaslClientSocketFactory</tt> will be
 * used to create connections to the remote object for remote method calls.<p>
 *
 * A <tt>SaslClientSocketFactory</tt> instance can also be associated with a
 * remote object registry so that clients can use custom socket communication
 * with a remote object registry.
 *
 * @version 1.1
 */
public class SaslClientSocketFactory
implements RMIClientSocketFactory, Serializable
{
   // Constants and variables
   // --------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SaslClientSocketFactory.class);

   /**
    * A dummy 0-byte message to use with SASL-ified RMI socket for mechanisms
    * whose client side does not have an initial response. This dummy message
    * is then supposed to be discarded by their server-side implementations.
    */
   private static final byte[] NULL_MESSAGE = new byte[0];

   // Constructor(s)
   // --------------------------------------------------------------------------

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Creates a client socket connected to the specified host and port.
    *
    * @param host the host name.
    * @param port the port number.
    * @return a socket connected to the specified host and port.
    * @exception IOException if an I/O error occurs during socket creation.
   */
   public Socket createSocket(String host, int port) throws IOException {
      cat.debug("==> createSocket("+String.valueOf(host)+", "+String.valueOf(port)+")");

      SaslSocket result = new SaslSocket(host, port);

      SaslClient client = MechanismSelector.instance().newClient(host);
      if (client == null) {
         cat.info("Using default RMI...");
      } else { // SASL authentication
         try {
            cat.info("Doing (client) SASL authentication...");

            String mechanism = client.getMechanismName();
            cat.info("Chosen mechanism: "+mechanism);

            InputStream in = result.getInputStream();
            OutputStream out = result.getOutputStream();
            byte[] challenge, response;
            if (client.hasInitialResponse()) {
               response = client.evaluateChallenge(null);
               // implies that server has last word; ie. client sends nothing
               // after server sends last challenge
               do {
                  RMIUtil.writeLV(out, response);
                  if (!client.isComplete()) {
                     challenge = RMIUtil.readLV(in);
                     response = client.evaluateChallenge(challenge);
                  }
               } while (!client.isComplete());
            } else
               // implies that client has last word; ie. server sends nothing
               // after client sends last response
               do {
                  RMIUtil.writeLV(out, NULL_MESSAGE);
                  challenge = RMIUtil.readLV(in);
                  response = client.evaluateChallenge(challenge);
                  RMIUtil.writeLV(out, response);
               } while (!client.isComplete());

            cat.info("Done (client) SASL authentication...");

            InputStream secureIn = new SaslInputStream(client, in);
            OutputStream secureOut = new SaslOutputStream(client, out);

            result.setSecureInputStream(secureIn);
            result.setSecureOutputStream(secureOut);

         } catch (IOException x) {
            cat.error("In createSocket(): "+String.valueOf(x));
            if (!(x instanceof SocketException)) {
               cat.debug("createSocket()", x);
            }
            throw x;
         }
      }

      cat.debug("<== createSocket()");
      return result;
   }
}
