package cryptix.sasl.rmi;

// $Id: MechanismSelector.java,v 1.2 2001/07/03 09:35:24 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.srp.SRPParams;
import java.io.InputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Hashtable;
import java.util.Properties;
import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslServer;

import org.apache.log4j.Category;

/**
 * A Singleton class that knows about the type of authentication to use when
 * communicating between two nodes. Reads its data from a file called '/node.config'
 * to be found by the same class loader which loaded this one.<p>
 *
 * If the file 'node.config' is not found, then a default set of data is used.
 * These defaults basically return 'SRP' as the mechanism name to use.
 *
 * @version 1.0
 */
public class MechanismSelector implements RMIParams
{
   // Constants and variables
   // --------------------------------------------------------------------------

   private static Category cat = Category.getInstance(MechanismSelector.class);

   /** Default node configuration in case node.config file was not found. */
   private static final String[][] DEFAULT_CONFIG = {
      {"*.*",            "HIGH"},
      {"HIGH.mechanism", "SRP"}
   };

   private static MechanismSelector singleton = null;

   private Properties map = null;
   private boolean debug;
   private String callbackHandlerClass;

   // Constructor(s)
   // --------------------------------------------------------------------------

   /** Private constructor to enforce Singleton pattern. */
   private MechanismSelector() {
      super();

      String it = "/node.config";
      cat.info("Loading "+String.valueOf(it));

      Properties def = new Properties();
      for (int i = 0, limit = DEFAULT_CONFIG.length; i < limit; i++)
         def.put(DEFAULT_CONFIG[i][0], DEFAULT_CONFIG[i][1]);
      map = new Properties(def);
      try {
         InputStream is = MechanismSelector.class.getResourceAsStream(it);
         map.load(is);
         cat.info("Loaded "+String.valueOf(it));
         is.close();
      } catch (Exception x) {
         cat.error("While loading "+String.valueOf(it)+": "+String.valueOf(x));
      }

      debug = System.getProperty("DEBUG") != null;
      cat.info("Running with DEBUG "+(debug ? "on":"off")+"...");
   }

   // Class methods
   // -------------------------------------------------------------------------

   /** Returns the singleton instance. */
   public static synchronized MechanismSelector instance() {
      if (singleton == null)
         singleton = new MechanismSelector();

      return singleton;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Returns an instance of a SASL client that authenticates using the
    * mechanism designated in a node-configuration file.<p>
    *
    * If both nodes are the same, then this method returns null, unless a
    * system property named 'DEBUG' is defined. In this case the default
    * mechanism is used.
    *
    * @param toNode the receiving node.
    * @return null, if to/from the same node, otherwise returns a new instance
    * of a SASL client using the mechanism indicated by a configuration file:
    * 'node.config.'
    * @exception IOException if an exception occurs during the execution.
    */
   public SaslClient newClient(String toNode) throws IOException {
      cat.debug("==> newClient("+String.valueOf(toNode)+")");

      String fromNode = "*";
      try {
         InetAddress here = InetAddress.getLocalHost();
         fromNode = here.getHostAddress();
      } catch (UnknownHostException x) {
         cat.error("While resolving local host: "+String.valueOf(x));
      }

      SaslClient result = newClient(fromNode, toNode);
      cat.debug("<== newClient(1)");
      return result;
   }

   /**
    * Returns an instance of a SASL client that authenticates using the
    * mechanism designated in a node-configuration file.<p>
    *
    * If both nodes are the same, then this method returns null, unless a
    * system property named 'DEBUG' is defined. In this case the default
    * mechanism is used.
    *
    * @param fromNode the originating node.
    * @param toNode the receiving node.
    * @return null, if to/from the same node, otherwise returns a new instance
    * of a SASL client using the mechanism indicated by a configuration file:
    * 'node.config.'
    * @exception IOException if an exception occurs during the execution.
    */
   public SaslClient newClient(String fromNode, String toNode)
   throws IOException {
      cat.debug("==> newClient("+String.valueOf(fromNode)+", "+String.valueOf(toNode)+")");

      SaslClient result = null;
      if (!fromNode.equals(toNode) || debug) {
         Hashtable p = new Hashtable();
         p.put(SRPParams.SRP_REPLAY_DETECTION,     "true");
         p.put(SRPParams.SRP_INTEGRITY_PROTECTION, "true");
         p.put(SRPParams.SRP_CONFIDENTIALITY,      "true");

         String def = map.getProperty("*.*");
         String strength = map.getProperty(fromNode+"."+toNode);
         if (strength == null)
            strength = map.getProperty("*."+toNode, def);

         String m = map.getProperty(strength+".mechanism", map.getProperty(def+".mechanism"));

         result = Sasl.createSaslClient(
            new String[] { m }, // one mechanism only: that defined in config file
            System.getProperty("user.name"), // username as the authorization ID
            "rmi", // this protocol
            toNode, // the server to authenticate to
            p,
            newCallbackHandler(m)); // a handler to return username and password
         if (result == null)
            throw new RuntimeException("Unable to create SASL client");
      }

      cat.debug("<== newClient(2)");
      return result;
   }

   /**
    * Returns an instance of a SASL server that authenticates using the
    * mechanism designated when communicating between the current node
    * and that indicated by the designated remote socket.<p>
    *
    * If the FROM node is the same as the TO node, then this method returns
    * null.
    *
    * @param remoteNode the socket of the remote node.
    * @return null, if to/from the same node, otherwise returns a new instance
    * of a SASL server using the mechanism indicated by a configuration file:
    * 'node.config.'
    * @exception IOException if an exception occurs during the execution.
    */
   public SaslServer newServer(SaslSocket remoteNode) throws IOException {
      cat.debug("==> newServer()");

      String fromNode = "*";
      InetAddress there = remoteNode.getInetAddress();
      fromNode = there.getHostAddress();

      String toNode = "*";
      try {
         InetAddress here = InetAddress.getLocalHost();
         toNode = here.getHostAddress();
      } catch (UnknownHostException x) {
         cat.error("While resolving local host: "+String.valueOf(x));
      }

      SaslServer result = null;
      if (!fromNode.equals(toNode) || debug) {
         String def = map.getProperty("*.*");
         String strength = map.getProperty(fromNode+"."+toNode);
         if (strength == null) {
            strength = map.getProperty(toNode+"."+fromNode);
            if (strength == null) {
               strength = map.getProperty(fromNode+".*");
               if (strength == null)
                  strength = map.getProperty("*."+toNode, def);
            }
         }

         String m = map.getProperty(strength+".mechanism", map.getProperty(def+".mechanism"));
         cat.info("Using authentication mechanism: "+m);

         Hashtable p = new Hashtable();
         p.put(SRPParams.SRP_REPLAY_DETECTION,     "true");
         p.put(SRPParams.SRP_INTEGRITY_PROTECTION, "true");
         p.put(SRPParams.SRP_CONFIDENTIALITY,      "true");

         result = Sasl.createSaslServer(m, "rmi", toNode, p, null);
         if (result == null)
            throw new RuntimeException("Unable to find "+m+" SASL server mechanism");
      }

      cat.debug("<== newServer()");
      return result;
   }

   private CallbackHandler newCallbackHandler(String mechanism) {
      if (callbackHandlerClass == null)
         callbackHandlerClass = System.getProperty(CALLBACK_HANDLER_CLASS);

      CallbackHandler result = null;
      try {
         cat.debug("Instantiating an instance of "+String.valueOf(callbackHandlerClass));
         result = (CallbackHandler) Class.forName(callbackHandlerClass).newInstance();
         cat.debug("Instantiated an instance of "+String.valueOf(callbackHandlerClass));
         try {
            Method setMechanism =
               result.getClass().getMethod("setMechanism", new Class[] { String.class });
            setMechanism.invoke(result, new String[] { mechanism });
         } catch (Exception ignored) {
            cat.warn("Error while attempting to invoke setMechanism(String)"
               +" on callback handler: "+callbackHandlerClass+". Ignored...", ignored);
         }
      } catch (Exception x) {
         cat.error("While instantiating a callback handler: "+String.valueOf(x));
         cat.info("Using default RMI callback handler implementation");
         result = new RMICallbackHandler();
      }

      return result;
   }
}