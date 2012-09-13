package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$23 extends BroadcastReceiver
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "N%-a`F/gza[.'g!N(=z`Ae\032P]j\016\007L@a".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "N%-a`F/gza[.'g!N(=z`Ae\032P]j\016\007L@i\r".toCharArray();
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
        m = 15;
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
        m = 47;
        continue;
        m = 75;
        continue;
        m = 73;
        continue;
        m = 19;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 15;
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
      i3 = 47;
      continue;
      i3 = 75;
      continue;
      i3 = 73;
      continue;
      i3 = 19;
    }
  }

  App$23(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals(z[0]))
    {
      App.u = false;
      if (!DialogToastListActivity.f);
    }
    else if (paramIntent.getAction().equals(z[1]))
    {
      App.u = true;
      if (App.Ab())
        new w(null).execute(new Void[0]);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.23
 * JD-Core Version:    0.6.1
 */