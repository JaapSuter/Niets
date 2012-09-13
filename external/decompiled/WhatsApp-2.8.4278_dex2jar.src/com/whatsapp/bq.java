package com.whatsapp;

public class bq
{
  private static final String[] z;
  public vf a;
  public long b;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = ";3+4".toCharArray();
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
      arrayOfChar2 = ") 2=w!&".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "'5*!1<$,'{=2*0j:2q7q=,?%{=31#".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = ") 2\"{".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "=(-8p(".toCharArray();
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
        m = 30;
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
        m = 79;
        continue;
        m = 65;
        continue;
        m = 94;
        continue;
        m = 81;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 30;
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
      i3 = 79;
      continue;
      i3 = 65;
      continue;
      i3 = 94;
      continue;
      i3 = 81;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 30;
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
      i7 = 79;
      continue;
      i7 = 65;
      continue;
      i7 = 94;
      continue;
      i7 = 81;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 30;
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
      i11 = 79;
      continue;
      i11 = 65;
      continue;
      i11 = 94;
      continue;
      i11 = 81;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 30;
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
      i15 = 79;
      continue;
      i15 = 65;
      continue;
      i15 = 94;
      continue;
      i15 = 81;
    }
  }

  public bq(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 == null)
    {
      this.a = vf.e;
      if (i == 0);
    }
    else if (paramString1.equals(z[3]))
    {
      this.a = vf.b;
      if (i == 0);
    }
    else if (paramString1.equals(z[0]))
    {
      this.a = vf.a;
      if (i == 0);
    }
    else if (paramString1.equals(z[4]))
    {
      this.a = vf.c;
      if (i == 0);
    }
    else if (paramString1.equals(z[1]))
    {
      this.a = vf.d;
      if (i == 0);
    }
    else
    {
      this.a = vf.e;
    }
    if ((this.a == vf.b) || (this.a == vf.c) || (this.a == vf.d));
    while (true)
    {
      try
      {
        this.b = Long.parseLong(paramString3);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        g5.c(z[2]);
        this.b = -1L;
        if (i == 0)
          continue;
      }
      this.b = -1L;
    }
  }
}