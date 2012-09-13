package cryptix.sasl.srp;

// $Id: SRPPublicKey.java,v 1.1 2001/02/04 00:33:32 keith Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.math.BigInteger;
import java.security.PublicKey;
import cryptix.sasl.SaslUtil;

/**
 *
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public class SRPPublicKey
   extends SRPKey
   implements PublicKey
{

	// Constants and variables
	// -------------------------------------------------------------------------

	/**
	 * The public exponent for either the server or the client engaged in the
	 * SRP protocol exchange.
	 */
	private BigInteger X;

	/**
	 * The byte representation of the above. cached for speed.
	 */
	private byte[] xBytes = null;

	// Constructor(s)
	// -------------------------------------------------------------------------

	public SRPPublicKey
      (
         BigInteger n,
         BigInteger g,
         BigInteger X
      )
	{
		super(n, g);

		// should check values here

		this.X = X;
	}

	// Class methods
	// -------------------------------------------------------------------------

	// Instance methods
	// -------------------------------------------------------------------------

	/**
	 * Returns the (public) exponent as a <tt>java.math.BigInteger</tt>.
	 *
	 * @return the (public) exponent as a <tt>java.math.BigInteger</tt>.
	 */
	public BigInteger
	getExponent()
	{
		return X;
	}

	/**
	 * Returns the public exponent part of the key; ie. <tt>B</tt> if this
	 * is the public key for a server, or <tt>A</tt> if it is for a client.
	 *
	 * @return the byte array containing the two's-complement representation of
	 * <tt>B</tt> or <tt>A</tt> --depending on whether this key is for a server,
	 * or a client respectively. The byte array will be in big-endian byte-order:
	 * the most significant byte is in the zeroth element. The array will contain
	 * the minimum number of bytes required to represent this BigInteger, excluding
	 * all bytes (MSB) with 0-value; ie. trimmed array.
	 */
	public byte[]
	getExponentBytes()
	{
		if (xBytes == null)
			xBytes = SaslUtil.trim(X);

		return (byte[]) xBytes.clone();
	}

}

