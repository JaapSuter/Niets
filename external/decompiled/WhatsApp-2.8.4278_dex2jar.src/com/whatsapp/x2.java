package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class x2
  implements Preference.OnPreferenceChangeListener
{
  final Settings a;

  x2(Settings paramSettings)
  {
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    ListPreference localListPreference = (ListPreference)paramPreference;
    int i = localListPreference.findIndexOfValue((String)paramObject);
    paramPreference.setSummary(localListPreference.getEntries()[i].toString());
    return true;
  }
}