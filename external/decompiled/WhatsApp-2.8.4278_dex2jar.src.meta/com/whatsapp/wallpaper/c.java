package com.whatsapp.wallpaper;

 enum c
{
  private static final c[] d;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\007s#W".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\016n\"E".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\004s;W".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label369;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        a = new c(z[0], 0);
        b = new c(z[2], 1);
        c = new c(z[1], 2);
        c[] arrayOfc = new c[3];
        arrayOfc[0] = a;
        arrayOfc[1] = b;
        arrayOfc[2] = c;
        d = arrayOfc;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 17;
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
        m = 73;
        continue;
        m = 28;
        continue;
        m = 77;
        continue;
        m = 50;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 17;
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
      i3 = 73;
      continue;
      i3 = 28;
      continue;
      i3 = 77;
      continue;
      i3 = 50;
    }
    label369: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 17;
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
      i7 = 73;
      continue;
      i7 = 28;
      continue;
      i7 = 77;
      continue;
      i7 = 50;
    }
  }

  public static c a(String paramString)
  {
    return (c)Enum.valueOf(c.class, paramString);
  }

  public static c[] a()
  {
    return (c[])d.clone();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.c
 * JD-Core Version:    0.6.1
 */