package com.whatsapp;

class n7
{
  private static final String[] z;
  int a;
  int b;
  int c;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "yM".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "S\0069$]J\rd'UW\020.wo".toCharArray();
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
        m = 52;
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
        m = 37;
        continue;
        m = 99;
        continue;
        m = 75;
        continue;
        m = 87;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 52;
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
      i3 = 37;
      continue;
      i3 = 99;
      continue;
      i3 = 75;
      continue;
      i3 = 87;
    }
  }

  public static n7 a(String paramString)
  {
    try
    {
      String[] arrayOfString = paramString.split(z[0]);
      localn7 = new n7();
      localn7.a = Integer.parseInt(arrayOfString[0]);
      localn7.b = Integer.parseInt(arrayOfString[1]);
      localn7.c = Integer.parseInt(arrayOfString[2]);
      return localn7;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.d(z[1] + paramString + "]");
        n7 localn7 = null;
      }
    }
  }

  public int a(n7 paramn7)
  {
    int i = -1;
    if (this.a < paramn7.a);
    while (true)
    {
      return i;
      if (this.a > paramn7.a)
        i = 1;
      else if (this.b >= paramn7.b)
        if (this.b > paramn7.b)
          i = 1;
        else if (this.c >= paramn7.c)
          if (this.c > paramn7.c)
            i = 1;
          else
            i = 0;
    }
  }

  public String toString()
  {
    return this.a + "." + this.b + "." + this.c;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.n7
 * JD-Core Version:    0.6.1
 */