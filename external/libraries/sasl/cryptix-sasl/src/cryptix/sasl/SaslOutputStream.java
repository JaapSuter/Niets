package cryptix.sasl;

// $Id: SaslOutputStream.java,v 1.2 2001/07/02 10:26:47 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.io.OutputStream;
import java.io.IOException;

import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslServer;

import org.apache.log4j.Category;

/**
 * An output stream that uses either a <tt>SaslClient</tt> or a <tt>SaslServer</tt>
 * to process the data through these entities' security layer filter(s).
 *
 * @version $Revision: 1.2 $
 * @since draft-weltman-java-sasl-05
 */
public class SaslOutputStream
extends OutputStream
{
   // Constants and variables
   // -------------------------------------------------------------------------

	private static Category cat = Category.getInstance(SaslOutputStream.class);

   private SaslClient client;
   private SaslServer server;
   private int maxRawSendSize;
	private OutputStream dest;

   // Constructor(s)
   // -------------------------------------------------------------------------

	public SaslOutputStream(SaslClient client, OutputStream dest)
   throws IOException {
      super();

      this.client = client;
      maxRawSendSize =
         Integer.parseInt(client.getNegotiatedProperty(Sasl.RAW_SEND_SIZE));
      server = null;
		this.dest = dest;
   }

	public SaslOutputStream(SaslServer server, OutputStream dest)
   throws IOException {
      super();

      this.server = server;
      maxRawSendSize =
         Integer.parseInt(server.getNegotiatedProperty(Sasl.RAW_SEND_SIZE));
      client = null;
		this.dest = dest;
   }

   // Class methods
   // -------------------------------------------------------------------------

   // Overloaded java.io.OutputStream methods
   // -------------------------------------------------------------------------

   public void close() throws IOException {
      dest.flush();
      dest.close();
   }

   public void flush() throws IOException {
      dest.flush();
   }

   /**
    * When writing octets to the resulting stream, if a security layer has been
    * negotiated, each piece of data written (by a single invocation of
    * <tt>write()</tt>) will be encapsulated as a SASL buffer, as defined in
    * RFC 2222, and then written to the underlying <i>dest</i> output stream.
    */
   public void write(int b) throws IOException {
      byte[] buf = { (byte) b };
      write(buf);
   }

   /**
    * When writing octets to the resulting stream, if a security layer has been
    * negotiated, each piece of data written (by a single invocation of
    * <tt>write()</tt>) will be encapsulated as a SASL buffer, as defined in
    * RFC 2222, and then written to the underlying <i>dest</i> output stream.
    */
   public void write (byte[] b, int off, int len) throws IOException {
      if (b == null)
         throw new NullPointerException("b");
      else if ((off < 0)
            || (off > b.length)
            || (len < 0)
            || ((off + len) > b.length)
            || ((off + len) < 0))
         throw new IndexOutOfBoundsException("off="+String.valueOf(off)
            +", len="+String.valueOf(len)+", b.length="+String.valueOf(b.length));
      else if (len == 0)
         return;

		cat.debug("==> write()");

      int chunckSize, length, chunck = 1;
      byte[] output = null, result;
      cat.debug("About to wrap "+String.valueOf(len)+" byte(s)...");
      while (len > 0) {
         chunckSize = (len > maxRawSendSize ? maxRawSendSize : len);

         cat.debug("Outgoing buffer (before security) (hex): "+SaslUtil.dumpString(b, off, chunckSize));
         cat.debug("Outgoing buffer (before security) (str): \""+new String(b, off, chunckSize)+"\"");

         if (client != null)
            output = client.wrap(b, off, chunckSize);
         else
            output = server.wrap(b, off, chunckSize);

         cat.debug("Outgoing buffer (after security) (hex): "+SaslUtil.dumpString(output));
         cat.debug("Outgoing buffer (after security) (str): \""+new String(output)+"\"");

         length = output.length;
         result = new byte[length+4];
         result[0] = (byte)(length >>> 24);
         result[1] = (byte)(length >>> 16);
         result[2] = (byte)(length >>>  8);
         result[3] = (byte) length;
         System.arraycopy(output, 0, result, 4, length);

         dest.write(result);

         off += chunckSize;
         len -= chunckSize;
         cat.debug("Wrapped chunck #"+String.valueOf(chunck));
         chunck++;
      }

      dest.flush();

      cat.debug("<== write()");
   }
}