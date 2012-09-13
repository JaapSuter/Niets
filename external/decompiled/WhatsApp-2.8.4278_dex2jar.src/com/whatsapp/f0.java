package com.whatsapp;

import java.io.IOException;

class f0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "0Pq\"\022:Mz".toCharArray();
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
    char[] arrayOfChar7;
    int i21;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = " }{".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = " Wv)\0030V".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label441;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "4P{6\026".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label533;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "<Uz&\024".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label625;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ":F".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label717;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = " }`".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label809;
        arrayOfString[6] = new String(arrayOfChar7).intern();
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
        m = 102;
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
        m = 83;
        continue;
        m = 34;
        continue;
        m = 20;
        continue;
        m = 67;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 102;
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
      i3 = 83;
      continue;
      i3 = 34;
      continue;
      i3 = 20;
      continue;
      i3 = 67;
    }
    label441: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 102;
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
      i7 = 83;
      continue;
      i7 = 34;
      continue;
      i7 = 20;
      continue;
      i7 = 67;
    }
    label533: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 102;
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
      i11 = 83;
      continue;
      i11 = 34;
      continue;
      i11 = 20;
      continue;
      i11 = 67;
    }
    label625: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 102;
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
      i15 = 83;
      continue;
      i15 = 34;
      continue;
      i15 = 20;
      continue;
      i15 = 67;
    }
    label717: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 102;
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
      i19 = 83;
      continue;
      i19 = 34;
      continue;
      i19 = 20;
      continue;
      i19 = 67;
    }
    label809: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 102;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 83;
      continue;
      i23 = 34;
      continue;
      i23 = 20;
      continue;
      i23 = 67;
    }
  }

  f0(qz paramqz)
  {
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    c1 localc1 = paramc1.a(0);
    c1.a(localc1, z[3]);
    localc1.a(z[5]);
    String str1 = localc1.a(z[4]);
    String str2 = localc1.a(z[2]);
    String str3 = localc1.a(z[6]);
    String str4 = localc1.a(z[1]);
    String str5 = localc1.a(z[0]);
    this.a.k.a(paramString, str1, str2, str4, Integer.parseInt(str3), Integer.parseInt(str5));
  }
}