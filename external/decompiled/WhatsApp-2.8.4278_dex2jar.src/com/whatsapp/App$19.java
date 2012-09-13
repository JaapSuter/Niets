package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$19 extends BroadcastReceiver
{
  private static final String z;
  final App a;

  static
  {
    char[] arrayOfChar = "s\"\031\020wk<\nL+{<\rVr=&\006Ke~r".toCharArray();
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
      m = 4;
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
      m = 18;
      continue;
      m = 82;
      continue;
      m = 105;
      continue;
      m = 63;
    }
  }

  App$19(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g5.b(z + App.h(App.Mb.getApplicationContext()));
    App.b(App.Mb.getApplicationContext(), 0);
  }
}