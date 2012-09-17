package com.whatsapp;

import java.util.Vector;

class z8 extends Thread
{
  private static final String[] z;
  final String a;
  final sz b;
  final yo c;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\003gO\016\027KvR\036\006\020p��\032��\005|NWG\016|DA".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "DfU\031\r\001vTA".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\nz��\026\024\003".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 103;
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
        m = 100;
        continue;
        m = 21;
        continue;
        m = 32;
        continue;
        m = 123;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 103;
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
      i3 = 100;
      continue;
      i3 = 21;
      continue;
      i3 = 32;
      continue;
      i3 = 123;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 103;
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
      i7 = 100;
      continue;
      i7 = 21;
      continue;
      i7 = 32;
      continue;
      i7 = 123;
    }
  }

  z8(yo paramyo, String paramString, sz paramsz)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      StringBuilder localStringBuilder = new StringBuilder().append(z[0]).append(this.a).append(z[1]);
      if (this.b == null);
      String str;
      for (Object localObject = z[2]; ; localObject = str)
      {
        g5.c((String)localObject);
        App.a(new ju(this.a, this.b.b(), (Vector)this.b.t, 13));
        break;
        str = this.b.b();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.z8
 * JD-Core Version:    0.6.1
 */