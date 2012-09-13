package com.whatsapp;

import android.os.Handler;
import android.os.Message;

final class oc extends Handler
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "Bx!g\002Zf2g\025Fd01".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Bx!g\002Zf2g\003Vf".toCharArray();
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
        m = 113;
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
        m = 35;
        continue;
        m = 8;
        continue;
        m = 81;
        continue;
        m = 72;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 113;
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
      i3 = 35;
      continue;
      i3 = 8;
      continue;
      i3 = 81;
      continue;
      i3 = 72;
    }
  }

  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    while (true)
    {
      return;
      if (tp.b())
      {
        g5.b(z[0]);
        removeMessages(0);
        sendEmptyMessageDelayed(0, 15000L);
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.b(z[1]);
        removeMessages(0);
        tp.c();
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.oc
 * JD-Core Version:    0.6.1
 */