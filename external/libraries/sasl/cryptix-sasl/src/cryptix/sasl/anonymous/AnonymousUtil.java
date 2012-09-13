package cryptix.sasl.anonymous;

// $Id: AnonymousUtil.java,v 1.1 2001/10/14 06:23:56 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import cryptix.sasl.SaslUtil;

/**
 * An ANONYMOUS-specific utility class.
 *
 * @version $Revision: 1.1 $
 */
public class AnonymousUtil
{
   // Constants and variables
   // -------------------------------------------------------------------------

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Trivial private constructor to enforce Singleton pattern. */
   private AnonymousUtil() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   static boolean isValidTraceInformation(String traceInformation) {
      if (traceInformation == null)
         return false;
      else if (traceInformation.length() == 0)
         return true;
      else if (SaslUtil.validEmailAddress(traceInformation))
         return true;
      else
         return isValidToken(traceInformation);
   }

   static boolean isValidToken(String token) {
      if (token == null)
         return false;
      else if (token.length() == 0)
         return false;
      else if (token.length() > 255)
         return false;
      else if (token.indexOf('@') != -1)
         return false;

      for (int i = 0; i < token.length(); i++) {
         char c = token.charAt(i);
         if (c < 0x20 || c > 0x7E) {
            return false;
         }
      }

      return true;
   }
}
