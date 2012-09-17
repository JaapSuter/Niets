package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class t3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  t3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    this.a.startActivity(new Intent(this.a, DeleteAccount.class));
    return true;
  }
}