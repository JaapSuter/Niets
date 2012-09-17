package com.whatsapp;

import java.io.IOException;

class t0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[6];
    char[] arrayOfChar1 = "S\030|\f".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "K\031|\023x".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "L\ru\024d".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label400;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "P\005}".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label488;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "N\025i\004".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label576;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "V\005j\025".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label664;
        arrayOfString[5] = new String(arrayOfChar6).intern();
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
        m = 58;
        continue;
        m = 108;
        continue;
        m = 25;
        continue;
        m = 97;
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
      i3 = 58;
      continue;
      i3 = 108;
      continue;
      i3 = 25;
      continue;
      i3 = 97;
    }
    label400: int i6 = arrayOfChar3[i5];
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
      i7 = 58;
      continue;
      i7 = 108;
      continue;
      i7 = 25;
      continue;
      i7 = 97;
    }
    label488: int i10 = arrayOfChar4[i9];
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
      i11 = 58;
      continue;
      i11 = 108;
      continue;
      i11 = 25;
      continue;
      i11 = 97;
    }
    label576: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 1;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 58;
      continue;
      i15 = 108;
      continue;
      i15 = 25;
      continue;
      i15 = 97;
    }
    label664: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 1;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 58;
      continue;
      i19 = 108;
      continue;
      i19 = 25;
      continue;
      i19 = 97;
    }
  }

  t0(qz paramqz)
  {
  }

  public void a(int paramInt)
  {
    if (paramInt == 404)
      this.a.j.b();
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    boolean bool = nz.b;
    c1 localc11 = paramc1.a(0);
    c1.a(localc11, z[1]);
    c1 localc12 = localc11.a(0);
    c1.a(localc12, z[5]);
    this.a.j.b();
    if (localc12.c != null)
    {
      int i = 0;
      do
      {
        if (i >= localc12.c.length)
          break;
        c1 localc13 = localc12.c[i];
        c1.a(localc13, z[0]);
        if (z[3].equals(localc13.a(z[4])))
        {
          String str = localc13.a(z[2]);
          if (str != null)
            this.a.j.d(str);
        }
        i++;
      }
      while (!bool);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.t0
 * JD-Core Version:    0.6.1
 */