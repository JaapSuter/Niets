package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.messaging.MessageService;

class dh
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "G[m\024".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "UHt\002.".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "]Ll\002?R]".toCharArray();
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
        m = 75;
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
        m = 51;
        continue;
        m = 41;
        continue;
        m = 24;
        continue;
        m = 113;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 75;
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
      i3 = 51;
      continue;
      i3 = 41;
      continue;
      i3 = 24;
      continue;
      i3 = 113;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 75;
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
      i7 = 51;
      continue;
      i7 = 41;
      continue;
      i7 = 24;
      continue;
      i7 = 113;
    }
  }

  dh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[2]);
    if (MessageService.C());
    for (String str = z[0]; ; str = z[1])
    {
      App.d(str);
      return;
    }
  }
}