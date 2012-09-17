package com.whatsapp;

import java.io.IOException;

class d0 extends xz
{
  private static final String[] z;
  final String a;
  final d1 b;
  final wz c;
  final qz d;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "88".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "6.lC)".toCharArray();
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
        m = 89;
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
        m = 81;
        continue;
        m = 92;
        continue;
        m = 3;
        continue;
        m = 54;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 89;
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
      i3 = 81;
      continue;
      i3 = 92;
      continue;
      i3 = 3;
      continue;
      i3 = 54;
    }
  }

  d0(qz paramqz, String paramString, d1 paramd1, wz paramwz)
  {
  }

  public void a(int paramInt)
  {
    if (this.c != null)
      this.c.a(paramInt);
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    c1 localc1 = paramc1.a(0);
    c1.a(localc1, z[1]);
    String str = localc1.a(z[0]);
    this.d.k.a(qz.a(this.d, str), this.a);
    if (this.b != null)
      this.b.a(qz.a(this.d, str));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d0
 * JD-Core Version:    0.6.1
 */