package cryptix.sasl;

// $Id: AuthInfoProviderFactory.java,v 1.1 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * The visible method of every authentication information provider factory.
 *
 * @version $Revision: 1.1 $
 * @since   0.8.9
 */
public interface AuthInfoProviderFactory
{
   // Constants
   // -------------------------------------------------------------------------

   // Methods
   // -------------------------------------------------------------------------

	/**
	 * Returns an implementation of a provider for a designated mechanism
	 * capable of honouring <tt>AuthInfoServices</tt> requests.
	 *
	 * @param mechanism the unique name of a mechanism.
	 * @return an implementation of <tt>AuthInfoServices</tt> for that mechanism
	 * or null if none found.
	 */
	AuthInfoServices getInstance(String mechanism);
}
