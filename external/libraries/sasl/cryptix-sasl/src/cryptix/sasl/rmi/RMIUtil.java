package cryptix.sasl.rmi;

// $Id: RMIUtil.java,v 1.1 2001/10/14 06:26:14 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * An RMI-specific utility class.
 *
 * @version 1.0
 */
public class RMIUtil
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Trivial private constructor to enforce Singleton pattern. */
   private RMIUtil() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * Read data from the stream in the format of 4 bytes length and then the
    * actual data.
    *
    * @param is the stream to read from.
    * @return the bytes read as content.
    * @exception IOException if the stream throws an exception.
    */
   static byte[] readLV(InputStream is) throws IOException {
      int bytesRead = 0;
      // read the first 4 length bytes. These will always be there.
      byte[] lengthBytes = new byte[4];
      while (bytesRead < 4) {
         int len = is.read(lengthBytes, bytesRead, 4 - bytesRead);
         if (len == -1) {
            throw new IOException("unexpected end of stream");
         }
         bytesRead += len;
      }

      int payloadLength = buildInt(lengthBytes);
      // read the actual payload, make sure this is read fully
      bytesRead = 0;
      byte[] payload = new byte[payloadLength];
      while (bytesRead < payloadLength) {
         int len = is.read(payload, bytesRead, payloadLength - bytesRead);
         if (len == -1) {
            throw new IOException("unexpected end of stream");
         }
         bytesRead += len;
      }
      return payload;
   }

   /**
    * Write data to the stream in the format of 4 bytes length and then the
    * actual data.
    *
    * @param os the stream to write to.
    * @param data the bytes to write as content.
    * @exception IOException if the stream throws an exception.
    */
   static void writeLV(OutputStream os, byte[] data) throws IOException {
      os.write(buildBytes(data.length));
      os.write(data);
   }

   /**
    * Build an int from an array of 4 bytes.
    *
    * @param bytes the bytes to form the int.
    * @return an int.
    * @exception IllegalArgumentException if the array is null or wrong size.
    */
   private static int buildInt(byte[] bytes) throws IllegalArgumentException {
      if (bytes == null || bytes.length != 4) {
         throw new IllegalArgumentException("bytes");
      }
      return bytes[0]         << 24 |
            (bytes[1] & 0xFF) << 16 |
            (bytes[2] & 0xFF) <<  8 |
            (bytes[3] & 0xFF);
   }

   /**
    * Build a 4 byte array that represents the int in network byte order.
    *
    * @param length the int to encode.
    * @return a 4 byte array representing the int.
    */
   private static byte[] buildBytes(int length) {
      byte[] result = new byte[4];
      result[0] = (byte)(length >>> 24);
      result[1] = (byte)(length >>> 16);
      result[2] = (byte)(length >>>  8);
      result[3] = (byte) length;

      return result;
   }
}
