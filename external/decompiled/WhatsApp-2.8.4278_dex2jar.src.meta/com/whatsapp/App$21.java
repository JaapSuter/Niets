package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.messaging.h;

class App$21 extends BroadcastReceiver
{
  private static final String z;
  final App a;

  static
  {
    char[] arrayOfChar = "9tr%o1je~v5amkwazzv*af".toCharArray();
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
      m = 31;
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
      m = 88;
      continue;
      m = 4;
      continue;
      m = 2;
      continue;
      m = 10;
    }
  }

  App$21(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g5.b(z);
    h.c(App.zb());
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.21
 * JD-Core Version:    0.6.1
 */