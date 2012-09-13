package javax.security.sasl;

import javax.security.auth.callback.CallbackHandler;
import java.util.Hashtable;

/**
 * An interface for creating instances of <tt>SaslClient</tt>. It is not
 * normally accessed directly by a client, which will use the <tt>Sasl</tt>
 * static methods instead. However, a particular environment may provide and
 * install a new or different <tt>SaslClientFactory</tt>.
 *
 * @version $Revision: 1.3 $
 * @since draft-weltman-java-sasl-04
 */
public interface SaslClientFactory
{
   /**
    * Creates a <tt>SaslClient</tt> using the parameters supplied. It returns
    * null if no <tt>SaslClient</tt> can be created using the parameters
    * supplied.
    *
    * @param mechanisms The non-null list of mechanism names to try. Each
    * is the IANA-registered name of a SASL mechanism (e.g. "GSSAPI", "CRAM-MD5").
    * @param authorizationID The possibly null protocol-dependent identification
    * to be used for authorization, e.g. user name or distinguished name. When
    * the SASL authentication completes successfully, the entity named by
    * authorizationId is granted access. If null, access is granted to a
    * protocol-dependent default (for example, in LDAP this is the DN in the
    * bind request).
    * @param protocol The non-null string name of the protocol for which the
    * authentication is being performed, e.g "pop", "ldap".
    * @param serrverName The non-null fully qualified host name of the server
    * to authenticate to.
    * @param props The possibly null properties to be used by the SASL
    * mechanisms to configure the authentication exchange. See the Sasl class
    * for a list of standard properties. Other, possibly mechanism-specific,
    * properties can be included. Properties not relevant to the selected
    * mechanism are ignored.
    * @param cbh The possibly null callback handler to used by the SASL
    * mechanisms to get further information from the application/library to
    * complete the authentication. For example, a SASL mechanism might require
    * the authentication ID, password and realm from the caller. The
    * authentication ID is requested by using a NameCallback. The password is
    * requested by using a PasswordCallback. The realm is requested by using a
    * RealmChoiceCallback if there is a list of realms to choose from, and by
    * using a RealmCallback if the realm must be entered.
    * @exception SaslException if it cannot create a SaslClient because
    * of an error.
    */
   SaslClient createSaslClient
   (
      String[] mechanisms,
      String authorizationID,
      String protocol,
      String serverName,
      Hashtable props,
      CallbackHandler cbh
   )
      throws SaslException;

   /**
    * Returns a non-null array of names of mechanisms supported by this
    * factory that match the specified mechanism selection policies.
    *
    * @param props The possibly null properties to specify the security policy
    * of the SASL mechanisms. For example, if props contains the
    * Sasl.POLICY_NOPLAINTEXT property with the value "true", then the factory
    * must not return any SASL mechanisms that are susceptible to simple plain
    * passive attacks. See the Sasl class for a complete list of policy
    * properties. Non-policy related properties, if present in props, are
    * ignored.
    */
   String[]
   getMechanismNames
      (
         Hashtable props
      );

}
