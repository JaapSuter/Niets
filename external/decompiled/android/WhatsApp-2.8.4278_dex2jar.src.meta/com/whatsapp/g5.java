package com.whatsapp;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class g5
{
  private static final int a;
  private static final SimpleDateFormat b;
  private static final int c;
  private static File d;
  private static File e;
  private static File f;
  private static int g;
  private static int h;
  private static boolean i;
  private static FileChannel j;
  private static Object k;
  private static Object l;
  private static Object m;
  public static int n;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[24];
    char[] arrayOfChar1 = "'<&".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    char[] arrayOfChar5;
    int i18;
    char[] arrayOfChar6;
    int i22;
    char[] arrayOfChar7;
    int i26;
    char[] arrayOfChar8;
    int i30;
    char[] arrayOfChar9;
    int i34;
    char[] arrayOfChar10;
    int i38;
    char[] arrayOfChar11;
    int i42;
    char[] arrayOfChar12;
    int i46;
    char[] arrayOfChar13;
    int i50;
    char[] arrayOfChar14;
    int i54;
    char[] arrayOfChar15;
    int i58;
    char[] arrayOfChar16;
    int i62;
    char[] arrayOfChar17;
    int i66;
    char[] arrayOfChar18;
    int i70;
    char[] arrayOfChar19;
    int i74;
    char[] arrayOfChar20;
    int i78;
    char[] arrayOfChar21;
    int i82;
    char[] arrayOfChar22;
    int i86;
    char[] arrayOfChar23;
    int i90;
    char[] arrayOfChar24;
    int i94;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "4<&".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "8<&".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label1181;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "&ng\00300vv".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label1273;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "^at\007\034\020er\036,\037<".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label1365;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "^r\007&K".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label1457;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\027ku\020l\002rg\0036\002<".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1549;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "^tk\003n\002teM".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1641;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "_((".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1733;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "R%%W&\037b&\0047\020emW7\003ge\022".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1825;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "R%%W!\024ao\031c\002rg\024(Qrt\026 \024&".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label1917;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "8IC\017 \024vr\036,\037&i\031c".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label2009;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "0<&".toCharArray();
        int i49 = arrayOfChar13.length;
        i50 = 0;
        if (i49 > i50)
          break label2101;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "0uu\0221\005oi\031c7go\033&\025".toCharArray();
        int i53 = arrayOfChar14.length;
        i54 = 0;
        if (i53 > i54)
          break label2193;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "&<&".toCharArray();
        int i57 = arrayOfChar15.length;
        i58 = 0;
        if (i57 > i58)
          break label2285;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "Qr|J".toCharArray();
        int i61 = arrayOfChar16.length;
        i62 = 0;
        if (i61 > i62)
          break label2377;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\006ng\0030\020vvY7\034v".toCharArray();
        int i65 = arrayOfChar17.length;
        i66 = 0;
        if (i65 > i66)
          break label2469;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "=ia\004".toCharArray();
        int i69 = arrayOfChar18.length;
        i70 = 0;
        if (i69 > i70)
          break label2561;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "Q;;J~".toCharArray();
        int i73 = arrayOfChar19.length;
        i74 = 0;
        if (i73 > i74)
          break label2653;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "L;;Jc\035ia\021*\035c&\033&\007cjJ".toCharArray();
        int i77 = arrayOfChar20.length;
        i78 = 0;
        if (i77 > i78)
          break label2745;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "\006ng\0030\020vvY/\036a".toCharArray();
        int i81 = arrayOfChar21.length;
        i82 = 0;
        if (i81 > i82)
          break label2837;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "Qjc\001&\035;".toCharArray();
        int i85 = arrayOfChar22.length;
        i86 = 0;
        if (i85 > i86)
          break label2929;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        arrayOfChar23 = "L;;Jc\035ia\021*\035c&\001&\003uo\030-L".toCharArray();
        int i89 = arrayOfChar23.length;
        i90 = 0;
        if (i89 > i90)
          break label3021;
        arrayOfString[22] = new String(arrayOfChar23).intern();
        arrayOfChar24 = "\b\016n<K+\023'QNNM.\034<u\004m\"UUW".toCharArray();
        int i93 = arrayOfChar24.length;
        i94 = 0;
        if (i93 > i94)
          break label3113;
        arrayOfString[23] = new String(arrayOfChar24).intern();
        z = arrayOfString;
        a = "\n".length();
        b = new SimpleDateFormat(z[23], Locale.US);
        c = b.toPattern().length();
        d = null;
        e = null;
        f = null;
        g = 5;
        h = 0;
        i = false;
        j = null;
        k = new Object();
        l = new Object();
        m = new Object();
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 67;
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
        i4 = 113;
        continue;
        i4 = 6;
        continue;
        i4 = 6;
        continue;
        i4 = 119;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 67;
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
      i8 = 113;
      continue;
      i8 = 6;
      continue;
      i8 = 6;
      continue;
      i8 = 119;
    }
    label1181: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 113;
      continue;
      i12 = 6;
      continue;
      i12 = 6;
      continue;
      i12 = 119;
    }
    label1273: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 113;
      continue;
      i16 = 6;
      continue;
      i16 = 6;
      continue;
      i16 = 119;
    }
    label1365: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 113;
      continue;
      i20 = 6;
      continue;
      i20 = 6;
      continue;
      i20 = 119;
    }
    label1457: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 113;
      continue;
      i24 = 6;
      continue;
      i24 = 6;
      continue;
      i24 = 119;
    }
    label1549: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 113;
      continue;
      i28 = 6;
      continue;
      i28 = 6;
      continue;
      i28 = 119;
    }
    label1641: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 113;
      continue;
      i32 = 6;
      continue;
      i32 = 6;
      continue;
      i32 = 119;
    }
    label1733: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 113;
      continue;
      i36 = 6;
      continue;
      i36 = 6;
      continue;
      i36 = 119;
    }
    label1825: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 113;
      continue;
      i40 = 6;
      continue;
      i40 = 6;
      continue;
      i40 = 119;
    }
    label1917: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i42] = (char)(i44 ^ i43);
      i42++;
      break;
      i44 = 113;
      continue;
      i44 = 6;
      continue;
      i44 = 6;
      continue;
      i44 = 119;
    }
    label2009: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i46] = (char)(i48 ^ i47);
      i46++;
      break;
      i48 = 113;
      continue;
      i48 = 6;
      continue;
      i48 = 6;
      continue;
      i48 = 119;
    }
    label2101: int i51 = arrayOfChar13[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i50] = (char)(i52 ^ i51);
      i50++;
      break;
      i52 = 113;
      continue;
      i52 = 6;
      continue;
      i52 = 6;
      continue;
      i52 = 119;
    }
    label2193: int i55 = arrayOfChar14[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i54] = (char)(i56 ^ i55);
      i54++;
      break;
      i56 = 113;
      continue;
      i56 = 6;
      continue;
      i56 = 6;
      continue;
      i56 = 119;
    }
    label2285: int i59 = arrayOfChar15[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i58] = (char)(i60 ^ i59);
      i58++;
      break;
      i60 = 113;
      continue;
      i60 = 6;
      continue;
      i60 = 6;
      continue;
      i60 = 119;
    }
    label2377: int i63 = arrayOfChar16[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i62] = (char)(i64 ^ i63);
      i62++;
      break;
      i64 = 113;
      continue;
      i64 = 6;
      continue;
      i64 = 6;
      continue;
      i64 = 119;
    }
    label2469: int i67 = arrayOfChar17[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i66] = (char)(i68 ^ i67);
      i66++;
      break;
      i68 = 113;
      continue;
      i68 = 6;
      continue;
      i68 = 6;
      continue;
      i68 = 119;
    }
    label2561: int i71 = arrayOfChar18[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i70] = (char)(i72 ^ i71);
      i70++;
      break;
      i72 = 113;
      continue;
      i72 = 6;
      continue;
      i72 = 6;
      continue;
      i72 = 119;
    }
    label2653: int i75 = arrayOfChar19[i74];
    int i76;
    switch (i74 % 5)
    {
    default:
      i76 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i74] = (char)(i76 ^ i75);
      i74++;
      break;
      i76 = 113;
      continue;
      i76 = 6;
      continue;
      i76 = 6;
      continue;
      i76 = 119;
    }
    label2745: int i79 = arrayOfChar20[i78];
    int i80;
    switch (i78 % 5)
    {
    default:
      i80 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i78] = (char)(i80 ^ i79);
      i78++;
      break;
      i80 = 113;
      continue;
      i80 = 6;
      continue;
      i80 = 6;
      continue;
      i80 = 119;
    }
    label2837: int i83 = arrayOfChar21[i82];
    int i84;
    switch (i82 % 5)
    {
    default:
      i84 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i82] = (char)(i84 ^ i83);
      i82++;
      break;
      i84 = 113;
      continue;
      i84 = 6;
      continue;
      i84 = 6;
      continue;
      i84 = 119;
    }
    label2929: int i87 = arrayOfChar22[i86];
    int i88;
    switch (i86 % 5)
    {
    default:
      i88 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i86] = (char)(i88 ^ i87);
      i86++;
      break;
      i88 = 113;
      continue;
      i88 = 6;
      continue;
      i88 = 6;
      continue;
      i88 = 119;
    }
    label3021: int i91 = arrayOfChar23[i90];
    int i92;
    switch (i90 % 5)
    {
    default:
      i92 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar23[i90] = (char)(i92 ^ i91);
      i90++;
      break;
      i92 = 113;
      continue;
      i92 = 6;
      continue;
      i92 = 6;
      continue;
      i92 = 119;
    }
    label3113: int i95 = arrayOfChar24[i94];
    int i96;
    switch (i94 % 5)
    {
    default:
      i96 = 67;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar24[i94] = (char)(i96 ^ i95);
      i94++;
      break;
      i96 = 113;
      continue;
      i96 = 6;
      continue;
      i96 = 6;
      continue;
      i96 = 119;
    }
  }

  public static String a(sz paramsz)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(z[6]).append(paramsz.a).append(z[5]).append(paramsz.l);
    if (paramsz.b.a.contains("-"))
      localStringBuffer.append(z[4]).append(paramsz.m);
    localStringBuffer.append(z[7]).append(paramsz.c).append(" ").append(paramsz.b.toString());
    return localStringBuffer.toString();
  }

  private static String a(String paramString1, String paramString2)
  {
    return a(a(paramString1, new StringBuilder(paramString2))).toString();
  }

  private static String a(String paramString1, String paramString2, String paramString3)
  {
    return a(a(paramString1, new StringBuilder(paramString2.length() + a + paramString3.length()).append(paramString2).append("\n").append(paramString3))).toString();
  }

  private static String a(Throwable paramThrowable)
  {
    if (paramThrowable == null);
    StringWriter localStringWriter;
    for (String str = ""; ; str = localStringWriter.toString())
    {
      return str;
      localStringWriter = new StringWriter();
      PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
      if (App.j != null)
        localPrintWriter.println(z[10].concat(App.j));
      paramThrowable.printStackTrace(localPrintWriter);
      localPrintWriter.println(z[9]);
    }
  }

  private static StringBuilder a(String paramString, StringBuilder paramStringBuilder)
  {
    if (g < 5);
    String str1;
    String str2;
    String str3;
    for (StringBuilder localStringBuilder = paramStringBuilder.insert(0, paramString); ; localStringBuilder = new StringBuilder(1 + (1 + (2 + paramString.length() + str3.length() + str1.length()) + str2.length()) + paramStringBuilder.length()).append(paramString).append("[").append(str3).append("]").append(str1).append(":").append(str2).append(" ").append(paramStringBuilder))
    {
      return localStringBuilder;
      str1 = Thread.currentThread().getStackTrace()[5].getFileName();
      str2 = Integer.toString(Thread.currentThread().getStackTrace()[5].getLineNumber());
      str3 = String.valueOf(Thread.currentThread().getId());
    }
  }

  // ERROR //
  private static StringBuilder a(StringBuilder paramStringBuilder)
  {
    // Byte code:
    //   0: invokestatic 284	com/whatsapp/g5:a	()Z
    //   3: ifeq +172 -> 175
    //   6: getstatic 113	com/whatsapp/g5:b	Ljava/text/SimpleDateFormat;
    //   9: new 286	java/util/Date
    //   12: dup
    //   13: invokespecial 287	java/util/Date:<init>	()V
    //   16: invokevirtual 291	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   19: astore_1
    //   20: new 188	java/lang/StringBuilder
    //   23: dup
    //   24: getstatic 118	com/whatsapp/g5:c	I
    //   27: aload_0
    //   28: invokevirtual 270	java/lang/StringBuilder:length	()I
    //   31: iadd
    //   32: getstatic 100	com/whatsapp/g5:a	I
    //   35: iadd
    //   36: invokespecial 202	java/lang/StringBuilder:<init>	(I)V
    //   39: aload_1
    //   40: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_0
    //   44: invokevirtual 279	java/lang/StringBuilder:append	(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //   47: ldc 94
    //   49: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokevirtual 295	java/lang/String:getBytes	()[B
    //   58: invokestatic 301	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   61: astore_2
    //   62: getstatic 136	com/whatsapp/g5:k	Ljava/lang/Object;
    //   65: astore 5
    //   67: aload 5
    //   69: monitorenter
    //   70: aconst_null
    //   71: astore 6
    //   73: getstatic 132	com/whatsapp/g5:j	Ljava/nio/channels/FileChannel;
    //   76: invokevirtual 307	java/nio/channels/FileChannel:lock	()Ljava/nio/channels/FileLock;
    //   79: astore 6
    //   81: getstatic 132	com/whatsapp/g5:j	Ljava/nio/channels/FileChannel;
    //   84: getstatic 132	com/whatsapp/g5:j	Ljava/nio/channels/FileChannel;
    //   87: invokevirtual 310	java/nio/channels/FileChannel:size	()J
    //   90: invokevirtual 314	java/nio/channels/FileChannel:position	(J)Ljava/nio/channels/FileChannel;
    //   93: pop
    //   94: getstatic 132	com/whatsapp/g5:j	Ljava/nio/channels/FileChannel;
    //   97: aload_2
    //   98: invokevirtual 318	java/nio/channels/FileChannel:write	(Ljava/nio/ByteBuffer;)I
    //   101: pop
    //   102: aload 6
    //   104: ifnull +8 -> 112
    //   107: aload 6
    //   109: invokevirtual 323	java/nio/channels/FileLock:release	()V
    //   112: aload 5
    //   114: monitorexit
    //   115: goto +60 -> 175
    //   118: astore 7
    //   120: aload 6
    //   122: ifnull +8 -> 130
    //   125: aload 6
    //   127: invokevirtual 323	java/nio/channels/FileLock:release	()V
    //   130: aload 7
    //   132: athrow
    //   133: astore 8
    //   135: aload 5
    //   137: monitorexit
    //   138: aload 8
    //   140: athrow
    //   141: astore_3
    //   142: getstatic 92	com/whatsapp/g5:z	[Ljava/lang/String;
    //   145: iconst_3
    //   146: aaload
    //   147: new 188	java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial 324	java/lang/StringBuilder:<init>	()V
    //   154: getstatic 92	com/whatsapp/g5:z	[Ljava/lang/String;
    //   157: bipush 11
    //   159: aaload
    //   160: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: aload_0
    //   164: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   167: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: aload_3
    //   171: invokestatic 332	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   174: pop
    //   175: aload_0
    //   176: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   73	102	118	finally
    //   107	138	133	finally
    //   62	70	141	java/io/IOException
    //   138	141	141	java/io/IOException
  }

  public static void a(int paramInt)
  {
    g = paramInt;
    a(z[2], z[22] + App.j + z[21] + g + z[15] + h + z[18]);
  }

  private static void a(int paramInt, String paramString)
  {
    int i1 = n;
    do
    {
      if (paramString.length() <= 4000)
        break;
      String str = paramString.substring(0, 3997);
      paramString = z[8] + paramString.substring(3997);
      b(paramInt, str + z[8]);
    }
    while (i1 == 0);
    b(paramInt, paramString);
  }

  public static void a(String paramString)
  {
    if (g >= 5)
      a(5, a(z[0], paramString));
  }

  public static void a(String paramString, Throwable paramThrowable)
  {
    if (g == 5)
    {
      a(2, a(z[14], paramString, a(paramThrowable)));
      if (n == 0);
    }
    else if (g >= 2)
    {
      a(z[14], paramString, a(paramThrowable));
    }
  }

  private static boolean a()
  {
    boolean bool = true;
    if ((!i) || (j == null) || (!j.isOpen()))
    {
      synchronized (k)
      {
        if ((i) && (j != null) && (j.isOpen()))
          break label317;
        if (App.Mb == null)
        {
          bool = false;
          break label317;
        }
        d = new File(App.Mb.getFilesDir(), z[17]);
        if (!d.exists())
        {
          d.mkdirs();
          if (!d.exists())
          {
            bool = false;
            break label317;
          }
        }
        e = new File(d, z[20]);
        f = new File(d, z[16]);
      }
      try
      {
        j = new FileOutputStream(e, true).getChannel();
        System.setErr(new PrintStream(new qf(System.err, Channels.newOutputStream(j)), true));
        i = true;
        Calendar localCalendar = Calendar.getInstance();
        h = (localCalendar.get(15) + localCalendar.get(16)) / 60000;
        a(z[2], z[19] + g + z[15] + h + z[18]);
        break label317;
        localObject2 = finally;
        throw localObject2;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        bool = false;
      }
      catch (IOException localIOException)
      {
        bool = false;
      }
    }
    label317: return bool;
  }

  static String b(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2);
  }

  public static ArrayList<File> b(int paramInt)
  {
    return h5.a(e, paramInt);
  }

  private static void b(int paramInt, String paramString)
  {
    int i1 = n;
    if ((paramInt == 0) || (paramInt == 5))
    {
      Log.v(z[3], paramString);
      if (i1 == 0);
    }
    else if (paramInt == 4)
    {
      Log.d(z[3], paramString);
      if (i1 == 0);
    }
    else if (paramInt == 3)
    {
      Log.i(z[3], paramString);
      if (i1 == 0);
    }
    else if (paramInt == 2)
    {
      Log.w(z[3], paramString);
      if (i1 == 0);
    }
    else if (paramInt == 1)
    {
      Log.e(z[3], paramString);
    }
  }

  public static void b(String paramString)
  {
    if (g == 5)
    {
      a(3, a(z[2], paramString));
      if (n == 0);
    }
    else if (g >= 3)
    {
      a(z[2], paramString);
    }
  }

  public static void b(String paramString, Throwable paramThrowable)
  {
    if (g == 5)
    {
      a(1, a(z[1], paramString, a(paramThrowable)));
      if (n == 0);
    }
    else if (g >= 1)
    {
      a(z[1], paramString, a(paramThrowable));
    }
  }

  public static void b(Throwable paramThrowable)
  {
    if (g == 5)
    {
      a(3, a(z[2], a(paramThrowable)));
      if (n == 0);
    }
    else if (g >= 3)
    {
      a(z[2], a(paramThrowable));
    }
  }

  public static void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      a(z[12], z[13]);
  }

  // ERROR //
  public static boolean b()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: invokestatic 284	com/whatsapp/g5:a	()Z
    //   5: ifeq +68 -> 73
    //   8: getstatic 136	com/whatsapp/g5:k	Ljava/lang/Object;
    //   11: astore_1
    //   12: aload_1
    //   13: monitorenter
    //   14: getstatic 132	com/whatsapp/g5:j	Ljava/nio/channels/FileChannel;
    //   17: invokevirtual 449	java/nio/channels/FileChannel:close	()V
    //   20: getstatic 138	com/whatsapp/g5:l	Ljava/lang/Object;
    //   23: astore 4
    //   25: aload 4
    //   27: monitorenter
    //   28: getstatic 122	com/whatsapp/g5:e	Ljava/io/File;
    //   31: getstatic 124	com/whatsapp/g5:f	Ljava/io/File;
    //   34: invokestatic 452	com/whatsapp/h5:a	(Ljava/io/File;Ljava/io/File;)Z
    //   37: istore_0
    //   38: aload 4
    //   40: monitorexit
    //   41: iconst_0
    //   42: putstatic 130	com/whatsapp/g5:i	Z
    //   45: invokestatic 284	com/whatsapp/g5:a	()Z
    //   48: pop
    //   49: aload_1
    //   50: monitorexit
    //   51: goto +22 -> 73
    //   54: astore_3
    //   55: aload_1
    //   56: monitorexit
    //   57: goto +16 -> 73
    //   60: astore_2
    //   61: aload_1
    //   62: monitorexit
    //   63: aload_2
    //   64: athrow
    //   65: astore 5
    //   67: aload 4
    //   69: monitorexit
    //   70: aload 5
    //   72: athrow
    //   73: iload_0
    //   74: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   14	20	54	java/io/IOException
    //   14	20	60	finally
    //   20	28	60	finally
    //   41	63	60	finally
    //   70	73	60	finally
    //   28	41	65	finally
    //   67	70	65	finally
  }

  // ERROR //
  public static File c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: invokestatic 284	com/whatsapp/g5:a	()Z
    //   5: ifeq +44 -> 49
    //   8: getstatic 140	com/whatsapp/g5:m	Ljava/lang/Object;
    //   11: astore_1
    //   12: aload_1
    //   13: monitorenter
    //   14: getstatic 138	com/whatsapp/g5:l	Ljava/lang/Object;
    //   17: astore_3
    //   18: aload_3
    //   19: monitorenter
    //   20: getstatic 122	com/whatsapp/g5:e	Ljava/io/File;
    //   23: getstatic 124	com/whatsapp/g5:f	Ljava/io/File;
    //   26: invokestatic 457	com/whatsapp/h5:b	(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    //   29: astore 10
    //   31: aload 10
    //   33: astore 6
    //   35: getstatic 124	com/whatsapp/g5:f	Ljava/io/File;
    //   38: invokevirtual 460	java/io/File:delete	()Z
    //   41: pop
    //   42: aload 6
    //   44: astore_0
    //   45: aload_3
    //   46: monitorexit
    //   47: aload_1
    //   48: monitorexit
    //   49: aload_0
    //   50: areturn
    //   51: astore 8
    //   53: aconst_null
    //   54: astore 6
    //   56: aload 8
    //   58: astore 9
    //   60: aload 9
    //   62: invokestatic 462	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   65: aload 6
    //   67: astore_0
    //   68: goto -23 -> 45
    //   71: aload 7
    //   73: invokestatic 462	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   76: aload 6
    //   78: astore_0
    //   79: goto -34 -> 45
    //   82: astore 4
    //   84: aload_3
    //   85: monitorexit
    //   86: aload 4
    //   88: athrow
    //   89: astore_2
    //   90: aload_1
    //   91: monitorexit
    //   92: aload_2
    //   93: athrow
    //   94: astore 7
    //   96: goto -25 -> 71
    //   99: astore 9
    //   101: goto -41 -> 60
    //   104: astore 5
    //   106: aconst_null
    //   107: astore 6
    //   109: aload 5
    //   111: astore 7
    //   113: goto -42 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   20	31	51	java/io/IOException
    //   20	31	82	finally
    //   35	42	82	finally
    //   45	47	82	finally
    //   60	86	82	finally
    //   14	20	89	finally
    //   47	49	89	finally
    //   86	92	89	finally
    //   35	42	94	java/lang/SecurityException
    //   35	42	99	java/io/IOException
    //   20	31	104	java/lang/SecurityException
  }

  static void c(int paramInt, String paramString)
  {
    a(paramInt, paramString);
  }

  public static void c(String paramString)
  {
    if (g == 5)
    {
      a(2, a(z[14], paramString));
      if (n == 0);
    }
    else if (g >= 2)
    {
      a(z[14], paramString);
    }
  }

  public static void c(Throwable paramThrowable)
  {
    if (g == 5)
    {
      a(2, a(z[14], a(paramThrowable)));
      if (n == 0);
    }
    else if (g >= 2)
    {
      a(z[14], a(paramThrowable));
    }
  }

  public static void d()
  {
    h5.b(e, 3);
  }

  public static void d(String paramString)
  {
    if (g == 5)
    {
      a(1, a(z[1], paramString));
      if (n == 0);
    }
    else if (g >= 1)
    {
      a(z[1], paramString);
    }
  }

  public static void d(Throwable paramThrowable)
  {
    if (g == 5)
    {
      a(1, a(z[1], a(paramThrowable)));
      if (n == 0);
    }
    else if (g >= 1)
    {
      a(z[1], a(paramThrowable));
    }
  }

  public static File e()
    throws IOException
  {
    return h5.a(e);
  }

  static int f()
  {
    return g;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.g5
 * JD-Core Version:    0.6.1
 */