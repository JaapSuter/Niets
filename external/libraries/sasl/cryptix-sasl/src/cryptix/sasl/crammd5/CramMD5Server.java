package cryptix.sasl.crammd5;

// $Id: CramMD5Server.java,v 1.7 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.ServerMechanism;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;

import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import javax.security.auth.callback.CallbackHandler;

/**
 * The Cryptix implementation of the CRAM-MD5 SASL mechanism.
 *
 * @version $Revision: 1.7 $
 * @since   draft-burdis-cat-sasl-srp-03
 */
public class CramMD5Server extends ServerMechanism
implements SaslServer, CramMD5Params, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private byte[] msgId;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public CramMD5Server(Hashtable props, CallbackHandler cbh) {
      super(CRAM_MD5_MECHANISM, "", "", props, cbh);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslServer interface implementation
   // -------------------------------------------------------------------------

   public byte[] evaluateResponse(byte[] response) throws SaslException {
      if (state == 0) {
         this.msgId = CramMD5Util.createMsgID();
         state++;
         return this.msgId;
      }

      String responseStr = new String(response);
      int index = responseStr.lastIndexOf(" ");
      String username = responseStr.substring(0,index);
      byte[] responseDigest;
      try {
         responseDigest = responseStr.substring(index+1).getBytes("ASCII");
      } catch (UnsupportedEncodingException e) {
         throw new SaslException("evaluateResponse()", e);
      }

      // Look up the password
      char[] password = lookupPassword(username);

      // Compute the digest
      byte[] digest = CramMD5Util.createHMac(password,this.msgId);
      digest = (new String(SaslUtil.toString(digest).toLowerCase())).getBytes();

      // Compare the received and computed digests
      if (!SaslUtil.areEqual(digest,responseDigest))
         throw new SaslException("authentication error");

      state++;
      return null;
   }

   public void dispose() throws SaslException {
      authenticator.passivate();
   }

   public boolean isComplete() {
      return (state == 2);
   }

   protected String getNegotiatedQOP() {
      return "auth";
   }

   // Other instance methods
   // -------------------------------------------------------------------------

   private char[] lookupPassword(String userName) throws SaslException {
      authenticator.activate(properties);
      try {
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
