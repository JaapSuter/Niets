package cryptix.sasl;

// $Id: SaslInputStream.java,v 1.2 2001/07/02 10:26:47 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.IOException;

import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslServer;
import javax.security.sasl.SaslException;

import org.apache.log4j.Category;

/**
 * An input stream that uses either a <tt>SaslClient</tt> or a <tt>SaslServer</tt>
 * to process the data through these entities' security layer filter(s).
 *
 * @version $Revision: 1.2 $
 * @since draft-weltman-java-sasl-05
 */
public class SaslInputStream
extends InputStream
{
   // Constants and variables
   // -------------------------------------------------------------------------

	private static Category cat = Category.getInstance(SaslInputStream.class);

   private SaslClient client;
   private SaslServer server;
   private int maxRawSendSize;
	private InputStream source;
	private byte[] internalBuf;

   // Constructor(s)
   // -------------------------------------------------------------------------

	public SaslInputStream(SaslClient client, InputStream source)
   throws IOException {
      super();

      this.client = client;
      maxRawSendSize =
         Integer.parseInt(client.getNegotiatedProperty(Sasl.RAW_SEND_SIZE));
      server = null;
		this.source = source;
	}

	public SaslInputStream(SaslServer server, InputStream source)
   throws IOException {
      super();

      this.server = server;
      maxRawSendSize =
         Integer.parseInt(server.getNegotiatedProperty(Sasl.RAW_SEND_SIZE));
      client = null;
		this.source = source;
	}

   // Class methods
   // -------------------------------------------------------------------------

   // Overloaded java.io.InputStream methods
   // -------------------------------------------------------------------------

	public int available() throws IOException {
		return (internalBuf == null) ? 0 : internalBuf.length;
	}

   public void close() throws IOException {
      source.close();
   }

   /**
    * Reads the next byte of data from the input stream. The value byte is
    * returned as an <tt>int</tt> in the range <tt>0</tt> to <tt>255</tt>.
    * If no byte is available because the end of the stream has been reached,
    * the value <tt>-1</tt> is returned. This method blocks until input data
    * is available, the end of the stream is detected, or an exception is
    * thrown.
    *
    * From a SASL mechanism provider's perspective, if a security layer has
    * been negotiated, the underlying <i>source</i> is expected to contain
    * SASL buffers, as defined in RFC 2222. Four octets in network byte order
    * in the front of each buffer identify the length of the buffer. The
    * provider is responsible for performing any integrity checking or other
    * processing on the buffer before returning the data as a stream of
    * octets. For example, the protocol driver's request for a single octet
    * from the stream might; i.e. an invocation of this method, may result
    * in an entire SASL buffer being read and processed before that single
    * octet can be returned.
    *
    * @return the next byte of data, or <tt>-1</tt> if the end of the stream
    * is reached.
    * @exception IOException if an I/O error occurs.
    */
   public int read() throws IOException {
      int result = -1;
      if (internalBuf != null && internalBuf.length > 0) {
         result = internalBuf[0] & 0xFF;
         if (internalBuf.length == 1)
            internalBuf = new byte[0];
         else {
            byte[] tmp = new byte[internalBuf.length - 1];
//            System.arraycopy(internalBuf, 0, tmp, 0, tmp.length);
            System.arraycopy(internalBuf, 1, tmp, 0, tmp.length);
            internalBuf = tmp;
         }
      } else {
         byte[] buf = new byte[1];
         int check = read(buf);
         result = (check > 0) ? (buf[0] & 0xFF) : -1;
      }

      return result;
   }

   /**
    * Reads up to <tt>len</tt> bytes of data from the underlying <i>source</i>
    * input stream into an array of bytes. An attempt is made to read as many
    * as <tt>len</tt> bytes, but a smaller number may be read, possibly zero.
    * The number of bytes actually read is returned as an integer.<p>
    *
    * This method blocks until input data is available, end of file is
    * detected, or an exception is thrown.<p>
    *
    * if <tt>b</tt> is null, a <tt>NullPointerException</tt> is thrown.<p>
    *
    * If <tt>off</tt> is negative, or <tt>len</tt> is negative, or <tt>off+len</tt>
    * is greater than the length of the array <tt>b</tt>, then an
    * <tt>IndexOutOfBoundsException</tt> is thrown.<p>
    *
    * if <tt>len</tt> is zero, then no bytes are read and <tt>0</tt> is
    * returned; otherwise, there is an attempt to read at least one byte. If
    * no byte is available because the stream is at end of file, the value
    * <tt>-1</tt> is returned; otherwise, at least one byte is read and stored
    * into <tt>b</tt>.<p>
    *
    * The first byte read is stored into element <tt>b[off]</tt>, the next one
    * into <tt>b[off+1]</tt>, and so on. The number of bytes read is, at most,
    * equal to <tt>len</tt>. Let <tt>k</tt> be the number of bytes actually
    * read; these bytes will be stored in elements <tt>b[off]</tt> through
    * <tt>b[off+k-1]</tt>, leaving elements <tt>b[off+k]</tt> through
    * <tt>b[off+len-1]</tt> unaffected.<p>
    *
    * In every case, elements <tt>b[0]</tt> through <tt>b[off]</tt> and
    * elements <tt>b[off+len]</tt> through <tt>b[b.length-1]</tt> are
    * unaffected.<p>
    *
    * If the first byte cannot be read for any reason other than end of file,
    * then an <tt>IOException</tt> is thrown. In particular, an
    * <tt>IOException</tt> is thrown if the input stream has been closed.<p>
    *
    * From the SASL mechanism provider's perspective, if a security layer has
    * been negotiated, the underlying <i>source</i> is expected to contain SASL
    * buffers, as defined in RFC 2222. Four octets in network byte order in the
    * front of each buffer identify the length of the buffer. The provider is
    * responsible for performing any integrity checking or other processing on
    * the buffer before returning the data as a stream of octets. The protocol
    * driver's request for a single octet from the stream might result in an
    * entire SASL buffer being read and processed before that single octet can
    * be returned.
    *
    * @param b the buffer into which the data is read.
    * @param off the start offset in array <tt>b</tt> at which the data is
    * written.
    * @param len the maximum number of bytes to read.
    * @return the total number of bytes read into the buffer, or <tt>-1</tt>
    * if there is no more data because the end of the stream has been reached.
    * @exception IOException if an I/O error occurs.
    */
   public int read(byte[] b, int off, int len) throws IOException {
		cat.debug("==> read(b, "+String.valueOf(off)+", "+String.valueOf(len)+")");

      if (b == null)
         throw new NullPointerException("b");
      else if ((off < 0)
            || (off > b.length)
            || (len < 0)
            || ((off + len) > b.length)
            || ((off + len) < 0))
         throw new IndexOutOfBoundsException("off="+String.valueOf(off)
            +", len="+String.valueOf(len)+", b.length="+String.valueOf(b.length));
      else if (len == 0) {
         cat.debug("<== read() --> 0");
         return 0;
      }

		cat.debug("Available: "+String.valueOf(available()));

      int result = 0;
      if (internalBuf == null || internalBuf.length < 1)
         try {
            internalBuf = readSaslBuffer();
            if (internalBuf == null) {
               cat.warn("Underlying stream empty. Returning -1");
               cat.debug("<== read() --> -1");
               return -1;
            }
         } catch (InterruptedIOException x) {
            cat.debug(String.valueOf(x));
            cat.warn("Reading thread was interrupted. Returning -1");
            cat.debug("<== read() --> -1");
            return -1;
         }

      if (len <= internalBuf.length) {
         result = len;
         System.arraycopy(internalBuf, 0, b, off, len);
         if (len == internalBuf.length)
            internalBuf = null;
         else {
            byte[] tmp = new byte[internalBuf.length - len];
            System.arraycopy(internalBuf, len, tmp, 0, tmp.length);
            internalBuf = tmp;
         }
      } else {
         // first copy the available bytes to b
         result = internalBuf.length;
         System.arraycopy(internalBuf, 0, b, off, result);
         internalBuf = null;

         off += result;
         len -= result;

         int remaining; // count of bytes remaining in buffer after an iteration
         int delta; // count of bytes moved to b after an iteration
         int datalen;
         byte[] data;
         while (len > 0)
            // we need to read SASL buffers, as long as there are at least
            // 4 bytes available at the source
            if (source.available() > 3) {
               // process a buffer
               data = readSaslBuffer();
               if (data == null) {
                  cat.warn("Underlying stream exhausted. Breaking...");
                  break;
               }

               datalen = data.length;

               // copy [part of] the result to b
               remaining = (datalen <= len) ? 0 : datalen - len;
               delta = datalen - remaining;
               System.arraycopy(data, 0, b, off, delta);
               if (remaining > 0) {
                  internalBuf = new byte[remaining];
                  System.arraycopy(data, delta, internalBuf, 0, remaining);
               }

               // update off, result and len
               off += delta;
               result += delta;
               len -= delta;
            } else { // nothing much we can do except return what we have
               cat.warn("Not enough bytes in source to read a buffer. Breaking...");
               break;
            }
      }

		cat.debug("Remaining: "+(internalBuf == null ? 0 : internalBuf.length));
      cat.debug("<== read() --> "+String.valueOf(result));
      return result;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Reads a SASL buffer from the underlying source if at least 4 bytes are
    * available.
    *
    * @return the byte[] of decoded buffer contents, or null if the underlying
    * source was exhausted.
    * @exception IOException if an I/O exception occurs during the operation.
    */
   private byte[] readSaslBuffer() throws IOException {
      cat.debug("==> readSaslBuffer()");

      int realLength; // check if we read as many bytes as we're supposed to
      byte[] result = new byte[4];
      try {
         realLength = source.read(result);
         if (realLength == -1) {
            cat.debug("<== readSaslBuffer() --> null");
            return null;
         }
      } catch (IOException x) {
         cat.error(String.valueOf(x));
         throw x;
      }

      if (realLength != 4)
         throw new IOException("Was expecting 4 but found "+String.valueOf(realLength));
      int bufferLength = result[0]         << 24 |
                        (result[1] & 0xFF) << 16 |
                        (result[2] & 0xFF) <<  8 |
                        (result[3] & 0xFF);

      cat.debug("SASL buffer size: "+bufferLength);
      if (bufferLength > maxRawSendSize || bufferLength < 0) {
         cat.error("SASL buffer (security layer) too long");
         throw new SaslEncodingException("SASL buffer size limit exceeded");
      }

      result = new byte[bufferLength];
      try {
         realLength = source.read(result);
      } catch (IOException x) {
         cat.error(String.valueOf(x));
         throw x;
      }

      if (realLength != bufferLength)
         throw new IOException("Was expecting "+String.valueOf(bufferLength)
            +" but found "+String.valueOf(realLength));

      cat.debug("Incoming buffer (before security) (hex): "+SaslUtil.dumpString(result));
      cat.debug("Incoming buffer (before security) (str): \""+new String(result)+"\"");

      if (client != null)
         result = client.unwrap(result, 0, realLength);
      else
         result = server.unwrap(result, 0, realLength);

      cat.debug("Incoming buffer (after security) (hex): "+SaslUtil.dumpString(result));
      cat.debug("Incoming buffer (after security) (str): \""+new String(result)+"\"");

      cat.debug("<== readSaslBuffer()");
      return result;
   }
}