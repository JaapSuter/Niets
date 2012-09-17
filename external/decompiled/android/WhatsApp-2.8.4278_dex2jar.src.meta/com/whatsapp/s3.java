package com.whatsapp;

import android.os.Environment;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class s3
  implements Preference.OnPreferenceClickListener
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "g}\035\013%ov".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "g}\035\013%ov7\027>".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 81;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 10;
        continue;
        m = 18;
        continue;
        m = 104;
        continue;
        m = 101;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 81;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 10;
      continue;
      i3 = 18;
      continue;
      i3 = 104;
      continue;
      i3 = 101;
    }
  }

  s3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    String str = Environment.getExternalStorageState();
    if (str.equals(z[1]))
      this.a.showDialog(9);
    while (true)
    {
      return true;
      if (!str.equals(z[0]))
        this.a.showDialog(10);
      else
        new vb(this.a, null).execute(new Void[0]);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.s3
 * JD-Core Version:    0.6.1
 */