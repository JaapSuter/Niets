package com.whatsapp.accountsync;

import android.content.Context;
import android.content.Intent;

class f extends Thread
{
  private static final String z;
  final b a;

  static
  {
    char[] arrayOfChar = "\031;6&a\0225/{w\n$uiu\031;.fb\t-5k8\023:/mx\016z\013MD<\033\tEI)\r\025K".toCharArray();
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
      m = 22;
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
      m = 122;
      continue;
      m = 84;
      continue;
      m = 91;
      continue;
      m = 8;
    }
  }

  f(b paramb)
  {
  }

  public void run()
  {
    Intent localIntent = new Intent(z);
    b.a(this.a).sendBroadcast(localIntent);
  }
}