package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class p3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  p3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    this.a.b();
    return false;
  }
}