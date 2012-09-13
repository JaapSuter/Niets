package com.whatsapp;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class lf extends FilterInputStream
{
  private static final String[] z;
  final int a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "&'w1\034t!e8\0041&$=\006t\017a'\0335%a\035\006$7p\007\034&'e9".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "9#v?H7#h8\r0bm:H\031'w'\t3'M:\030!6W \0321#i".toCharArray();
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
        m = 104;
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
        m = 84;
        continue;
        m = 66;
        continue;
        m = 4;
        continue;
        m = 84;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 104;
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
      i3 = 84;
      continue;
      i3 = 66;
      continue;
      i3 = 4;
      continue;
      i3 = 84;
    }
  }

  public lf(InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream);
    this.a = paramInt;
  }

  public void mark(int paramInt)
  {
    g5.c(z[1]);
  }

  public boolean markSupported()
  {
    return false;
  }

  public int read()
    throws IOException
  {
    int i = super.read();
    e4.a(1L, this.a);
    return i;
  }

  public int read(byte[] paramArrayOfByte)
    throws IOException
  {
    int i = super.read(paramArrayOfByte);
    e4.a(i, this.a);
    return i;
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    e4.a(i, this.a);
    return i;
  }

  public void reset()
  {
    try
    {
      g5.c(z[0]);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public long skip(long paramLong)
    throws IOException
  {
    long l = super.skip(paramLong);
    e4.a(l, this.a);
    return l;
  }
}