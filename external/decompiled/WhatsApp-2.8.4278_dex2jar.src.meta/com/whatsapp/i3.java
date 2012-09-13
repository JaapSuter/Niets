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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.i3
 * JD-Core Version:    0.6.1
 */