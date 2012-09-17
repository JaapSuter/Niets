package com.whatsapp;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class l3
  implements Preference.OnPreferenceClickListener
{
  private static final String z;
  final Settings a;

  static
  {
    char[] arrayOfChar = "3!> V\t$6:N9>&".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 58;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 86;
      continue;
      m = 76;
      continue;
      m = 95;
      continue;
      m = 73;
    }
  }

  l3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    Settings localSettings;
    if ((App.mb) || (App.lb))
    {
      localSettings = this.a;
      if (!App.tb())
        break label75;
    }
    label75: for (int i = 2131296438; ; i = 2131296439)
    {
      localSettings.a(i);
      if (DialogToastListActivity.f)
      {
        Intent localIntent = new Intent(this.a, ContactPicker.class);
        localIntent.putExtra(z, true);
        this.a.startActivityForResult(localIntent, 104);
      }
      return true;
    }
  }
}