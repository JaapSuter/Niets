package cryptix.sasl;

// $Id: AuthInfoServices.java,v 1.1 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.util.Map;

/**
 * The visible methods of any authentication information provider.
 *
 * @version $Revision: 1.1 $
 * @since   0.8.9
 */
public interface AuthInfoServices
{
   // Constants
   // -------------------------------------------------------------------------

   // Methods
   // -------------------------------------------------------------------------

	/**
	 * Activates (initialises) this provider instance. SHOULD be the first method
    * invoked on the provider.
	 *
    * @param context a collection of name-value bindings describing the
    * activation context.
	 * @exception AuthException if an exception occurs during the operation.
	 */
	void activate(Map context) throws AuthException;

   /**
    * Passivates (releases) this provider instance. SHOULD be the last method
    * invoked on the provider. Once it is done, no other method may be invoked
    * on the same instance before it is <i>activated</i> agains.
	 *
	 * @exception AuthException if an exception occurs during the operation.
    */
	void passivate() throws AuthException;

   /**
    * Checks if a user with a designated name is known to this provider.
    *
    * @param userName the name of a user to check.
    * @return <tt>true</tt> if the user with the designated name is known to
    * this provider; <tt>false</tt> otherwise.
	 * @exception AuthException if an exception occurs during the operation.
    */
	boolean contains(String userName) throws AuthException;

   /**
    * Returns a collection of information about a designated user. The contents
    * of the returned map is provider-specific of name-to-value mappings.
    *
    * @param userID a map of name-to-value bindings that fully describe a user.
    * @return a collection of information about the designated user.
	 * @exception AuthException if an exception occurs during the operation.
    */
	Map lookup(Map userID) throws AuthException;

   /**
    * Updates the credentials of a designated user.
    *
    * @param userCredentials a map of name-to-value bindings that fully describe
    * a user, including her new credentials.
	 * @exception AuthException if an exception occurs during the operation.
    */
	void update(Map userCredentials) throws AuthException;

   /**
    * A provider may operate in more than mode; e.g. SRP-II caters for user
    * credentials computed in more than one message digest algorithm. This
    * method returns the set of name-to-value bindings describing the mode of
    * the provider.
    *
    * @param mode a unique identifier described the operational mode.
    * @return a collection of name-to-value bindings describing the desgianted
    * mode.
	 * @exception AuthException if an exception occurs during the operation.
    */
	Map getConfiguration(String mode) throws AuthException;
}
