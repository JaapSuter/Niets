package com.whatsapp;

import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class h3
  implements Preference.OnPreferenceClickListener
{
  final CheckBoxPreference a;
  final Settings b;

  h3(Settings paramSettings, CheckBoxPreference paramCheckBoxPreference)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (this.a.isChecked())
    {
      Conversation.r = true;
      if (!DialogToastListActivity.f);
    }
    else
    {
      Conversation.r = false;
    }
    return true;
  }
}