package com.whatsapp;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;

class ic extends CountDownTimer
{
  private static final String[] z;
  final VerifySms a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "/2\036\036)/2\034\034)(>\037\035k)#".toCharArray();
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
      arrayOfChar2 = "*2��\021b%$\037\013+(>\037\035k)#R".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "*2��\021b%$\037\013+(>\037\035k)#_\036m26\036".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label324;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "/2��\016a.z\001\035j8z\006\021i98\007\f".toCharArray();
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
        m = 4;
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
        m = 92;
        continue;
        m = 87;
        continue;
        m = 114;
        continue;
        m = 120;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 4;
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
      i3 = 92;
      continue;
      i3 = 87;
      continue;
      i3 = 114;
      continue;
      i3 = 120;
    }
    label324: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 4;
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
      i7 = 92;
      continue;
      i7 = 87;
      continue;
      i7 = 114;
      continue;
      i7 = 120;
    }
    label412: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 4;
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
      i11 = 92;
      continue;
      i11 = 87;
      continue;
      i11 = 114;
      continue;
      i11 = 120;
    }
  }

  ic(VerifySms paramVerifySms, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }

  public void onFinish()
  {
    g5.b(z[1] + VerifySms.y());
    if (VerifySms.y() == 1)
    {
      if ("".equals(VerifyNumber.j))
        this.a.e(z[0]);
      VerifySms.b(this.a);
      if (!DialogToastListActivity.f);
    }
    else
    {
      VerifySms.a(this.a);
      VerifySms.a(13);
      VerifySms.c(this.a);
      if ("".equals(VerifyNumber.j))
        this.a.e(z[3]);
      g5.b(z[2]);
      VerifySms.k(this.a);
      if ((this.a.l) || (this.a.isFinishing()))
        this.a.c();
    }
  }

  public void onTick(long paramLong)
  {
    VerifySms.a(this.a, VerifySms.f(this.a) + VerifySms.x() - paramLong);
    VerifySms.i(this.a).setProgress((int)(100.0D * VerifySms.g(this.a) / VerifySms.h(this.a)));
    VerifySms.c(paramLong);
    String str = v5.a((VerifySms.h(this.a) - VerifySms.g(this.a)) / 1000L);
    VerifySms.j(this.a).setText(str);
  }
}