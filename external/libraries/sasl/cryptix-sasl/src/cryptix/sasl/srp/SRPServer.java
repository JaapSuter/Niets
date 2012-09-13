package cryptix.sasl.srp;

// $Id: SRPServer.java,v 1.12 2001/11/02 11:05:51 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.
//
// This product includes software developed by Tom Wu and Eugene Jhong for the
// SRP Distribution (http://srp.stanford.edu/srp/).
//
// Copyright (c) 1997-1999  The Stanford SRP Authentication Project.
// All Rights Reserved.
//
// Please see LICENSE.SRP for a copy of the license for this software.

import cryptix.sasl.ConfidentialityException;
import cryptix.sasl.IllegalMechanismStateException;
import cryptix.sasl.IntegrityException;
import cryptix.sasl.InputBuffer;
import cryptix.sasl.NoSuchUserException;
import cryptix.sasl.OutputBuffer;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.ServerMechanism;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringTokenizer;

import javax.crypto.SecretKey;
import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServerExt;

import org.apache.log4j.Category;

/**
 * The Cryptix implementation of an SM2-capable server-side SASL-SRP mechanism.
 *
 * @version $Revision: 1.12 $
 * @since draft-burdis-cat-sasl-srp-04
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class SRPServer extends ServerMechanism
implements SaslServerExt, SRPParams, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SRPServer.class);

   // client's username
   private String U = null;

   // List of available options
   private String mandatory;
   private String L = null;
   private String o;
   private String chosenIntegrityAlgorithm;
   private String chosenConfidentialityAlgorithm;
   private int rawSendSize = BUFFER_LIMIT;

   private byte[] modulus;
   private byte[] generator;
   private BigInteger N, g, A, B, v;
   private byte[] s;

   private KeyPair kp;

   private MessageDigest hash, ckhash;

   // SRP algorithm instance used by this server
   private SRP srp;

   // ----- begin SASL Security Context parameters for a SASL-SRP mechanism

   // shared session key
   private SecretKey K;

   // if yes or no Replay Detection is activated
   private boolean replayDetection = true;

   // messages sequence numbers
   private int inCounter = 0;
   private int outCounter = 0;

   // HMACs to use, if not null, for integrity protection
   private IALG inMac, outMac;

   // ciphers to use, if not null, for confidentiality protection
   private CALG inCipher, outCipher;

   // ----- end SASL Security Context parameters for an SASL-SRP mechanism

   // Constructor(s)
   // -------------------------------------------------------------------------

   public SRPServer(String mdName, String protocol, String serverName,
                    Hashtable props, CallbackHandler cbh) {
      super(SRP_MECHANISM+"-"+(mdName.equals("") ? SRP_DEFAULT_DIGEST_NAME : mdName),
            protocol, serverName, props, cbh);

      srp = SRP.instance(mdName);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslServerExt interface implementation
   // -------------------------------------------------------------------------

   public AlgorithmParameterSpec getSaslSecurityContext() throws SaslException {
      if (!complete)
         throw new IllegalMechanismStateException("getSaslSecurityContext()");

      return new SRPContext(K, replayDetection, inCounter, outCounter,
                            inMac, outMac, inCipher, outCipher);
   }

   public void setSaslSecurityContext(AlgorithmParameterSpec ctx)
   throws SaslException {
      SRPContext ssc = (SRPContext) ctx;
      K = ssc.getK();
      replayDetection = ssc.hasReplayDetection();
      inCounter = ssc.getIncomingCounter();
      outCounter = ssc.getOutgoingCounter();
      inMac = ssc.getIncomingMac();
      outMac = ssc.getOutgoingMac();
      inCipher = ssc.getIncomingCipher();
      outCipher = ssc.getOutgoingCipher();

      complete = true;
   }

   public byte[] evaluateEvidence(byte[] peerEvidence) throws SaslException {
      // rotate K's bytes
      byte[] key = K.getEncoded();
      int t = key[0];
      for (int i = 0; i < key.length-1; i++)
         key[i] = key[i+1];

      key[key.length-1] = (byte) t;
      K = new SRPSecretKey(key);

      // return the signature of the new context
      return ((SRPContext) getSaslSecurityContext()).getSignature();
   }

   // javax.security.sasl.SaslServer interface implementation
   // -------------------------------------------------------------------------

   public byte[] evaluateResponse(byte[] response) throws SaslException {
      switch (state) {
      case 0:
         state++;
         return sendNgL(response);
      case 1:
         state++;
         return sendResponse(response);
      case 2:
         state++;
         return sendEvidence(response);
      default:
         throw new IllegalMechanismStateException("evaluateResponse()");
      }
   }

   protected byte[] engineUnwrap(byte[] incoming, int offset, int len)
   throws SaslException {
      cat.debug("==> engineUnwrap()");
      cat.debug("Incoming buffer (before security): "+SaslUtil.dumpString(incoming, offset, len));

      byte[] data = null;
      try {
         InputBuffer frameIn = InputBuffer.getInstance(incoming, offset, len);

         data = frameIn.getEOS();
         if (inMac != null) {
            byte[] received_mac = frameIn.getOS();
            cat.debug("Got C (received MAC): "+SaslUtil.dumpString(received_mac));

            inMac.update(data);
            if (replayDetection) {
               inCounter++;
               cat.debug("inCounter="+String.valueOf(inCounter));
               inMac.update(new byte[] {
                  (byte)(inCounter >>> 24),
                  (byte)(inCounter >>> 16),
                  (byte)(inCounter >>>  8),
                  (byte) inCounter });
            }

            byte[] computed_mac = inMac.doFinal();
            cat.debug("Computed MAC: "+SaslUtil.dumpString(computed_mac));
            if (!SaslUtil.areEqual(received_mac, computed_mac))
               throw new IntegrityException("engineUnwrap()");
         }

         if (inCipher != null)
            data = inCipher.doFinal(data);
       } catch (IOException x) {
          cat.debug("engineUnwrap()", x);
          if (x instanceof SaslException)
             throw (SaslException) x;
          throw new SaslException("engineUnwrap()", x);
       }

      cat.debug("Incoming buffer (after security): "+SaslUtil.dumpString(data));
      cat.debug("<== engineUnwrap()");
      return data;
   }

   protected byte[] engineWrap(byte[] outgoing, int offset, int len)
   throws SaslException {
      cat.debug("==> engineWrap()");

      byte[] data = new byte[len];
      System.arraycopy(outgoing, offset, data, 0, len);

      cat.debug("Outgoing buffer (before security) (hex): "+SaslUtil.dumpString(data));
      cat.debug("Outgoing buffer (before security) (str): \""+new String(data)+"\"");

      byte[] result = null;
      try {
         OutputBuffer frameOut = new OutputBuffer();
         // Process the data
         if (outCipher != null) {
            data = outCipher.doFinal(data);
            cat.debug("Encoding c (encrypted plaintext): "+SaslUtil.dumpString(data));
         } else
            cat.debug("Encoding p (plaintext): "+SaslUtil.dumpString(data));

         frameOut.setEOS(data);

         if (outMac != null) {
            outMac.update(data);

         if (replayDetection) {
            outCounter++;
            cat.debug("outCounter="+String.valueOf(outCounter));
            outMac.update(new byte[] {
               (byte)(outCounter >>> 24),
               (byte)(outCounter >>> 16),
               (byte)(outCounter >>>  8),
               (byte) outCounter});
         }

            byte[] C = outMac.doFinal();
            frameOut.setOS(C);
            cat.debug("Encoding C (integrity checksum): "+SaslUtil.dumpString(C));
         }

         result = frameOut.wrap();

      } catch (IOException x) {
          cat.debug("engineWrap()", x);
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("engineWrap()", x);
      }

      cat.debug("<== engineWrap()");
      return result;
   }

   public void dispose() throws SaslException {
      s = null;
      kp = null;
      N = g = A = B = v = null;
      K = null;
      inMac = outMac = null;
      inCipher = outCipher = null;
      authenticator.passivate();
   }

   protected String getNegotiatedQOP() {
      if (inMac != null)
         if (inCipher != null)
            return "auth-conf";
         else
            return "auth-int";

      return "auth";
   }

   protected String getNegotiatedStrength() {
      return "high";
   }

   protected String getNegotiatedRawSendSize() {
      return String.valueOf(rawSendSize);
   }

   // Instance methods
   // -------------------------------------------------------------------------

   private byte[] sendNgL(byte[] input) throws SaslException {
      cat.debug("==> sendNgL()");
      cat.debug("response: "+SaslUtil.dumpString(input));

      // Client sends U
      InputBuffer frameIn = new InputBuffer(input);

      try { // Extract username
         U = frameIn.getText();
         cat.debug("Got U (client's username): \""+U+"\"");
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendNgL()", x);
      }

      authenticator.activate(properties);

      Map credentials;
      try {
         Map userID = new HashMap();
         userID.put(USERNAME, U);
         userID.put(MD_NAME_FIELD, srp.getAlgorithm());
         credentials = authenticator.lookup(userID);
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendNgL()", x);
      }

      String verifier = (String) credentials.get(USER_VERIFIER_FIELD);
      v = new BigInteger(1, SaslUtil.fromb64(verifier));
      cat.debug("v: "+SaslUtil.dump(v));
      s = SaslUtil.fromb64((String) credentials.get(SALT_FIELD));

      Map configuration;
      try {
         String mode = (String) credentials.get(CONFIG_NDX_FIELD);
         configuration = authenticator.getConfiguration(mode);
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendNgL()", x);
      }

      modulus = SaslUtil.fromb64((String) configuration.get(SHARED_MODULUS));
      cat.debug("Encoding N (modulus): "+SaslUtil.dumpString(modulus));
      N = new BigInteger(1, modulus);

      generator = SaslUtil.fromb64((String) configuration.get(FIELD_GENERATOR));
      cat.debug("Encoding g (generator): "+SaslUtil.dumpString(generator));
      g = new BigInteger(1, generator);

      // The server creates an options list (L), which consists of a
      // comma-separated list of option strings that specify the security
      // service options the server supports.

      L = createAvailableOptionsList();

      OutputBuffer frameOut = new OutputBuffer();
      try {
         frameOut.setMPI(N);
         frameOut.setMPI(g);
         frameOut.setOS(s);
         cat.debug("Encoding s (client's salt): "+SaslUtil.dumpString(s));
         frameOut.setText(L);
         cat.debug("Encoding L (available options list): \""+L+"\"");
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendNgL()", x);
      }

      byte[] challenge = frameOut.encode();
      cat.debug("<== sendNgL() --> "+SaslUtil.dumpString(challenge));
      return challenge;
   }

   private byte[] sendResponse(byte[] input) throws SaslException {
      cat.debug("==> sendResponse()");
      cat.debug("response: "+SaslUtil.dumpString(input));

      // Client sends A,I,o
      InputBuffer frameIn = new InputBuffer(input);
      try {
         // Extract client's ephemeral public key
         A = frameIn.getMPI();
         cat.debug("Got A (client's ephemeral public key): "+SaslUtil.dump(A));

         // Extract authorisation identity
         authorizationID = frameIn.getText();
         cat.debug("Got I (client's authorisation identity): \""+authorizationID+"\"");

         // Extract client's options list
         o = frameIn.getText();
         cat.info("Got o (client's chosen options list): \""+o+"\"");
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendResponse()", x);
      }

      // Parse client's options and set security layer variables
      parseChosenOptionsList(o);

      cat.debug("*** Generating ephemeral public keypair...");
      kp = srp.generateServerKeyPair(N, g, v);

      // The server generates its ephemeral public key (B)
      B = ((SRPPublicKey) kp.getPublic()).getExponent();

      // The server calculates the shared context key (K).
      K = srp.generateServerSecretKey(kp, A, v);

      OutputBuffer frameOut = new OutputBuffer();
      try {
         frameOut.setMPI(B);
         cat.debug("Encoding B (server's ephemeral public key): "+SaslUtil.dump(B));
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendResponse()", x);
      }

      byte[] result = frameOut.encode();
      cat.debug("<== sendResponse() --> "+SaslUtil.dumpString(result));
      return result;
   }

   private byte[] sendEvidence(byte[] input) throws SaslException {
      cat.debug("==> sendEvidence()");
      cat.debug("response: "+SaslUtil.dumpString(input));

      // Client sends evidence
      InputBuffer frameIn = new InputBuffer(input);

      // Extract evidence
      byte[] M1;
      try {
         M1 = frameIn.getOS();
         cat.debug("Got M1 (client evidence): "+SaslUtil.dumpString(M1));
      } catch (IOException x) {
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("sendEvidence()", x);
      }

      byte[] k = K.getEncoded();
      byte[] expected = srp.generateClientEvidence(N, g, U, s, A, B, k, L);

      // Verify client evidence
      if (!SaslUtil.areEqual(M1, expected))
         throw new SaslException("Verification of client evidence failed");

      byte[] result = null;
      if (chosenConfidentialityAlgorithm == null) { // server MUST send M2
         OutputBuffer frameOut = new OutputBuffer();

         byte[] M2 = srp.generateServerEvidence(A, M1, k, U, authorizationID, o);
         try {
            frameOut.setOS(M2);
         } catch (IOException x) {
            if (x instanceof SaslException)
               throw (SaslException) x;
            throw new SaslException("sendEvidence()", x);
         }

         result = frameOut.encode();
      }

      setupSecurityServices();

      cat.debug("<== sendEvidence() --> "+SaslUtil.dumpString(result));
      return result;
   }

   private String createAvailableOptionsList() {
      cat.debug("==> createAvailableOptionsList()");

      StringBuffer sb = new StringBuffer();
      int i;

      String s = (String) properties.get(SRP_MANDATORY);
      if (s == null)
         s = DEFAULT_MANDATORY;

      if (!MANDATORY_NONE.equals(s)
            && !MANDATORY_REPLAY_DETECTION.equals(s)
            && !MANDATORY_INTEGRITY.equals(s)
            && !MANDATORY_CONFIDENTIALITY.equals(s)) {
         cat.warn("Unrecognised mandatory option ("+s+"). Using default...");
         s = DEFAULT_MANDATORY;
      }

      mandatory = s;

      s = (String) properties.get(SRP_CONFIDENTIALITY);
      boolean confidentiality =
         (s == null ? DEFAULT_CONFIDENTIALITY : Boolean.valueOf(s).booleanValue());

      s = (String) properties.get(SRP_INTEGRITY_PROTECTION);
      boolean integrity =
         (s == null ? DEFAULT_INTEGRITY : Boolean.valueOf(s).booleanValue());

      s = (String) properties.get(SRP_REPLAY_DETECTION);
      boolean replayDetection =
         (s == null ? DEFAULT_REPLAY_DETECTION : Boolean.valueOf(s).booleanValue());

      if (!MANDATORY_NONE.equals(mandatory))
         sb.append("mandatory=").append(mandatory).append(",");

      if (replayDetection) {
         sb.append("replay detection,");
         // if replay detection is on then force integrity protection
         integrity = true;
      }

      if (integrity)
         for (i = 0; i < INTEGRITY_ALGORITHMS.length; i++)
             sb.append("integrity=").append(INTEGRITY_ALGORITHMS[i]).append(",");

      if (confidentiality)
         for (i = 0; i < CONFIDENTIALITY_ALGORITHMS.length; i++)
             sb.append("confidentiality=")
                .append(CONFIDENTIALITY_ALGORITHMS[i])
                .append(",");

      // chop off trailing comma
//      String result = (sb.toString()).substring(0, sb.length()-1);
      String result = sb.append("maxbuffersize=").append(BUFFER_LIMIT).toString();
      cat.debug("<== createAvailableOptionsList() --> "+result);
      return result;
   }

   // Parse client's options and set security layer variables
   private void parseChosenOptionsList(String o) throws SaslException {
      this.replayDetection = false;
      boolean integrity = false;
      boolean confidentiality = false;
      String option;
      int i;

      StringTokenizer st = new StringTokenizer(o.toLowerCase(), ",");
      while (st.hasMoreTokens()) {
         option = st.nextToken();
         cat.debug("option: <"+option+">");
         if (option.equals("replay detection"))
            replayDetection = true;
         else if (option.startsWith("integrity="))
            if (integrity)
               throw new SaslException("Only one integrity algorithm may be chosen");
            else {
               option = option.substring(option.indexOf('=')+1);
               cat.debug("algorithm: <"+option+">");
               for (i = 0; i < INTEGRITY_ALGORITHMS.length; i++)
                  if (INTEGRITY_ALGORITHMS[i].equals(option)) {
                     chosenIntegrityAlgorithm = option;
                     integrity = true;
                     break;
                  }

               if (!integrity)
                  throw new SaslException("Unknown integrity algorithm: "+option);
            }
         else if (option.startsWith("confidentiality="))
            if (confidentiality)
               throw new SaslException("Only one confidentiality algorithm may be chosen");
            else
            {
               option = option.substring(option.indexOf('=')+1);
               cat.debug("algorithm: <"+option+">");
               for (i = 0; i < CONFIDENTIALITY_ALGORITHMS.length; i++)
                  if (CONFIDENTIALITY_ALGORITHMS[i].equals(option)) {
                     chosenConfidentialityAlgorithm = option;
                     confidentiality = true;
                     break;
                  }

               if (!confidentiality)
                  throw new SaslException("Unknown confidentiality algorithm: "+option);
            }
         else if (option.startsWith("maxbuffersize=")) {
            String maxBufferSize = option.substring(option.indexOf('=')+1);
            try {
               rawSendSize = Integer.parseInt(maxBufferSize);
               if (rawSendSize > BUFFER_LIMIT || rawSendSize < 1)
                  throw new SaslException("Illegal value for 'maxbuffersize' option");
            } catch (NumberFormatException x) {
               throw new SaslException("maxbuffersize="+String.valueOf(maxBufferSize), x);
            }
         }
      }

      // check if client did the right thing
      if (replayDetection)
         if (!integrity)
            throw new SaslException("Missing integrity protection algorithm "
               +"but replay detection is chosen");
         else
            ; // ok

      if (mandatory.equals(MANDATORY_REPLAY_DETECTION))
         if (!replayDetection)
            throw new SaslException("Replay detection is mandatory but was not chosen");
         else
            ; // ok

      if (mandatory.equals(MANDATORY_INTEGRITY))
         if (!integrity)
            throw new SaslException("Integrity protection is mandatory but was not chosen");
         else
            ; // ok

      if (mandatory.equals(MANDATORY_CONFIDENTIALITY))
         if (!confidentiality)
            throw new SaslException("Confidentiality is mandatory but was not chosen");
         else
            ; // ok
   }

   private void setupSecurityServices() throws SaslException {
      // signal end of authentication phase
      complete = true;
      outCounter = inCounter = 0;

      // instantiate hmacs if integrity protection filter is active
      if (chosenIntegrityAlgorithm != null) {
         cat.debug("Activating integrity protection filter");
         inMac =  IALG.getInstance(chosenIntegrityAlgorithm, K);
         outMac = IALG.getInstance(chosenIntegrityAlgorithm, K);
      }

      // instantiate cipher if confidentiality protection filter is active
      if (chosenConfidentialityAlgorithm != null) {
         cat.debug("Activating confidentiality protection filter");
         inCipher =  CALG.getInstance(chosenConfidentialityAlgorithm, K, CALG.DECRYPT);
         outCipher = CALG.getInstance(chosenConfidentialityAlgorithm, K, CALG.ENCRYPT);
       }
   }
}
