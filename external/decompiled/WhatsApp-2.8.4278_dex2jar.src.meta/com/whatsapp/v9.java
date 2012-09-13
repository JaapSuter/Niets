package com.whatsapp;

import android.os.Handler;

class v9 extends Thread
{
  private static final String z;
  Handler a;

  static
  {
    char[] arrayOfChar = "P\013'\025sB\032&\025(F\034!\tu\003".toCharArray();
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
      m = 7;
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
      m = 35;
      continue;
      m = 110;
      continue;
      m = 83;
      continue;
      m = 102;
    }
  }

  v9(Handler paramHandler)
  {
    this.a = paramHandler;
  }

  public void run()
  {
    try
    {
      yp.a(App.bb);
      this.a.sendEmptyMessage(1);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.c(z + localException.toString());
        this.a.sendEmptyMessage(0);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v9
 * JD-Core Version:    0.6.1
 */