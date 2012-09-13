package cryptix.sasl.otp;

// $Id: OTPServer.java,v 1.6 2001/08/31 09:11:39 raif Exp $
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
 *
 */

import cryptix.sasl.IllegalMechanismStateException;
import cryptix.sasl.InputBuffer;
import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.OutputBuffer;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.ServerMechanism;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;

import org.apache.log4j.Category;

/**
 * Implementation of the server-side of the SASL OTP protocol.
 *
 * @version $Revision: 1.6 $
 */
public class OTPServer
extends ServerMechanism
implements SaslServer, OTPParams, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(OTPServer.class);

   /** The client's username. */
   private String username = null;

   private Map credentials;
   private byte[] lastHash;

   /** The OTP algorithm instance used by this server. */
   private OTP otp;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public OTPServer(String protocol, String serverName, Hashtable props,
                    CallbackHandler cbh) {
      super(OTP_MECHANISM, protocol, serverName, props, cbh);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslServer interface implementation
   // -------------------------------------------------------------------------

   public byte[] evaluateResponse(byte[] response) throws SaslException {
      switch (state) {
      case 0: state++; return sendChallenge(response);
      case 1: state++; return sendFinalResponse(response);
      default: throw new IllegalMechanismStateException("evaluateResponse()");
      }
   }

   public void dispose() throws SaslException {
      credentials = null;
      lastHash = null;
      authenticator.passivate();
   }

   // Instance methods
   // -------------------------------------------------------------------------

   private byte[] sendChallenge(byte[] input) throws SaslException {
      cat.debug("==> sendChallenge()");
      cat.debug("response: "+SaslUtil.dumpString(input));

      // Client sends identity
      InputBuffer frameIn = new InputBuffer(input);

      String identity;
      try { // Extract identity
         identity = frameIn.getText();
         cat.debug("Got identity: "+identity);
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("sendChallenge()", x);
      }

      // Identity is username<NULL>authorisationId
      int index = identity.indexOf(0);
      this.username = identity.substring(0,index);
      authorizationID = identity.substring(index+1);

      // Need to get:
      //  - the algorithm the user uses
      //  - the user's sequence number
      //  - the user's seed

      authenticator.activate(properties);
      try {
         Map userID = new HashMap();
         userID.put(USERNAME, username);
			credentials = authenticator.lookup(userID);
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("sendChallenge()", x);
      }

      String algorithm   = (String) credentials.get(ALGORITHM_FIELD);
      String seqnum      = (String) credentials.get(SEGNUM_FIELD);
      String seed        = (String) credentials.get(SEED_FIELD);
      String lastHashStr = (String) credentials.get(LAST_HASH_FIELD);

      otp = OTP.instance(algorithm);

      this.lastHash = SaslUtil.fromb64(lastHashStr);

      StringBuffer challenge =
         new StringBuffer(algorithm.length()+1+
                          seqnum.length()+1+
                          seed.length()+1+
                          EXT.length()+1+
                          WORD.length()+1+
                          HEX.length()+1+
                          INIT_WORD.length()+1+
                          INIT_HEX.length());

      challenge.append(algorithm);
      challenge.append(SPACE);
      challenge.append(seqnum);
      challenge.append(SPACE);
      challenge.append(seed.toLowerCase());
      challenge.append(SPACE);
      challenge.append(EXT);
      challenge.append(COMMA);
      challenge.append(WORD);
      challenge.append(COMMA);
      challenge.append(HEX);
      challenge.append(COMMA);
      challenge.append(INIT_WORD);
      challenge.append(COMMA);
      challenge.append(INIT_HEX);

      OTPOutputBuffer frameOut = new OTPOutputBuffer();
      try {
         frameOut.setText(challenge.toString());
			cat.debug("Encoding challenge: "+challenge.toString());
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("sendChallenge()", x);
      }

      byte[] output = frameOut.encode();
      cat.debug("<== sendChallenge() --> "+SaslUtil.dumpString(output));
      return output;
   }

   private byte[] sendFinalResponse(byte[] input) throws SaslException {
      cat.debug("==> sendFinalResponse()");

      // Client sends I,A,o
      InputBuffer frameIn = new InputBuffer(input);
      String response;
      try { // Extract response
         response = frameIn.getText();
         cat.debug("Response: "+response);
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("sendFinalResponse()", x);
      }

      if (response.startsWith(INIT_HEX+COLON) || response.startsWith(INIT_WORD+COLON))
         validateInitResponse(response);
      else if (response.startsWith(HEX+COLON) || response.startsWith(WORD+COLON))
         validateResponse(response);
      else
         throw new SaslException("sendFinalResponse: Unknown format");

      OutputBuffer frameOut = new OutputBuffer();
      byte[] result = frameOut.encode();
      cat.debug("<== sendFinalResponse() --> "+SaslUtil.dumpString(result));
      this.complete = true;
      return result;
   }

   private void validateResponse(String response) throws SaslException {
      // Check results
      // The 'last hash' is the result of the hash function
      // on password+seed for sequence+1 times.
      // The pwd hash this time is for password_seed sequence
      // times.  By taking it and hashing it once, we should
      // get the last hash and that's how we verify.  Semi-slick.
      // So hooray for assymetric hash functions
      byte[] responseHash;
      if (response.startsWith(WORD+COLON)) {
         response = response.substring(WORD.length());
         long l = OTPDictionary.convertWordsToHash(response);
         responseHash = OTPUtil.convertHexToBytes(response);
         cat.debug("responseHash: "+responseHash);
      } else if (response.startsWith(HEX+COLON)) {
         response = response.substring(HEX.length());
         responseHash = OTPUtil.convertHexToBytes(response);
         cat.debug("responseHash: "+responseHash);
      } else
         throw new SaslException("Unknown format");

      byte[] hashResponseHash = otp.digest(responseHash);
      cat.debug("hash(responseHash): "+SaslUtil.dumpString(hashResponseHash));
      cat.debug("lastHash          : "+SaslUtil.dumpString(lastHash));
      if (!SaslUtil.areEqual(this.lastHash,hashResponseHash))
         throw new SaslException("validateResponse: "+ERR_AUTH_FAILURE);

      try {
//         credentials.put(USERNAME, username);
//         credentials.put(ALGORITHM_FIELD, credentials[1]);
         String sequence = (String) credentials.get(SEGNUM_FIELD);
         int seqnum = Integer.parseInt(sequence);
         seqnum--;
         credentials.put(SEGNUM_FIELD, new Integer(seqnum).toString());
//         credentials.put(SEED_FIELD, credentials[3]);
//         String lastHashStr = credentials[4];
         credentials.put(LAST_HASH_FIELD, SaslUtil.tob64(responseHash));
         authenticator.update(credentials);
      } catch (Exception x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("validateResponse()", x);
      }
   }

   private void validateInitResponse(String response) throws SaslException {
      StringTokenizer st = new StringTokenizer(response,COLON);
      if (st.countTokens() != 4)
         throw new SaslException("validateInitResponse: "+ERR_INVALID_RESPONSE);

      String format    = st.nextToken();
      String curOTP    = st.nextToken();
      String newParams = st.nextToken();
      String newOTP    = st.nextToken();

      st = new StringTokenizer(newParams);
      if (st.countTokens() != 3)
         throw new SaslException("validateInitResponse: "+ERR_INVALID_RESPONSE);

      String newAlgorithm = st.nextToken();
      String newSequence  = st.nextToken();
      String newSeed      = st.nextToken();

      OTP.validateAlgorithm(newAlgorithm);
      OTP.validateSeed(newSeed);
      OTP.validateSequenceNumber(newSequence);

      if (format.equalsIgnoreCase(INIT_WORD))
         validateResponse(WORD+COLON+curOTP);
      else if (format.equalsIgnoreCase(INIT_HEX))
         validateResponse(HEX+COLON+curOTP);
      else
         throw new SaslException("validateInitResponse: "+ERR_UNKNOWN_COMMAND);

      try {
         credentials.put(ALGORITHM_FIELD, newAlgorithm);
         credentials.put(SEGNUM_FIELD, newSequence);
         credentials.put(SEED_FIELD, newSeed);
         credentials.put(LAST_HASH_FIELD, newOTP);
         authenticator.update(credentials);
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;

         throw new SaslException("validateInitResponse()", x);
      }
   }
}
