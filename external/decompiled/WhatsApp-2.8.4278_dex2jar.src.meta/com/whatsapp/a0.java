package com.whatsapp;

import java.io.IOException;
import java.util.Vector;

class a0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "H>".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "T)\027{".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "K3\026".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "M3\001}".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 116;
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
        m = 90;
        continue;
        m = 114;
        continue;
        m = 9;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 116;
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
      i3 = 90;
      continue;
      i3 = 114;
      continue;
      i3 = 9;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 116;
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
      i7 = 90;
      continue;
      i7 = 114;
      continue;
      i7 = 9;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 116;
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
      i11 = 90;
      continue;
      i11 = 114;
      continue;
      i11 = 9;
    }
  }

  a0(qz paramqz)
  {
  }

  public void a(int paramInt)
  {
    this.a.j.a(null, paramInt);
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    boolean bool = nz.b;
    c1 localc11 = paramc1.b(z[3]);
    Vector localVector;
    if (localc11 != null)
      localVector = localc11.c(z[1]);
    int j;
    for (int i = 0; ; i = j)
      if (i < localVector.size())
      {
        c1 localc12 = (c1)localVector.elementAt(i);
        String str1 = localc12.a(z[2]);
        String str2 = localc12.a(z[0]);
        this.a.j.b(str1, str2);
        j = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a0
 * JD-Core Version:    0.6.1
 */