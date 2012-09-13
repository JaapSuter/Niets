package cryptix.sasl;

// $Id: AuthInfoProvider.java,v 1.2 2001/09/25 09:37:02 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.crammd5.CramMD5AuthInfoProvider;
import cryptix.sasl.otp.OTPAuthInfoProvider;
import cryptix.sasl.plain.PlainAuthInfoProvider;
import cryptix.sasl.srp.SRPAuthInfoProvider;

/**
 * The concrete Cryptix SASL authentication information provider factory.
 *
 * @version $Revision: 1.2 $
 * @since   0.8.9
 */
public class AuthInfoProvider implements AuthInfoProviderFactory, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   // implicit 0-args constructor

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

	/**
	 * Returns an implementation of a provider for a designated mechanism capable
    * of honouring <tt>AuthInfoServices</tt> requests.
	 *
	 * @param mechanism the unique name of a mechanism.
	 * @return an implementation of <tt>AuthInfoServices</tt> for that mechanism
	 * or null if none found.
	 */
	public AuthInfoServices getInstance(String mechanism) {
      if (mechanism == null)
         return null;

      mechanism = mechanism.trim().toUpperCase();
      if (mechanism.startsWith(SRP_MECHANISM))
         return new SRPAuthInfoProvider();

      if (mechanism.equals(OTP_MECHANISM))
         return new OTPAuthInfoProvider();

      if (mechanism.equals(CRAM_MD5_MECHANISM))
         return new CramMD5AuthInfoProvider();

      if (mechanism.equals(PLAIN_MECHANISM))
         return new PlainAuthInfoProvider();

      return null;
   }
}
