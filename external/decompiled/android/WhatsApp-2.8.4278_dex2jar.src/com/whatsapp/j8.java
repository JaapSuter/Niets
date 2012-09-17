package com.whatsapp;

final class j8 extends Thread
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "(\013GFM&\tT\fX0\025TFO,\027C\b\004,\tE\006Y".toCharArray();
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
      m = 43;
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
      m = 73;
      continue;
      m = 123;
      continue;
      m = 55;
      continue;
      m = 105;
    }
  }

  public void run()
  {
    try
    {
      App.lc.onChange(true);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g5.a(z, localException);
    }
  }
}