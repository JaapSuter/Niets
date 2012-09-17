package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ng
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\037tSc,KyYo>\033hHc5".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\037yRx{\016dBi+\037uNb".toCharArray();
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
        m = 91;
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
        m = 107;
        continue;
        m = 28;
        continue;
        m = 33;
        continue;
        m = 12;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 91;
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
      i3 = 107;
      continue;
      i3 = 28;
      continue;
      i3 = 33;
      continue;
      i3 = 12;
    }
  }

  ng(Advanced paramAdvanced)
  {
  }

  public void onClick(View paramView)
  {
    App.d(z[0]);
    throw new RuntimeException(z[1]);
  }
}