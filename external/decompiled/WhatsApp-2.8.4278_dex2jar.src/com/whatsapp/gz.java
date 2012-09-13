package com.whatsapp;

public class gz
{
  private static final String[] z;
  public String a;
  public byte[] b;
  public byte[] c;
  public int d;
  public int e;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "_x\002\rg".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Fg\006\034kSb".toCharArray();
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
        m = 2;
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
        m = 54;
        continue;
        m = 21;
        continue;
        m = 99;
        continue;
        m = 106;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 2;
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
      i3 = 54;
      continue;
      i3 = 21;
      continue;
      i3 = 99;
      continue;
      i3 = 106;
    }
  }

  public gz(String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.d = paramInt1;
    this.e = paramInt2;
  }

  public gz(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    this.a = paramString;
    this.b = paramArrayOfByte1;
    this.c = paramArrayOfByte2;
    this.d = paramInt;
  }

  public String a()
  {
    String str;
    if (this.e == 1)
      str = z[0];
    while (true)
    {
      return str;
      if (this.e == 2)
        str = z[1];
      else
        str = z[0];
    }
  }
}