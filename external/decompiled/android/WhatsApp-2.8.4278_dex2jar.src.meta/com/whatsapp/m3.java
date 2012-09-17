package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class m3
  implements Preference.OnPreferenceClickListener
{
  private static final String z;
  final Settings a;

  static
  {
    char[] arrayOfChar = "M.3^_P,4\005UV.$AEG83O[M?&^CMd)E\033]$)DS]?.\\_J2".toCharArray();
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
      m = 54;
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
      m = 62;
      continue;
      m = 75;
      continue;
      m = 71;
      continue;
      m = 42;
    }
  }

  m3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (!App.sb())
    {
      g5.b(z);
      Settings localSettings1 = this.a;
      Settings localSettings2 = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.getString(2131296328);
      localSettings1.c(localSettings2.getString(2131296333, arrayOfObject));
      if (!DialogToastListActivity.f);
    }
    else
    {
      new wb(this.a).execute(new String[0]);
    }
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.m3
 * JD-Core Version:    0.6.1
 */