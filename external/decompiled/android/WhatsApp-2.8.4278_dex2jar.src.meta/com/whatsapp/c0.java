package com.whatsapp;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

class c0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "VU>x".toCharArray();
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
      arrayOfChar2 = "NU?hm".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "HF<m".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "NQ!naWZ".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "HF<m{".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 8;
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
        m = 56;
        continue;
        m = 52;
        continue;
        m = 83;
        continue;
        m = 29;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 8;
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
      i3 = 56;
      continue;
      i3 = 52;
      continue;
      i3 = 83;
      continue;
      i3 = 29;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 8;
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
      i7 = 56;
      continue;
      i7 = 52;
      continue;
      i7 = 83;
      continue;
      i7 = 29;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 8;
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
      i11 = 56;
      continue;
      i11 = 52;
      continue;
      i11 = 83;
      continue;
      i11 = 29;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 8;
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
      i15 = 56;
      continue;
      i15 = 52;
      continue;
      i15 = 83;
      continue;
      i15 = 29;
    }
  }

  c0(qz paramqz)
  {
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    boolean bool = nz.b;
    c1 localc11 = paramc1.b(z[4]);
    String str;
    if (localc11 != null)
      str = localc11.a(z[3]);
    try
    {
      int m = Integer.parseInt(str);
      i = m;
      Vector localVector = localc11.c(z[2]);
      Hashtable localHashtable = new Hashtable();
      j = 0;
      if (j < localVector.size())
      {
        c1 localc12 = (c1)localVector.elementAt(j);
        localHashtable.put(localc12.a(z[0]), localc12.a(z[1]));
        k = j + 1;
        if (!bool);
      }
      else
      {
        this.a.k.a(i, localHashtable);
        return;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        int k;
        int i = 0;
        continue;
        int j = k;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.c0
 * JD-Core Version:    0.6.1
 */