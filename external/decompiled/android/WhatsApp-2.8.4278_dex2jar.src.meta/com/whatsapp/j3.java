package com.whatsapp;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class j3
  implements Preference.OnPreferenceChangeListener
{
  final Settings a;

  j3(Settings paramSettings)
  {
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    ListPreference localListPreference = (ListPreference)paramPreference;
    int i = localListPreference.findIndexOfValue((String)paramObject);
    String str = localListPreference.getEntries()[i].toString();
    Settings localSettings = this.a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = str;
    paramPreference.setTitle(localSettings.getString(2131296729, arrayOfObject));
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j3
 * JD-Core Version:    0.6.1
 */