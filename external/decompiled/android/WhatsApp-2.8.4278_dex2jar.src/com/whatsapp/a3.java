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