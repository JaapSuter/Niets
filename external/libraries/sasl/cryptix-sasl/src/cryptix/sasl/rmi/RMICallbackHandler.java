package cryptix.sasl.rmi;

// $Id: RMICallbackHandler.java,v 1.1 2001/06/11 08:20:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.log4j.Category;

/**
 * A default callback handler for RMI. Always returns the IP host name string
 * as the username, and the string 'rmi' as its password.<p>
 *
 * Should be replaced by a user-defined callback handler and specified to the
 * JVM by giving the fully qualified classname of that handler as a java option
 * (-Dname=value) to the interpreter as the value of the system property:
 * <tt>cryptix.sasl.rmi.callback.handler</tt>.
 *
 * @version $Revision: 1.1 $
 */
public class RMICallbackHandler
implements CallbackHandler
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(RMICallbackHandler.class);

   // Constructor(s)
   // -------------------------------------------------------------------------

   // implicit no-arguments constructor

   // Class methods
   // -------------------------------------------------------------------------

   // CallbackHandler interface implementation
   // -------------------------------------------------------------------------

   public void invokeCallback(Callback[] callbacks)
   throws IOException, UnsupportedCallbackException {
      for (int i = 0; i < callbacks.length; i++) {
         if (callbacks[i] instanceof NameCallback) {
            String username = "127.0.0.1";
            try {
               InetAddress here = InetAddress.getLocalHost();
               username = here.getHostAddress();
            } catch (UnknownHostException x) {
               cat.error("In invokeCallback(): "+String.valueOf(x));
               cat.warn("Using 127.0.0.1 as username");
            }

            ((NameCallback) callbacks[i]).setName(username);
         } else if (callbacks[i] instanceof PasswordCallback)
            ((PasswordCallback) callbacks[i]).setPassword("rmi".toCharArray());
         else
            throw new UnsupportedCallbackException(callbacks[i]);
      }
   }
}