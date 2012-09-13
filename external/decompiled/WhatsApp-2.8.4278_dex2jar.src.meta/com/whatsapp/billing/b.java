package com.whatsapp.billing;

public enum b
{
  private static final b[] d;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "t\027Cdn{\023I".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "e\023Kres\023I".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "g\003_dcv\005Hc".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label369;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        a = new b(z[2], 0);
        b = new b(z[0], 1);
        c = new b(z[1], 2);
        b[] arrayOfb = new b[3];
        arrayOfb[0] = a;
        arrayOfb[1] = b;
        arrayOfb[2] = c;
        d = arrayOfb;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 43;
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
        m = 55;
        continue;
        m = 86;
        continue;
        m = 13;
        continue;
        m = 39;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 43;
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
      i3 = 55;
      continue;
      i3 = 86;
      continue;
      i3 = 13;
      continue;
      i3 = 39;
    }
    label369: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 43;
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
      i7 = 55;
      continue;
      i7 = 86;
      continue;
      i7 = 13;
      continue;
      i7 = 39;
    }
  }

  public static b a(int paramInt)
  {
    b[] arrayOfb = a();
    if ((paramInt < 0) || (paramInt >= arrayOfb.length));
    for (b localb = b; ; localb = arrayOfb[paramInt])
      return localb;
  }

  public static b a(String paramString)
  {
    return (b)Enum.valueOf(b.class, paramString);
  }

  public static b[] a()
  {
    return (b[])d.clone();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.billing.b
 * JD-Core Version:    0.6.1
 */