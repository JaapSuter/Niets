package cryptix.sasl.srp;

// $Id: SRPKey.java,v 1.1 2001/02/04 00:33:31 keith Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.Serializable;
import java.math.BigInteger;
import java.security.Key;
import java.security.PublicKey;

import cryptix.sasl.SaslUtil;

/**
 *
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public abstract class SRPKey
   implements Key, Serializable
{

	// Constants and variables
	// -------------------------------------------------------------------------

	/**
	 * The public shared modulus.
	 */
	protected BigInteger n;

	/**
	 * Same as above. Cached for speed.
	 */
	protected byte[] nBytes = null;

	/**
	 * The generator.
	 */
	protected BigInteger g;

	/**
	 * Same as above. Cached for speed.
	 */
	protected byte[] gBytes = null;

	// Constructor(s)
	// -------------------------------------------------------------------------

	public SRPKey
      (
         BigInteger n,
         BigInteger g
      )
	{
		// should check values here

		this.n = n;
		this.g = g;
	}

	// Class methods
	// -------------------------------------------------------------------------

	// java.security.Key interface implementation
	// -------------------------------------------------------------------------

	/**
	 * Returns the standard algorithm name for this key.
	 *
	 * @return the standard algorithm name for this key.
	 */
	public String
	getAlgorithm()
	{
		return "SRP";
	}

	/**
	 * Returns null since this implementation does not encode SRP keys.
	 *
	 * @return null since this implementation does not encode SRP keys.
	 */
	public byte[]
	getEncoded()
	{
		return null;
	}

	/**
	 * Returns null since this implementation does not encode SRP keys.
	 *
	 * @return null since this implementation does not encode SRP keys.
	 */
	public String
	getFormat()
	{
		return null;
	}

	// Instance methods
	// -------------------------------------------------------------------------

	/**
	 * Returns the public shared modulus.
	 *
	 * @return <tt>n</tt>.
	 */
	public BigInteger
	getModulus()
	{
		return this.n;
	}

	/**
	 * Returns the public shared modulus.
	 *
	 * @return the byte array containing the two's-complement representation of
	 * <tt>n</tt>. The byte array will be in big-endian byte-order: the most
	 * significant byte is in the zeroth element. The array will contain the
	 * minimum number of bytes required to represent this BigInteger, excluding
	 * all bytes (MSB) with 0-value; ie. trimmed array.
	 */
	public byte[]
	getModulusBytes()
	{
		if (this.nBytes == null)
			this.nBytes = SaslUtil.trim(this.n);

		return this.nBytes;
	}

	/**
	 * Returns the generator.
	 *
	 * @return <tt>g</tt>.
	 */
	public BigInteger
	getGenerator()
	{
		return this.g;
	}

	/**
	 * Returns the generator.
	 *
	 * @return the byte array containing the two's-complement representation of
	 * <tt>g</tt>. The byte array will be in big-endian byte-order: the most
	 * significant byte is in the zeroth element. The array will contain the
	 * minimum number of bytes required to represent this BigInteger, excluding
	 * all bytes (MSB) with 0-value; ie. trimmed array.
	 */
	public byte[]
	getGeneratorBytes()
	{
		if (this.gBytes == null)
			this.gBytes = SaslUtil.trim(this.g);

		return this.gBytes;
	}
}

