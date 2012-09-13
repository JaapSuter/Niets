package cryptix.sasl;

// $Id: InputBuffer.java,v 1.6 2001/11/06 12:11:15 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import javax.security.sasl.SaslException;
import cryptix.sasl.SaslUtil;
import org.apache.log4j.Category;

/**
 * The Cryptix implementation of an incoming SASL buffer.
 *
 * @version $Revision: 1.6 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public class InputBuffer implements SaslParams {

   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(InputBuffer.class);

   /** The internal buffer stream containing the buffer's contents. */
   protected ByteArrayInputStream in;

   /** The length of the buffer, according to its header. */
   protected int length;

   // Constructor(s)
   // -------------------------------------------------------------------------

   /**
    * Constructs a SASL buffer given the buffer's encoded form, including its
    * header bytes.
    *
    * @param buffer the encoded form, including the header bytes, of a SASL
    * buffer.
    * @exception SaslEncodingException if the buffer is malformed.
    */
   public InputBuffer(byte[] frame) throws SaslEncodingException {
      this();

      cat.debug("<init>.buffer = "+SaslUtil.dumpString(frame));
      if (frame.length < 4) {
         cat.error("Illegal SASL buffer header length");
         throw new SaslEncodingException("Buffer length too short");
      }

      length = (frame[0] & 0xFF) << 24 |
               (frame[1] & 0xFF) << 16 |
               (frame[2] & 0xFF) <<  8 |
               (frame[3] & 0xFF);
      if (length > BUFFER_LIMIT || length < 0) {
         cat.error("Buffer too long");
         throw new SaslEncodingException("SASL buffer size limit exceeded");
      }

      in = new ByteArrayInputStream(frame, 4, length);
   }

   /** Trivial private constructor for use by the class method. */
   private InputBuffer() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * Returns an instance of a SASL buffer given the buffer's encoded contents,
    * excluding the buffer's header bytes.<p>
    *
    * Calls the method with the same name and three arguments as:
    * <tt>getInstance(raw, 0, raw.length)</tt>.
    *
    * @param raw the encoded form, excluding the header bytes, of a SASL buffer.
    * @return a new instance of <tt>cryptix.sasl.InputBuffer</tt>.
    */
   public static InputBuffer getInstance(byte[] raw) {
      return getInstance(raw, 0, raw.length);
   }

   /**
    * Returns an instance of a SASL buffer given the buffer's encoded contents,
    * excluding the buffer's header bytes.
    *
    * @param raw the encoded form, excluding the header bytes, of a SASL buffer.
    * @param offset offset where to start using raw bytes from.
    * @param len number of bytes to use.
    * @return a new instance of <tt>cryptix.sasl.InputBuffer</tt>.
    */
   public static InputBuffer getInstance(byte[] raw, int offset, int len) {
      InputBuffer result = new InputBuffer();
      result.in = new ByteArrayInputStream(raw, offset, len);

      return result;
   }

   /**
    * Converts four octets into the number that they represent.
    *
    * @param the four octets
    * @return the length
    */
   public static int fourBytesToLength(byte[] b) throws SaslEncodingException {
      int result = (b[0] & 0xFF) << 24 |
                   (b[1] & 0xFF) << 16 |
                   (b[2] & 0xFF) <<  8 |
                   (b[3] & 0xFF);
      if (result > FOUR_BYTE_HEADER_LIMIT || result < 0) {
         cat.error("SASL EOS size limit exceeded");
         throw new SaslEncodingException("SASL EOS size limit exceeded");
      }

      return result;
   }

   /**
    * Converts two octets into the number that they represent.
    *
    * @param the two octets
    * @return the length
    */
   public static int twoBytesToLength(byte[] b) throws SaslEncodingException {
      int result = (b[0] & 0xFF) << 8 | (b[1] & 0xFF);
      if (result > TWO_BYTE_HEADER_LIMIT) {
         cat.error("SASL MPI/Text size limit exceeded");
         throw new SaslEncodingException("SASL MPI/Text size limit exceeded");
      }

      return result;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   public boolean hasMoreElements() {
      return (in.available() > 0);
   }

   /**
    * Decodes a SASL scalar quantity, <tt>count</tt>-octet long, from the
    * current buffer.
    *
    * @param count the number of octets of this scalar quantity.
    * @return a native representation of a SASL scalar quantity.
    * @exception SaslEncodingException if an encoding exception occurs during
    * the operation.
    * @exception IOException if any other I/O exception occurs during the
    * operation.
    */
   public int getScalar(int count) throws IOException {
      cat.debug("==> getScalar("+String.valueOf(count)+")");

      if (count < 0 || count > 4)
         throw new SaslEncodingException("Invalid SASL scalar octet count: "
            +String.valueOf(count));

      if (!hasMoreElements()) {
         cat.error("Not enough bytes for a Scalar in buffer");
         throw new SaslEncodingException("Buffer:getScalar: no data found");
      }

      if (in.available() < count) {
         cat.error("Illegal Scalar encoding");
         throw new SaslEncodingException("Illegal SASL Scalar encoding");
      }

      byte[] element = new byte[count];
      in.read(element);

      int result = 0;
      for (int i = 0; i < count; i++)
         result = (result << 8) | (element[i] & 0xFF);

      cat.debug("<== getScalar() --> "+result);
      return result;
   }

   /**
    * Decodes a SASL OS from the current buffer.
    *
    * @return a native representation of a SASL OS.
    * @exception SaslEncodingException if an encoding exception occurs during
    * the operation.
    * @exception IOException if any other I/O exception occurs during the
    * operation.
    */
   public byte[] getOS() throws IOException {
      cat.debug("==> getOS()");

      if (!hasMoreElements()) {
         cat.error("Not enough bytes for an OS in buffer");
         throw new SaslEncodingException("Buffer:getOS: no data found");
      }

      int elementLength = in.read();
      if (elementLength > ONE_BYTE_HEADER_LIMIT) {
         cat.error("OS encoding too long");
         throw new SaslEncodingException("SASL octet sequence size limit exceeded");
      }

      if (in.available() < elementLength) {
         cat.error("Illegal OS encoding");
         throw new SaslEncodingException("Illegal SASL octet sequence encoding");
      }

      cat.debug("OS length = "+String.valueOf(elementLength));
      byte[] element = new byte[elementLength];
      in.read(element);

      cat.debug("<== getOS() --> "+SaslUtil.dumpString(element));
      return element;
   }

   /**
    * Decodes a SASL EOS from the current buffer.
    *
    * @return a native representation of a SASL EOS.
    * @exception SaslEncodingException if an encoding exception occurs during
    * the operation.
    * @exception IOException if any other I/O exception occurs during the
    * operation.
    */
   public byte[] getEOS() throws IOException {
      cat.debug("==> getEOS()");

      if (in.available() < 4) {
         cat.error("Not enough bytes for an EOS in buffer");
         throw new SaslEncodingException("Buffer:getEOS: no data found");
      }

      byte[] elementLengthBytes = new byte[4];
      in.read(elementLengthBytes);
      int elementLength = fourBytesToLength(elementLengthBytes);
      if (in.available() < elementLength) {
         cat.error("Illegal EOS encoding");
         throw new SaslEncodingException("Illegal SASL extended octet sequence encoding");
      }

      cat.debug("EOS length = "+String.valueOf(elementLength));
      byte[] element = new byte[elementLength];
      in.read(element);

      cat.debug("<== getEOS() --> "+SaslUtil.dumpString(element));
      return element;
   }

   /**
    * Decodes a SASL MPI from the current buffer.
    *
    * @return a native representation of a SASL MPI.
    * @exception SaslEncodingException if an encoding exception occurs during
    * the operation.
    * @exception IOException if any other I/O exception occurs during the
    * operation.
    */
   public BigInteger getMPI() throws IOException {
      cat.debug("==> getMPI()");

      if (in.available() < 2) {
         cat.error("Not enough bytes for an MPI in buffer");
         throw new SaslEncodingException("Buffer:getMPI: no data found");
      }

      byte[] elementLengthBytes = new byte[2];
      in.read(elementLengthBytes);
      int elementLength = twoBytesToLength(elementLengthBytes);
      if (in.available() < elementLength) {
         cat.error("Illegal MPI encoding");
         throw new SaslEncodingException("Illegal SASL multi-precision integer encoding");
      }

      cat.debug("MPI length = "+String.valueOf(elementLength));
      byte[] element = new byte[elementLength];
      in.read(element);

      cat.debug("<== getMPI() --> "+SaslUtil.dumpString(element));
      return new BigInteger(1, element);
   }

   /**
    * Decodes a SASL Text from the current buffer.
    *
    * @return a native representation of a SASL Text.
    * @exception SaslEncodingException if an encoding exception occurs during
    * the operation.
    * @exception UnsupportedEncodingException if the UTF-8 character encoding
    * is not supported on this platform.
    * @exception IOException if any other I/O exception occurs during the
    * operation.
    */
   public String getText() throws IOException {
      cat.debug("==> getText()");

      if (in.available() < 2) {
         cat.error("Not enough bytes for a Text in buffer");
         throw new SaslEncodingException("Buffer:getText: no data found");
      }

      byte[] elementLengthBytes = new byte[2];
      in.read(elementLengthBytes);
      int elementLength = twoBytesToLength(elementLengthBytes);
      if (in.available() < elementLength) {
         cat.error("Illegal Text encoding");
         throw new SaslEncodingException("Illegal SASL text encoding");
      }

      cat.debug("Text length = "+String.valueOf(elementLength));
      byte[] element = new byte[elementLength];
      in.read(element);

      cat.debug("<== getText() --> "+SaslUtil.dumpString(element));
      return new String(element, "UTF8");
   }
}
