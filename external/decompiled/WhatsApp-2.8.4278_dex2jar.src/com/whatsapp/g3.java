package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class g3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  g3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    this.a.startActivity(new Intent(this.a, AccountInfoActivity.class));
    return true;
  }
}