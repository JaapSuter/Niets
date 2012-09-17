package com.whatsapp;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class i3
  implements Preference.OnPreferenceClickListener
{
  final CheckBoxPreference a;
  final Settings b;

  i3(Settings paramSettings, CheckBoxPreference paramCheckBoxPreference)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (this.a.isChecked())
    {
      App.Mb.b(true);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.Mb.b(false);
    }
    return true;
  }
}