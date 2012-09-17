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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.x2
 * JD-Core Version:    0.6.1
 */