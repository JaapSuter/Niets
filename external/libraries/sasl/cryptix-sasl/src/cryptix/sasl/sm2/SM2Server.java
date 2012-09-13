package cryptix.sasl.sm2;

// $Id: SM2Server.java,v 1.6 2001/11/06 12:11:13 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.IllegalMechanismStateException;
import cryptix.sasl.InputBuffer;
import cryptix.sasl.NoSuchMechanismException;
import cryptix.sasl.OutputBuffer;
import cryptix.sasl.ServerFactory;
import cryptix.sasl.SaslParams;
import cryptix.sasl.SaslUtil;
import cryptix.sasl.ServerMechanism;

import java.io.IOException;
import java.util.Hashtable;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import javax.security.sasl.SaslServerExt;

import org.apache.log4j.Category;

/**
 * The server-side implementation of the SASL SM2 mechanism.
 *
 * @version $Revision: 1.6 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class SM2Server extends ServerMechanism
implements SaslServer, SM2Params, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SM2Server.class);

   /** The default TTL indicator value. */
   private static final int DEFAULT_TTL = 0;

   /** The SASL buffer encoding of a NAK reply to a session re-use request. */
   private static final byte[] INVALID_SESSION_BUFFER =
      { 0x00, 0x00, 0x00, 0x01, 0x15 };

   /** The reference to the Server Factory. */
   private static ServerFactory factory = new ServerFactory();

   /** The sessions in-memory cache. */
   private static Hashtable sessions;

   /** The name of the underlying mechanism for this object. */
   private String umn;

   /** The underlying mechanism peer. */
   private SaslServerExt spi;

   /** The TTL indicator for this server. */
   private int timeToLive;

   // Constructor(s)
   // -------------------------------------------------------------------------

   public SM2Server(String umn, String protocol, String serverName,
                    Hashtable props, CallbackHandler handler) {
      super(SM2_MECHANISM+"-"+umn, protocol, serverName, props, handler);

      this.umn = umn;
      if (props == null) {
         timeToLive = DEFAULT_TTL;
      } else {
         String s = (String) props.get(TTL_INDICATOR);
         if (s == null) {
            timeToLive = DEFAULT_TTL;
         } else {
            try {
               timeToLive = Integer.valueOf(s).intValue();
            } catch (Exception x) {
               cat.warn("Exception while parsing TTL. Using default...");
               timeToLive = DEFAULT_TTL;
            }
         }
      }
   }

   // Class methods
   // -------------------------------------------------------------------------

   // javax.security.sasl.SaslServer interface implementation
   // -------------------------------------------------------------------------

   public byte[] evaluateResponse(byte[] response) throws SaslException {
      cat.debug("==> evaluateResponse()");
      cat.debug("response: "+SaslUtil.dumpString(response));
      cat.debug("state: "+String.valueOf(state));

      if (complete) {
         cat.error("SPI Authentication phase completed");
         throw new IllegalMechanismStateException("evaluateResponse()");
      }

      String sid = null;
      byte[] result;
      switch (state) {
      case 0:
         // create an underlying server
         spi = (SaslServerExt)
            factory.createSaslServer(umn, protocol, serverName, properties, handler);
         if (spi == null) {
            NoSuchMechanismException x = new NoSuchMechanismException(umn);
            cat.error("evaluateResponse()", x);
            throw x;
         }

         int cmd;
         byte[] arg;
         InputBuffer frameIn = new InputBuffer(response);
         try {
            cmd = frameIn.getScalar(1);
            cat.debug("Client command: "+String.valueOf(cmd));
            if (cmd != NEW_SESSION_COMMAND && cmd != USE_SESSION_COMMAND)
               throw new SaslException("Unknown SM2 command: "+String.valueOf(cmd));

            if (cmd == NEW_SESSION_COMMAND) {
               arg = frameIn.getEOS(); // umir
            } else {
               sid = frameIn.getText();
               arg = frameIn.getOS(); // Ec
            }
         } catch (IOException x) {
            cat.error("evaluateResponse()", x);
            if (x instanceof SaslException)
               throw (SaslException) x;
            throw new SaslException(String.valueOf(x));
         }

         if (cmd == NEW_SESSION_COMMAND) {
            result = spi.evaluateResponse(arg);
            state = 1;
         } else
            try {
               cat.debug("Attempting to re-use session");
               result = reuseSession(sid, arg);
               complete = true;
               state = Integer.MAX_VALUE;
            } catch (SM2InvalidSessionException x) {
               cat.error("evaluateResponse()", x);
               result = INVALID_SESSION_BUFFER;
               // state remains @ 0
            }

         cat.debug("<== evaluateResponse()");
         return result;
      case 1:
         // mid/end of authentication phase of underlying mechanism
//         if (!spi.isComplete())
//            return spi.evaluateResponse(response);
         // SRP now can become complete without needing to send anything anymore
         // to the client; eg. when M2 MUST NOT be sent.  this is also the case
         // for other than SRP mechanisms which can behave similarly.  the
         // following should handle this case.
         if (!spi.isComplete()) {
            result = spi.evaluateResponse(response);
            if (result != null)
               return result;
            else if (!spi.isComplete())
               throw new SaslException("Response is null yet underlying server"
                  +" is incomplete");
            // else fall through
         }
         // fall through
      case 2:
         // end-of establishing a new session
         complete = true;
         // get the sid
         sid = SM2ServerStore.instance().cacheSession(spi, timeToLive);
         cat.debug("sid: "+String.valueOf(sid));
         cat.debug("ttl: "+String.valueOf(timeToLive & 0xFFFFFFFFL));
         OutputBuffer frameOut = new OutputBuffer();
         try {
            frameOut.setText(sid);
            frameOut.setScalar(4, timeToLive);
         } catch (IOException x) {
            if (x instanceof SaslException)
               throw (SaslException) x;
            throw new SaslException("End of establishing new session", x);
         }

         state = Integer.MAX_VALUE;
         result = frameOut.encode();

         cat.debug("<== evaluateResponse()");
         return result;
      default:
         throw new IllegalMechanismStateException(String.valueOf(state));
      }
   }

   protected byte[] engineUnwrap(byte[] incoming, int offset, int len)
   throws SaslException {
      return spi.unwrap(incoming, offset, len);
   }

   protected byte[] engineWrap(byte[] outgoing, int offset, int len)
   throws SaslException {
      return spi.wrap(outgoing, offset, len);
   }

   public String getAuthorizationID() {
      return spi.getAuthorizationID();
   }

   public String getNegotiatedProperty(String propName) throws SaslException {
      if (!isComplete())
         throw new IllegalMechanismStateException("getNegotiatedProperty()");

      return spi.getNegotiatedProperty(propName);
   }

   public void dispose() throws SaslException {
      spi.dispose();
   }

   // Instance methods
   // -------------------------------------------------------------------------

   private byte[] reuseSession(String sid, byte[] Ec)
   throws SaslException, SM2SessionModifiedException {
      cat.debug("==> reuseSession("+String.valueOf(sid)+", "+SaslUtil.dumpString(Ec)+")");

      if (!SM2ServerStore.instance().isAlive(sid)) {
         throw new SM2SessionExpiredException(sid);
      }

      byte[] Es = SM2ServerStore.instance().computeEvidence(sid, spi, Ec);
      cat.debug("Es: "+SaslUtil.dumpString(Es));
      if (!SaslUtil.areEqual(Ec, Es)) {
         cat.error("Es != Ec");
         SM2ServerStore.instance().invalidateSession(sid);
         throw new SM2SessionModifiedException(String.valueOf(sid));
      }

      OutputBuffer frameOut = new OutputBuffer();
      try {
         frameOut.setScalar(1, USE_SESSION_ACK);
         frameOut.setOS(Es);
      } catch (IOException x) {
         cat.error(x);
         if (x instanceof SaslException)
            throw (SaslException) x;
         throw new SaslException("reuseSession()", x);
      }

      byte[] result = frameOut.encode();
      cat.debug("<== reuseSession()");
      return result;
   }
}
