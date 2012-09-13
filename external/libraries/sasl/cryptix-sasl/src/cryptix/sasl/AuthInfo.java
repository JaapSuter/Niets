package cryptix.sasl;

// $Id: AuthInfo.java,v 1.1 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * A static class for creating AuthInfoServices providers. It transparently
 * locates and uses any provider instances, based on the value assigned to the
 * System property with the key <tt>cryptix.sasl.auth.info.provider.pkgs</tt>.
 * If more than one is specified they SHOULD be separated with a vertical bar
 * character. Please note that the Cryptix provider is always added last to the
 * list, disregarding whether it was mentioned or not in the value of that
 * property, or if it that property was not defined.
 *
 * @version $Revision: 1.1 $
 * @since   0.8.9
 */
public class AuthInfo implements SaslParams
{
   // Constants and variables
   // -------------------------------------------------------------------------

   private static ArrayList factories = new ArrayList();
   static {
      // if cryptix.sasl.auth.info.provider.pkgs is defined then parse it
      String clazz;
      String pkgs = System.getProperty(AUTH_INFO_PROVIDER_PKGS, null);
      if (pkgs != null)
         for (StringTokenizer st = new StringTokenizer(pkgs, "|"); st.hasMoreTokens(); ) {
            clazz = st.nextToken();
            if (!"cryptix.sasl".equals(clazz)) {
               clazz += ".AuthInfoProvider";
               try {
                  AuthInfoProviderFactory factory =
                     (AuthInfoProviderFactory) Class.forName(clazz).newInstance();
                  factories.add(factory);
               } catch (ClassCastException ignored) {
               } catch (ClassNotFoundException ignored) {
               } catch (InstantiationException ignored) {
               } catch (IllegalAccessException ignored) {
               }
            }
         }

      factories.add(new AuthInfoProvider()); // always add ours last
   }

   // Constructor(s)
   // -------------------------------------------------------------------------

   /** Trivial constructor to enforce usage through static methods. */
   private AuthInfo() {
      super();
   }

   // Class methods
   // -------------------------------------------------------------------------

   /**
    * A convenience method to return the authentication information provider
    * for a designated SASL mechnanism. It goes through all the installed
    * provider factories, one at a time, and attempts to return a new instance
    * of the provider for the designated mechanism. It stops at the first
    * factory returning a non-null provider.
    *
    * @param mechanism the name of a mechanism.
    * @return an implementation that provides <tt>AuthInfoServices</tt> for that
    * mechanism.
    */
   public static AuthInfoServices getProvider(String mechanism) {
      for (Iterator it = factories.iterator(); it.hasNext(); ) {
         AuthInfoProviderFactory factory = (AuthInfoProviderFactory) it.next();
         AuthInfoServices result = factory.getInstance(mechanism);
         if (result != null)
            return result;
      }

      return null;
   }
}
