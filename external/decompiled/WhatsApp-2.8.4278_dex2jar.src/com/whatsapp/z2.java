package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class z2
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  z2(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    App.a(this.a, this.a);
    return true;
  }
}