package com.whatsapp;

import java.io.IOException;
import java.util.Vector;

class n0 extends xz
{
  private static final String[] z;
  final qz a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\003?eVh\0207gCo\007".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\0317s".toCharArray();
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
        m = 1;
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
        m = 115;
        continue;
        m = 94;
        continue;
        m = 23;
        continue;
        m = 34;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 1;
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
      i3 = 115;
      continue;
      i3 = 94;
      continue;
      i3 = 23;
      continue;
      i3 = 34;
    }
  }

  n0(qz paramqz)
  {
  }

  public void a(c1 paramc1, String paramString)
    throws IOException
  {
    Vector localVector = new Vector();
    qz.a(this.a, paramc1, localVector, z[0], z[1]);
    this.a.k.a(paramString, localVector);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.n0
 * JD-Core Version:    0.6.1
 */