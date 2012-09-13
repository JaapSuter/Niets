package com.whatsapp;

public enum uf
{
  private static final uf[] l;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[11];
    char[] arrayOfChar1 = "\nn\004jp\020h\023hr��n\027wk\003e\tpl\016j\027ln\016~\032`".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    char[] arrayOfChar4;
    int i12;
    char[] arrayOfChar5;
    int i16;
    char[] arrayOfChar6;
    int i20;
    char[] arrayOfChar7;
    int i24;
    char[] arrayOfChar8;
    int i28;
    char[] arrayOfChar9;
    int i32;
    char[] arrayOfChar10;
    int i36;
    char[] arrayOfChar11;
    int i40;
    if (m <= n)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\026y\005".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\nn\004jp\020l\032dv\ts\004h}\001s\002zq\032l\006jp\033y\022".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label873;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\nn\004jp\020\031kl\n\002lt\006h\017".toCharArray();
        int i11 = arrayOfChar4.length;
        i12 = 0;
        if (i11 > i12)
          break label965;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\nn\004jp\020h\031j}\002}\030|}\033n\037`q".toCharArray();
        int i15 = arrayOfChar5.length;
        i16 = 0;
        if (i15 > i16)
          break label1057;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\nn\004jp\020~\027a}\037}\004do\nh\023w".toCharArray();
        int i19 = arrayOfChar6.length;
        i20 = 0;
        if (i19 > i20)
          break label1149;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\nn\004jp\020~\032ja\004y\022".toCharArray();
        int i23 = arrayOfChar7.length;
        i24 = 0;
        if (i23 > i24)
          break label1241;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\nn\004jp\020j\023wq\006s\030zv��s\tjn\013".toCharArray();
        int i27 = arrayOfChar8.length;
        i28 = 0;
        if (i27 > i28)
          break label1333;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\nn\004jp\020i\030vr\n\037ck\nx".toCharArray();
        int i31 = arrayOfChar9.length;
        i32 = 0;
        if (i31 > i32)
          break label1425;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\nn\004jp\020h\031j}\035y\025`l\033".toCharArray();
        int i35 = arrayOfChar10.length;
        i36 = 0;
        if (i35 > i36)
          break label1517;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\026y\005zu\006h\036za��x\023".toCharArray();
        int i39 = arrayOfChar11.length;
        i40 = 0;
        if (i39 > i40)
          break label1609;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        z = arrayOfString;
        a = new uf(z[1], 0);
        b = new uf(z[10], 1);
        c = new uf(z[8], 2);
        d = new uf(z[3], 3);
        e = new uf(z[9], 4);
        f = new uf(z[4], 5);
        g = new uf(z[7], 6);
        h = new uf(z[2], 7);
        i = new uf(z[0], 8);
        j = new uf(z[5], 9);
        k = new uf(z[6], 10);
        uf[] arrayOfuf = new uf[11];
        arrayOfuf[0] = a;
        arrayOfuf[1] = b;
        arrayOfuf[2] = c;
        arrayOfuf[3] = d;
        arrayOfuf[4] = e;
        arrayOfuf[5] = f;
        arrayOfuf[6] = g;
        arrayOfuf[7] = h;
        arrayOfuf[8] = i;
        arrayOfuf[9] = j;
        arrayOfuf[10] = k;
        l = arrayOfuf;
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 34;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 79;
        continue;
        i2 = 60;
        continue;
        i2 = 86;
        continue;
        i2 = 37;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 79;
      continue;
      i6 = 60;
      continue;
      i6 = 86;
      continue;
      i6 = 37;
    }
    label873: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 79;
      continue;
      i10 = 60;
      continue;
      i10 = 86;
      continue;
      i10 = 37;
    }
    label965: int i13 = arrayOfChar4[i12];
    int i14;
    switch (i12 % 5)
    {
    default:
      i14 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i12] = (char)(i14 ^ i13);
      i12++;
      break;
      i14 = 79;
      continue;
      i14 = 60;
      continue;
      i14 = 86;
      continue;
      i14 = 37;
    }
    label1057: int i17 = arrayOfChar5[i16];
    int i18;
    switch (i16 % 5)
    {
    default:
      i18 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i16] = (char)(i18 ^ i17);
      i16++;
      break;
      i18 = 79;
      continue;
      i18 = 60;
      continue;
      i18 = 86;
      continue;
      i18 = 37;
    }
    label1149: int i21 = arrayOfChar6[i20];
    int i22;
    switch (i20 % 5)
    {
    default:
      i22 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i20] = (char)(i22 ^ i21);
      i20++;
      break;
      i22 = 79;
      continue;
      i22 = 60;
      continue;
      i22 = 86;
      continue;
      i22 = 37;
    }
    label1241: int i25 = arrayOfChar7[i24];
    int i26;
    switch (i24 % 5)
    {
    default:
      i26 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i24] = (char)(i26 ^ i25);
      i24++;
      break;
      i26 = 79;
      continue;
      i26 = 60;
      continue;
      i26 = 86;
      continue;
      i26 = 37;
    }
    label1333: int i29 = arrayOfChar8[i28];
    int i30;
    switch (i28 % 5)
    {
    default:
      i30 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i28] = (char)(i30 ^ i29);
      i28++;
      break;
      i30 = 79;
      continue;
      i30 = 60;
      continue;
      i30 = 86;
      continue;
      i30 = 37;
    }
    label1425: int i33 = arrayOfChar9[i32];
    int i34;
    switch (i32 % 5)
    {
    default:
      i34 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i32] = (char)(i34 ^ i33);
      i32++;
      break;
      i34 = 79;
      continue;
      i34 = 60;
      continue;
      i34 = 86;
      continue;
      i34 = 37;
    }
    label1517: int i37 = arrayOfChar10[i36];
    int i38;
    switch (i36 % 5)
    {
    default:
      i38 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i36] = (char)(i38 ^ i37);
      i36++;
      break;
      i38 = 79;
      continue;
      i38 = 60;
      continue;
      i38 = 86;
      continue;
      i38 = 37;
    }
    label1609: int i41 = arrayOfChar11[i40];
    int i42;
    switch (i40 % 5)
    {
    default:
      i42 = 34;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i40] = (char)(i42 ^ i41);
      i40++;
      break;
      i42 = 79;
      continue;
      i42 = 60;
      continue;
      i42 = 86;
      continue;
      i42 = 37;
    }
  }

  public static uf a(String paramString)
  {
    return (uf)Enum.valueOf(uf.class, paramString);
  }

  public static uf[] a()
  {
    return (uf[])l.clone();
  }
}