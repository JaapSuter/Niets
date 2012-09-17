package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class rg
  implements View.OnClickListener
{
  private static final String z;
  final Advanced a;

  static
  {
    char[] arrayOfChar = "\024\006C\n\030\022".toCharArray();
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
      m = 127;
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
      m = 113;
      continue;
      m = 103;
      continue;
      m = 55;
      continue;
      m = 42;
    }
  }

  rg(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z);
    new Thread(new sg(this)).start();
  }
}