package cryptix.sasl.plain;

// $Id: PlainServer.java,v 1.5 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.ServerMechanism;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import javax.security.auth.callback.CallbackHandler;

/**
 * The Cryptix implementation of the PLAIN SASL mechanism.
 *
 * @version $Revision: 1.5 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class PlainServer extends ServerMechanism
implements SaslServer, PlainParams, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   public PlainServer(Hashtable props, CallbackHandler cbh) {
      super(PLAIN_MECHANISM, "", "", props, cbh);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslServer interface implementation
   // -------------------------------------------------------------------------

   public byte[] evaluateResponse(byte[] response) throws SaslException {
      if (response == null)
         return null;

      try {
         String nullStr = new String("\0");
         StringTokenizer strtok =
            new StringTokenizer(new String(response), nullStr, true);

         authorizationID = strtok.nextToken();
         if (!authorizationID.equals(nullStr))
            strtok.nextToken();
         else
            authorizationID = null;

         String id = strtok.nextToken();
         if (id.equals(nullStr))
            throw new SaslException("No identity given");

         if (authorizationID == null)
            authorizationID = id;

         if ((!authorizationID.equals(nullStr)) &&
             (!authorizationID.equals(id)))
            throw new SaslException("Delegation not supported");

         strtok.nextToken();
         byte[] pwd = strtok.nextToken().getBytes();
         if (pwd == null)
            throw new SaslException("No password given");

         byte[] password = new String(lookupPassword(id)).getBytes();
         if (!SaslUtil.areEqual(pwd, password))
            throw new SaslException("Password incorrect");

         this.complete = true;
         return null;
      } catch (NoSuchElementException x) {
         throw new SaslException("evaluateResponse()", x);
      }
   }

   public void dispose() throws SaslException {
      authenticator.passivate();
   }

   protected String getNegotiatedQOP() {
      return "auth";
   }

   // Instance methods
   // -------------------------------------------------------------------------

   private char[] lookupPassword(String userName) throws SaslException {
      try {
         authenticator.activate(properties);
         if (!authenticator.contains(userName))
            throw new NoSuchUserException(userName);

         Map userID = new HashMap();
         userID.put(USERNAME, userName);
         Map credentials = authenticator.lookup(userID);
         String password = (String) credentials.get(PASSWORD);
         if (password == null)
            throw new SaslException("lookupPassword()", new InternalError());

         return password.toCharArray();
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("lookupPassword()", x);
      }
   }
}
