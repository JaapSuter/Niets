package javax.security.sasl;

// $Id: SaslServer.java,v 1.3 2001/06/11 08:20:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * An object implementing this interface can negotiate authentication as a
 * server using one of the IANA-registered mechanisms.
 *
 * @version $Revision: 1.3 $
 * @since draft-weltman-java-sasl-05
 */
public interface SaslServer
{
   /**
    * If a response is received from the client during the authentication
    * process, this method is called to prepare an appropriate next
    * challenge to submit to the client. The challenge is null if the
    * authentication has succeeded and no more challenge data is to be sent
    * to the client. It is non-null if the authentication must be continued
    * by sending a challenge to the client, or if the authentication has
    * succeeded but challenge data needs to be processed by the client. A
    * <tt>SaslException</tt> is thrown if an error occurred while processing
    * the response or generating a challenge. <tt>isComplete()</tt> should be
    * called after each call to <tt>evaluateResponse()</tt>, to determine if
    * any further response is needed from the client. The protocol driver will
    * send an indication (in a protocol-specific manner) as to whether the
    * authentication has succeeded, failed, or should be continued, and any
    * accompanying challenge data.
    *
    * @param response Non-null response received from client.
    * @return the server's next challenge.
    * @exception SaslException if an error occurred while processing the
    * response or generating a challenge.
    */
   byte[]
   evaluateResponse
      (
         byte[] response
      )
      throws SaslException;

   /**
    * This method may be called at any time to determine if the authentication
    * process is finished. This method is typically called after each
    * invocation of <tt>evaluateResponse()</tt> to determine whether the
    * authentication has completed successfully or should be continued.
    *
    * @return <tt>true</tt> if the authentication process is finished.
    */
   boolean
   isComplete();

   /**
    * Unwraps a byte array received from the client to return the corresponding
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
    * the client.
    * @param offset the starting position at incoming of the bytes to use.
    * @param len the number of bytes from incoming to use.
    * @return the decoded/verified portion of the incoming array.
    * @exception SaslException if an exception occurs during the operation.
    */
   byte[] unwrap(byte[] incoming, int offset, int len) throws SaslException;

   /**
    * Wraps a byte array to be sent to the client to return the corresponding
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
    * Reports the IANA-registered name of the mechanism used by this server,
    * e.g. "GSSAPI" or "CRAM-MD5".
    *
    * @return the canonical mechanism name.
    */
   String
   getMechanismName();

   /**
    * Reports the authorization ID in effect for the client of this session. If
    * null, a protocol-dependent default is assumed. Can only be called if
    * <tt>isComplete()</tt> returns <tt>true</tt>; throws <tt>SaslException</tt>
    * if called before authentication completes.
    *
    * @return the authorization ID in effect for the client of this session.
    */
   String
   getAuthorizationID();

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