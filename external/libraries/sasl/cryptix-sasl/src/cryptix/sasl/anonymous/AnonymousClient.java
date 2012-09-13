package cryptix.sasl.anonymous;

// $Id: AnonymousClient.java,v 1.5 2001/10/14 06:23:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.ClientMechanism;
import cryptix.sasl.IllegalMechanismStateException;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;

import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;

/**
 * Cryptix implementation of the ANONYMOUS SASL mechanism.
 *
 * @version $Revision: 1.5 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class AnonymousClient
extends ClientMechanism
implements SaslClient, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   public AnonymousClient(String authorizationID) {
      super(ANONYMOUS_MECHANISM, authorizationID, "", "", null, null);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslClient interface implementation
   // -------------------------------------------------------------------------

   public boolean hasInitialResponse() {
      return true;
   }

   public byte[] evaluateChallenge(byte[] challenge) throws SaslException {
      if (complete) {
         throw new IllegalMechanismStateException("evaluateChallenge()");
      }

      return response();
   }

   private byte[] response() throws SaslException {
      if (!AnonymousUtil.isValidTraceInformation(authorizationID)) {
         throw new SaslException("Authorization ID is not a valid email address");
      }

      complete = true;
      return authorizationID.getBytes();
   }
}
