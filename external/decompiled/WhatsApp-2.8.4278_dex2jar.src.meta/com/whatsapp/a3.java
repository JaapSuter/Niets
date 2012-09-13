package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class a3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  a3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    Intent localIntent = new Intent(this.a, About.class);
    this.a.startActivity(localIntent);
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a3
 * JD-Core Version:    0.6.1
 */