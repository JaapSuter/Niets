package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class d3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  d3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    this.a.startActivity(new Intent(this.a, ProfileInfoActivity.class));
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d3
 * JD-Core Version:    0.6.1
 */