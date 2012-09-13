package com.whatsapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class a5
{
  private static a5 d;
  private static final String[] z;
  private Cipher a;
  private Cipher b;
  private boolean c = false;
  byte[] e = new byte[131072];

  static
  {
    String[] arrayOfString = new String[10];
    char[] arrayOfChar1 = "9m".toCharArray();
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
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    char[] arrayOfChar10;
    int i33;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\035T]Z?\bN[Zi\021THI*\021^UM?X".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "9i}a\017".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label557;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\035T]Z?\bN[Zi\rTM]6\bUL\\#\034_PK)\034SPOf".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label649;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\035T]Z?\bN[Zi\026UM]%\020[ROf".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label741;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\035T]Z?\bN[Zi\026UM]%\020J_L\"\021TY\b".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label833;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\034_]Z?\bNWG(XTQ\\f\031L_A*\031XRM".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label925;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\035T]Z?\bN[Zi\035T]\007/\027\032".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1017;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\035T]Z?\bNWG(XTQ\\f\031L_A*\031XRM".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1109;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\035T]Z?\bN[Zi\035T]\007)\rN\021A)X".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1201;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        z = arrayOfString;
        d = null;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 70;
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
        m = 120;
        continue;
        m = 58;
        continue;
        m = 62;
        continue;
        m = 40;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 70;
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
      i3 = 120;
      continue;
      i3 = 58;
      continue;
      i3 = 62;
      continue;
      i3 = 40;
    }
    label557: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 70;
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
      i7 = 120;
      continue;
      i7 = 58;
      continue;
      i7 = 62;
      continue;
      i7 = 40;
    }
    label649: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 70;
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
      i11 = 120;
      continue;
      i11 = 58;
      continue;
      i11 = 62;
      continue;
      i11 = 40;
    }
    label741: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 70;
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
      i15 = 120;
      continue;
      i15 = 58;
      continue;
      i15 = 62;
      continue;
      i15 = 40;
    }
    label833: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 70;
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
      i19 = 120;
      continue;
      i19 = 58;
      continue;
      i19 = 62;
      continue;
      i19 = 40;
    }
    label925: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 70;
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
      i23 = 120;
      continue;
      i23 = 58;
      continue;
      i23 = 62;
      continue;
      i23 = 40;
    }
    label1017: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 70;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 120;
      continue;
      i27 = 58;
      continue;
      i27 = 62;
      continue;
      i27 = 40;
    }
    label1109: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 70;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 120;
      continue;
      i31 = 58;
      continue;
      i31 = 62;
      continue;
      i31 = 40;
    }
    label1201: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 70;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 120;
      continue;
      i35 = 58;
      continue;
      i35 = 62;
      continue;
      i35 = 40;
    }
  }

  private a5()
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(f8.k.getBytes(z[2]), z[0]);
      this.a = Cipher.getInstance(z[0]);
      this.b = Cipher.getInstance(z[0]);
      this.a.init(1, localSecretKeySpec);
      this.b.init(2, localSecretKeySpec);
      this.c = true;
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        g5.c(z[3] + localUnsupportedEncodingException.toString());
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      while (true)
        g5.c(z[5] + localNoSuchPaddingException.toString());
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      while (true)
        g5.c(z[4] + localNoSuchAlgorithmException.toString());
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      while (true)
        g5.c(z[1] + localInvalidKeyException.toString());
    }
  }

  public static a5 a()
  {
    if (d == null)
      d = new a5();
    return d;
  }

  // ERROR //
  public void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    // Byte code:
    //   0: getstatic 127	com/whatsapp/g5:n	I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield 70	com/whatsapp/a5:c	Z
    //   8: ifeq +57 -> 65
    //   11: new 129	javax/crypto/CipherOutputStream
    //   14: dup
    //   15: aload_2
    //   16: aload_0
    //   17: getfield 93	com/whatsapp/a5:a	Ljavax/crypto/Cipher;
    //   20: invokespecial 132	javax/crypto/CipherOutputStream:<init>	(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   23: astore 4
    //   25: aload_1
    //   26: aload_0
    //   27: getfield 68	com/whatsapp/a5:e	[B
    //   30: invokevirtual 138	java/io/InputStream:read	([B)I
    //   33: istore 10
    //   35: iload 10
    //   37: iflt +19 -> 56
    //   40: aload 4
    //   42: aload_0
    //   43: getfield 68	com/whatsapp/a5:e	[B
    //   46: iconst_0
    //   47: iload 10
    //   49: invokevirtual 144	java/io/OutputStream:write	([BII)V
    //   52: iload_3
    //   53: ifeq -28 -> 25
    //   56: aload 4
    //   58: invokevirtual 147	java/io/OutputStream:close	()V
    //   61: iload_3
    //   62: ifeq +104 -> 166
    //   65: new 149	java/lang/IllegalStateException
    //   68: dup
    //   69: getstatic 53	com/whatsapp/a5:z	[Ljava/lang/String;
    //   72: bipush 8
    //   74: aaload
    //   75: invokespecial 151	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   78: athrow
    //   79: astore 5
    //   81: new 101	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   88: getstatic 53	com/whatsapp/a5:z	[Ljava/lang/String;
    //   91: bipush 7
    //   93: aaload
    //   94: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: aload 5
    //   99: invokevirtual 152	java/io/IOException:toString	()Ljava/lang/String;
    //   102: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokestatic 154	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   111: aload_2
    //   112: invokevirtual 147	java/io/OutputStream:close	()V
    //   115: goto -54 -> 61
    //   118: astore 8
    //   120: new 101	java/lang/StringBuilder
    //   123: dup
    //   124: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   127: getstatic 53	com/whatsapp/a5:z	[Ljava/lang/String;
    //   130: bipush 9
    //   132: aaload
    //   133: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: aload 8
    //   138: invokevirtual 152	java/io/IOException:toString	()Ljava/lang/String;
    //   141: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: astore 9
    //   149: aload 9
    //   151: invokestatic 154	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   154: goto -93 -> 61
    //   157: astore 6
    //   159: aload_2
    //   160: invokevirtual 147	java/io/OutputStream:close	()V
    //   163: aload 6
    //   165: athrow
    //   166: return
    //   167: astore 7
    //   169: new 101	java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   176: getstatic 53	com/whatsapp/a5:z	[Ljava/lang/String;
    //   179: bipush 9
    //   181: aaload
    //   182: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: aload 7
    //   187: invokevirtual 152	java/io/IOException:toString	()Ljava/lang/String;
    //   190: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   196: invokestatic 154	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   199: goto -36 -> 163
    //   202: astore 11
    //   204: new 101	java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial 102	java/lang/StringBuilder:<init>	()V
    //   211: getstatic 53	com/whatsapp/a5:z	[Ljava/lang/String;
    //   214: bipush 9
    //   216: aaload
    //   217: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: aload 11
    //   222: invokevirtual 152	java/io/IOException:toString	()Ljava/lang/String;
    //   225: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: astore 9
    //   233: goto -84 -> 149
    //   236: astore 6
    //   238: aload 4
    //   240: astore_2
    //   241: goto -82 -> 159
    //   244: astore 5
    //   246: aload 4
    //   248: astore_2
    //   249: goto -168 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   11	25	79	java/io/IOException
    //   111	115	118	java/io/IOException
    //   11	25	157	finally
    //   81	111	157	finally
    //   159	163	167	java/io/IOException
    //   56	61	202	java/io/IOException
    //   25	52	236	finally
    //   25	52	244	java/io/IOException
  }

  public void a(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, long paramLong, rq paramrq)
    throws IOException
  {
    int i = g5.n;
    if (!this.c)
      throw new IllegalStateException(z[6]);
    CipherInputStream localCipherInputStream = new CipherInputStream(paramInputStream, this.b);
    long l = 0L;
    do
    {
      do
      {
        int j = localCipherInputStream.read(this.e);
        if (j < 0)
          break;
        paramOutputStream.write(this.e, 0, j);
        l += j;
      }
      while ((paramrq == null) || (paramInt2 <= 0));
      paramrq.a(l, paramLong, paramInt1, paramInt2);
    }
    while (i == 0);
  }

  public boolean b()
  {
    return this.c;
  }
}