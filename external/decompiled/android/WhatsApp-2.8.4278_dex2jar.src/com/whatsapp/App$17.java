package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$17 extends BroadcastReceiver
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\034|>a:".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\016x/:7\ni;f:\033'".toCharArray();
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
        m = 95;
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
        m = 111;
        continue;
        m = 8;
        continue;
        m = 95;
        continue;
        m = 21;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 95;
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
      i3 = 111;
      continue;
      i3 = 8;
      continue;
      i3 = 95;
      continue;
      i3 = 21;
    }
  }

  App$17(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = false;
    int i = paramIntent.getIntExtra(z[0], 0);
    if (i >= 1)
      bool = true;
    App.A = bool;
    g5.b(z[1] + i);
  }
}