package cryptix.sasl.sm2;

// $Id: SM2SessionModifiedException.java,v 1.1 2001/03/10 06:48:32 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import javax.security.sasl.SaslException;

/**
 * A checked exception thrown to indicate that a concurrent modification of the
 * SASL Security Context object for an SM2 session has occured (probably by
 * another thread using the same session).
 *
 * @version $Revision: 1.1 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class SM2SessionModifiedException extends SM2InvalidSessionException
{
	/**
	 * Constructs a <tt>SM2SessionModifiedException</tt> with the specified
	 * detail message. In the case of this exception, the detail message
	 * designates the targeted session identifier.
	 *
	 * @param sid the targeted session identifier.
	 */
   public SM2SessionModifiedException(String sid) {
      super(sid);
   }
}