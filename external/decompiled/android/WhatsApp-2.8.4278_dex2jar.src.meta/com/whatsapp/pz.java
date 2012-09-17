package com.whatsapp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;

public class pz
  implements f1
{
  private static final String[] z;
  g1 a;
  int b;
  int c;
  Hashtable d;
  OutputStream e;
  kf f;
  int g;
  byte[][] h = (byte[][])null;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "]br\005Z]dd".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "[h".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "zSGG\027".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "Fiw\013CFc!\036@Dbo".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "mrg\fJ]'u\005@\017k`\030HJ=!".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label540;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 47;
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
        m = 47;
        continue;
        m = 7;
        continue;
        m = 1;
        continue;
        m = 106;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 47;
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
      i3 = 47;
      continue;
      i3 = 7;
      continue;
      i3 = 1;
      continue;
      i3 = 106;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 47;
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
      i7 = 47;
      continue;
      i7 = 7;
      continue;
      i7 = 1;
      continue;
      i7 = 106;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 47;
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
      i11 = 47;
      continue;
      i11 = 7;
      continue;
      i11 = 1;
      continue;
      i11 = 106;
    }
    label540: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 47;
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
      i15 = 47;
      continue;
      i15 = 7;
      continue;
      i15 = 1;
      continue;
      i15 = 106;
    }
  }

  public pz(OutputStream paramOutputStream, String[] paramArrayOfString)
  {
    this.e = paramOutputStream;
    this.f = new kf();
    b();
    this.d = new Hashtable(1 + 4 * paramArrayOfString.length / 3);
    int i = 0;
    while (true)
    {
      if (i < paramArrayOfString.length)
        if (paramArrayOfString[i] != null)
          break label80;
      while (true)
      {
        i++;
        if (!bool)
          break;
        return;
        label80: this.d.put(paramArrayOfString[i], new Integer(i));
      }
    }
  }

  private void a(int paramInt)
    throws IOException
  {
    if (paramInt < 245)
    {
      this.f.write((byte)paramInt);
      if (!nz.b);
    }
    else if (paramInt <= 500)
    {
      throw new IOException(z[3]);
    }
  }

  private static void a(OutputStream paramOutputStream, int paramInt)
    throws IOException
  {
    paramOutputStream.write((0xFF00 & paramInt) >> 8);
    paramOutputStream.write((paramInt & 0xFF) >> 0);
  }

  private void a(String paramString)
    throws IOException
  {
    boolean bool = nz.b;
    try
    {
      Integer localInteger = (Integer)this.d.get(paramString);
      if (localInteger != null)
      {
        a(localInteger.intValue());
        if (!bool);
      }
      else
      {
        int i = paramString.indexOf('@');
        if (i < 1)
        {
          a(paramString.getBytes(z[2]));
          if (!bool);
        }
        else
        {
          String str = paramString.substring(i + 1);
          b(paramString.substring(0, i), str);
        }
      }
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new RuntimeException(localUnsupportedEncodingException.getMessage());
    }
  }

  private void a(boolean paramBoolean)
    throws IOException
  {
    try
    {
      if (this.a != null)
      {
        bool = true;
        a(paramBoolean, bool);
        return;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
    throws IOException
  {
    int i = 0;
    while (true)
    {
      int j;
      try
      {
        this.g = (1 + this.g);
        if (this.h != null)
          e();
        j = this.f.a() - (this.b + this.c);
        if (!paramBoolean2)
          break label225;
        k = j + 4;
        if ((0xFFFFF & k) != k)
          throw new IOException(z[4] + k);
      }
      finally
      {
      }
      if (paramBoolean2)
      {
        this.a.a(this.f.b(), this.b + this.c, j);
        byte[] arrayOfByte2 = this.a.a();
        this.f.write(arrayOfByte2, 0, 4);
      }
      byte[] arrayOfByte1 = this.f.b();
      if (paramBoolean2)
        i = 1;
      if (this.h != null)
      {
        a(arrayOfByte1, -2 + (this.b + this.c));
        k += 2;
        i |= 2;
      }
      rz.a(arrayOfByte1, this.b, i, k);
      if (paramBoolean1)
        d();
      return;
      label225: int k = j;
    }
  }

  private void a(byte[] paramArrayOfByte)
    throws IOException
  {
    int i = paramArrayOfByte.length;
    if (i >= 256)
    {
      this.f.write(253);
      d(i);
      if (!nz.b);
    }
    else
    {
      this.f.write(252);
      b(i);
    }
    this.f.write(paramArrayOfByte);
  }

  private void a(w0[] paramArrayOfw0)
    throws IOException
  {
    boolean bool = nz.b;
    if (paramArrayOfw0 != null)
    {
      int i = 0;
      do
      {
        if (i >= paramArrayOfw0.length)
          break;
        a(paramArrayOfw0[i].a);
        a(paramArrayOfw0[i].b);
        i++;
      }
      while (!bool);
    }
  }

  private void b()
  {
    int i = 0;
    try
    {
      boolean bool = nz.b;
      this.b = this.f.a();
      if (this.h != null)
      {
        j = 2;
        this.c = (j + 3);
        do
        {
          if (i >= this.c)
            break;
          this.f.write(0);
          i++;
        }
        while (!bool);
        return;
      }
      int j = 0;
    }
    finally
    {
    }
  }

  private void b(int paramInt)
    throws IOException
  {
    this.f.write(paramInt & 0xFF);
  }

  private void b(c1 paramc1)
    throws IOException
  {
    int i = 1;
    int j = 0;
    boolean bool = nz.b;
    int k;
    int m;
    if (paramc1.b == null)
    {
      k = 0;
      m = k + 1;
      if (paramc1.c != null)
        break label146;
    }
    label146: for (int n = 0; ; n = i)
    {
      int i1 = n + m;
      if (paramc1.d == null)
        i = 0;
      e(i1 + i);
      a(paramc1.a);
      a(paramc1.b);
      if (paramc1.d != null)
        a(paramc1.d);
      if (paramc1.c != null)
      {
        e(paramc1.c.length);
        do
        {
          if (j >= paramc1.c.length)
            break;
          b(paramc1.c[j]);
          j++;
        }
        while (!bool);
      }
      return;
      k = 2 * paramc1.b.length;
      break;
    }
  }

  private static void b(OutputStream paramOutputStream, int paramInt)
    throws IOException
  {
    paramOutputStream.write((0xF0000 & paramInt) >> 16);
    paramOutputStream.write((0xFF00 & paramInt) >> 8);
    paramOutputStream.write((paramInt & 0xFF) >> 0);
  }

  private void b(String paramString1, String paramString2)
    throws IOException
  {
    this.f.write(250);
    if (paramString1 != null)
    {
      a(paramString1);
      if (!nz.b);
    }
    else
    {
      a(0);
    }
    a(paramString2);
  }

  private void c()
  {
    try
    {
      this.f.reset();
      this.c = 0;
      this.b = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void c(int paramInt)
    throws IOException
  {
    a(this.f, paramInt);
  }

  private void d()
    throws IOException
  {
    try
    {
      this.e.write(this.f.b(), 0, this.f.a());
      this.e.flush();
      c();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void d(int paramInt)
    throws IOException
  {
    b(this.f, paramInt);
  }

  private void e()
    throws IOException
  {
    int i = this.f.a() - (this.b + this.c);
    int j = this.g % this.h.length;
    byte[] arrayOfByte = new byte[i + 5];
    rz.a(arrayOfByte, 0, 2, i + 2);
    a(arrayOfByte, 3);
    System.arraycopy(this.f.b(), this.b + this.c, arrayOfByte, 5, i);
    this.h[j] = arrayOfByte;
  }

  private void e(int paramInt)
    throws IOException
  {
    boolean bool = nz.b;
    if (paramInt == 0)
    {
      this.f.write(0);
      if (!bool);
    }
    else if (paramInt < 256)
    {
      this.f.write(248);
      b(paramInt);
      if (!bool);
    }
    else
    {
      this.f.write(249);
      c(paramInt);
    }
  }

  public void a()
    throws IOException
  {
    try
    {
      b();
      e(1);
      this.f.write(2);
      a(true);
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
    try
    {
      b();
      if (paramc1 == null)
      {
        a(paramBoolean, false);
        if (!nz.b);
      }
      else
      {
        b(paramc1);
        a(paramBoolean);
      }
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
    try
    {
      this.a = paramg1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(String paramString1, String paramString2)
    throws IOException
  {
    try
    {
      c();
      byte[] arrayOfByte = new byte[4];
      arrayOfByte[0] = 87;
      arrayOfByte[1] = 65;
      arrayOfByte[2] = 1;
      arrayOfByte[3] = 2;
      this.f.write(arrayOfByte);
      b();
      w0[] arrayOfw0 = new w0[2];
      arrayOfw0[0] = new w0(z[1], paramString1);
      arrayOfw0[1] = new w0(z[0], paramString2);
      e(1 + 2 * arrayOfw0.length);
      this.f.write(1);
      a(arrayOfw0);
      a(false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte[paramInt] = (byte)((0xFF00 & this.g) >> 8);
    paramArrayOfByte[(paramInt + 1)] = (byte)((0xFF & this.g) >> 0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pz
 * JD-Core Version:    0.6.1
 */