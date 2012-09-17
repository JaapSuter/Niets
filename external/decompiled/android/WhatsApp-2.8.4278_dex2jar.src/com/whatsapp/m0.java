package com.whatsapp;

import java.util.Vector;

class m0 extends xz
{
  private static final String[] z;
  final Runnable a;
  final wz b;
  final qz c;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\030V\022>d".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\023A\034=q".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\026@".toCharArray();
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
        m = 20;
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
        m = 127;
        continue;
        m = 36;
        continue;
        m = 125;
        continue;
        m = 75;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 20;
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
      i3 = 127;
      continue;
      i3 = 36;
      continue;
      i3 = 125;
      continue;
      i3 = 75;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 20;
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
      i7 = 127;
      continue;
      i7 = 36;
      continue;
      i7 = 125;
      continue;
      i7 = 75;
    }
  }

  m0(qz paramqz, Runnable paramRunnable, wz paramwz)
  {
  }

  public void a(int paramInt)
  {
    if (this.b != null)
      this.b.a(paramInt);
  }

  public void a(c1 paramc1, String paramString)
  {
    boolean bool = nz.b;
    c1 localc1 = paramc1.b(z[1]);
    Vector localVector;
    if (localc1 != null)
      localVector = localc1.c(z[0]);
    int j;
    for (int i = 0; ; i = j)
      if (i < localVector.size())
      {
        this.c.k.b(((c1)localVector.elementAt(i)).a(z[2]));
        j = i + 1;
        if (!bool);
      }
      else
      {
        if (this.a != null)
          this.a.run();
        return;
      }
  }
}