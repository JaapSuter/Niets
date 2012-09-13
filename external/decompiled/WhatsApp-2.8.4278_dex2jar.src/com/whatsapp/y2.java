package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

class y2
  implements Preference.OnPreferenceClickListener
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "tcjv438iqy2`vgzovnv xs)h}f1".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "}yztaus0o`hrpr }tjoar9HOKK".toCharArray();
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
        m = 14;
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
        m = 28;
        continue;
        m = 23;
        continue;
        m = 30;
        continue;
        m = 6;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 14;
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
      i3 = 28;
      continue;
      i3 = 23;
      continue;
      i3 = 30;
      continue;
      i3 = 6;
    }
  }

  y2(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    String str = z[0];
    Intent localIntent = new Intent(z[1], Uri.parse(str));
    this.a.startActivity(localIntent);
    return true;
  }
}