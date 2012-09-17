package com.whatsapp;

import android.os.SystemClock;

public class p5
{
  private static final String[] z;
  private final boolean a;
  private boolean b = false;
  private String c = null;
  private long d = 0L;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "K\013?<\035\026P3=\031\024\f35BD".toCharArray();
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
      arrayOfChar2 = "\020\026;4\nK\032:0\b\027\0322kX".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\020\026;4\nK\f\">\b^_".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "K\013?<\035\026P%%\027\024Ev".toCharArray();
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
        m = 120;
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
        m = 100;
        continue;
        m = 127;
        continue;
        m = 86;
        continue;
        m = 81;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 120;
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
      i3 = 100;
      continue;
      i3 = 127;
      continue;
      i3 = 86;
      continue;
      i3 = 81;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 120;
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
      i7 = 100;
      continue;
      i7 = 127;
      continue;
      i7 = 86;
      continue;
      i7 = 81;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 120;
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
      i11 = 100;
      continue;
      i11 = 127;
      continue;
      i11 = 86;
      continue;
      i11 = 81;
    }
  }

  public p5()
  {
    this(false);
  }

  public p5(String paramString)
  {
    this(false);
    this.c = paramString;
    a();
  }

  public p5(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  private long d()
  {
    if (this.a);
    for (long l = SystemClock.elapsedRealtime(); ; l = SystemClock.uptimeMillis())
      return l;
  }

  public long a(String paramString)
  {
    long l = b();
    b(paramString);
    return l;
  }

  public void a()
  {
    if ((this.b) && (this.c != null));
    this.d = d();
  }

  public long b()
  {
    long l1 = 0L;
    if (this.d == l1);
    while (true)
    {
      return l1;
      long l2 = d() - this.d;
      if (this.b)
        if (this.c != null)
        {
          g5.b(this.c + z[3] + l2);
          if (g5.n == 0);
        }
        else
        {
          g5.b(z[2] + l2);
        }
      this.d = l1;
      this.b = false;
      this.c = null;
      l1 = l2;
    }
  }

  public void b(String paramString)
  {
    this.c = paramString;
    this.b = true;
    a();
  }

  public long c()
  {
    long l = d() - this.d;
    if (this.b)
      if (this.c != null)
      {
        g5.b(this.c + z[0] + l);
        if (g5.n == 0);
      }
      else
      {
        g5.b(z[1] + l);
      }
    return l;
  }
}