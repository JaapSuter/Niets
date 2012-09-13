package com.whatsapp;

public class g8 extends RuntimeException
{
  private static final String[] z;
  String a;
  Throwable b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "4-WO!\n1Q\005q".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "i\031CQ\003\0261BV<\006\032N\\4\023+_P?C3WL%C,B^?\031>\f\037".toCharArray();
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
        m = 81;
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
        m = 99;
        continue;
        m = 95;
        continue;
        m = 54;
        continue;
        m = 63;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 81;
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
      i3 = 99;
      continue;
      i3 = 95;
      continue;
      i3 = 54;
      continue;
      i3 = 63;
    }
  }

  public g8(Throwable paramThrowable, String paramString)
  {
    this.a = paramString;
    this.b = paramThrowable;
  }

  public Throwable a()
  {
    return this.b;
  }

  public String getMessage()
  {
    return z[0] + this.b.getClass().getName() + z[1] + this.a;
  }
}