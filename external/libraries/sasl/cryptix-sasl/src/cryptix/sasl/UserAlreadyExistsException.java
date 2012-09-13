package cryptix.sasl;

// $Id: UserAlreadyExistsException.java,v 1.1 2001/02/04 00:29:03 keith Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import javax.security.sasl.SaslException;

/**
 * A checked exception thrown to indicate that a designated user is already
 * known to the the authentication layer.
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class UserAlreadyExistsException
   extends SaslException
{
   /**
	 * Constructs a <tt>UserAlreadyExistsException</tt> with no detail message.
	 */
   public UserAlreadyExistsException()
   {
      super();
   }

	/**
	 * Constructs a <tt>UserAlreadyExistsException</tt> with the specified
	 * detail message. In the case of this exception, the detail message
	 * designates the offending username.
	 *
	 * @param arg the detail message, which in this case is the username.
	 */
   public UserAlreadyExistsException
      (
         String arg
      )
   {
      super(arg);
   }
}

