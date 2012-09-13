package cryptix.sasl;

// $Id: ServerFactory.java,v 1.6 2001/06/16 09:03:59 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.anonymous.AnonymousServer;
import cryptix.sasl.crammd5.CramMD5Server;
import cryptix.sasl.otp.OTPServer;
import cryptix.sasl.plain.PlainServer;
import cryptix.sasl.sm2.SM2Server;
import cryptix.sasl.srp.SRPServer;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslException;
import javax.security.sasl.SaslServer;
import javax.security.sasl.SaslServerFactory;

/**
 * The Cryptix implementation of the {@link javax.security.sasl.SaslServerFactory}.
 *
 * @version $Revision: 1.6 $
 * @since draft-burdis-cat-sasl-srp-03
 * @since draft-cat-sasl-sm2-00
 */
public class ServerFactory
   implements SaslServerFactory, SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   public ServerFactory()
   {}

   // Class methods
   // -------------------------------------------------------------------------

   // Instance methods
   // -------------------------------------------------------------------------

   public SaslServer
   createSaslServer
      (
         String mechanism,
         String protocol,
         String serverName,
         Hashtable props,
         CallbackHandler cbh
      )
      throws SaslException
   {
      if (mechanism == null)
         return null;

      mechanism = mechanism.trim().toUpperCase();
      if (mechanism.startsWith(SM2_MECHANISM))
      {
         // SM2 mechanism names start with the string "SM2-" and contains
         // the canonical name of the underlying SASL mechanism to use
         String umn = mechanism.substring(SM2_MECHANISM.length()).trim();
         if (!umn.startsWith("-"))
            throw new RuntimeException("Invalid SM2 mechanism name: "+SM2_MECHANISM+umn);

         umn = umn.substring(1);
         return new SM2Server(umn, protocol, serverName, props, cbh);
      }

      if (mechanism.startsWith(SRP_MECHANISM))
      {
         // SRP mechanism names start with the string "SRP-" and contains
         // the canonical name of the Message Digest Algorithm to use.
         // for backward compatibility we shall allow just the string "SRP"
         // and assume/use a default MDA designated in the SRPParams under
         // the SRP_DEFAULT_DIGEST_NAME key
         String mdaName = mechanism.substring(SRP_MECHANISM.length()).trim();
         if (mdaName.equals(""))
            ; // do nothing. will use default digest algorithm
         else if (!mdaName.startsWith("-"))
            throw new RuntimeException("Invalid SRP mechanism name: "+
               SRP_MECHANISM+mdaName);
         else
            mdaName = mdaName.substring(1);

         return new SRPServer(mdaName, protocol, serverName, props, cbh);
      }

      if (mechanism.equals(OTP_MECHANISM))
         return new OTPServer(protocol, serverName, props, cbh);

      if (mechanism.equals(CRAM_MD5_MECHANISM))
         return new CramMD5Server(props, cbh);

      if (mechanism.equals(PLAIN_MECHANISM))
         return new PlainServer(props, cbh);

      if (mechanism.equals(ANONYMOUS_MECHANISM))
         return new AnonymousServer();

      return null;
   }

   public String[] getMechanismNames(Hashtable props) {
      String[] all = new String[] {
         SRP_MECHANISM,
         SM2_MECHANISM+"-"+SRP_MECHANISM,
         OTP_MECHANISM,
         CRAM_MD5_MECHANISM,
         PLAIN_MECHANISM,
         ANONYMOUS_MECHANISM };

      if (props == null)
         return all;

      String[] none = new String[0];
      ArrayList mechs = new ArrayList(6);
      for (int i = 0; i < all.length; i++)
         mechs.add(all[i]);

      if (hasPolicy(Sasl.POLICY_NOPLAINTEXT, props))
         mechs.remove(PLAIN_MECHANISM);

      if (hasPolicy(Sasl.POLICY_NOACTIVE, props)) {
         mechs.remove(CRAM_MD5_MECHANISM);
         mechs.remove(PLAIN_MECHANISM);
      }

      if (hasPolicy(Sasl.POLICY_NODICTIONARY, props)) {
         mechs.remove(CRAM_MD5_MECHANISM);
         mechs.remove(PLAIN_MECHANISM);
      }

      if (hasPolicy(Sasl.POLICY_NOANONYMOUS, props))
         mechs.remove(ANONYMOUS_MECHANISM);

      if (hasPolicy(Sasl.POLICY_FORWARD_SECRECY, props)) {
         mechs.remove(CRAM_MD5_MECHANISM);
         mechs.remove(ANONYMOUS_MECHANISM);
         mechs.remove(PLAIN_MECHANISM);
      }

      if (hasPolicy(Sasl.POLICY_PASS_CREDENTIALS, props))
         return none;

      return (String[]) mechs.toArray(new String[0]);
   }

   private static boolean hasPolicy(String propertyName, Hashtable props) {
      return "true".equalsIgnoreCase(String.valueOf(props.get(propertyName)));
   }
}