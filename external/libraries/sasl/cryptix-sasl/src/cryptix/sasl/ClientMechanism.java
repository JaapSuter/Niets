package cryptix.sasl;

// $Id: ClientMechanism.java,v 1.3 2001/10/14 06:24:43 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;

/**
 * The Cryptix implementation of the base SASL client-side mechanism.
 *
 * @version $Revision: 1.3 $
 * @since draft-weltman-java-sasl-05
 * @see cryptix.sasl.sm2.SM2Client
 * @see cryptix.sasl.srp.SRPClient
 */
public abstract class ClientMechanism
implements SaslClient, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   /** Name of this mechanism. */
   protected String mechanism;

   /** The authorisation identity. */
   protected String authorizationID;

   /** Name of protocol using this mechanism. */
   protected String protocol;

   /** Name of server to authenticate to. */
   protected String serverName;

   /** Properties of qualities desired for this mechanism. */
   protected Hashtable properties;

   /** Callback handler to use with this mechanism instance. */
   protected CallbackHandler handler;

   /** Whether authentication phase is completed (true) or not (false). */
   protected boolean complete = false;

   /** The state of the authentication automaton. */
   protected int state = 0;

   private int rawSendSize = BUFFER_LIMIT;

   // Constructor(s)
   // -------------------------------------------------------------------------

   protected
   ClientMechanism(String mechanism, String authorizationID, String protocol,
                   String serverName, Hashtable props, CallbackHandler cbh) {
      this.mechanism = mechanism;
      this.authorizationID = (authorizationID == null ? "" : authorizationID);
      this.protocol = protocol;
      this.serverName = serverName;
      this.properties = (props == null ? new Hashtable() : props);
      this.handler = cbh;
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslClient interface implementation
   // -------------------------------------------------------------------------

   public abstract byte[] evaluateChallenge(byte[] challenge)
   throws SaslException;

   public abstract boolean hasInitialResponse();

   public boolean isComplete() {
      return complete;
   }

   public byte[] unwrap(byte[] incoming, int offset, int len )
   throws SaslException {
      if (!isComplete())
         throw new IllegalMechanismStateException();

      return this.engineUnwrap(incoming, offset, len);
   }

   public byte[] wrap(byte[] outgoing, int offset, int len)
   throws SaslException {
      if (!isComplete())
         throw new IllegalMechanismStateException();

      return this.engineWrap(outgoing, offset, len);
   }

   public String getMechanismName() {
      return this.mechanism;
   }

   public String getNegotiatedProperty(String propName) throws SaslException {
      if (!isComplete())
         throw new IllegalMechanismStateException();

      if (Sasl.QOP.equals(propName))
         return getNegotiatedQOP();
      else if (Sasl.STRENGTH.equals(propName))
         return getNegotiatedStrength();
      else if (Sasl.SERVER_AUTH.equals(propName))
         return getNegotiatedServerAuth();
      else if (Sasl.MAX_BUFFER.equals(propName))
         return getNegotiatedMaxBuffer();
      else if (Sasl.CLIENT_PKGS.equals(propName))
         return "cryptix.sasl";
      else if (Sasl.SERVER_PKGS.equals(propName))
         return "cryptix.sasl";
      else if (Sasl.RAW_SEND_SIZE.equals(propName))
         return getNegotiatedRawSendSize();
      else if (Sasl.POLICY_NOPLAINTEXT.equals(propName))
         return getNegotiatedPolicyNoPlainText();
      else if (Sasl.POLICY_NOACTIVE.equals(propName))
         return getNegotiatedPolicyNoActive();
      else if (Sasl.POLICY_NODICTIONARY.equals(propName))
         return getNegotiatedPolicyNoDictionary();
      else if (Sasl.POLICY_NOANONYMOUS.equals(propName))
         return getNegotiatedPolicyNoAnonymous();
      else if (Sasl.POLICY_FORWARD_SECRECY.equals(propName))
         return getNegotiatedPolicyForwardSecrecy();
      else if (Sasl.POLICY_PASS_CREDENTIALS.equals(propName))
         return getNegotiatedPolicyPassCredentials();
      else
         return null;
   }

   public void dispose() throws SaslException {
   }

   // other Instance methods
   // -------------------------------------------------------------------------

   public String getAuthorizationID() {
      return this.authorizationID;
   }

   protected String getNegotiatedQOP() {
      return null;
   }

   protected String getNegotiatedStrength() {
      return null;
   }

   protected String getNegotiatedServerAuth() {
      return null;
   }

   protected String getNegotiatedMaxBuffer() {
      return null;
   }

   protected String getNegotiatedRawSendSize() {
      return String.valueOf(rawSendSize);
   }

   protected String getNegotiatedPolicyNoPlainText() {
      return null;
   }

   protected String getNegotiatedPolicyNoActive() {
      return null;
   }

   protected String getNegotiatedPolicyNoDictionary() {
      return null;
   }

   protected String getNegotiatedPolicyNoAnonymous() {
      return null;
   }

   protected String getNegotiatedPolicyForwardSecrecy() {
      return null;
   }

   protected String getNegotiatedPolicyPassCredentials() {
      return null;
   }

   protected byte[] engineUnwrap(byte[] incoming, int offset, int len)
   throws SaslException {
      byte[] buffy = new byte[len];
      System.arraycopy(incoming, offset, buffy, 0, len);
      return buffy;
   }

   protected byte[] engineWrap(byte[] outgoing, int offset, int len)
   throws SaslException {
      byte[] buffy = new byte[len];
      System.arraycopy(outgoing, offset, buffy, 0, len);
      return buffy;
   }
}
