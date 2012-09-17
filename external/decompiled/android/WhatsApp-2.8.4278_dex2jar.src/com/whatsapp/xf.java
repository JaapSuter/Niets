package com.whatsapp;

public enum xf
{
  private static final xf[] d;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\035QZ\016;\035WF\037;\035PV\037;\n".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\035QZ\016;\035WF\016,\013EM\b:".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\bEP\001;\n".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label368;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        a = new xf(z[2], 0);
        b = new xf(z[0], 1);
        c = new xf(z[1], 2);
        xf[] arrayOfxf = new xf[3];
        arrayOfxf[0] = a;
        arrayOfxf[1] = b;
        arrayOfxf[2] = c;
        d = arrayOfxf;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 126;
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
        m = 78;
        continue;
        m = 4;
        continue;
        m = 25;
        continue;
        m = 77;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 126;
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
      i3 = 78;
      continue;
      i3 = 4;
      continue;
      i3 = 25;
      continue;
      i3 = 77;
    }
    label368: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 126;
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
      i7 = 78;
      continue;
      i7 = 4;
      continue;
      i7 = 25;
      continue;
      i7 = 77;
    }
  }

  public static xf a(String paramString)
  {
    return (xf)Enum.valueOf(xf.class, paramString);
  }

  public static xf[] a()
  {
    return (xf[])d.clone();
  }
}