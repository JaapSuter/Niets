package com.whatsapp;

import android.provider.ContactsContract.Data;
import android.view.View;
import android.view.View.OnClickListener;

class yg
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = ")k\017tG9r\017".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ")\026eI)k\017tI(d\037".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ")\026eI)k\017tI/o\034|\007".toCharArray();
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
        m = 105;
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
        m = 77;
        continue;
        m = 10;
        continue;
        m = 123;
        continue;
        m = 21;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 105;
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
      i3 = 77;
      continue;
      i3 = 10;
      continue;
      i3 = 123;
      continue;
      i3 = 21;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 105;
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
      i7 = 77;
      continue;
      i7 = 10;
      continue;
      i7 = 123;
      continue;
      i7 = 21;
    }
  }

  yg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[2]);
    Advanced.a(ContactsContract.Data.CONTENT_URI, z[0]);
    App.d(z[1]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yg
 * JD-Core Version:    0.6.1
 */