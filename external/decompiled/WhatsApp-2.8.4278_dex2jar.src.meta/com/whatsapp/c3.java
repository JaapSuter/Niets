package com.whatsapp;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class c3
  implements Preference.OnPreferenceClickListener
{
  private static final String z;
  final Settings a;

  static
  {
    char[] arrayOfChar = "\017\r0\b<A\0010P+\001\0011\030+\032\006)\024<\027".toCharArray();
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
      m = 72;
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
      m = 110;
      continue;
      m = 111;
      continue;
      m = 95;
      continue;
      m = 125;
    }
  }

  c3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (!App.sb())
    {
      g5.b(z);
      if (!this.a.isFinishing())
      {
        this.a.showDialog(102);
        if (!DialogToastListActivity.f);
      }
    }
    else
    {
      new xb(this.a).execute(new String[0]);
    }
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.c3
 * JD-Core Version:    0.6.1
 */