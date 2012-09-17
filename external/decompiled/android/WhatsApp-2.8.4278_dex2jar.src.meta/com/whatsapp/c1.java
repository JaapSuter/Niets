package com.whatsapp;

import java.io.UnsupportedEncodingException;
import java.util.Vector;

public final class c1
{
  private static final String[] z;
  public final String a;
  public final w0[] b;
  public final c1[] c;
  public final byte[] d;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "X3@nQ".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "-\024r1��c��<c".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "k\006o/\fiGt&\030x\016t&G-\ti'\f7G".toCharArray();
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
        m = 105;
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
        m = 13;
        continue;
        m = 103;
        continue;
        m = 6;
        continue;
        m = 67;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 105;
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
      i3 = 13;
      continue;
      i3 = 103;
      continue;
      i3 = 6;
      continue;
      i3 = 67;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 105;
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
      i7 = 13;
      continue;
      i7 = 103;
      continue;
      i7 = 6;
      continue;
      i7 = 67;
    }
  }

  public c1(String paramString, w0[] paramArrayOfw0)
  {
    this.a = paramString;
    this.b = paramArrayOfw0;
    this.c = null;
    this.d = null;
  }

  public c1(String paramString, w0[] paramArrayOfw0, c1 paramc1)
  {
    this.a = paramString;
    this.b = paramArrayOfw0;
    c1[] arrayOfc1 = new c1[1];
    arrayOfc1[0] = paramc1;
    this.c = arrayOfc1;
    this.d = null;
  }

  public c1(String paramString1, w0[] paramArrayOfw0, String paramString2)
    throws UnsupportedEncodingException
  {
    this.a = paramString1;
    this.b = paramArrayOfw0;
    this.c = null;
    if (paramString2 != null)
    {
      this.d = paramString2.getBytes(z[0]);
      if (!nz.b);
    }
    else
    {
      this.d = null;
    }
  }

  public c1(String paramString, w0[] paramArrayOfw0, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfw0;
    this.c = null;
    this.d = paramArrayOfByte;
  }

  public c1(String paramString, w0[] paramArrayOfw0, c1[] paramArrayOfc1)
  {
    this.a = paramString;
    this.b = paramArrayOfw0;
    this.c = paramArrayOfc1;
    this.d = null;
  }

  public static void a(c1 paramc1, String paramString)
    throws bg
  {
    if (!b(paramc1, paramString))
      throw new bg(z[2] + paramc1 + z[1] + paramString);
  }

  public static boolean b(c1 paramc1, String paramString)
  {
    if ((paramc1 != null) && (paramc1.a != null) && (paramc1.a.equals(paramString)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public c1 a(int paramInt)
  {
    if ((this.c == null) || (this.c.length <= paramInt));
    for (c1 localc1 = null; ; localc1 = this.c[paramInt])
      return localc1;
  }

  public String a()
    throws UnsupportedEncodingException
  {
    if (this.d == null);
    for (String str = null; ; str = new String(this.d, z[0]))
      return str;
  }

  public String a(String paramString)
  {
    boolean bool = nz.b;
    String str;
    if (this.b == null)
      str = null;
    while (true)
    {
      return str;
      int i = 0;
      do
      {
        if (i >= this.b.length)
          break label65;
        w0 localw0 = this.b[i];
        if (paramString.equals(localw0.a))
        {
          str = localw0.b;
          break;
        }
        i++;
      }
      while (!bool);
      label65: str = null;
    }
  }

  public c1 b(String paramString)
  {
    boolean bool = nz.b;
    c1 localc1;
    if (this.c == null)
      localc1 = null;
    while (true)
    {
      return localc1;
      int i = 0;
      do
      {
        if (i >= this.c.length)
          break label62;
        if (paramString.equals(this.c[i].a))
        {
          localc1 = this.c[i];
          break;
        }
        i++;
      }
      while (!bool);
      label62: localc1 = null;
    }
  }

  public Vector c(String paramString)
  {
    boolean bool = nz.b;
    Vector localVector1 = new Vector();
    if (this.c == null);
    for (Vector localVector2 = localVector1; ; localVector2 = localVector1)
    {
      return localVector2;
      int i = 0;
      do
      {
        if (i >= this.c.length)
          break;
        if (paramString.equals(this.c[i].a))
          localVector1.addElement(this.c[i]);
        i++;
      }
      while (!bool);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.c1
 * JD-Core Version:    0.6.1
 */