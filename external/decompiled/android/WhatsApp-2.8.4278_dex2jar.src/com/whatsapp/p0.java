package com.whatsapp;

import java.io.IOException;

class p0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\bgJoV\f".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\002l".toCharArray();
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
        m = 63;
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
        m = 107;
        continue;
        m = 8;
        continue;
        m = 36;
        continue;
        m = 9;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 63;
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
      i3 = 107;
      continue;
      i3 = 8;
      continue;
      i3 = 36;
      continue;
      i3 = 9;
    }
  }

  p0(qz paramqz)
  {
  }

  public void a(c1 paramc1)
    throws bg, IOException
  {
    this.a.j.b(null);
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    c1 localc1 = paramc1.a(0);
    c1.a(localc1, z[0]);
    String str = localc1.a(z[1]);
    this.a.j.b(str);
  }
}