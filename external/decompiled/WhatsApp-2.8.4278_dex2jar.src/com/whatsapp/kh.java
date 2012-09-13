package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class kh
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "\005\034a\004/\004Yi\003{��\027iA)\004\ny\016)\004Yd\025u".toCharArray();
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
      m = 91;
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
      m = 97;
      continue;
      m = 121;
      continue;
      m = 13;
      continue;
      m = 97;
    }
  }

  kh(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    fq.y();
    new h8(this.a).start();
  }
}