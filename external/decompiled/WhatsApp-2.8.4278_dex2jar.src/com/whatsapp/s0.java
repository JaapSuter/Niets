package com.whatsapp;

import java.io.IOException;

class s0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\030\020kQ[��\022uQT\005\003q\030B\035\022?\n@\016\rp\005W".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\037\007h\004U\b".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\025\017i\005P".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
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
        m = 35;
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
        m = 109;
        continue;
        m = 98;
        continue;
        m = 5;
        continue;
        m = 107;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 35;
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
      i3 = 109;
      continue;
      i3 = 98;
      continue;
      i3 = 5;
      continue;
      i3 = 107;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 35;
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
      i7 = 109;
      continue;
      i7 = 98;
      continue;
      i7 = 5;
      continue;
      i7 = 107;
    }
  }

  s0(qz paramqz)
  {
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    c1 localc1 = paramc1.a(0);
    c1.a(localc1, z[1]);
    if (z[0].equals(localc1.a(z[2])))
      this.a.j.c();
  }
}