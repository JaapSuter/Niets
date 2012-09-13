package cryptix.sasl.rmi;

// $Id: SaslServerSocketFactory.java,v 1.1 2001/06/11 08:20:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.IOException;
import java.io.Serializable;
import java.net.ServerSocket;
import java.rmi.server.RMIServerSocketFactory;

/**
 * A <tt>SaslServerSocketFactory</tt> instance is used by the RMI runtime in
 * order to obtain server sockets for RMI calls. A remote object can be
 * associated with an <tt>SaslServerSocketFactory</tt> when it is created/exported
 * via the constructors or <tt>exportObject()</tt> methods of
 * {@link java.rmi.server.UnicastRemoteObject} and {@link java.rmi.activation.Activatable}.<p>
 *
 * A <tt>SaslServerSocketFactory</tt> instance associated with a remote object
 * is used to obtain the <tt>ServerSocket</tt> used to accept incoming calls
 * from clients.<p>
 *
 * A <tt>SaslServerSocketFactory</tt> instance can also be associated with a
 * remote object registry so that clients can use custom socket communication
 * with a remote object registry.
 *
 * @version 1.0
 */
public class SaslServerSocketFactory
implements RMIServerSocketFactory, Serializable
{
	// Constants and variables
	// --------------------------------------------------------------------------

	// Constructor(s)
	// --------------------------------------------------------------------------

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Creates a server socket on the specified port (port 0 indicates an
    * anonymous port).
    *
    * @param port the port number.
    * @return the server socket on the specified port.
    * @exception IOException if an I/O error occurs during server socket
    * creation.
    */
   public ServerSocket createServerSocket(int port)
   throws IOException {
      return new SaslServerSocket(port);
   }
}
