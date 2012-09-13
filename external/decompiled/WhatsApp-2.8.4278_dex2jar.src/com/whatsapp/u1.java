package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class u1
  implements View.OnClickListener
{
  private static final String z;
  final RegisterName a;

  static
  {
    char[] arrayOfChar = "wN\r|\nqN\030{\030hNEv\025lH\001p\035".toCharArray();
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
      m = 121;
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
      m = 5;
      continue;
      m = 43;
      continue;
      m = 106;
      continue;
      m = 21;
    }
  }

  u1(RegisterName paramRegisterName)
  {
  }

  public void onClick(View paramView)
  {
    g5.b(z);
    RegisterName.a(this.a);
  }
}