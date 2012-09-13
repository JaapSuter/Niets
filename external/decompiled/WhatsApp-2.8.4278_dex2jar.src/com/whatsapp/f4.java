package com.whatsapp;

import android.os.Handler;
import java.io.IOException;

final class f4
  implements Runnable
{
  private static final String z;
  final Handler a;

  static
  {
    char[] arrayOfChar = "|(\016\017\0139)\035\026\020w=\\\023\rx.\025\023\rp9\017@\037p6\031".toCharArray();
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
      m = 25;
      continue;
      m = 90;
      continue;
      m = 124;
      continue;
      m = 96;
    }
  }

  f4(Handler paramHandler)
  {
  }

  public void run()
  {
    try
    {
      e4.b();
      this.a.postDelayed(this, 900000L);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.b(z, localIOException);
    }
  }
}