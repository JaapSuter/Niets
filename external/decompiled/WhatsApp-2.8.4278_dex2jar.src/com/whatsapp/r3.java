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