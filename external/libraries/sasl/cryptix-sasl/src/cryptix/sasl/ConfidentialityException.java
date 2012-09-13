package cryptix.sasl;

// $Id: ConfidentialityException.java,v 1.1 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import javax.security.sasl.SaslException;

/**
 * Used by mechanisms that offer a security services layer, this checked
 * exception is thrown to indicate that a violation has occured during the
 * processing of a <i>confidentiality</i> protection filter.
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-srp-sasl-04
 */
public class ConfidentialityException extends SaslException {

	/**
	 * Constructs a new instance of <tt>ConfidentialityException</tt> with no
	 * detail message.
	 */
   public ConfidentialityException() {
      super();
   }

	/**
	 * Constructs a new instance of <tt>ConfidentialityException</tt> with the
	 * specified detail message.
	 *
	 * @param s the detail message.
	 */
   public ConfidentialityException(String s) {
      super(s);
   }

   /**
    * Constructs a new instance of <tt>ConfidentialityException</tt> with a
    * detailed message and a root exception.
    *
    * @param s possibly null additional detail about the exception.
    * @param x a possibly null root exception that caused this one.
    */
   public ConfidentialityException(String s, Throwable x) {
      super(s, x);
   }
}