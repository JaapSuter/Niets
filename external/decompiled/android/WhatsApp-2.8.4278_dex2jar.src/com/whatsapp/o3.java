package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class o3
  implements Preference.OnPreferenceClickListener
{
  final Settings a;

  o3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    this.a.startActivity(new Intent(this.a, BlockList.class));
    return true;
  }
}