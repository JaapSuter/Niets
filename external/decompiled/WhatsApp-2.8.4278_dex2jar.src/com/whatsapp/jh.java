package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.io.IOException;

class jh
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "Hkr'[I.f/_\\.}-AXo}6\\".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Oap6NOzm".toCharArray();
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
        m = 47;
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
        m = 44;
        continue;
        m = 14;
        continue;
        m = 30;
        continue;
        m = 66;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 47;
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
      i3 = 44;
      continue;
      i3 = 14;
      continue;
      i3 = 30;
      continue;
      i3 = 66;
    }
  }

  jh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[0]);
    try
    {
      App.C.a(App.Mb.getDir(z[1], 0));
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.c(localIOException);
    }
  }
}