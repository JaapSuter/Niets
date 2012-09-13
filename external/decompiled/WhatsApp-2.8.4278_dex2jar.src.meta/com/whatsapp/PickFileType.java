package com.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import g;

public class PickFileType extends DialogToastActivity
{
  private static final String[] z;
  String f;
  g g;
  String h;
  String i;

  static
  {
    String[] arrayOfString = new String[19];
    char[] arrayOfChar1 = "\r1\\ 9\0244Z?&\r=\020\"2\034?Zd<\0345Z9>R7P&r\030*M$-]".toCharArray();
    int j = arrayOfChar1.length;
    int k = 0;
    char[] arrayOfChar2;
    int i2;
    char[] arrayOfChar3;
    int i6;
    char[] arrayOfChar4;
    int i10;
    char[] arrayOfChar5;
    int i14;
    char[] arrayOfChar6;
    int i18;
    char[] arrayOfChar7;
    int i22;
    char[] arrayOfChar8;
    int i26;
    char[] arrayOfChar9;
    int i30;
    char[] arrayOfChar10;
    int i34;
    char[] arrayOfChar11;
    int i38;
    char[] arrayOfChar12;
    int i42;
    char[] arrayOfChar13;
    int i46;
    char[] arrayOfChar14;
    int i50;
    char[] arrayOfChar15;
    int i54;
    char[] arrayOfChar16;
    int i58;
    char[] arrayOfChar17;
    int i62;
    char[] arrayOfChar18;
    int i66;
    char[] arrayOfChar19;
    int i70;
    if (j <= k)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\0271[".toCharArray();
      int i1 = arrayOfChar2.length;
      i2 = 0;
      if (i1 <= i2)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\r1\\ 9\0244Z?&\r=\020\"2\034?Zd0\0225\022.-\0177Mk".toCharArray();
        int i5 = arrayOfChar3.length;
        i6 = 0;
        if (i5 > i6)
          break label897;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\0237Kf>P1R*8\030".toCharArray();
        int i9 = arrayOfChar4.length;
        i10 = 0;
        if (i9 > i10)
          break label989;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\030<V?��\0367Q?>\036,`\"1\0337".toCharArray();
        int i13 = arrayOfChar5.length;
        i14 = 0;
        if (i13 > i14)
          break label1081;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\r1\\ 9\0244Z?&\r=\020=6\031=Pd6\023,Z%+]<^?>]1Lk1\b4S".toCharArray();
        int i17 = arrayOfChar6.length;
        i18 = 0;
        if (i17 > i18)
          break label1173;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\r1\\ 9\0244Z?&\r=\020(0\023,^(+R;J9,\022*\037.2\r,F".toCharArray();
        int i21 = arrayOfChar7.length;
        i22 = 0;
        if (i21 > i22)
          break label1265;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\0311L;3\034!`%>\020=".toCharArray();
        int i25 = arrayOfChar8.length;
        i26 = 0;
        if (i25 > i26)
          break label1357;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\"1[".toCharArray();
        int i29 = arrayOfChar9.length;
        i30 = 0;
        if (i29 > i30)
          break label1449;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\r1\\ 9\0244Z?&\r=\020*<\t*Z8*\021,\020=<\034*[k6\016xQ>3\021y".toCharArray();
        int i33 = arrayOfChar10.length;
        i34 = 0;
        if (i33 > i34)
          break label1541;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\0227R".toCharArray();
        int i37 = arrayOfChar11.length;
        i38 = 0;
        if (i37 > i38)
          break label1633;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\r1\\ 9\0244Z?&\r=\020*<\t*Z8*\021,\020%0\tx^%\0245^,:".toCharArray();
        int i41 = arrayOfChar12.length;
        i42 = 0;
        if (i41 > i42)
          break label1725;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\r1\\ 9\0244Z?&\r=\020>1\0266P<1]*Z:*\030+Kk+\004(Z".toCharArray();
        int i45 = arrayOfChar13.length;
        i46 = 0;
        if (i45 > i46)
          break label1817;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\0259L\024/\0257Q.��\023-R):\017".toCharArray();
        int i49 = arrayOfChar14.length;
        i50 = 0;
        if (i49 > i50)
          break label1909;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\0367Q?>\036,`\";".toCharArray();
        int i53 = arrayOfChar15.length;
        i54 = 0;
        if (i53 > i54)
          break label2001;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\r1\\ 9\0244Z?&\r=\020(0\023,^(+R1Q?:\023,\037/>\t9\037\",]6J'3".toCharArray();
        int i57 = arrayOfChar16.length;
        i58 = 0;
        if (i57 > i58)
          break label2093;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\r1\\ 9\0244Z?&\r=\020*<\t*Z8*\021,\020.'\t=M%>\021\007Y\"3\030\007V&>\032=\037/0\030+\037%0\txZ36\016,".toCharArray();
        int i61 = arrayOfChar17.length;
        i62 = 0;
        if (i61 > i62)
          break label2185;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\013;^9;".toCharArray();
        int i65 = arrayOfChar18.length;
        i66 = 0;
        if (i65 > i66)
          break label2277;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\t!O.".toCharArray();
        int i69 = arrayOfChar19.length;
        i70 = 0;
        if (i69 > i70)
          break label2369;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int m = arrayOfChar1[k];
      int n;
      switch (k % 5)
      {
      default:
        n = 95;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[k] = (char)(n ^ m);
        k++;
        break;
        n = 125;
        continue;
        n = 88;
        continue;
        n = 63;
        continue;
        n = 75;
      }
    }
    int i3 = arrayOfChar2[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 125;
      continue;
      i4 = 88;
      continue;
      i4 = 63;
      continue;
      i4 = 75;
    }
    label897: int i7 = arrayOfChar3[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 125;
      continue;
      i8 = 88;
      continue;
      i8 = 63;
      continue;
      i8 = 75;
    }
    label989: int i11 = arrayOfChar4[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 125;
      continue;
      i12 = 88;
      continue;
      i12 = 63;
      continue;
      i12 = 75;
    }
    label1081: int i15 = arrayOfChar5[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 125;
      continue;
      i16 = 88;
      continue;
      i16 = 63;
      continue;
      i16 = 75;
    }
    label1173: int i19 = arrayOfChar6[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 125;
      continue;
      i20 = 88;
      continue;
      i20 = 63;
      continue;
      i20 = 75;
    }
    label1265: int i23 = arrayOfChar7[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 125;
      continue;
      i24 = 88;
      continue;
      i24 = 63;
      continue;
      i24 = 75;
    }
    label1357: int i27 = arrayOfChar8[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 125;
      continue;
      i28 = 88;
      continue;
      i28 = 63;
      continue;
      i28 = 75;
    }
    label1449: int i31 = arrayOfChar9[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 125;
      continue;
      i32 = 88;
      continue;
      i32 = 63;
      continue;
      i32 = 75;
    }
    label1541: int i35 = arrayOfChar10[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 125;
      continue;
      i36 = 88;
      continue;
      i36 = 63;
      continue;
      i36 = 75;
    }
    label1633: int i39 = arrayOfChar11[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 125;
      continue;
      i40 = 88;
      continue;
      i40 = 63;
      continue;
      i40 = 75;
    }
    label1725: int i43 = arrayOfChar12[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i42] = (char)(i44 ^ i43);
      i42++;
      break;
      i44 = 125;
      continue;
      i44 = 88;
      continue;
      i44 = 63;
      continue;
      i44 = 75;
    }
    label1817: int i47 = arrayOfChar13[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i46] = (char)(i48 ^ i47);
      i46++;
      break;
      i48 = 125;
      continue;
      i48 = 88;
      continue;
      i48 = 63;
      continue;
      i48 = 75;
    }
    label1909: int i51 = arrayOfChar14[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i50] = (char)(i52 ^ i51);
      i50++;
      break;
      i52 = 125;
      continue;
      i52 = 88;
      continue;
      i52 = 63;
      continue;
      i52 = 75;
    }
    label2001: int i55 = arrayOfChar15[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i54] = (char)(i56 ^ i55);
      i54++;
      break;
      i56 = 125;
      continue;
      i56 = 88;
      continue;
      i56 = 63;
      continue;
      i56 = 75;
    }
    label2093: int i59 = arrayOfChar16[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i58] = (char)(i60 ^ i59);
      i58++;
      break;
      i60 = 125;
      continue;
      i60 = 88;
      continue;
      i60 = 63;
      continue;
      i60 = 75;
    }
    label2185: int i63 = arrayOfChar17[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i62] = (char)(i64 ^ i63);
      i62++;
      break;
      i64 = 125;
      continue;
      i64 = 88;
      continue;
      i64 = 63;
      continue;
      i64 = 75;
    }
    label2277: int i67 = arrayOfChar18[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i66] = (char)(i68 ^ i67);
      i66++;
      break;
      i68 = 125;
      continue;
      i68 = 88;
      continue;
      i68 = 63;
      continue;
      i68 = 75;
    }
    label2369: int i71 = arrayOfChar19[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i70] = (char)(i72 ^ i71);
      i70++;
      break;
      i72 = 125;
      continue;
      i72 = 88;
      continue;
      i72 = 63;
      continue;
      i72 = 75;
    }
  }

  // ERROR //
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: getstatic 87	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore 4
    //   5: iload_2
    //   6: ifne +4 -> 10
    //   9: return
    //   10: iload_1
    //   11: iconst_1
    //   12: if_icmpne +362 -> 374
    //   15: invokestatic 92	com/whatsapp/j5:b	()Ljava/io/File;
    //   18: astore 22
    //   20: iconst_1
    //   21: aload_0
    //   22: invokestatic 96	com/whatsapp/j5:a	(ILandroid/app/Activity;)I
    //   25: getstatic 100	com/whatsapp/j5:c	I
    //   28: if_icmpne +260 -> 288
    //   31: aload_3
    //   32: ifnull +10 -> 42
    //   35: aload_3
    //   36: invokevirtual 106	android/content/Intent:getData	()Landroid/net/Uri;
    //   39: ifnonnull +206 -> 245
    //   42: aload 22
    //   44: invokevirtual 112	java/io/File:exists	()Z
    //   47: istore 26
    //   49: iload 26
    //   51: ifeq +133 -> 184
    //   54: aload_0
    //   55: getfield 114	com/whatsapp/PickFileType:i	Ljava/lang/String;
    //   58: aload_3
    //   59: aload 22
    //   61: invokestatic 117	com/whatsapp/j5:a	(Ljava/lang/String;Landroid/content/Intent;Ljava/io/File;)V
    //   64: aload_0
    //   65: bipush 255
    //   67: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   70: aload_0
    //   71: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   74: goto -65 -> 9
    //   77: astore 7
    //   79: aload 7
    //   81: invokestatic 130	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   84: aload_0
    //   85: ldc 131
    //   87: iconst_0
    //   88: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   91: aload_0
    //   92: bipush 255
    //   94: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   97: aload_0
    //   98: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   101: goto -92 -> 9
    //   104: astore 27
    //   106: new 138	java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   113: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   116: iconst_0
    //   117: aaload
    //   118: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload 27
    //   123: invokevirtual 146	java/lang/OutOfMemoryError:toString	()Ljava/lang/String;
    //   126: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   135: new 102	android/content/Intent
    //   138: dup
    //   139: invokespecial 151	android/content/Intent:<init>	()V
    //   142: astore 28
    //   144: aload 28
    //   146: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   149: bipush 10
    //   151: aaload
    //   152: iconst_1
    //   153: invokevirtual 155	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   156: pop
    //   157: aload_0
    //   158: iconst_0
    //   159: aload 28
    //   161: invokevirtual 158	com/whatsapp/PickFileType:setResult	(ILandroid/content/Intent;)V
    //   164: goto -94 -> 70
    //   167: astore 6
    //   169: aload 6
    //   171: invokestatic 130	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   174: aload_0
    //   175: ldc 131
    //   177: iconst_0
    //   178: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   181: goto -90 -> 91
    //   184: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   187: bipush 16
    //   189: aaload
    //   190: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   193: aload_0
    //   194: invokevirtual 162	com/whatsapp/PickFileType:getBaseContext	()Landroid/content/Context;
    //   197: ldc 163
    //   199: iconst_0
    //   200: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   203: goto -194 -> 9
    //   206: astore 5
    //   208: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   211: bipush 11
    //   213: aaload
    //   214: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   217: aload_0
    //   218: iconst_0
    //   219: new 102	android/content/Intent
    //   222: dup
    //   223: invokespecial 151	android/content/Intent:<init>	()V
    //   226: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   229: iconst_3
    //   230: aaload
    //   231: iconst_1
    //   232: invokevirtual 155	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   235: invokevirtual 158	com/whatsapp/PickFileType:setResult	(ILandroid/content/Intent;)V
    //   238: aload_0
    //   239: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   242: goto -233 -> 9
    //   245: aload_3
    //   246: putstatic 166	com/whatsapp/j5:b	Landroid/content/Intent;
    //   249: aload_3
    //   250: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   253: bipush 18
    //   255: aaload
    //   256: iconst_1
    //   257: invokevirtual 169	android/content/Intent:putExtra	(Ljava/lang/String;B)Landroid/content/Intent;
    //   260: pop
    //   261: aload_0
    //   262: bipush 255
    //   264: aload_3
    //   265: invokevirtual 158	com/whatsapp/PickFileType:setResult	(ILandroid/content/Intent;)V
    //   268: invokestatic 173	com/whatsapp/Conversation:a	()Z
    //   271: ifeq +10 -> 281
    //   274: invokestatic 176	com/whatsapp/Conversation:b	()Lcom/whatsapp/Conversation;
    //   277: aload_3
    //   278: invokevirtual 179	com/whatsapp/Conversation:a	(Landroid/content/Intent;)V
    //   281: aload_0
    //   282: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   285: goto -276 -> 9
    //   288: aload_0
    //   289: getfield 114	com/whatsapp/PickFileType:i	Ljava/lang/String;
    //   292: aload_3
    //   293: aload 22
    //   295: invokestatic 117	com/whatsapp/j5:a	(Ljava/lang/String;Landroid/content/Intent;Ljava/io/File;)V
    //   298: aload_0
    //   299: bipush 255
    //   301: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   304: aload_0
    //   305: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   308: goto -299 -> 9
    //   311: astore 23
    //   313: new 138	java/lang/StringBuilder
    //   316: dup
    //   317: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   320: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   323: iconst_2
    //   324: aaload
    //   325: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: aload 23
    //   330: invokevirtual 146	java/lang/OutOfMemoryError:toString	()Ljava/lang/String;
    //   333: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   339: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   342: new 102	android/content/Intent
    //   345: dup
    //   346: invokespecial 151	android/content/Intent:<init>	()V
    //   349: astore 24
    //   351: aload 24
    //   353: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   356: bipush 10
    //   358: aaload
    //   359: iconst_1
    //   360: invokevirtual 155	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   363: pop
    //   364: aload_0
    //   365: iconst_0
    //   366: aload 24
    //   368: invokevirtual 158	com/whatsapp/PickFileType:setResult	(ILandroid/content/Intent;)V
    //   371: goto -67 -> 304
    //   374: iload_1
    //   375: iconst_5
    //   376: if_icmpne +72 -> 448
    //   379: aload_3
    //   380: invokevirtual 106	android/content/Intent:getData	()Landroid/net/Uri;
    //   383: astore 20
    //   385: aload 20
    //   387: ifnonnull +22 -> 409
    //   390: aload_0
    //   391: invokevirtual 162	com/whatsapp/PickFileType:getBaseContext	()Landroid/content/Context;
    //   394: ldc 163
    //   396: iconst_0
    //   397: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   400: aload_0
    //   401: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   404: iload 4
    //   406: ifeq -397 -> 9
    //   409: aload 20
    //   411: invokestatic 182	com/whatsapp/j5:a	(Landroid/net/Uri;)Ljava/io/File;
    //   414: astore 21
    //   416: aload_0
    //   417: aload_0
    //   418: aload_0
    //   419: getfield 114	com/whatsapp/PickFileType:i	Ljava/lang/String;
    //   422: aload 21
    //   424: iconst_2
    //   425: iconst_2
    //   426: invokestatic 185	com/whatsapp/j5:a	(I)Ljava/lang/String;
    //   429: invokestatic 188	com/whatsapp/j5:a	(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z
    //   432: ifeq -423 -> 9
    //   435: aload_0
    //   436: bipush 255
    //   438: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   441: aload_0
    //   442: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   445: goto -436 -> 9
    //   448: iload_1
    //   449: iconst_4
    //   450: if_icmpne +80 -> 530
    //   453: aload_3
    //   454: invokevirtual 106	android/content/Intent:getData	()Landroid/net/Uri;
    //   457: astore 18
    //   459: aload 18
    //   461: ifnonnull +30 -> 491
    //   464: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   467: iconst_5
    //   468: aaload
    //   469: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   472: aload_0
    //   473: invokevirtual 162	com/whatsapp/PickFileType:getBaseContext	()Landroid/content/Context;
    //   476: ldc 163
    //   478: iconst_0
    //   479: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   482: aload_0
    //   483: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   486: iload 4
    //   488: ifeq -479 -> 9
    //   491: aload 18
    //   493: invokestatic 182	com/whatsapp/j5:a	(Landroid/net/Uri;)Ljava/io/File;
    //   496: astore 19
    //   498: aload_0
    //   499: aload_0
    //   500: aload_0
    //   501: getfield 114	com/whatsapp/PickFileType:i	Ljava/lang/String;
    //   504: aload 19
    //   506: iconst_3
    //   507: iconst_3
    //   508: invokestatic 185	com/whatsapp/j5:a	(I)Ljava/lang/String;
    //   511: invokestatic 188	com/whatsapp/j5:a	(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z
    //   514: ifeq -505 -> 9
    //   517: aload_0
    //   518: bipush 255
    //   520: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   523: aload_0
    //   524: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   527: goto -518 -> 9
    //   530: iload_1
    //   531: bipush 7
    //   533: if_icmpne +474 -> 1007
    //   536: iconst_3
    //   537: anewarray 16	java/lang/String
    //   540: astore 8
    //   542: aload 8
    //   544: iconst_0
    //   545: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   548: bipush 8
    //   550: aaload
    //   551: aastore
    //   552: aload 8
    //   554: iconst_1
    //   555: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   558: bipush 7
    //   560: aaload
    //   561: aastore
    //   562: aload 8
    //   564: iconst_2
    //   565: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   568: bipush 13
    //   570: aaload
    //   571: aastore
    //   572: aload_3
    //   573: invokevirtual 106	android/content/Intent:getData	()Landroid/net/Uri;
    //   576: astore 9
    //   578: aload 9
    //   580: ifnonnull +22 -> 602
    //   583: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   586: bipush 15
    //   588: aaload
    //   589: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   592: aload_0
    //   593: bipush 255
    //   595: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   598: aload_0
    //   599: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   602: getstatic 192	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   605: aload 9
    //   607: aload 8
    //   609: aconst_null
    //   610: aconst_null
    //   611: aconst_null
    //   612: invokevirtual 198	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   615: astore 10
    //   617: aload 10
    //   619: ifnull +205 -> 824
    //   622: aload 10
    //   624: invokeinterface 203 1 0
    //   629: ifeq +195 -> 824
    //   632: aload_0
    //   633: new 204	g
    //   636: dup
    //   637: aload_0
    //   638: invokespecial 207	g:<init>	(Landroid/content/Context;)V
    //   641: putfield 209	com/whatsapp/PickFileType:g	Lg;
    //   644: aload_0
    //   645: aload 10
    //   647: aload 10
    //   649: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   652: bipush 8
    //   654: aaload
    //   655: invokeinterface 213 2 0
    //   660: invokeinterface 216 2 0
    //   665: putfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   668: aload_0
    //   669: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   672: getfield 221	g:c	Lj;
    //   675: aload 10
    //   677: aload 10
    //   679: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   682: bipush 7
    //   684: aaload
    //   685: invokeinterface 213 2 0
    //   690: invokeinterface 216 2 0
    //   695: putfield 225	j:a	Ljava/lang/String;
    //   698: aload_0
    //   699: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   702: aload_0
    //   703: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   706: invokevirtual 227	g:c	(Ljava/lang/String;)V
    //   709: aload 10
    //   711: aload 10
    //   713: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   716: bipush 13
    //   718: aaload
    //   719: invokeinterface 213 2 0
    //   724: invokeinterface 216 2 0
    //   729: invokestatic 232	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   732: ifle +14 -> 746
    //   735: aload_0
    //   736: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   739: aload_0
    //   740: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   743: invokevirtual 233	g:d	(Ljava/lang/String;)V
    //   746: aload_0
    //   747: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   750: aload_0
    //   751: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   754: invokevirtual 236	g:e	(Ljava/lang/String;)V
    //   757: aload_0
    //   758: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   761: aload_0
    //   762: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   765: invokevirtual 238	g:f	(Ljava/lang/String;)V
    //   768: aload_0
    //   769: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   772: aload_0
    //   773: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   776: invokevirtual 240	g:g	(Ljava/lang/String;)V
    //   779: aload_0
    //   780: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   783: aload_0
    //   784: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   787: invokevirtual 242	g:h	(Ljava/lang/String;)V
    //   790: aload_0
    //   791: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   794: aload_0
    //   795: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   798: invokevirtual 244	g:i	(Ljava/lang/String;)V
    //   801: aload_0
    //   802: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   805: aload_0
    //   806: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   809: invokevirtual 246	g:j	(Ljava/lang/String;)V
    //   812: aload 10
    //   814: invokeinterface 249 1 0
    //   819: iload 4
    //   821: ifeq +25 -> 846
    //   824: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   827: bipush 6
    //   829: aaload
    //   830: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   833: aload_0
    //   834: bipush 255
    //   836: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   839: aload_0
    //   840: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   843: goto -834 -> 9
    //   846: new 251	m
    //   849: dup
    //   850: invokespecial 252	m:<init>	()V
    //   853: astore 11
    //   855: aload_0
    //   856: aload 11
    //   858: aload_0
    //   859: getfield 209	com/whatsapp/PickFileType:g	Lg;
    //   862: iconst_2
    //   863: invokevirtual 255	m:a	(Lg;I)Ljava/lang/String;
    //   866: putfield 257	com/whatsapp/PickFileType:f	Ljava/lang/String;
    //   869: aload_0
    //   870: getfield 257	com/whatsapp/PickFileType:f	Ljava/lang/String;
    //   873: ifnonnull +25 -> 898
    //   876: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   879: bipush 9
    //   881: aaload
    //   882: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   885: aload_0
    //   886: ldc_w 258
    //   889: iconst_0
    //   890: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   893: iload 4
    //   895: ifeq -886 -> 9
    //   898: new 102	android/content/Intent
    //   901: dup
    //   902: aload_0
    //   903: ldc_w 260
    //   906: invokespecial 263	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   909: astore 13
    //   911: aload 13
    //   913: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   916: iconst_4
    //   917: aaload
    //   918: iconst_1
    //   919: invokevirtual 155	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   922: pop
    //   923: aload 13
    //   925: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   928: iconst_1
    //   929: aaload
    //   930: aload_0
    //   931: getfield 114	com/whatsapp/PickFileType:i	Ljava/lang/String;
    //   934: invokevirtual 266	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   937: pop
    //   938: aload 13
    //   940: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   943: bipush 17
    //   945: aaload
    //   946: aload_0
    //   947: getfield 257	com/whatsapp/PickFileType:f	Ljava/lang/String;
    //   950: invokevirtual 266	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   953: pop
    //   954: aload 13
    //   956: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   959: bipush 14
    //   961: aaload
    //   962: aload_0
    //   963: getfield 218	com/whatsapp/PickFileType:h	Ljava/lang/String;
    //   966: invokevirtual 266	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   969: pop
    //   970: aload_0
    //   971: aload 13
    //   973: invokevirtual 269	com/whatsapp/PickFileType:startActivity	(Landroid/content/Intent;)V
    //   976: aload_0
    //   977: bipush 255
    //   979: invokevirtual 121	com/whatsapp/PickFileType:setResult	(I)V
    //   982: aload_0
    //   983: invokevirtual 124	com/whatsapp/PickFileType:finish	()V
    //   986: goto -977 -> 9
    //   989: astore 12
    //   991: aload 12
    //   993: invokestatic 130	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   996: aload_0
    //   997: ldc_w 270
    //   1000: iconst_0
    //   1001: invokestatic 136	com/whatsapp/App:a	(Landroid/content/Context;II)V
    //   1004: goto -135 -> 869
    //   1007: getstatic 68	com/whatsapp/PickFileType:z	[Ljava/lang/String;
    //   1010: bipush 12
    //   1012: aaload
    //   1013: invokestatic 150	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   1016: goto -1007 -> 9
    //
    // Exception table:
    //   from	to	target	type
    //   15	49	77	java/io/FileNotFoundException
    //   54	70	77	java/io/FileNotFoundException
    //   70	74	77	java/io/FileNotFoundException
    //   106	164	77	java/io/FileNotFoundException
    //   184	203	77	java/io/FileNotFoundException
    //   245	285	77	java/io/FileNotFoundException
    //   288	304	77	java/io/FileNotFoundException
    //   304	855	77	java/io/FileNotFoundException
    //   855	869	77	java/io/FileNotFoundException
    //   869	1016	77	java/io/FileNotFoundException
    //   54	70	104	java/lang/OutOfMemoryError
    //   15	49	167	java/io/IOException
    //   54	70	167	java/io/IOException
    //   70	74	167	java/io/IOException
    //   106	164	167	java/io/IOException
    //   184	203	167	java/io/IOException
    //   245	285	167	java/io/IOException
    //   288	304	167	java/io/IOException
    //   304	855	167	java/io/IOException
    //   855	869	167	java/io/IOException
    //   869	1016	167	java/io/IOException
    //   15	49	206	com/whatsapp/dg
    //   54	70	206	com/whatsapp/dg
    //   70	74	206	com/whatsapp/dg
    //   106	164	206	com/whatsapp/dg
    //   184	203	206	com/whatsapp/dg
    //   245	285	206	com/whatsapp/dg
    //   288	304	206	com/whatsapp/dg
    //   304	855	206	com/whatsapp/dg
    //   855	869	206	com/whatsapp/dg
    //   869	1016	206	com/whatsapp/dg
    //   288	304	311	java/lang/OutOfMemoryError
    //   855	869	989	b
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903117);
    if (App.bb == null)
      finish();
    while (true)
    {
      return;
      this.i = getIntent().getExtras().getString(z[1]);
      findViewById(2131558583).setFocusable(true);
      findViewById(2131558583).setClickable(true);
      findViewById(2131558583).setOnClickListener(new ay(this));
      findViewById(2131558584).setOnClickListener(new by(this));
      findViewById(2131558585).setOnClickListener(new cy(this));
      findViewById(2131558586).setOnClickListener(new dy(this));
      findViewById(2131558587).setOnClickListener(new ey(this));
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.PickFileType
 * JD-Core Version:    0.6.1
 */