package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

class App$14 extends BroadcastReceiver
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\013ul}\022\013fw5\002\005pr6]\016dh3_\017k}0\034\017a<".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\tjq|\027\005j{>\025Dun=\023\017vo|\027\013ul!".toCharArray();
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
        m = 112;
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
        m = 106;
        continue;
        m = 5;
        continue;
        m = 28;
        continue;
        m = 82;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 112;
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
      i3 = 106;
      continue;
      i3 = 5;
      continue;
      i3 = 28;
      continue;
      i3 = 82;
    }
  }

  App$14(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = App.eb.getBackgroundDataSetting();
    g5.b(z[0] + bool);
    if (!bool)
    {
      App.c(paramContext, true);
      App.p(paramContext);
    }
    App.s(z[1]);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.14
 * JD-Core Version:    0.6.1
 */