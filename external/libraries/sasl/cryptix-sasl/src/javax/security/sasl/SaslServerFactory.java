package javax.security.sasl;

import javax.security.auth.callback.CallbackHandler;
import java.util.Hashtable;

/**
 * An interface for creating instances of <tt>SaslServer</tt>. It is not
 * normally accessed directly by a server, which will use the <tt>Sasl</tt>
 * static methods instead. However, a particular environment may provide and
 * install a new or different <tt>SaslServerFactory</tt>.
 *
 * @version $Revision: 1.3 $
 * @since draft-weltman-java-sasl-04
 */
public interface SaslServerFactory
{
   /**
    * Creates a <tt>SaslServer</tt> using the mechanism supplied. It returns
    * <tt>null</tt> if no <tt>SaslServer</tt> can be created using the
    * parameters supplied.
    *
    * @param mechanism The non-null IANA-registered name of a SASL mechanism
    * (e.g. "GSSAPI", "CRAM-MD5").
    * @param protocol The non-null string name of the protocol for which the
    * authentication is being performed, e.g "pop", "ldap".
    * @param serverName The non-null fully qualified host name of the server.
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
    * requested by using a PasswordCallback. The realm is requested by using
    * a RealmChoiceCallback if there is a list of realms to choose from, and
    * by using a RealmCallback if the realm must be entered.
    *
    * @return a possibly null <tt>SaslServer</tt> which supports the specified
    * mechanism. If <tt>null</tt>, this factory cannot produce a SaslServer
    * for the specified mechanism.
    * @exception SaslException if it cannot create a SaslServer because of an
    * error.
    */
   SaslServer
   createSaslServer
      (
         String mechanism,
         String protocol,
         String serverName,
         Hashtable props,
         CallbackHandler cbh
      )
      throws SaslException;

   /**
    * Returns a non-null array of names of mechanisms supported by this
    * factory.
    *
    * @return a non-null array of names of mechanisms supported by this
    * factory.
    */
   String[]
   getMechanismNames
      (
         Hashtable props
      );

}
