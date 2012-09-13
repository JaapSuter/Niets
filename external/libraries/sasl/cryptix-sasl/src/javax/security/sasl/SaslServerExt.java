package javax.security.sasl;

import java.security.spec.AlgorithmParameterSpec;

/**
 * The visible additional methods for a SASL server to support the SM2 protocol.
 *
 * @version $Revision: 1.2 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
public interface SaslServerExt extends SaslServer {

   /**
    * Retrieves the SASL Security Context of this SASL mechanism object. This
    * method can be called only after the authentication exchange has completed
    * (i.e., when {@link javax.security.sasl.SaslServer#isComplete()} returns
    * <tt>true</tt>); otherwise, a {@link javax.security.sasl.SaslException}
    * is thrown.
    *
    * @return the SASL Security Context of this object.
    * @throws SaslException if the authentication phase has not finished.
    */
   AlgorithmParameterSpec getSaslSecurityContext() throws SaslException;

   /**
    * Sets the SASL Security Context of this SASL mechanism object to the
    * designated value.
    *
    * @param ctx the new SASL Security Context of this object.
    * @throws SaslException if an error occurs during the operation.
    */
   void setSaslSecurityContext(AlgorithmParameterSpec ctx) throws SaslException;

   /**
    * Given the SASL mechanism peer's evidence, which may be null, this method
    * is for SASL mechanisms capable of using the designated evidence to update
    * or recycle their cryptographic data, so security services can still be
    * provided, in a secure fashion, without the need to go through the
    * authentication phase again.
    *
    * @param peerEvidence the SASL mechanism peer's evidence.
    * @return this object's evidence.
    * @throws SaslException if an exception occurs during the operation.
    */
   byte[] evaluateEvidence(byte[] peerEvidence) throws SaslException;
}