package com.whatsapp;

import java.io.IOException;

class v0 extends xz
{
  private static final String[] z;
  final String a;
  final String b;
  final String c;
  final qz d;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "IS".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "P^<\030.RR".toCharArray();
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
        m = 91;
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
        m = 32;
        continue;
        m = 55;
        continue;
        m = 95;
        continue;
        m = 108;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 91;
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
      i3 = 32;
      continue;
      i3 = 55;
      continue;
      i3 = 95;
      continue;
      i3 = 108;
    }
  }

  v0(qz paramqz, String paramString1, String paramString2, String paramString3)
  {
  }

  public void a(int paramInt)
  {
    if (paramInt == 404)
    {
      this.d.j.a(this.c, null, null, null);
      if (!nz.b);
    }
    else
    {
      this.d.j.a(this.c, paramInt);
    }
  }

  public void a(c1 paramc1, String paramString)
    throws IOException, bg
  {
    c1 localc1 = paramc1.b(z[1]);
    String str = this.a;
    byte[] arrayOfByte = null;
    if (localc1 != null)
    {
      arrayOfByte = localc1.d;
      str = localc1.a(z[0]);
    }
    if (paramString != null)
      this.d.j.a(paramString, str, arrayOfByte, this.b);
  }
}