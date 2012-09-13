package cryptix.sasl.srp;

// $Id: SRPContext.java,v 1.5 2001/06/25 21:04:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.
//
// This product includes software developed by Tom Wu and Eugene Jhong for the
// SRP Distribution (http://srp.stanford.edu/srp/).
//
// Copyright (c) 1997-1999  The Stanford SRP Authentication Project.
// All Rights Reserved.
//
// Please see LICENSE.SRP for a copy of the license for this software.

import java.security.spec.AlgorithmParameterSpec;
import java.util.zip.Adler32;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.security.sasl.SaslException;

/**
 * A class that wraps SASL Security Context parameters for an SRP mechanism.
 *
 * @version $Revision: 1.5 $
 * @since draft-naffah-cat-sasl-sm2-00
 */
class SRPContext implements AlgorithmParameterSpec
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // shared session key
   private SecretKey K;

   // if yes or no Replay Detection is activated
   private boolean replayDetection = true;

   // messages sequence numbers
	private int inCounter = 0;
	private int outCounter = 0;

   // HMACs to use, if not null, for integrity protection
   private IALG inMac, outMac;

   // ciphers to use, if not null, for confidentiality protection
   private CALG inCipher, outCipher;

   // CRC engine for computing signatures
   private Adler32 adler = new Adler32();

   // Constructor(s)
   // -------------------------------------------------------------------------

   SRPContext(SecretKey K, boolean replayDetection, int inCounter, int outCounter,
              IALG inMac, IALG outMac, CALG inCipher, CALG outCipher) {
      super();

      this.K = K;
      this.replayDetection = replayDetection;
      this.inCounter = inCounter;
      this.outCounter = outCounter;
      this.inMac = inMac;
      this.outMac = outMac;
      this.inCipher = inCipher;
      this.outCipher = outCipher;
   }

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   SecretKey getK() {
      return K;
   }

   boolean hasReplayDetection() {
      return replayDetection;
   }

   int getIncomingCounter() {
      return inCounter;
   }

   int getOutgoingCounter() {
      return outCounter;
   }

   IALG getIncomingMac() {
      return inMac;
   }

   IALG getOutgoingMac() {
      return outMac;
   }

   CALG getIncomingCipher() {
      return inCipher;
   }

   CALG getOutgoingCipher() {
      return outCipher;
   }

   public synchronized byte[] getSignature() throws SaslException {
      adler.reset();
      adler.update(K.getEncoded());
      adler.update(replayDetection ? 1 : 0);
      try {
         adler.update(((IALG) inMac.clone()).doFinal());
         adler.update(((IALG) outMac.clone()).doFinal());
      } catch (CloneNotSupportedException x) {
         throw new SaslException("getSignature()", x);
      }

      long signature = adler.getValue();
      byte[] result = new byte[4]; // adler is 32-bit long
      for (int i = 0; i < 4; signature >>>= 8)
         result[i++] = (byte) signature;

      return result;
   }
}