package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class r3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  r3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    new yb(this.a).execute(new String[0]);
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r3
 * JD-Core Version:    0.6.1
 */