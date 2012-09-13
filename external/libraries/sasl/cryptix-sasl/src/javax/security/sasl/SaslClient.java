package javax.security.sasl;

// $Id: SaslClient.java,v 1.3 2001/06/11 08:20:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * An object implementing this interface can negotiate authentication as a
 * client using one of the IANA-registered mechanisms.
 *
 * @version $Revision: 1.3 $
 * @since draft-weltman-java-sasl-05
 */
public interface SaslClient
{
   /**
    * If a challenge is received from the server during the authentication
    * process, this method is called to prepare an appropriate next response to
    * submit to the server. The response is null if the challenge accompanied a
    * "SUCCESS" status and the challenge only contains data for the client to
    * update its state and no response needs to be sent to the server. The
    * response is a zero-length byte array if the client is to send a response
    * with no data. A <tt>SaslException</tt> is thrown if an error occurred
    * while processing the challenge or generating a response. The challenge
    * array may have zero length.
    *
    * @param challenge a challenge is received from the server.
    * @return the eventual response to the server.
    * @exception SaslException if an error occurred while processing the
    * challenge or generating a response.
    */
   byte[]
   evaluateChallenge
      (
         byte[] challenge
      )
      throws SaslException;

   /**
    * Determines whether this mechanism has an optional initial response. If
    * true, caller should call <tt>evaluateChallenge()</tt> with an empty
    * array to get the initial response.
    *
    * @return whether this mechanism has an optional initial response.
   */
   boolean
   hasInitialResponse();

   /**
    * This method may be called at any time to determine if the authentication
    * process is finished. Typically, the protocol driver will not do this
    * until it has received something from the server which indicates (in a
    * protocol-specific manner) that the process has completed.
    *
    * @return <tt>true</tt> if the authentication process is finished.
    */
   boolean
   isComplete();

   /**
    * Unwraps a byte array received from the server to return the corresponding
    * decoded bytes in a byte array.<p>
    *
    * This method can be called only after the authentication process has
    * completed (i.e., when <tt>isComplete()</tt> returns true) and only if the
    * authentication process has negotiated integrity and/or privacy as the
    * quality of protection; otherwise, a <tt>SaslException</tt> is thrown. A
    * <tt>SaslException</tt> is thrown also if incoming cannot be successfully
    * unwrapped.<p>
    *
    * <tt>incoming</tt> is the contents of the SASL buffer as defined in [SASL]
    * without the leading four octet field that represents the length.
    * <tt>offset</tt> and <tt>len</tt> specify the portion of incoming to use.
    *
    * @param incoming a non-null byte array containing the encoded bytes from
    * the server.
    * @param offset the starting position at incoming of the bytes to use.
    * @param len the number of bytes from incoming to use.
    * @return the decoded/verified portion of the incoming array.
    * @exception SaslException if an exception occurs during the operation.
    */
   byte[] unwrap(byte[] incoming, int offset, int len) throws SaslException;

   /**
    * Wraps a byte array to be sent to the server to return the corresponding
    * encoded bytes in a byte array.<p>
    *
    * This method can be called only after the authentication exchange has
    * completed (i.e., when <tt>isComplete()</tt> returns true) and only if the
    * authentication exchange has negotiated integrity and/or privacy as the
    * quality of protection; otherwise, a <tt>SaslException</tt> is thrown. A
    * <tt>SaslException</tt> is thrown also if outgoing cannot be successfully
    * wrapped.<p>
    *
    * The result of this method will make up the contents of the SASL buffer as
    * defined in [SASL] without the leading four octet field that represents the
    * length.<p>
    *
    * <tt>offset</tt> and <tt>len</tt> specify the portion of outgoing to use.
    *
    * @param outgoing a non-null byte array containing the bytes to encode.
    * @param offset the starting position at outgoing of the bytes to use.
    * @param len the number of bytes from outgoing to use.
    * @return the encoded/mac-ed portion of the outgoing array.
    * @exception SaslException if an exception occurs during the operation.
    */
   byte[] wrap(byte[] outgoing, int offset, int len) throws SaslException;

   /**
    * Reports the IANA-registered name of the mechanism used by this client,
    * e.g. "GSSAPI" or "CRAM-MD5".
    *
    * @return the canonical mechanism name.
    */
   String
   getMechanismName();

   /**
    * Retrieves the negotiated property. This method can be called only after
    * the authentication exchange has completed (i.e., when <tt>isComplete()</tt>
    * returns true); otherwise, a <tt>SaslException</tt> is thrown.<p>
    *
    * For example, this method may be used to obtain the negotiated raw send
    * buffer size, quality-of-protection, and cipher strength. See Section 4.1.7
    * for a list of standard properties.<p>
    *
    * This method returns null when the specified property was not negotiated or
    * is not applicable to this mechanism.
    *
    * @param propName the non-null property name.
    * @exception SaslException if the authentication phase is not complete or
    * the designated property was not negotiated or is not applicable to this
    * client.
    */
   String getNegotiatedProperty(String propName) throws SaslException;

   /**
    * Disposes of any system resources or security-sensitive information the
    * SaslClient might be using. Invoking this method invalidates the
    * SaslClient instance. This method is idempotent.
    */
   void dispose() throws SaslException;
}