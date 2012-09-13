package com.whatsapp;

public enum sf
{
  private static final sf[] c;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "M\027WZE\031iZFH\031cUQ".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "M\027WZ^\005sIZI\032yXNN\022".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
        a = new sf(z[0], 0);
        b = new sf(z[1], 1);
        sf[] arrayOfsf = new sf[2];
        arrayOfsf[0] = a;
        arrayOfsf[1] = b;
        c = arrayOfsf;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 5;
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
        m = 11;
        continue;
        m = 86;
        continue;
        m = 54;
        continue;
        m = 27;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 5;
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
      i3 = 11;
      continue;
      i3 = 86;
      continue;
      i3 = 54;
      continue;
      i3 = 27;
    }
  }

  public static sf a(String paramString)
  {
    return (sf)Enum.valueOf(sf.class, paramString);
  }

  public static sf[] a()
  {
    return (sf[])c.clone();
  }
}