package cryptix.sasl.rmi;

// $Id: RMIRegistry.java,v 1.1 2001/06/24 12:23:29 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Date;

import org.apache.log4j.Category;
//import org.apache.log4j.PropertyConfigurator;

/**
 * A utility class to start/run an RMI registry using SASL on connections for
 * bind and lookup operations.
 *
 * @version $Revision: 1.1 $
 */
public class RMIRegistry implements Runnable
{
	// Constants and variables
	// ------------------------------------------------------------------------

   private static Category cat = Category.getInstance(RMIRegistry.class);

   // the default port for RMI
   private static final int DEFAULT_RMI_PORT = 1099;

	// Constructor(s)
	// ------------------------------------------------------------------------

   /**
    * Constructs an RMI registry listening on the default RMI port -1099- for
    * SASL connections.
    *
    * @exception RemoteException thrown when the registry can not be started,
    * due to unavailabiliy of port 1099.
    */
   private RMIRegistry() throws RemoteException {
      this(DEFAULT_RMI_PORT);
   }

   /**
    * Constructs an RMI registry listening on the designated port for SASL
    * connections.
    *
    * @param port the port to start the registry on.
    * @exception RemoteException thrown when the registry can not be started,
    * due to an invalid or unavailable port.
    */
   private RMIRegistry(int port) throws RemoteException {
      this(port, true);
   }

   /**
    * Constructs an RMI registry.
    *
    * @param port the port to start the registry on.
    * @param secure whether or not the registry is started using the SASL RMI
    * socket factories.
    * @exception RemoteException if the registry can not be started due to an
    * invalid or unavailable port.
    */
   private RMIRegistry(int port, boolean secure) throws RemoteException {
      super();

      cat.info("Listen on port #"+String.valueOf(port)+" for "
         +(secure ? "" : "non-")+"SASL connection(s)...");

      if (secure)
         LocateRegistry.createRegistry(port,
                                       new SaslClientSocketFactory(),
                                       new SaslServerSocketFactory());
      else
         LocateRegistry.createRegistry(port);
   }

	// Class methods
	// ------------------------------------------------------------------------

   /**
    * Runs an RMI registry that listens on the port specified by the first
    * command line argument, or the default RMI port (1099) if no arguments
    * are present.<p>
    *
    * If a second argument is present, it is taken as the name of a system
    * environment variable that holds the string representation of a boolean
    * value. If the value is <tt>true</tt> then the RMI Registry will
    * authenticate connections to it using SASL mechanisms, otherise, if the
    * value is <tt>false</tt> then default sockets will be used.<p>
    *
    * <b>Note</b>: If the registry is to listen on the default RMI port but
    * should authenticate connections to it using SASL, then the token 1099
    * (the value of the port) should be present as the first argument.
    *
    * @param args command-line arguments.
    */
   public static final void main(String[] args) {
//      PropertyConfigurator.configureAndWatch("log.properties");
      RMIRegistry registry = null;
      try {
         if (args != null) {
            if (args.length == 1)
               registry = new RMIRegistry(Integer.parseInt(args[0]));
            else if (args.length == 2) {
               boolean secure = Boolean.getBoolean(args[1]);
               registry = new RMIRegistry(Integer.parseInt(args[0]), secure);
            } else {
               cat.warn("Command line arguments ignored. Using defaults...");
               registry = new RMIRegistry();
            }
         }
         else
            registry = new RMIRegistry();
      } catch (RemoteException x) {
         cat.fatal("Could not instantiate RMI registry", x);
         throw new Error(String.valueOf(x));
      }

      final Thread t = new Thread(registry, "SASL RMI Registry");
      t.start();

      Runtime.getRuntime().addShutdownHook(
         new Thread() {
            public void run() {
               cat.info("Started shutdown...");
               if (t.isAlive())
                  try {
                     t.interrupt();
                     t.join();
                  } catch (Exception ignored) {
                     cat.warn("t.interrupt(). Ignored...", ignored);
                  }
               cat.info("Completed shutdown. Exiting...");
            }
         }
      );
   }

	// Instance methods
	// ------------------------------------------------------------------------

   /** Starts the registry. */
   public void run() {
      cat.info("RMIRegistry started on "+String.valueOf(new Date()));

      while (true) {
         try {
            Thread.sleep(5000);
         } catch (InterruptedException x) {
            break;
         } catch (Throwable x) {
            cat.fatal("run()", x);
            break;
         }
      }

      cat.info("RMIRegistry stopped on "+String.valueOf(new Date()));
   }
}