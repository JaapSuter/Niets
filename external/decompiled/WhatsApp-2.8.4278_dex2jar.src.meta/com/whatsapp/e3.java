package com.whatsapp;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class e3
  implements Preference.OnPreferenceClickListener
{
  private static final String z;
  final Preference a;
  final Settings b;

  static
  {
    char[] arrayOfChar = "#n`jU=z~g".toCharArray();
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
      m = 10;
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
      m = 83;
      continue;
      m = 27;
      continue;
      m = 19;
      continue;
      m = 2;
    }
  }

  e3(Settings paramSettings, Preference paramPreference)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    f3 localf3 = new f3(this);
    String str = this.a.getSharedPreferences().getString(z, null);
    new b(this.b, 2131296693, str, localf3, 25, 0, 2131296931).show();
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.e3
 * JD-Core Version:    0.6.1
 */