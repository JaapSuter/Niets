package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$13 extends BroadcastReceiver
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "\004qc\003m".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\030x`\001f\rp".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "��qt\nu��".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label324;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\033wt\nd".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label412;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 1;
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
        m = 104;
        continue;
        m = 20;
        continue;
        m = 21;
        continue;
        m = 102;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 1;
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
      i3 = 104;
      continue;
      i3 = 20;
      continue;
      i3 = 21;
      continue;
      i3 = 102;
    }
    label324: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 1;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 104;
      continue;
      i7 = 20;
      continue;
      i7 = 21;
      continue;
      i7 = 102;
    }
    label412: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 1;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 104;
      continue;
      i11 = 20;
      continue;
      i11 = 21;
      continue;
      i11 = 102;
    }
  }

  App$13(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = paramIntent.getIntExtra(z[0], -1);
    int j = paramIntent.getIntExtra(z[3], -1);
    App.Ob = paramIntent.getIntExtra(z[2], 1);
    App.Pb = paramIntent.getIntExtra(z[1], 0);
    App.Nb = -1;
    if ((i >= 0) && (j > 0))
      App.Nb = i * 100 / j;
  }
}