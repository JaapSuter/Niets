package com.whatsapp;

import android.telephony.PhoneStateListener;

final class wd extends PhoneStateListener
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\007S\024\032_XH\017\025N\022\033\024\022\\\037T\024\037".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\007S\024\032_XH\017\025N\022\033\022\020V\022".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\007S\024\032_XH\017\025N\022\033\t\035T\020R\025\023".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 58;
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
        m = 119;
        continue;
        m = 59;
        continue;
        m = 123;
        continue;
        m = 116;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 58;
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
      i3 = 119;
      continue;
      i3 = 59;
      continue;
      i3 = 123;
      continue;
      i3 = 116;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 58;
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
      i7 = 119;
      continue;
      i7 = 59;
      continue;
      i7 = 123;
      continue;
      i7 = 116;
    }
  }

  public void onCallStateChanged(int paramInt, String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    App.Cb = paramInt;
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      return;
      g5.b(z[2]);
      if (bool)
      {
        g5.b(z[0]);
        if (bool)
          g5.b(z[1]);
      }
    }
  }
}