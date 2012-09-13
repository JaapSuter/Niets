package com.whatsapp;

import java.io.IOException;
import java.io.Writer;

public class rf extends Writer
{
  private static final String z;
  StringBuilder a = new StringBuilder();

  static
  {
    char[] arrayOfChar = "WA\003".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 59;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 19;
      continue;
      m = 123;
      continue;
      m = 35;
      continue;
      m = 109;
    }
  }

  public void close()
    throws IOException
  {
    this.a = null;
  }

  public void flush()
    throws IOException
  {
    if (g5.f() >= 4)
    {
      g5.c(4, g5.b(z, this.a.toString()));
      this.a = new StringBuilder();
    }
  }

  public void write(int paramInt)
    throws IOException
  {
    if (g5.f() >= 4)
      this.a.append((char)paramInt);
  }

  public void write(String paramString)
    throws IOException
  {
    write(paramString, 0, paramString.length());
  }

  public void write(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    if (g5.f() >= 4)
      this.a.append(paramString, paramInt1, paramInt2);
  }

  public void write(char[] paramArrayOfChar)
    throws IOException
  {
    write(paramArrayOfChar, 0, paramArrayOfChar.length);
  }

  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws IOException
  {
    if (g5.f() >= 4)
      this.a.append(paramArrayOfChar, paramInt1, paramInt2);
  }
}