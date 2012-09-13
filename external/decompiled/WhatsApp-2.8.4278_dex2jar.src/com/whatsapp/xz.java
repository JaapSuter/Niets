package com.whatsapp;

import java.io.IOException;
import java.util.Vector;

public abstract class xz
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "a1��\016j".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "g,\026\004".toCharArray();
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
        m = 24;
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
        m = 4;
        continue;
        m = 67;
        continue;
        m = 114;
        continue;
        m = 97;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 24;
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
      i3 = 4;
      continue;
      i3 = 67;
      continue;
      i3 = 114;
      continue;
      i3 = 97;
    }
  }

  public void a(int paramInt)
  {
  }

  public void a(c1 paramc1)
    throws IOException, bg
  {
    boolean bool = nz.b;
    Vector localVector = paramc1.c(z[0]);
    int j;
    for (int i = 0; ; i = j)
      if (i < localVector.size())
      {
        c1 localc1 = (c1)localVector.elementAt(i);
        if (localc1 != null)
        {
          String str = localc1.a(z[1]);
          if (str != null)
            a(Integer.parseInt(str));
        }
        j = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }

  public abstract void a(c1 paramc1, String paramString)
    throws IOException, bg;
}