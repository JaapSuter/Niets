package com.whatsapp;

import java.io.IOException;
import java.io.Writer;

public class j1
  implements f1
{
  private static final String[] z;
  final Writer a;

  static
  {
    String[] arrayOfString = new String[7];
    char[] arrayOfChar1 = "\013k<Q~R%\"\037C6*Da\t".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\0137;WiV)uVxE!.H,C+r\002".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\020d=@X1=Fi\nc".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label441;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\020z".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label533;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\030z".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label625;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\nc".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label717;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\013k".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label809;
        arrayOfString[6] = new String(arrayOfChar7).intern();
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
        m = 12;
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
        m = 55;
        continue;
        m = 68;
        continue;
        m = 79;
        continue;
        m = 37;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 12;
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
      i3 = 55;
      continue;
      i3 = 68;
      continue;
      i3 = 79;
      continue;
      i3 = 37;
    }
    label441: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 12;
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
      i7 = 55;
      continue;
      i7 = 68;
      continue;
      i7 = 79;
      continue;
      i7 = 37;
    }
    label533: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 12;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 55;
      continue;
      i11 = 68;
      continue;
      i11 = 79;
      continue;
      i11 = 37;
    }
    label625: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 12;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 55;
      continue;
      i15 = 68;
      continue;
      i15 = 79;
      continue;
      i15 = 37;
    }
    label717: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 12;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 55;
      continue;
      i19 = 68;
      continue;
      i19 = 79;
      continue;
      i19 = 37;
    }
    label809: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 12;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 55;
      continue;
      i23 = 68;
      continue;
      i23 = 79;
      continue;
      i23 = 37;
    }
  }

  public j1(Writer paramWriter)
    throws IOException
  {
    this.a = paramWriter;
  }

  private void b(c1 paramc1)
    throws IOException
  {
    c(paramc1);
  }

  private void c(c1 paramc1)
    throws IOException
  {
    int i = 0;
    boolean bool = nz.b;
    this.a.write(60);
    this.a.write(paramc1.a);
    if (paramc1.b != null)
    {
      int j = 0;
      do
      {
        if (j >= paramc1.b.length)
          break;
        this.a.write(32);
        this.a.write(paramc1.b[j].a);
        this.a.write(z[5]);
        a(paramc1.b[j].b);
        this.a.write(39);
        j++;
      }
      while (!bool);
    }
    if ((paramc1.d == null) && (paramc1.c == null))
    {
      this.a.write(z[4]);
      if (!bool);
    }
    else
    {
      this.a.write(62);
      if (paramc1.d != null)
        a(paramc1.d);
      if (paramc1.c != null)
        do
        {
          if (i >= paramc1.c.length)
            break;
          b(paramc1.c[i]);
          i++;
        }
        while (!bool);
      this.a.write(z[6]);
      this.a.write(paramc1.a);
      this.a.write(62);
    }
  }

  public void a()
    throws IOException
  {
    try
    {
      this.a.write(z[0]);
      this.a.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(c1 paramc1)
    throws IOException
  {
    try
    {
      a(paramc1, true);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(c1 paramc1, boolean paramBoolean)
    throws IOException
  {
    if (paramc1 == null);
    try
    {
      this.a.write(32);
      if (nz.b)
        b(paramc1);
      if (paramBoolean)
        this.a.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(g1 paramg1)
  {
  }

  void a(String paramString)
    throws IOException
  {
    a(paramString.getBytes());
  }

  public void a(String paramString1, String paramString2)
    throws IOException
  {
    try
    {
      this.a.write(z[1]);
      this.a.write(paramString1);
      this.a.write(z[2]);
      this.a.write(paramString2);
      this.a.write(z[3]);
      this.a.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  void a(byte[] paramArrayOfByte)
    throws IOException
  {
    boolean bool = nz.b;
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    do
    {
      if (i >= paramArrayOfByte.length)
        break;
      if ((paramArrayOfByte[i] < 33) || (paramArrayOfByte[i] == 37) || (paramArrayOfByte[i] > 126))
      {
        localStringBuffer.append('%');
        String str = Integer.toHexString(0xFF & paramArrayOfByte[i]);
        if (str.length() == 1)
          localStringBuffer.append('0');
        localStringBuffer.append(str);
        if (!bool);
      }
      else
      {
        localStringBuffer.append((char)paramArrayOfByte[i]);
      }
      i++;
    }
    while (!bool);
    this.a.write(localStringBuffer.toString());
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j1
 * JD-Core Version:    0.6.1
 */