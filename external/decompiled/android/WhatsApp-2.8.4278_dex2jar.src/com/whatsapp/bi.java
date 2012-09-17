package com.whatsapp;

import android.os.Handler;
import java.io.File;

final class bi
  implements Runnable
{
  private static final String[] z;
  final zq a;
  final gz b;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "[\026\016O\027_\026\t\n\016A\034\031E!O\006\001F!@\027MC\020_\022\001C\032\005S".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "[\026\016O\027_\026\t\n\016A\034\031E!]\033\030G\034v\032\t\n\027G\005\fF\027M_M".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\t��\005E\013E\027MH\033\tMP\n".toCharArray();
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
        m = 126;
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
        m = 41;
        continue;
        m = 115;
        continue;
        m = 109;
        continue;
        m = 42;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 126;
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
      i3 = 41;
      continue;
      i3 = 115;
      continue;
      i3 = 109;
      continue;
      i3 = 42;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 126;
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
      i7 = 41;
      continue;
      i7 = 115;
      continue;
      i7 = 109;
      continue;
      i7 = 42;
    }
  }

  bi(zq paramzq, gz paramgz)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    this.a.a(this.b.b, this.b.c);
    int i = this.a.o;
    if (this.b.b != null)
    {
      i = this.b.d;
      if (!bool);
    }
    else if (i != this.b.d)
    {
      if (this.b.d < i)
      {
        g5.d(z[0] + this.b.d + z[2] + i);
        if (!bool);
      }
      else
      {
        this.a.g().delete();
        i = 0;
      }
    }
    int j = this.a.p;
    if (this.b.c != null)
    {
      j = this.b.d;
      if (!bool);
    }
    else if (j != this.b.d)
    {
      if (this.b.d < j)
      {
        g5.d(z[1] + this.b.d + z[2] + j);
        if (!bool);
      }
      else
      {
        this.a.h().delete();
        j = 0;
      }
    }
    this.a.a(i, j);
    if (this.b.b != null)
      App.T.b(this.a.b);
    if (this.b.c != null)
      App.U.b(this.a.b);
    if ((this.b.b != null) || (this.b.c != null))
      App.Jb.post(new ci(this));
  }
}