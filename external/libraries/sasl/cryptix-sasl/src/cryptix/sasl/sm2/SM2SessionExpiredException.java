package cryptix.sasl.sm2;

// $Id: SM2SessionExpiredException.java,v 1.1 2001/11/06 12:11:52 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import javax.security.sasl.SaslException;

/**
 * A checked exception thrown to indicate that a re-use session exchange has
 * been initiated by the client, but the server deems the session to have
 * expired.
 *
 * @version $Revision: 1.1 $
 * @since draft-naffah-cat-sasl-sm2-01
 */
public class SM2SessionExpiredException extends SM2InvalidSessionException {

   /**
    * Constructs an <tt>SM2SessionExpiredException</tt> with a specified detail
    * message. In the case of this exception, the detail message designates the
    * targeted session identifier.
    *
    * @param sid the identifier of the session in question.
    */
   public SM2SessionExpiredException(String sid) {
      super(sid);
   }
}
