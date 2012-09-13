package com.whatsapp;

import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;

class xg
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "��Ry\033i\005Cp\031,\027T4\016'��".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "��Ry\033i\005Cp\031,\027T4\t,\003Nz".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\007Hz\037(\007SgE=\034S".toCharArray();
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
        m = 73;
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
        m = 100;
        continue;
        m = 39;
        continue;
        m = 20;
        continue;
        m = 107;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 73;
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
      i3 = 100;
      continue;
      i3 = 39;
      continue;
      i3 = 20;
      continue;
      i3 = 107;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 73;
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
      i7 = 100;
      continue;
      i7 = 39;
      continue;
      i7 = 20;
      continue;
      i7 = 107;
    }
  }

  xg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[1]);
    Advanced.a(ContactsContract.Contacts.CONTENT_URI, z[2]);
    App.d(z[0]);
  }
}