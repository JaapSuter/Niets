package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class mg
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "\037\016I^\034\004\025JQY\007\024".toCharArray();
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
      m = 60;
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
      m = 116;
      continue;
      m = 103;
      continue;
      m = 37;
      continue;
      m = 50;
    }
  }

  mg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    new h8(this.a).start();
  }
}