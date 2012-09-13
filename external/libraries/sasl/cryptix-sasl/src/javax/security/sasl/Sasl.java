package javax.security.sasl;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.security.auth.callback.CallbackHandler;

/**
 * A static class for creating SASL clients and servers. It transparently locates
 * and uses any available SaslClientFactory/SaslServerFactory instances.
 *
 * @version $Revision: 1.5 $
 * @since draft-weltman-java-sasl-04
 */
public class Sasl
{
   // Constants and variables
   // -------------------------------------------------------------------------

   /**
    * A comma-separated, ordered list of quality-of-protection
    * values that the client or server is willing to support.
    * A qop value is one of:
    *
    * "auth"         authentication only
    * "auth-int"     authentication plus integrity protection
    * "auth-conf"    authentication plus integrity and confidentiality
    *                protection
    *
    * The order of the list specifies the preference order of
    * the client or server. If this property is absent, the
    * default qop is "auth"
    */
   public static final String QOP = "javax.security.sasl.qop";

   /**
    * A comma-separated, ordered list of cipher strength values
    * that the client or server is willing to support.
    * A strength value is one of:
    *
    * "low"
    * "medium"
    * "high"
    *
    * The order of the list specifies the preference order of
    * the client or server. An implementation SHOULD allow
    * configuration of the meaning of these values.
    *
    * An application MAY use the Java Cryptography Extension
    * (JCE) with JCE-aware mechanisms to control the selection
    * of cipher suites that match the strength values.
    *
    * If this property is absent, the default strength is
    * "high,medium,low".
    */
   public static final String STRENGTH = "javax.security.sasl.strength";

   /**
    * "true" if server must authenticate to client; default "false"
    */
   public static final String SERVER_AUTH = "javax.security.sasl.server.authentication";

   /**
    * Maximum size of receive buffer in bytes of SaslClient/SaslServer;
    * the default is defined by the mechanism
    */
   public static final String MAX_BUFFER = "javax.security.sasl.maxbuffer";

   /**
    * A |-separated list of package names to use when locating
    * a SaslClientFactory
    */
   public static final String CLIENT_PKGS = "javax.security.sasl.client.pkgs";

   /**
    * A |-separated list of package names to use when locating
    * a SaslServerFactory
    */
   public static final String SERVER_PKGS = "javax.security.sasl.server.pkgs";

   /**
    * Maximum size of the raw send buffer in bytes of SaslClient/SaslServer.
    * The property value is the string representation of an integer and is
    * negotiated between the client and server during the authentication
    * exchange.
    */
   public static final String RAW_SEND_SIZE = "javax.security.sasl.rawsendsize";

   /**
    * Note: For properties defining a security policy for a server or client,
    * absence of the property is interpreted as "false".
    */

   /**
    * Specifies policy on plain passive attacks.
    * "true" if mechanisms susceptible to simple plain passive attacks
    *        (e.g. "PLAIN") are not permitted
    * "false" if such mechanisms are permitted
    */
   public static final String POLICY_NOPLAINTEXT = "javax.security.sasl.policy.noplaintext";

   /**
    * Specifies policy on active attacks.
    * "true" if mechanisms susceptible to active (non-dictionary)
    *        attacks are not permitted
    * "false" if such mechanisms are permitted
    */
   public static final String POLICY_NOACTIVE = "javax.security.sasl.policy.noactive";

   /**
    * Specifies policy on dictionary attacks.
    * "true" if mechanisms susceptible to dictionary attacks
    *        are not permitted
    * "false" if such mechanisms are permitted
    */
   public static final String POLICY_NODICTIONARY = "javax.security.sasl.policy.nodictionary";

   /**
    * Specifies policy on anonymous logins.
    * "true" if mechanisms that accept anonymous login
    *        are not permitted
    * "false" if such mechanisms are permitted
    */
   public static final String POLICY_NOANONYMOUS = "javax.security.sasl.policy.noanonymous";

   /**
    * Specifies requirements for forward secrecy.
    * "true" if mechanisms that forward secrecy
    *        between sessions are required
    * "false" if such mechanisms are not required
    */
   public static final String POLICY_FORWARD_SECRECY = "javax.security.sasl.policy.forward";

   /**
    * Specifies requirements for passing credentials.
    * "true" if mechanisms that pass client
    *        credentials are required
    * "false" if such mechanisms are not required
    */
   public static final String POLICY_PASS_CREDENTIALS = "javax.security.sasl.policy.credentials";

   private static SaslServerFactory serverFactory = null;
   private static SaslClientFactory clientFactory = null;

   // Constructor(s)
   // -------------------------------------------------------------------------

   private Sasl()
   {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * Creates a <tt>SaslClient</tt> using the parameters supplied. It returns
    * null if no <tt>SaslClient</tt> can be created using the parameters
    * supplied. Throws <tt>SaslException</tt> if it cannot create a <tt>SaslClient</tt>
    * because of an error.<p>
    *
    * The algorithm for selection is as follows:
    * <ol>
    *    <li>If a factory has been installed via setSaslClientFactory(),
    *     invoke createSaslClient() on it. If the method invocation returns
    *     a non-null SaslClient instance, return the SaslClient instance;
    *     otherwise continue.</li>
    *    <li>Create a list of fully qualified class names using the package
    *     names listed in the CLIENT_PKGS ("javax.security.sasl.client.pkgs")
    *     property in props and the class name <tt>ClientFactory</tt>. Each
    *     class name in this list identifies a <tt>SaslClientFactory</tt>
    *     implementation. Starting with the first class on the list, create an
    *     instance of <tt>SaslClientFactory</tt> using the class' public no-
    *     argument constructor and invoke <tt>createSaslClient()</tt> on it. If
    *     the method invocation returns a non-null <tt>SaslClient</tt> instance,
    *     return it; otherwise repeat using the next class on the list until a
    *     non-null <tt>SaslClient</tt> is produced or the list is exhausted.</li>
    *    <li>Repeat the previous step using the CLIENT_PKGS
    *     ("javax.security.sasl.client.pkgs") System property instead of the
    *     property in props.</li>
    *    <li>As per the Java 2 Standard Edition version 1.3 service provider
    *     guidelines, check for the existence of one of more files named
    *     <i>META-INF/services/javax.security.sasl.SaslClientFactory</i> in the
    *     classpath and installed JAR files. Each file lists the fully
    *     qualified class names of the factories (i.e. implementations of
    *     <tt>SaslClientFactory</tt>) found in the JAR files or classpath.
    *     Construct a merged list of class names using these files and repeat
    *     Step 2 using this list. If there is more than one of these files, the
    *     order in which they are processed is undefined. If no non-null
    *     <tt>SaslClient</tt> instance is produced, return null.</li>
    * </ol>
    *
    * @param mechanisms The non-null list of mechanism names to try. Each
    * is the IANA-registered name of a SASL mechanism. (e.g. "GSSAPI", "CRAM-MD5").
    * @param authorizationID The possibly null protocol-dependent
    * identification to be used for authorization, e.g. user name or
    * distinguished name. When the SASL authentication completes successfully,
    * the entity named by authorizationId is granted access. If null, access is
    * granted to a protocol-dependent default (for example, in LDAP this is the
    * DN in the bind request).
    * @param protocol The non-null string name of the protocol for which the
    * authentication is being performed, e.g "pop", "ldap".
    * @param serverName The non-null fully qualified host name of the server to
    * authenticate to.
    * @param props The possibly null additional configuration properties for
    * the session, e.g.
    *    <ul>
    *       <li>Sasl.POLICY_NOPLAINTEXT       If the property has the value
    *       "true", then the selected SASL mechanism must not be susceptible
    *       to simple plain passive attacks.</li>
    *    </ul>
    * In addition to the standard properties of this class, other, possibly
    * mechanism-specific, properties can be included. Properties not relevant
    * to the selected mechanism are ignored.
    * @param cbh The possibly null callback handler to used by the SASL
    * mechanisms to get further information from the application/library to
    * complete the authentication. For example, a SASL mechanism might require
    * the authentication ID, password and realm from the caller. The
    * authentication ID is requested by using a NameCallback. The password
    * is requested by using a PasswordCallback. The realm is requested by
    * using a RealmChoiceCallback if there is a list of realms to choose from,
    * and by using a RealmCallback if the realm must be entered.
    * @return a SaslClient using the parameters supplied.
    * @exception SaslException if an exception occurs during the operation.
    */
   public static SaslClient
   createSaslClient
      (
         String[] mechanisms,
         String authorizationID,
         String protocol,
         String serverName,
         Hashtable props,
         CallbackHandler cbh
      )
      throws SaslException
   {
      if (clientFactory != null)
      {
         SaslClient client =
            clientFactory.createSaslClient
               (
                  mechanisms,
                  authorizationID,
                  protocol,
                  serverName,
                  props,
                  cbh
               );
         if (client != null)
            return client;
      }

      Enumeration clientFactoryPkgs = getSaslClientFactories(props);
      while (clientFactoryPkgs.hasMoreElements())
      {
         StringBuffer pkg =
            new StringBuffer((String)clientFactoryPkgs.nextElement());
         pkg.append(".ClientFactory");
         try
         {
            SaslClientFactory fac =
               (SaslClientFactory)Class.forName(pkg.toString()).newInstance();

            SaslClient client =
               fac.createSaslClient
                  (
                     mechanisms,
                     authorizationID,
                     protocol,
                     serverName,
                     props,
                     cbh
                  );
            if (client != null)
            {
               return client;
            }
            }
            // ignore all exceptions
            catch (ClassCastException ignored)
            { }
            catch (ClassNotFoundException ignored)
            { }
            catch (InstantiationException ignored)
            { }
            catch (IllegalAccessException ignored)
            { }
      }

      //TODO: Implement selection using the Java 2 Standard Edition version 1.3
      //      service provider guidelines.

      return null;
   }

   /**
    * Sets the default SaslClientFactory to use. This method sets fac to be
    * the default factory. It can only be called with a non-null value once
    * per VM. If a factory has been set already, this method throws
    * <tt>IllegalStateException</tt>. The method throws
    * <tt>java.lang.SecurityException</tt> if the caller does not have the
    * necessary permission to set the factory.
    *
    * @param fac The possibly null factory to set. If null, it doesn't do
    * anything.
    */
   public static void
   setSaslClientFactory
      (
         SaslClientFactory fac
      )
   {
      clientFactory = fac;
   }

   /**
    * This method creates a SaslServer for the specified mechanism. It
    * returns null if no SaslServer can be created for the specified
    * mechanism.<p>
    *
    * The algorithm for selection is as follows:
    * <ol>
    *    <li>If a factory has been installed via setSaslServerFactory(),
    *    invoke createSaslServer() on it. If the method invocation returns
    *    a non-null SaslServer instance, return the SaslServer instance;
    *    otherwise continue.</li>
    *    <li>Create a list of fully qualified class names using the package
    *    names listed in the SERVER_PKGS ("javax.security.sasl.server.pkgs")
    *    property in props and the class name ServerFactory. Each class name
    *    in this list identifies a SaslServerFactory implementation.
    *    Starting with the first class on the list, create an instance of
    *    SaslServerFactory using the class' public no-argument constructor
    *    and invoke <tt>createSaslServer()</tt> on it. If the method invocation
    *    returns a non-null <tt>SaslServer</tt> instance, return it; otherwise
    *    repeat using the next class on the list until a non-null <tt>SaslServer</tt>
    *    is produced or the list is exhausted.</li>
    *    <li>Repeat the previous step using the SERVER_PKGS
    *    ("javax.security.sasl.server.pkgs") System property instead of
    *    the property in props.</li>
    *    <li>As per the Java 2 Standard Edition version 1.3 service provider
    *    guidelines, check for the existence of one of more files named
    *    <i>META-INF/services/javax.security.sasl.SaslServerFactory</i> in the
    *    classpath and installed JAR files. Each file lists the fully qualified
    *    class names of the factories (i.e. implementations of <tt>SaslServerFactory</tt>)
    *    found in the JAR files or classpath. Construct a merged list of class
    *    names using these files and repeat Step 2 using this list. If there is
    *    more than one of these files, the order in which they are processed is
    *    undefined. If no non-null <tt>SaslServer</tt> instance is produced,
    *    return null.</li>
    *    <li>If no non-null answer produced, return null.</li>
    * </ul>
    *
    * @param mechanism A non-null IANA-registered name of a SASL mechanism
    * (e.g. "GSSAPI", "CRAM-MD5").
    * @param protocol The non-null string name of the protocol for which the
    * authentication is being performed, e.g "pop", "ldap".
    * @param serverName The non-null fully qualified host name of the server.
    * @param props The possibly null properties to be used by the SASL
    * mechanism to configure the authentication exchange, e.g.
    *    <ul>
    *       <li>Sasl.POLICY_NOPLAINTEXT       If the property has the value
    *       "true", then the selected SASL mechanism must not be susceptible
    *       to simple plain passive attacks.</li>
    *    </ul>
    * In addition to the standard properties defined in this class, other,
    * possibly mechanism-specific, properties can be included. Properties not
    * relevant to the selected mechanism are ignored.
    * @param cbh The possibly null callback handler to used by the SASL
    * mechanism to get further information from the application/library to
    * complete the authentication. For example, a SASL mechanism might require
    * the authentication ID and password from the caller. The authentication ID
    * may be requested with a NameCallback, and the password with a
    * PasswordCallback.
    * @return a SaslServer for the specified mechanism.
    * @exception SaslException if an exception occurs during the operation.
    */
   public static SaslServer
   createSaslServer
      (
         String mechanism,
         String protocol,
         String serverName,
         Hashtable props,
         CallbackHandler cbh
      )
      throws SaslException
   {
      if (serverFactory != null)
      {
         SaslServer server =
            serverFactory.createSaslServer
               (
                  mechanism,
                  protocol,
                  serverName,
                  props,
                  cbh
               );
         if (server != null)
         {
            return server;
         }
      }

      Enumeration serverFactoryPkgs = getSaslServerFactories(props);
      while (serverFactoryPkgs.hasMoreElements())
      {
         StringBuffer pkg =
            new StringBuffer((String)serverFactoryPkgs.nextElement());
         pkg.append(".ServerFactory");
         try
         {
            SaslServerFactory fac =
               (SaslServerFactory)Class.forName(pkg.toString()).newInstance();

            SaslServer server =
               fac.createSaslServer
                  (
                     mechanism,
                     protocol,
                     serverName,
                     props,
                     cbh
                  );
            if (server != null)
            {
               return server;
            }
         }
         // ignore all exceptions
         catch (ClassCastException ignored)
         { }
         catch (ClassNotFoundException ignored)
         { }
         catch (InstantiationException ignored)
         { }
         catch (IllegalAccessException ignored)
         { }
      }

      return null;
   }

   /**
    * Sets the default SaslServerFactory to use. This method sets fac to be
    * the default factory. It can only be called with a non-null value once
    * per VM. If a factory has been set already, this method throws
    * <tt>IllegalStateException</tt>. The method throws
    * <tt>java.lang.SecurityException</tt> if the caller does not have the
    * necessary permission to set the factory.
    *
    * @param fac The possibly null factory to set. If null, it doesn't do
    * anything.
    */
   public static void
   setSaslServerFactory
      (
         SaslServerFactory fac
      )
   {
      serverFactory = fac;
   }

   /**
    * Gets an enumeration of known factories for producing SaslClient.
    *
    * @param props A possibly null properties that may contain the property
    * CLIENT_PKGS ("javax.security.sasl.client.pkgs") for specifying a list of
    * SaslClientFactory implementation package names.
    */
   public static Enumeration
   getSaslClientFactories
      (
         Hashtable props
      )
   {
      return getFactories(CLIENT_PKGS,props);
   }

   /**
    * Gets an enumeration of known factories for producing SaslServer..
    *
    * @param props A possibly null properties that may contain the property
    * SERVER_PKGS ("javax.security.sasl.server.pkgs") for specifying a list of
    * SaslServerFactory implementation package names.
    */
   public static Enumeration
   getSaslServerFactories
      (
         Hashtable props
      )
   {
      return getFactories(SERVER_PKGS,props);
   }

   private static Enumeration
   getFactories
      (
         String propertyName,
         Hashtable props
      )
   {
      //TODO: Implement selection using the Java 2 Standard Edition version 1.3
      //      service provider guidelines.

      Vector factoryPkgs = new Vector(5);
      // first try the given properties, then try the System properties
      String givenpkgs = null;
      if (props != null)
      {
         try
         {
            givenpkgs = (String)props.get(propertyName);
         }
         catch (ClassCastException ignored)
         { }
      }

      String syspkgs =
         System.getProperty(propertyName,null);

      String pkgs;
      if ((givenpkgs != null) && (syspkgs != null))
      {
         pkgs = givenpkgs+"|"+syspkgs;
      }
      else if (givenpkgs != null)
      {
         pkgs = givenpkgs;
      }
      else if (syspkgs != null)
      {
         pkgs = syspkgs;
      }
      else
      {
         return null;
      }

      StringTokenizer strtok = new StringTokenizer(pkgs,"|");
      while (strtok.hasMoreTokens())
      {
         factoryPkgs.addElement(strtok.nextToken());
      }

      return factoryPkgs.elements();
   }

}

