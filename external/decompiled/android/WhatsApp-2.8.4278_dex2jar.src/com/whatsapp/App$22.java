package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$22 extends BroadcastReceiver
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "ha(RMep*\020\003db?\016Hk>:\034Obd(R_bx(]^lp<PCg}!]Alu1\034".toCharArray();
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
      arrayOfChar2 = "ha(RMep*\020\003db?\016Hk>:\034Obd(".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "ha(RMep*\020\003db?\016Hk>:\034Obd(R_bx(]Bfex\r@|v?\030H)x6]Mgux\021C~1:\034X}t*\004".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "ha(RMep*\020\003db?\016Hk>:\034Obd(R_bx(]Bf15\030H`p".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
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
        m = 44;
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
        m = 9;
        continue;
        m = 17;
        continue;
        m = 88;
        continue;
        m = 125;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 44;
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
      i3 = 9;
      continue;
      i3 = 17;
      continue;
      i3 = 88;
      continue;
      i3 = 125;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 44;
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
      i7 = 9;
      continue;
      i7 = 17;
      continue;
      i7 = 88;
      continue;
      i7 = 125;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 44;
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
      i11 = 9;
      continue;
      i11 = 17;
      continue;
      i11 = 88;
      continue;
      i11 = 125;
    }
  }

  App$22(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = DialogToastListActivity.f;
    if (App.lb)
    {
      g5.b(z[3]);
      App.i(true);
      if (!bool);
    }
    else if (App.mb)
    {
      g5.b(z[0]);
      App.i(false);
      if (!bool);
    }
    else if ((App.Pb != 1) && (App.Pb != 2) && (App.Nb < 20))
    {
      g5.b(z[2]);
      App.i(true);
      if (!bool);
    }
    else
    {
      g5.b(z[1]);
      App.i(false);
      new w(null).execute(new Void[0]);
      i8 locali8 = new i8(this);
      locali8.setPriority(1);
      locali8.start();
    }
  }
}