package test;

// $Id: SimpleCallbackHandler.java,v 1.1 2001/02/04 01:40:00 keith Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import javax.security.auth.callback.*;
import java.io.*;

/**
 * A simple callback handler for test purposes.
 *
 * @version $Revision: 1.1 $
 * @since draft-burdis-cat-sasl-srp-03
 */
public class SimpleCallbackHandler
      implements CallbackHandler
{
   public void invokeCallback
      (
         Callback[] callbacks
      )
      throws java.io.IOException, UnsupportedCallbackException
   {
      for (int i=0;i<callbacks.length;i++)
      {
         if (callbacks[i] instanceof NameCallback)
         {
            NameCallback namecb = (NameCallback)callbacks[i];
            String defaultName = namecb.getDefaultName();
            if (defaultName != null)
            {
               System.out.print(namecb.getPrompt()+" ");
               System.out.println("["+defaultName+"]");
            }
            else
            {
               System.out.println(namecb.getPrompt());
            }
            String name =
               (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (name.length() > 0)
            {
               namecb.setName(name);
            }
            else
            {
               namecb.setName(defaultName);
            }
            continue;
         } // if
         if (callbacks[i] instanceof PasswordCallback)
         {
            PasswordCallback passwdcb  = (PasswordCallback)callbacks[i];
            System.out.println(passwdcb.getPrompt());
            String password =
               (new BufferedReader(new InputStreamReader(System.in))).readLine();
            passwdcb.setPassword(password.toCharArray());
            continue;
         } // if
         System.err.println("Unknown callback type");
      } // for
   } // invokeCallback

}

