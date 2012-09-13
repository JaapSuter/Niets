package cryptix.sasl;

// $Id: IllegalMechanismStateException.java,v 1.2 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import javax.security.sasl.SaslException;

/**
 * A checked exception thrown to indicate that an operation that should be
 * invoked on a completed mechanism was invoked but the authentication phase of
 * that mechanism was not completed yet, or that an operation that should be
 * invoked on incomplete mechanisms was invoked but the authentication phase of
 * that mechanism was already completed.
 *
 * @version $Revision: 1.2 $
 * @since draft-weltman-java-sasl-05
 */
public class IllegalMechanismStateException
extends SaslException
{
	/**
	 * Constructs a new instance of <tt>IllegalMechanismStateException</tt> with
	 * no detail message.
	 */
   public IllegalMechanismStateException() {
      super();
   }

	/**
	 * Constructs a new instance of <tt>IllegalMechanismStateException</tt> with
	 * the specified detail message.
	 *
	 * @param s the detail message.
	 */
   public IllegalMechanismStateException(String s) {
      super(s);
   }
}