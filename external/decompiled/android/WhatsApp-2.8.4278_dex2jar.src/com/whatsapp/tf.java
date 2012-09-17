package com.whatsapp;

public enum tf
{
  private static final tf[] c;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "sC\037~".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "lG\005".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
        a = new tf(z[1], 0);
        b = new tf(z[0], 1);
        tf[] arrayOftf = new tf[2];
        arrayOftf[0] = a;
        arrayOftf[1] = b;
        c = arrayOftf;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 25;
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
        m = 53;
        continue;
        m = 2;
        continue;
        m = 86;
        continue;
        m = 50;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 25;
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
      i3 = 53;
      continue;
      i3 = 2;
      continue;
      i3 = 86;
      continue;
      i3 = 50;
    }
  }

  public static tf a(String paramString)
  {
    return (tf)Enum.valueOf(tf.class, paramString);
  }

  public static tf[] a()
  {
    return (tf[])c.clone();
  }
}