package com.whatsapp;

import java.io.IOException;

class zz extends xz
{
  private static final String[] z;
  final d1 a;
  final byte[] b;
  final wz c;
  final qz d;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "(\002q+@*\016".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "1\017".toCharArray();
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
        m = 53;
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
        m = 88;
        continue;
        m = 107;
        continue;
        m = 18;
        continue;
        m = 95;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 53;
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
      i3 = 88;
      continue;
      i3 = 107;
      continue;
      i3 = 18;
      continue;
      i3 = 95;
    }
  }

  zz(qz paramqz, d1 paramd1, byte[] paramArrayOfByte, wz paramwz)
  {
  }

  public void a(int paramInt)
  {
    if (this.c != null)
      this.c.a(paramInt);
  }

  public void a(c1 paramc1, String paramString)
    throws IOException, bg
  {
    if (this.a != null)
    {
      String str = null;
      if (this.b != null)
      {
        c1 localc1 = paramc1.a(0);
        c1.a(localc1, z[0]);
        str = localc1.a(z[1]);
      }
      this.a.a(str);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zz
 * JD-Core Version:    0.6.1
 */