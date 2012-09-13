package com.whatsapp;

import java.io.IOException;

class i0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "*#\002\002".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "=$\b\035f".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "?4\016��q(\"".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
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
        m = 31;
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
        m = 76;
        continue;
        m = 81;
        continue;
        m = 109;
        continue;
        m = 111;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 31;
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
      i3 = 76;
      continue;
      i3 = 81;
      continue;
      i3 = 109;
      continue;
      i3 = 111;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 31;
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
      i7 = 76;
      continue;
      i7 = 81;
      continue;
      i7 = 109;
      continue;
      i7 = 111;
    }
  }

  i0(qz paramqz)
  {
  }

  public void a(c1 paramc1)
    throws IOException, bg
  {
    String str = paramc1.a(z[0]);
    if (str != null)
      this.a.j.c(str);
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    c1 localc1 = paramc1.a(0);
    c1.a(localc1, z[1]);
    String str1 = localc1.a(z[2]);
    String str2 = localc1.a();
    if ((str1 != null) && (paramString != null));
    try
    {
      this.a.j.a(paramString, Integer.parseInt(str1), str2);
      label61: return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      break label61;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.i0
 * JD-Core Version:    0.6.1
 */