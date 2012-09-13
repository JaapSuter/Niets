package cryptix.sasl.sm2;

// $Id: SM2ServerStore.java,v 1.4 2001/11/06 12:11:13 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslUtil;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServerExt;
import org.apache.log4j.Category;

/**
 * The client-side implementation of the SASL SM2 session store.
 *
 * @version $Revision: 1.4 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class SM2ServerStore
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SM2ServerStore.class);

   /** The underlying singleton. */
   private static SM2ServerStore singleton = null;

   /** The map of sid --> SASL Security Context record. */
   private static final HashMap sid2ssc = new HashMap();

   /** The map of sid --> Session timing record. */
   private static final HashMap sid2ttl = new HashMap();

   /** Lock object to synchronise operations requiring access to both maps. */
   private static Object lock = new Object();

   /** A counter to generate SIDs. */
   private static int counter = 0;

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Private constructor to enforce Singleton pattern. */
   private SM2ServerStore() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   public static synchronized SM2ServerStore instance() {
      if (singleton == null)
         singleton = new SM2ServerStore();

      return singleton;
   }

   private static String getNewSessionID() {
      StringBuffer sb = new StringBuffer();
      sb.append("SM2-SID-");
      String sid = String.valueOf(++counter);
      for (int i = 0; i < 10-sid.length(); i++)
         sb.append('0');

      return sb.append(sid).toString();
   }

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Records a mapping between a session identifier newly generated by the
    * store and the SASL Security Context of the designated SM2 underlying
    * mechanism server instance.
    *
    * @param server the server object of an SM2 underlying mechanism.
    * @param ttl the session's Time-To-Live indicator.
    * @return a session identifier that the server can send back as part of
    * the reply in an establishment of a new session exchange.
    * @exception SaslException if an error occurs during the operation.
    */
   public String
   cacheSession(SaslServerExt server, int ttl) throws SaslException {
      cat.debug("==> cacheSession(server)");

      String result = null;
      synchronized (lock) {
         AlgorithmParameterSpec ssc = server.getSaslSecurityContext();
         result = getNewSessionID();
         sid2ssc.put(result, ssc);
         sid2ttl.put(result, new SessionTimeout(ttl));
      }

      cat.debug("<== cacheSession()");
      return result;
   }

   /**
    * Updates the mapping between the designated session identifier and the
    * designated server's SASL Security Context. In the process, computes
    * and return the underlying mechanism server's evidence that shall be
    * returned to the client in a session re-use exchange.
    *
    * @param sid the identifier of the session to update.
    * @param server the SM2 underlying mechanism server object whose SASL
    * Security Context should be updated after generating an evidence.
    * @param Ec the client's evidence.
    * @throws SM2InvalidSessionException if the designated session identifier
    * is invalid.
    * @throws SaslException if the sid is null or any other error occurs
    * during the operation.
    * @return Es: the server's evidence.
    */
   public byte[] computeEvidence(String sid, SaslServerExt server, byte[] Ec)
   throws SM2InvalidSessionException, SaslException {
      cat.debug("==> computeEvidence("+String.valueOf(sid)+", server, "+SaslUtil.dumpString(Ec)+")");

      byte[] result = null;
      synchronized (lock) {
         if (sid == null)
            throw new SaslException("computeEvidence()", new NullPointerException("sid"));

         AlgorithmParameterSpec ssc = (AlgorithmParameterSpec) sid2ssc.remove(sid);
         if (ssc == null)
            throw new SM2InvalidSessionException(sid);

         server.setSaslSecurityContext(ssc);
         result = server.evaluateEvidence(Ec);
         ssc = server.getSaslSecurityContext();
         sid2ssc.put(sid, ssc);
      }

      cat.debug("<== computeEvidence()");
      return result;
   }

   /**
    * Returns a boolean flag indicating if the designated session is still
    * alive or not.
    *
    * @param sid the identifier of the seesion to invalidate.
    * @return <tt>true</tt> if the designated session is still alive.
    */
   public boolean isAlive(String sid) {
      cat.debug("==> isAlive("+String.valueOf(sid)+")");
      boolean result = false;

      if (sid != null) {
         synchronized (lock) {
            SessionTimeout sto = (SessionTimeout) sid2ttl.get(sid);
            result = sto.isAlive();
            if (!result) { // invalidate it en-passant
               sid2ssc.remove(sid);
               sid2ttl.remove(sid);
            }
         }
      }

      cat.debug("<== isAlive() --> "+String.valueOf(result));
      return result;
   }

   /**
    * Removes all information related to the designated session ID.
    *
    * @param sid the identifier of the seesion to invalidate.
    */
   public void invalidateSession(String sid) {
      cat.debug("==> invalidateSession("+String.valueOf(sid)+")");

      synchronized (lock) {
         sid2ssc.remove(sid);
         sid2ttl.remove(sid);
      }

      cat.debug("<== invalidateSession()");
   }

   // Inner class
   // =========================================================================

   class SessionTimeout {
      boolean perenial;
      long timeToLive;
      long timeToDie;

      SessionTimeout(int ttl) {
         super();

         perenial = (ttl == 0);
         timeToLive = ttl & 0xFFFFFFFFL;
         timeToDie = (perenial
            ? 0L
            : (System.currentTimeMillis() + timeToLive * 1000L));
      }

      boolean isAlive() {
         return (perenial ? true : (System.currentTimeMillis() < timeToDie));
      }
   }
}
