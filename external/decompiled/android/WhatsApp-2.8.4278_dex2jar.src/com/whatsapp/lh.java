package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class lh
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "35 l^��0".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\"1.~V\036&aHV\02174jZ\001".toCharArray();
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
        m = 63;
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
        m = 114;
        continue;
        m = 67;
        continue;
        m = 65;
        continue;
        m = 24;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 63;
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
      i3 = 114;
      continue;
      i3 = 67;
      continue;
      i3 = 65;
      continue;
      i3 = 24;
    }
  }

  lh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.w.a(null);
    w5.b(new File(App.Mb.getFilesDir(), z[0]));
    w5.b(new File(App.c, z[1]));
    App.w.b().a(0, 0);
    new h8(this.a).start();
  }
}