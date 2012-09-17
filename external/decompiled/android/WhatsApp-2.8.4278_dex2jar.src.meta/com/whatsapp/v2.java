package com.whatsapp;

import android.os.Build;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

class v2
  implements Preference.OnPreferenceChangeListener
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\fY1\0222Bv".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\037U`<\006>".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "k��U\023Dk".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 116;
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
        m = 91;
        continue;
        m = 48;
        continue;
        m = 19;
        continue;
        m = 85;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 116;
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
      i3 = 91;
      continue;
      i3 = 48;
      continue;
      i3 = 19;
      continue;
      i3 = 85;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 116;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 91;
      continue;
      i7 = 48;
      continue;
      i7 = 19;
      continue;
      i7 = 85;
    }
  }

  v2(Settings paramSettings)
  {
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    if (((Build.MODEL.contains(z[1])) || (Build.MODEL.contains(z[0]))) && (!paramObject.toString().equals(z[2])))
      this.a.showDialog(7);
    ListPreference localListPreference = (ListPreference)paramPreference;
    int i = localListPreference.findIndexOfValue((String)paramObject);
    String str = localListPreference.getEntries()[i].toString();
    Settings localSettings = this.a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = str;
    paramPreference.setTitle(localSettings.getString(2131296712, arrayOfObject));
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v2
 * JD-Core Version:    0.6.1
 */