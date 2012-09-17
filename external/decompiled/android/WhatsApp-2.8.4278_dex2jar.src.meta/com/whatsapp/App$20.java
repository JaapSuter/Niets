package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$20 extends BroadcastReceiver
{
  private static final String z;
  final App a;

  static
  {
    char[] arrayOfChar = "n__s&}J\\98lJN*7fCN>:j��[5;j@Z(".toCharArray();
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
      m = 86;
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
      m = 15;
      continue;
      m = 47;
      continue;
      m = 47;
      continue;
      m = 92;
    }
  }

  App$20(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g5.b(z);
    if (App.Cb() != 1)
    {
      App.d(3);
      App.Db();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.20
 * JD-Core Version:    0.6.1
 */