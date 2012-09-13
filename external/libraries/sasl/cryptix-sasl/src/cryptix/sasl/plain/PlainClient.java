package cryptix.sasl.plain;

// $Id: PlainClient.java,v 1.4 2001/11/02 11:04:17 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.ClientMechanism;
import cryptix.sasl.SaslParams;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;

import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 *
 *
 * @version $Revision: 1.4 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class PlainClient extends ClientMechanism
implements SaslClient, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   public
   PlainClient(String authorizationID, Hashtable props, CallbackHandler cbh) {
      super("PLAIN", authorizationID, "", "", props, cbh);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslClient interface implementation
   // -------------------------------------------------------------------------

   public boolean hasInitialResponse() {
      return true;
   }

   public byte[] evaluateChallenge(byte[] challenge) throws SaslException {
      try {
         String username;
         char[] password;
         Callback[] callbacks;

         if (     (!properties.containsKey(USERNAME))
               && (!properties.containsKey(PASSWORD))) {
            callbacks = new Callback[2];

            NameCallback nameCB;
            String defaultName = System.getProperty("user.name");
            if (defaultName == null)
               nameCB = new NameCallback("username: ");
            else
               nameCB = new NameCallback("username: ", defaultName);

            PasswordCallback pwdCB = new PasswordCallback("password: ", false);
            callbacks[0] = nameCB;
            callbacks[1] = pwdCB;
            this.handler.invokeCallback(callbacks);
            username = nameCB.getName();
            password = pwdCB.getPassword();
         } else {
            if (properties.containsKey(USERNAME))
               username = (String) properties.get(USERNAME);
            else {
               callbacks = new Callback[1];
               NameCallback nameCB;
               String defaultName = System.getProperty("user.name");
               if (defaultName == null)
                  nameCB = new NameCallback("username: ");
               else
                  nameCB = new NameCallback("username: ",defaultName);
               callbacks[0] = nameCB;
               this.handler.invokeCallback(callbacks);
               username = nameCB.getName();
            }

            if (properties.containsKey(PASSWORD)) {
               password = ((String) properties.get(PASSWORD)).toCharArray();
            } else {
               callbacks = new Callback[1];
               PasswordCallback pwdCB = new PasswordCallback("password: ", false);
               callbacks[0] = pwdCB;
               this.handler.invokeCallback(callbacks);
               password = pwdCB.getPassword();
            }
         }

         if (password == null)
            throw new SaslException("null password supplied");

         StringBuffer sb = new StringBuffer();
         if (authorizationID != null)
            sb.append(authorizationID);

         sb.append('\0');
         sb.append(username);
         sb.append('\0');
         sb.append(password);
         this.complete = true;

         byte[] response = sb.toString().getBytes();
         return response;
      } catch (Exception x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("evaluateChallenge()", x);
      }
   }

   protected String getNegotiatedQOP() {
      return "auth";
   }
}
