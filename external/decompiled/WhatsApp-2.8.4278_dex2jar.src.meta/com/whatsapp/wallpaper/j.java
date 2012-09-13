package com.whatsapp.wallpaper;

public final class j
{
  public static final String a;
  private static final String[] z;
  public long b;
  public String c = "";
  public String d;
  public String e;
  private int f = -1;
  public double g;
  public double h;
  public long i = 0L;
  public boolean j = false;
  public long k = 0L;
  public long l = 0L;
  public int m;
  public int n = 0;
  public int o = 0;
  public float p;
  public String q;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "%\033KC]|".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ":\026".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
        a = new String(z[1]);
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 50;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        i2++;
        break;
        i4 = 83;
        continue;
        i4 = 114;
        continue;
        i4 = 47;
        continue;
        i4 = 38;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 50;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 83;
      continue;
      i8 = 114;
      continue;
      i8 = 47;
      continue;
      i8 = 38;
    }
  }

  public int a()
  {
    int i1 = 0;
    if (this.f == -1)
    {
      if ((this.e != null) && (this.e.startsWith(z[0])))
        i1 = 1;
      this.f = i1;
    }
    return this.f;
  }

  public String toString()
  {
    return this.c;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.j
 * JD-Core Version:    0.6.1
 */