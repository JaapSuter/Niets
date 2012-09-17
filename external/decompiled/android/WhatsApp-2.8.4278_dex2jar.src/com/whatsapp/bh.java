package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class bh
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "\\n\013q\036Jl\026\"\030]j\0138\003A+\f%\r[nBa".toCharArray();
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
      m = 108;
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
      m = 47;
      continue;
      m = 11;
      continue;
      m = 127;
      continue;
      m = 81;
    }
  }

  bh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    App.a(App.Mb, 0);
    new h8(this.a).start();
  }
}