package cryptix.sasl;

// $Id: OTPInputBuffer.java,v 1.2 2001/06/11 08:20:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.InputBuffer;
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
 * @version $Revision: 1.2 $
 * @since draft-burdis-cat-sasl-srp-04
 */
public class OTPInputBuffer
   extends InputBuffer
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(OTPInputBuffer.class);

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
   public OTPInputBuffer
      (
         byte[] frame
      )
      throws SaslEncodingException
   {
      super(frame);
   }

   // Class methods
   // -------------------------------------------------------------------------

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
   public String
   getText()
      throws IOException
   {
      cat.debug("==> getText()");

      byte[] element = new byte[length];
      in.read(element, 0, length);

      cat.debug("<== getText() --> "+SaslUtil.dumpString(element));
      return new String(element,"UTF8");
   }
}