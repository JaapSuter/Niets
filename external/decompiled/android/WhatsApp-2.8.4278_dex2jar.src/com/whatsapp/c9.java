package com.whatsapp;

import java.util.ArrayList;

final class c9 extends Thread
{
  private static final String z;
  final ArrayList a;
  final vp b;

  static
  {
    char[] arrayOfChar = "t${ Wa<|/\ru8:\"\024krq&\024s<".toCharArray();
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
      m = 120;
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
      m = 7;
      continue;
      m = 93;
      continue;
      m = 21;
      continue;
      m = 67;
    }
  }

  c9(ArrayList paramArrayList, vp paramvp)
  {
  }

  public void run()
  {
    try
    {
      yp.a(App.bb, this.a, this.b);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.b(z, localException);
        if (this.b != null)
          this.b.a();
        tp.b(false);
      }
    }
  }
}