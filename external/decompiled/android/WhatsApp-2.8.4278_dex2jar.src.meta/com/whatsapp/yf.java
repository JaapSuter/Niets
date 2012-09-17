package com.whatsapp;

public enum yf
{
  private static final yf[] f;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "gI��s5eW��q#tN\017v3hM\007k/rX\b|5".toCharArray();
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
      arrayOfChar2 = "gI��s5eW\035p?~G\005{".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "gI��s5eW\016z>dZ��|".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label489;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "gI��s5eW��q&`D��{/tZ\005".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label581;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "r]\n|5r[".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label673;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        z = arrayOfString;
        a = new yf(z[2], 0);
        b = new yf(z[4], 1);
        c = new yf(z[0], 2);
        d = new yf(z[1], 3);
        e = new yf(z[3], 4);
        yf[] arrayOfyf = new yf[5];
        arrayOfyf[0] = a;
        arrayOfyf[1] = b;
        arrayOfyf[2] = c;
        arrayOfyf[3] = d;
        arrayOfyf[4] = e;
        f = arrayOfyf;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 112;
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
        m = 33;
        continue;
        m = 8;
        continue;
        m = 73;
        continue;
        m = 63;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 112;
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
      i3 = 33;
      continue;
      i3 = 8;
      continue;
      i3 = 73;
      continue;
      i3 = 63;
    }
    label489: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 112;
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
      i7 = 33;
      continue;
      i7 = 8;
      continue;
      i7 = 73;
      continue;
      i7 = 63;
    }
    label581: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 112;
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
      i11 = 33;
      continue;
      i11 = 8;
      continue;
      i11 = 73;
      continue;
      i11 = 63;
    }
    label673: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 112;
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
      i15 = 33;
      continue;
      i15 = 8;
      continue;
      i15 = 73;
      continue;
      i15 = 63;
    }
  }

  public static yf a(String paramString)
  {
    return (yf)Enum.valueOf(yf.class, paramString);
  }

  public static yf[] a()
  {
    return (yf[])f.clone();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yf
 * JD-Core Version:    0.6.1
 */