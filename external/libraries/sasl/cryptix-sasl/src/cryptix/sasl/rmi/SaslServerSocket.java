package cryptix.sasl.rmi;

// $Id: SaslServerSocket.java,v 1.3 2001/10/17 09:59:20 raif Exp $
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
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.security.sasl.SaslServer;

import org.apache.log4j.Category;

/**
 * This class implements server sockets. A server socket waits for requests to
 * come in over the network. It performs some operation based on that request,
 * and then possibly returns a result to the requester.
 *
 * @version 1.1
 */
public class SaslServerSocket extends ServerSocket
{
   // Constants and variables
   // --------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SaslServerSocket.class);

   // Constructor(s)
   // --------------------------------------------------------------------------

   /**
    * Creates a server socket on a specified port. A port of 0 creates a socket
    * on any free port.<p>
    *
    * The maximum queue length for incoming connection indications (a request
    * to  connect) is set to 50. If a connection indication arrives when the
    * queue  is full, the connection is refused.<p>
    *
    * If there is a security manager, its <tt>checkListen()</tt> method is
    * called with the port argument as its argument to ensure the operation is
    * allowed. This could result in a <tt>SecurityException</tt>.
    *
    * @param port the port number where is request is coming from.
    * @exception IOException if an exception occurs during the construction.
    */
   public SaslServerSocket(int port) throws IOException {
      super(port);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Listens for a connection to be made to this socket and accepts it. The
    * method blocks until a connection is made.<p>
    *
    * A new <tt>Socket</tt> s is created and, if there is a security manager,
    * the security manager's <tt>checkAccept()</tt> method is called with
    * <tt>s.getInetAddress().getHostAddress()</tt> and <tt>s.getPort()</tt> as
    * its arguments to ensure the operation is allowed. This could result in a
    * <tt>SecurityException</tt>.<p>
    *
    * <b>NOTE:</b>This implementation now _always_ starts by reading on this
    * (server) side, which implies that the peer (client) has to start the
    * dialogue. This is no problem for mechanisms whose client has an initial
    * response to send to the server. However, for those mechanisms whose
    * client does not have an initial response, we achieve this in
    * {@link cryptix.sasl.rmi.SaslClientSocketFactory} by adding a write of a
    * 0-byte message that we (SHOULD) discard in the mechanism's server
    * implementation.
    *
    * @exception IOException if an exception occurs during the operation.
    * @since 1.1
    */
   public Socket accept() throws IOException {
      cat.debug("==> accept()");

      SaslSocket result = new SaslSocket();

      implAccept(result);

      SaslServer server = MechanismSelector.instance().newServer(result);
      if (server == null) {
         cat.info("Using default RMI...");
      } else { // SASL authentication
         try {
            cat.info("Doing (server) SASL authentication...");

            InputStream in = result.getInputStream();
            OutputStream out = result.getOutputStream();
            byte[] response, challenge;
            do {
               response = RMIUtil.readLV(in);
               challenge = server.evaluateResponse(response);
               if (challenge != null) {
                  RMIUtil.writeLV(out, challenge);
               }
            } while (!server.isComplete());

            cat.info("Done (server) SASL authentication...");

            InputStream secureIn = new SaslInputStream(server, in);
            OutputStream secureOut = new SaslOutputStream(server, out);

            result.setSecureInputStream(secureIn);
            result.setSecureOutputStream(secureOut);

         } catch (IOException x) {
            cat.error("In accept(): "+String.valueOf(x));
            if (!(x instanceof SocketException)) {
               cat.debug("accept()", x);
            }
            throw x;
         }
      }

      cat.debug("<== accept()");
      return result;
   }
}
