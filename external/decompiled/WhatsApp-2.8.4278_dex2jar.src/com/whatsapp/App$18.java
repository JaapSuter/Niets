package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

class App$18 extends BroadcastReceiver
{
  private static final String z;
  final App a;

  static
  {
    char[] arrayOfChar = "UDc\0340\\AgW,CZ<V;@Qa]\"Xk~V']U<@7U@v\034".toCharArray();
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
      m = 67;
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
      m = 52;
      continue;
      m = 52;
      continue;
      m = 19;
      continue;
      m = 51;
    }
  }

  App$18(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g5.b(z + Environment.getExternalStorageState());
    App.c(App.Mb, 0);
    App.c(App.Mb, false);
  }
}