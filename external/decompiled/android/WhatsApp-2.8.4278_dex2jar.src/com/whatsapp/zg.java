package com.whatsapp;

import android.provider.ContactsContract.RawContacts;
import android.view.View;
import android.view.View.OnClickListener;

class zg
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "M+\023\005a[?\tU#L9\027\033".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "M+\023\005a[?\tU$G:".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "[?\t[5Q*".toCharArray();
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
        m = 65;
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
        m = 41;
        continue;
        m = 94;
        continue;
        m = 126;
        continue;
        m = 117;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 65;
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
      i3 = 41;
      continue;
      i3 = 94;
      continue;
      i3 = 126;
      continue;
      i3 = 117;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 65;
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
      i7 = 41;
      continue;
      i7 = 94;
      continue;
      i7 = 126;
      continue;
      i7 = 117;
    }
  }

  zg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[0]);
    Advanced.a(ContactsContract.RawContacts.CONTENT_URI, z[2]);
    App.d(z[1]);
  }
}