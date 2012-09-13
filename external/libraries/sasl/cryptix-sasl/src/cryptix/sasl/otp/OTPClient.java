package cryptix.sasl.otp;

// $Id: OTPClient.java,v 1.5 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/*
 * Copyright (c) 2001 Invisible Worlds, Inc.  All rights reserved.
 *
 * The contents of this file are subject to the Blocks Public License (the
 * "License"); You may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.invisible.net/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.  See the License
 * for the specific language governing rights and limitations under the
 * License.
 */

import cryptix.sasl.ClientMechanism;
import cryptix.sasl.IllegalMechanismStateException;
import cryptix.sasl.InputBuffer;
import cryptix.sasl.OutputBuffer;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;

import org.apache.log4j.Category;

/**
 * Implementation of the client-side of the SASL OTP protocol.
 *
 * @version $Revision: 1.5 $
 * @since RFC 2444
 * @since RFC 2289
 */
public class OTPClient
extends ClientMechanism
implements SaslClient, OTPParams, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(OTPClient.class);

   /** The authentication identity. */
   private String username;

   /** The authentication credentials. */
   private char[] password;

   /** The OTP algorithm instance used by this client. */
   private OTP otp;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public OTPClient
		(
			String protocol,
			String authorizationID,
			String serverName,
			Hashtable props,
			CallbackHandler cbh
		)
   {
      super(OTP_MECHANISM, authorizationID, protocol, serverName, props, cbh);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslClient interface implementation
   // -------------------------------------------------------------------------

   public boolean
	hasInitialResponse()
   {
      return true;
   }

   public byte[]
	evaluateChallenge
		(
			byte[] challenge
		)
  	   throws SaslException
   {
      switch (state) {
      case 0: state++; return sendIdentity();
      case 1: state++; return sendResponse(challenge);
      default: throw new IllegalMechanismStateException("evaluateChallenge()");
      }
   }

   public void dispose() throws SaslException {
      password = null;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   private byte[]
   sendIdentity()
      throws SaslException
   {
      cat.debug("==> sendIdentity()");

      // If necessary, prompt the client for the username and password
      getUsernameAndPassword();

      cat.debug("Password: "+new String(password));
      cat.debug("Username: "+username);

      OTPOutputBuffer frameOut = new OTPOutputBuffer();

      StringBuffer identity =
        new StringBuffer(MAX_AUTHORISATION_ID_LENGTH+1+
                         MAX_AUTHENTICATION_ID_LENGTH);
      if (authorizationID != null)
         identity.append(authorizationID);

      identity.append((char) 0);
      identity.append(username);

      try
      {
         frameOut.setText(identity.toString());
      }
      catch (IOException x)
      {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendIdentity()", x);
      }

      byte[] result = frameOut.encode();
      cat.debug("<== sendIdentity() --> "+SaslUtil.dumpString(result));
      return result;
   }

   private byte[]
	sendResponse
		(
			byte[] input
		)
  	   throws SaslException
   {
      cat.debug("==> sendResponse()");
      cat.debug("challenge: "+SaslUtil.dumpString(input));

      // Server sends challenge
      InputBuffer frameIn = new InputBuffer(input);

      try
      {
         // Extract the challenge
         String challenge = frameIn.getText();
         cat.debug("Got challenge: "+challenge);
         StringTokenizer st = new StringTokenizer(challenge);

         // Extended response syntax MUST be used
         if (st.countTokens() != 4)
            throw new SaslException("sendResponse: Malformed challenge");

         String algorithm = st.nextToken();
         String sequence  = st.nextToken();
         String seed      = st.nextToken().toLowerCase();

         OTP.validateAlgorithm(algorithm);
         OTP.validateSeed(seed);
         OTP.validateSequenceNumber(sequence);

         int seqnum = Integer.parseInt(sequence);
         String passwd = new String(password);
         this.otp = OTP.instance(algorithm);

         OTPOutputBuffer frameOut = new OTPOutputBuffer();

         String format =
            ((Properties) properties).getProperty(
              RESPONSE_FORMAT, DEFAULT_RESPONSE_FORMAT);

         String response = null;

         if (format.equals(WORD))
            response = otp.wordResponse(seed,passwd,seqnum);
         else if (format.equals(HEX))
            response = otp.hexResponse(seed,passwd,seqnum);
         else if (format.equals(INIT_HEX))
            response = otp.initHexResponse(seed,passwd,seqnum);
         else if (format.equals(INIT_WORD))
            response = otp.initWordResponse(seed,passwd,seqnum);
         else
            throw new SaslException("sendResponse: "+ERR_UNKNOWN_COMMAND);

         frameOut.setText(response);

         byte[] result = frameOut.encode();
         cat.debug("<== sendResponse() --> "+SaslUtil.dumpString(result));
         this.complete = true;
         return result;
      }
      catch (Exception x)
      {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendResponse()", x);
      }
   }

   private void
	getUsernameAndPassword()
  	   throws SaslException
   {
      try
      {
         if ((!properties.containsKey(USERNAME)) &&
             (!properties.containsKey(PASSWORD)))
         {
            NameCallback nameCB;
            String defaultName = System.getProperty("user.name");
            if (defaultName == null)
               nameCB = new NameCallback("username: ");
            else
               nameCB = new NameCallback("username: ", defaultName);

            PasswordCallback pwdCB = new PasswordCallback("password: ", false);
            handler.invokeCallback(new Callback[] { nameCB, pwdCB });
            username = nameCB.getName();
            password = pwdCB.getPassword();
         }
         else
         {
            if (properties.containsKey(USERNAME))
               this.username = (String) properties.get(USERNAME);
            else
            {
               NameCallback nameCB;
               String defaultName = System.getProperty("user.name");
               if (defaultName == null)
                  nameCB = new NameCallback("username: ");
               else
                  nameCB = new NameCallback("username: ", defaultName);

               handler.invokeCallback(new Callback[] { nameCB });
               username = nameCB.getName();
            }

            if (properties.containsKey(PASSWORD))
               this.password = ((String) properties.get(PASSWORD)).toCharArray();
            else
            {
               PasswordCallback pwdCB = new PasswordCallback("password: ", false);
               handler.invokeCallback(new Callback[] { pwdCB });
               password = pwdCB.getPassword();
            }
         }

         if (username == null)
            throw new SaslException("null username supplied");

         if (password == null)
            throw new SaslException("null password supplied");

      }
      catch (UnsupportedCallbackException x)
      {
         cat.error("getUsernameAndPassword()", x);
         throw new SaslException("getUsernameAndPassword()", x);
      }
      catch (IOException x)
      {
         cat.error("getUsernameAndPassword()", x);
         throw new SaslException("getUsernameAndPassword()", x);
      }
   }
}