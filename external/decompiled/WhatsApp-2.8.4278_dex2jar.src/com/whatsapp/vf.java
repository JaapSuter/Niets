package com.whatsapp;

public enum vf
{
  private static final vf[] f;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "-.".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "*7r\026J?".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "<1v\021".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label488;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = ">?m\023M69".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label576;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "-0j\021K/0".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label664;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        z = arrayOfString;
        a = new vf(z[0], 0);
        b = new vf(z[2], 1);
        c = new vf(z[1], 2);
        d = new vf(z[3], 3);
        e = new vf(z[4], 4);
        vf[] arrayOfvf = new vf[5];
        arrayOfvf[0] = a;
        arrayOfvf[1] = b;
        arrayOfvf[2] = c;
        arrayOfvf[3] = d;
        arrayOfvf[4] = e;
        f = arrayOfvf;
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
        m = 120;
        continue;
        m = 126;
        continue;
        m = 33;
        continue;
        m = 95;
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
      i3 = 120;
      continue;
      i3 = 126;
      continue;
      i3 = 33;
      continue;
      i3 = 95;
    }
    label488: int i6 = arrayOfChar3[i5];
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
      i7 = 120;
      continue;
      i7 = 126;
      continue;
      i7 = 33;
      continue;
      i7 = 95;
    }
    label576: int i10 = arrayOfChar4[i9];
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
      i11 = 120;
      continue;
      i11 = 126;
      continue;
      i11 = 33;
      continue;
      i11 = 95;
    }
    label664: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 4;
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
      i15 = 120;
      continue;
      i15 = 126;
      continue;
      i15 = 33;
      continue;
      i15 = 95;
    }
  }

  public static vf a(String paramString)
  {
    return (vf)Enum.valueOf(vf.class, paramString);
  }

  public static vf[] a()
  {
    return (vf[])f.clone();
  }
}