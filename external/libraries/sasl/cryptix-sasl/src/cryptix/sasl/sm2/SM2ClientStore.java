package cryptix.sasl.sm2;

// $Id: SM2ClientStore.java,v 1.4 2001/11/06 12:11:13 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.security.sasl.SaslClientExt;
import javax.security.sasl.SaslException;
import org.apache.log4j.Category;

/**
 * The client-side implementation of the SASL SM2 session store.
 *
 * @version $Revision: 1.4 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
public class SM2ClientStore
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static Category cat = Category.getInstance(SM2ClientStore.class);

   /** The underlying singleton. */
   private static SM2ClientStore singleton = null;

   /** The map of uid --> sid. */
   private static final HashMap uid2sid = new HashMap();

   /** The map of sid --> SASL Security Context record. */
   private static final HashMap sid2ssc = new HashMap();

   /** The map of sid --> Session timing record. */
   private static final HashMap sid2ttl = new HashMap();

   /** Lock object to synchronise operations requiring access to both maps. */
   private static Object lock = new Object();

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Private constructor to enforce Singleton pattern. */
   private SM2ClientStore() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   public static synchronized SM2ClientStore instance() {
      if (singleton == null)
         singleton = new SM2ClientStore();

      return singleton;
   }

   // Instance methods
   // -------------------------------------------------------------------------

   /**
    * Returns the identifier of a session, if one exists and is still alive, for
    * use by an SM2 client whose identifier is specified as the argument.
    *
    * @param uid the UID string of the SM2 client.
    * @return the session ID string, if one exists and is alive.
    */
   public String getSessionID(String uid) {
      String result = null;
      synchronized (lock) {
         result = (String) uid2sid.get(uid);
         // if not null is it still alive?
         if (result != null) {
            SessionTimeout sto = (SessionTimeout) sid2ttl.get(result);
            if (!sto.isAlive()) {
               // invalidate it
               uid2sid.remove(uid);
               sid2ssc.remove(result);
               sid2ttl.remove(result);

               result = null;
            }
         }
      }

      return result;
   }

   /**
    * Records a mapping between a session identifier, usually returned by an
    * SM2 server, and the underlying client context of and SM2 client.
    *
    * @param uid the unique identifier of the SM2 client for which the session
    * is to be cached.
    * @param sid the session identifier to map to the SASL Security Context
    * af an SM2 underlying mechanism client.
    * @param ttl the session's Time-To-Live indicator.
    * @param client the client of an SM2 underlying mechanism.
    * @throws SaslException if the sid is null, the uid is null or any other
    * error occured during the operation.
    */
   public void
   cacheSession(String uid, String sid, int ttl, SaslClientExt client)
   throws SaslException {
      cat.debug("==> cacheSession("+String.valueOf(uid)+", "+String.valueOf(sid)+", "+String.valueOf(ttl & 0xFFFFFFFFL)+", client)");

      synchronized (lock) {
         if (uid == null)
            throw new SaslException("cacheSession()", new NullPointerException("uid"));

         if (sid == null)
            throw new SaslException("cacheSession()", new NullPointerException("sid"));

         AlgorithmParameterSpec ssc = client.getSaslSecurityContext();
         sid2ssc.put(sid, ssc);
         uid2sid.put(uid, sid);

         sid2ttl.put(sid, new SessionTimeout(ttl));
      }

      cat.debug("<== cacheSession()");
   }

   /**
    * Removes the mapping between the designated SM2 client identifier and
    * the session identifier. Also removes any record that may exist in the
    * map of sid --> SASL Security Context.
    *
    * @param sid the identifier of the seesion to invalidate.
    */
   public void invalidateSession(String uid, String sid) {
      cat.debug("==> invalidateSession("+String.valueOf(uid)+", "+String.valueOf(sid)+")");

      synchronized (lock) {
         uid2sid.remove(uid);
         sid2ssc.remove(sid);
         sid2ttl.remove(sid);
      }

      cat.debug("<== invalidateSession()");
   }

   /**
    * Updates the mapping between the designated session identifier and the
    * designated client's SASL Security Context. In the process, computes
    * and return the underlying mechanism client's evidence that shall be
    * returned to the server in a session re-use exchange.
    *
    * @param sid the identifier of the session to update.
    * @param client the SM2 underlying mechanism client object whose SASL
    * Security Context should be updated after generating an evidence.
    * @throws SaslException if the sid is null, or an error occured during
    * the operation.
    * @return Ec: the client's evidence.
    */
   public byte[] computeEvidence(String sid, SaslClientExt client)
   throws SaslException {
      cat.debug("==> computeEvidence("+String.valueOf(sid)+", client)");

      byte[] result = null;
      synchronized (lock) {
         if (sid == null)
            throw new SaslException("computeEvidence()", new NullPointerException("sid"));

         AlgorithmParameterSpec ssc = (AlgorithmParameterSpec) sid2ssc.remove(sid);
         client.setSaslSecurityContext(ssc);
         result = client.evaluateEvidence(null);
         ssc = client.getSaslSecurityContext();
         sid2ssc.put(sid, ssc);
      }

      cat.debug("<== computeEvidence()");
      return result;
   }

   // Inner class
   // =========================================================================

   class SessionTimeout {
      boolean perenial;
      long timeToDie;

      SessionTimeout(int ttl) {
         super();

         perenial = (ttl == 0);
         timeToDie = (perenial
            ? 0L
            : (System.currentTimeMillis() + (ttl & 0xFFFFFFFFL) * 1000L));
      }

      boolean isAlive() {
         return (perenial ? true : (System.currentTimeMillis() < timeToDie));
      }
   }
}
