package com.whatsapp;

public class uz
{
  private static final String[] z;
  public final String a;
  public final boolean b;
  public final String c;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "7vV\r1t\"A76r2\031".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "7vB\0323v\tI\ra".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "P3]35k".toCharArray();
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
        m = 92;
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
        m = 27;
        continue;
        m = 86;
        continue;
        m = 36;
        continue;
        m = 104;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 92;
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
      i3 = 27;
      continue;
      i3 = 86;
      continue;
      i3 = 36;
      continue;
      i3 = 104;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 92;
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
      i7 = 27;
      continue;
      i7 = 86;
      continue;
      i7 = 36;
      continue;
      i7 = 104;
    }
  }

  public uz(String paramString1, boolean paramBoolean, String paramString2)
  {
    this.a = paramString1;
    this.b = paramBoolean;
    this.c = paramString2;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        bool = false;
      }
      else
      {
        uz localuz = (uz)paramObject;
        if (this.b != localuz.b)
          bool = false;
        else if (this.c == null)
        {
          if (localuz.c != null)
            bool = false;
        }
        else if (!this.c.equals(localuz.c))
          bool = false;
        else if (this.a == null)
        {
          if (localuz.a != null)
            bool = false;
        }
        else if (!this.a.equals(localuz.a))
          bool = false;
      }
    }
  }

  public int hashCode()
  {
    int i = 0;
    int j;
    int m;
    label31: int n;
    if (this.b)
    {
      j = 1231;
      int k = 31 * (j + 31);
      if (this.c != null)
        break label59;
      m = 0;
      n = 31 * (m + k);
      if (this.a != null)
        break label71;
    }
    while (true)
    {
      return n + i;
      j = 1237;
      break;
      label59: m = this.c.hashCode();
      break label31;
      label71: i = this.a.hashCode();
    }
  }

  public String toString()
  {
    return z[2] + this.c + z[1] + this.b + z[0] + this.a + "]";
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uz
 * JD-Core Version:    0.6.1
 */