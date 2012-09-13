package com.whatsapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

public abstract class y0
{
  static String f = z(z("A\027Z_i\022Z"));
  private static final String[] z;
  i1 a;
  e1 b;
  f1 c;
  qz d;
  String e;

  static
  {
    String[] arrayOfString = new String[7];
    arrayOfString[0] = z(z("\025\031AHd\025"));
    arrayOfString[1] = z(z("n-`tIa,}M{=\016"));
    arrayOfString[2] = z(z("\003\033ZSbL\035\t\036"));
    arrayOfString[3] = z(z("\rTPUkJ\013@\021y]\021\t\036"));
    arrayOfString[4] = z(z("\rTAOi]\026UQi\022Z"));
    arrayOfString[5] = z(z("]\035GLcA\013Q\001"));
    arrayOfString[6] = z(z("F\026B]`F\034\024_`@\033_\034J\f@UbH"));
    z = arrayOfString;
  }

  public y0(i1 parami1, e1 parame1, f1 paramf1)
  {
    this.b = parame1;
    this.c = paramf1;
    this.a = parami1;
  }

  static byte a(int paramInt)
  {
    if (paramInt < 10);
    for (byte b1 = (byte)(paramInt + 48); ; b1 = (byte)(-10 + (paramInt + 97)))
      return b1;
  }

  public static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, i1 parami1)
    throws IOException
  {
    boolean bool = nz.b;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localByteArrayOutputStream.write(a((paramString4 + ":" + paramString5 + ":" + paramString7).getBytes(), parami1));
    localByteArrayOutputStream.write(58);
    localByteArrayOutputStream.write(paramString1.getBytes());
    localByteArrayOutputStream.write(58);
    localByteArrayOutputStream.write(paramString2.getBytes());
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    String str1 = z[1] + paramString6;
    String str2 = new String(b(a((new String(b(a(arrayOfByte, parami1))) + ":" + paramString1 + ":" + paramString3 + ":" + paramString2 + z[0] + new String(b(a(str1.getBytes(), parami1)))).getBytes(), parami1)));
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(z[5]);
    localStringBuffer.append(str2);
    localStringBuffer.append(z[2]);
    localStringBuffer.append(paramString2);
    localStringBuffer.append(z[4]);
    localStringBuffer.append(paramString4);
    localStringBuffer.append(z[3]);
    localStringBuffer.append(paramString6);
    localStringBuffer.append("\"");
    String str3 = localStringBuffer.toString();
    if (bool)
      App.wc = 1 + App.wc;
    return str3;
  }

  private static byte[] a(byte[] paramArrayOfByte, i1 parami1)
  {
    parami1.a();
    parami1.a(paramArrayOfByte);
    return parami1.b();
  }

  static byte[] b(byte[] paramArrayOfByte)
  {
    int i = 0;
    boolean bool = nz.b;
    byte[] arrayOfByte = new byte[2 * paramArrayOfByte.length];
    int j = 0;
    do
    {
      if (i >= paramArrayOfByte.length)
        break;
      int k = paramArrayOfByte[i];
      if (k < 0)
        k += 256;
      arrayOfByte[j] = a(k >> 4);
      int m = j + 1;
      arrayOfByte[m] = a(k % 16);
      j = m + 1;
      i++;
    }
    while (!bool);
    return arrayOfByte;
  }

  private byte[] d()
    throws IOException
  {
    long l = System.currentTimeMillis() / 1000L;
    if (l < 1000000000L);
    for (byte[] arrayOfByte = String.valueOf(l + 10000000000L).substring(1).getBytes(); ; arrayOfByte = Long.toString(l).getBytes())
    {
      return arrayOfByte;
      if (l >= 10000000000L)
        throw new IOException(z[6]);
    }
  }

  public static String e()
  {
    return Long.toString(Math.abs(new Random().nextLong()), 36);
  }

  private static String z(char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    int j = 0;
    if (i <= j)
      return new String(paramArrayOfChar).intern();
    int k = paramArrayOfChar[j];
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
      paramArrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 47;
      continue;
      m = 120;
      continue;
      m = 52;
      continue;
      m = 60;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0xC ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  public f1 a()
  {
    return this.c;
  }

  public void a(qz paramqz)
  {
    this.d = paramqz;
  }

  protected byte[] a(byte[] paramArrayOfByte)
    throws IOException
  {
    byte[] arrayOfByte1 = this.d.d.getBytes();
    byte[] arrayOfByte2 = d();
    if (this.e == null);
    for (byte[] arrayOfByte3 = new byte[0]; ; arrayOfByte3 = this.e.getBytes())
    {
      int i = paramArrayOfByte.length + arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length;
      byte[] arrayOfByte4 = new byte[i + 4];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte4, 4, arrayOfByte1.length);
      int j = 4 + arrayOfByte1.length;
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte4, j, paramArrayOfByte.length);
      int k = j + paramArrayOfByte.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte4, k, arrayOfByte2.length);
      int m = k + arrayOfByte2.length;
      if (arrayOfByte3.length > 0)
        System.arraycopy(arrayOfByte3, 0, arrayOfByte4, m, arrayOfByte3.length);
      this.d.h.a(arrayOfByte4, 4, i);
      System.arraycopy(this.d.h.a(), 0, arrayOfByte4, 0, 4);
      return arrayOfByte4;
    }
  }

  public e1 b()
  {
    return this.b;
  }

  abstract void c()
    throws IOException, cg, bg;
}