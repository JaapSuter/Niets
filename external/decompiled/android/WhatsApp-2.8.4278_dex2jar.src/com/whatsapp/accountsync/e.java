package com.whatsapp.accountsync;

class e
{
  private static final String[] z;
  long a;
  String b;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "C\017(".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\n\001|\rN".toCharArray();
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
        m = 115;
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
        m = 42;
        continue;
        m = 107;
        continue;
        m = 21;
        continue;
        m = 105;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 115;
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
      i3 = 42;
      continue;
      i3 = 107;
      continue;
      i3 = 21;
      continue;
      i3 = 105;
    }
  }

  public e(long paramLong, String paramString)
  {
    this.a = paramLong;
    this.b = paramString;
  }

  public String toString()
  {
    return z[0] + this.a + z[1] + this.b;
  }
}