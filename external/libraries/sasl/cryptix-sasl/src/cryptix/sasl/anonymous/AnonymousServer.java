package cryptix.sasl.anonymous;

// $Id: AnonymousServer.java,v 1.5 2001/10/14 06:23:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.ServerMechanism;

import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;

/**
 * The Cryptix implementation of the ANONYMOUS SASL mechanism.
 *
 * @version $Revision: 1.5 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class AnonymousServer
extends ServerMechanism
implements SaslServer, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   public AnonymousServer() {
      super(ANONYMOUS_MECHANISM, "", "", null, null);
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslServer interface implementation
   // -------------------------------------------------------------------------

   public byte[] evaluateResponse(byte[] response) throws SaslException {
      if (response == null)
         return null;

      authorizationID = new String(response);
      if (AnonymousUtil.isValidTraceInformation(authorizationID)) {
         this.complete = true;
         return null;
      }

      authorizationID = null;
      throw new SaslException("Not a valid email address");
   }
}
