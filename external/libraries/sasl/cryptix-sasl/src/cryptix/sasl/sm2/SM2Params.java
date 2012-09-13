package cryptix.sasl.sm2;

// $Id: SM2Params.java,v 1.3 2001/11/06 12:11:13 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * The following is a list of key names designating the values used in an SM2
 * exchange.
 *
 * @version $Revision: 1.3 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
public interface SM2Params
{
   /** The property name of the underlying SASL mechanism to use with SM2. */
   String UNDERLYING_MECHANISM = "sm2.underlying.mechanism";

   /** The property name of the protocol to use. */
   String PROTOCOL = "sm2.protocol";

   /** The property name of the server to authenticate to. */
   String SERVER_NAME = "sm2.server.name";

   /** The property name of the Time-To-Live (TTL) indicator. */
   String TTL_INDICATOR = "sm2.ttl";

   /** Value to indicate an establishment of a new session exchange. */
   int NEW_SESSION_COMMAND = 0x00;

   /** Value to indicate a re-use of an existing session exchange. */
   int USE_SESSION_COMMAND = 0x01;

   /** Positive acknowledgment for a re-use exchange. */
   int USE_SESSION_ACK = 0x06;

   /** Negative acknowledgment for a re-use exchange. */
   int USE_SESSION_NAK = 0x15;
}
