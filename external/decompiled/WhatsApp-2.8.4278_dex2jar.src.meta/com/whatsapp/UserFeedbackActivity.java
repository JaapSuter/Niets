package com.whatsapp;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

public class UserFeedbackActivity extends DialogToastActivity
{
  private static final String[] z;
  private String f;
  private HashMap<String, bq> g;
  private String h;
  private String i;

  static
  {
    String[] arrayOfString = new String[19];
    char[] arrayOfChar1 = "\021\002p\031S��\023~DE\026\024e\nG\001^{\004\030\t\024f\030T\003\024".toCharArray();
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
      arrayOfChar2 = "\024\020g\037\\\005\035".toCharArray();
      int i1 = arrayOfChar2.length;
      i2 = 0;
      if (i1 <= i2)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\021\037t\035T\r\035t\tY\001".toCharArray();
        int i5 = arrayOfChar3.length;
        i6 = 0;
        if (i5 > i6)
          break label897;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\021\037~\005Z\023\037".toCharArray();
        int i9 = arrayOfChar4.length;
        i10 = 0;
        if (i9 > i10)
          break label989;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\021\002p\031S��\023~DR\001\005x\030R\002\036g\030P\026\007p\031\032\n\0368\030P\026\007p\031\030\027\005t\037@\027".toCharArray();
        int i13 = arrayOfChar5.length;
        i14 = 0;
        if (i13 > i14)
          break label1081;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\005\007t\002Y\005\023y\016".toCharArray();
        int i17 = arrayOfChar6.length;
        i18 = 0;
        if (i17 > i18)
          break label1173;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\021\002p\031S��\023~DR\001\005x\030R\002\036g\030P\026\007p\031\032\n\004y\007".toCharArray();
        int i21 = arrayOfChar7.length;
        i22 = 0;
        if (i21 > i22)
          break label1265;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\021\002p\031S��\023~DR\001\005x\030R\002\036g\030P\026\007p\031\032\n\0368\030A\005\005`\030\030\002\036gF".toCharArray();
        int i25 = arrayOfChar8.length;
        i26 = 0;
        if (i25 > i26)
          break label1357;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\007\036xEB\f\020a\030T\024\001;/P\027\022g\002W\001!g\004W\b\024x*V\020\030c\002A\035_a\022E\001".toCharArray();
        int i29 = arrayOfChar9.length;
        i30 = 0;
        if (i29 > i30)
          break label1449;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\007\036xEB\f\020a\030T\024\001;/P\027\022g\002W\001!g\004W\b\024x*V\020\030c\002A\035_s\031Z\t".toCharArray();
        int i33 = arrayOfChar10.length;
        i34 = 0;
        if (i33 > i34)
          break label1541;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\007\036xEB\f\020a\030T\024\001;/P\027\022g\002W\001!g\004W\b\024x*V\020\030c\002A\035_f\016G\022\024g\030A\005\005`\030".toCharArray();
        int i37 = arrayOfChar11.length;
        i38 = 0;
        if (i37 > i38)
          break label1633;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "\021\002p\031S��\023~DP\n\005p\031Q\001\002v\031\\\024\005|\004[\024\003p\033\032\n\0368\030P\026\007p\031\030\020\be\016".toCharArray();
        int i41 = arrayOfChar12.length;
        i42 = 0;
        if (i41 > i42)
          break label1725;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\021\002p\031S��\023~DP\n\005p\031Q\001\002v\031\\\024\005|\004[\024\003p\033\032\n\0368\bZ\n\037p\bA\r\007|\037L".toCharArray();
        int i45 = arrayOfChar13.length;
        i46 = 0;
        if (i45 > i46)
          break label1817;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\007\031t\037".toCharArray();
        int i49 = arrayOfChar14.length;
        i50 = 0;
        if (i49 > i50)
          break label1909;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "\026\024r\002F\020\003t\037\\\013\037".toCharArray();
        int i53 = arrayOfChar15.length;
        i54 = 0;
        if (i53 > i54)
          break label2001;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\n\0368\bZ\n\037p\bA\r\007|\037L".toCharArray();
        int i57 = arrayOfChar16.length;
        i58 = 0;
        if (i57 > i58)
          break label2093;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "(\036r\030".toCharArray();
        int i61 = arrayOfChar17.length;
        i62 = 0;
        if (i61 > i62)
          break label2185;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "\t\036`\005A\001\025".toCharArray();
        int i65 = arrayOfChar18.length;
        i66 = 0;
        if (i65 > i66)
          break label2277;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "\023\031t\037F\005\001eEY\013\026".toCharArray();
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
        n = 53;
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
        n = 100;
        continue;
        n = 113;
        continue;
        n = 21;
        continue;
        n = 107;
      }
    }
    int i3 = arrayOfChar2[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 53;
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
      i4 = 100;
      continue;
      i4 = 113;
      continue;
      i4 = 21;
      continue;
      i4 = 107;
    }
    label897: int i7 = arrayOfChar3[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 53;
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
      i8 = 100;
      continue;
      i8 = 113;
      continue;
      i8 = 21;
      continue;
      i8 = 107;
    }
    label989: int i11 = arrayOfChar4[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 53;
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
      i12 = 100;
      continue;
      i12 = 113;
      continue;
      i12 = 21;
      continue;
      i12 = 107;
    }
    label1081: int i15 = arrayOfChar5[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 53;
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
      i16 = 100;
      continue;
      i16 = 113;
      continue;
      i16 = 21;
      continue;
      i16 = 107;
    }
    label1173: int i19 = arrayOfChar6[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 53;
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
      i20 = 100;
      continue;
      i20 = 113;
      continue;
      i20 = 21;
      continue;
      i20 = 107;
    }
    label1265: int i23 = arrayOfChar7[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 53;
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
      i24 = 100;
      continue;
      i24 = 113;
      continue;
      i24 = 21;
      continue;
      i24 = 107;
    }
    label1357: int i27 = arrayOfChar8[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 53;
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
      i28 = 100;
      continue;
      i28 = 113;
      continue;
      i28 = 21;
      continue;
      i28 = 107;
    }
    label1449: int i31 = arrayOfChar9[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 53;
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
      i32 = 100;
      continue;
      i32 = 113;
      continue;
      i32 = 21;
      continue;
      i32 = 107;
    }
    label1541: int i35 = arrayOfChar10[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 53;
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
      i36 = 100;
      continue;
      i36 = 113;
      continue;
      i36 = 21;
      continue;
      i36 = 107;
    }
    label1633: int i39 = arrayOfChar11[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 53;
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
      i40 = 100;
      continue;
      i40 = 113;
      continue;
      i40 = 21;
      continue;
      i40 = 107;
    }
    label1725: int i43 = arrayOfChar12[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 53;
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
      i44 = 100;
      continue;
      i44 = 113;
      continue;
      i44 = 21;
      continue;
      i44 = 107;
    }
    label1817: int i47 = arrayOfChar13[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 53;
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
      i48 = 100;
      continue;
      i48 = 113;
      continue;
      i48 = 21;
      continue;
      i48 = 107;
    }
    label1909: int i51 = arrayOfChar14[i50];
    int i52;
    switch (i50 % 5)
    {
    default:
      i52 = 53;
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
      i52 = 100;
      continue;
      i52 = 113;
      continue;
      i52 = 21;
      continue;
      i52 = 107;
    }
    label2001: int i55 = arrayOfChar15[i54];
    int i56;
    switch (i54 % 5)
    {
    default:
      i56 = 53;
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
      i56 = 100;
      continue;
      i56 = 113;
      continue;
      i56 = 21;
      continue;
      i56 = 107;
    }
    label2093: int i59 = arrayOfChar16[i58];
    int i60;
    switch (i58 % 5)
    {
    default:
      i60 = 53;
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
      i60 = 100;
      continue;
      i60 = 113;
      continue;
      i60 = 21;
      continue;
      i60 = 107;
    }
    label2185: int i63 = arrayOfChar17[i62];
    int i64;
    switch (i62 % 5)
    {
    default:
      i64 = 53;
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
      i64 = 100;
      continue;
      i64 = 113;
      continue;
      i64 = 21;
      continue;
      i64 = 107;
    }
    label2277: int i67 = arrayOfChar18[i66];
    int i68;
    switch (i66 % 5)
    {
    default:
      i68 = 53;
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
      i68 = 100;
      continue;
      i68 = 113;
      continue;
      i68 = 21;
      continue;
      i68 = 107;
    }
    label2369: int i71 = arrayOfChar19[i70];
    int i72;
    switch (i70 % 5)
    {
    default:
      i72 = 53;
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
      i72 = 100;
      continue;
      i72 = 113;
      continue;
      i72 = 21;
      continue;
      i72 = 107;
    }
  }

  public static q4 a(Context paramContext, String paramString, HashMap<String, bq> paramHashMap)
  {
    q4 localq4;
    if (!App.sb())
    {
      g5.b(z[12]);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramContext.getString(2131296328);
      localq4 = new q4(paramContext.getString(2131296338, arrayOfObject), z[15]);
    }
    while (true)
    {
      return localq4;
      if (paramString == null)
      {
        g5.d(z[11]);
        localq4 = new q4(null, null);
      }
      else if (z[14].equals(paramString))
      {
        localq4 = a(paramContext, z[14], paramHashMap, 2131296340, 2131296342, 2131296344, 2131296345, 2131296344, 2131296345);
      }
      else
      {
        localq4 = a(paramContext, z[13], paramHashMap, 2131296341, 2131296343, 2131296344, 2131296345, 2131296344, 2131296345);
      }
    }
  }

  public static q4 a(Context paramContext, String paramString, HashMap<String, bq> paramHashMap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    String str2;
    String str1;
    if (paramString == null)
    {
      g5.d(z[6]);
      if (!DialogToastListActivity.f);
    }
    else if (paramHashMap == null)
    {
      g5.b(z[4]);
      str2 = z[3];
      str1 = null;
    }
    while (true)
    {
      return new q4(str1, str2);
      bq localbq = (bq)paramHashMap.get(paramString);
      if (localbq != null)
      {
        switch (p4.a[localbq.a.ordinal()])
        {
        default:
          str2 = z[3];
          str1 = null;
          break;
        case 1:
          str2 = z[2];
          if (localbq.b <= 0L)
          {
            str1 = paramContext.getString(paramInt2);
            continue;
          }
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = t4.g(paramContext, 1000L * localbq.b);
          str1 = paramContext.getString(paramInt1, arrayOfObject3);
          break;
        case 2:
          str2 = z[1];
          if (localbq.b <= 0L)
          {
            str1 = paramContext.getString(paramInt4);
            continue;
          }
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = t4.g(paramContext, 1000L * localbq.b);
          str1 = paramContext.getString(paramInt3, arrayOfObject2);
          break;
        case 3:
          str2 = z[1];
          if (localbq.b <= 0L)
          {
            str1 = paramContext.getString(paramInt6);
            continue;
          }
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = t4.g(paramContext, 1000L * localbq.b);
          str1 = paramContext.getString(paramInt5, arrayOfObject1);
          break;
        case 4:
          str2 = z[5];
          str1 = null;
          break;
        }
      }
      else
      {
        g5.c(z[7] + paramString);
        str1 = null;
        str2 = null;
      }
    }
  }

  static String a(UserFeedbackActivity paramUserFeedbackActivity)
  {
    return paramUserFeedbackActivity.f;
  }

  static String a(UserFeedbackActivity paramUserFeedbackActivity, String paramString)
  {
    paramUserFeedbackActivity.i = paramString;
    return paramString;
  }

  static HashMap a(UserFeedbackActivity paramUserFeedbackActivity, HashMap paramHashMap)
  {
    paramUserFeedbackActivity.g = paramHashMap;
    return paramHashMap;
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Integer paramInteger)
  {
    Intent localIntent = new Intent(paramContext, DescribeProblemActivity.class);
    localIntent.putExtra(z[9], paramString1);
    localIntent.putExtra(z[10], paramString2);
    if (paramInteger != null)
      localIntent.putExtra(z[8], paramInteger);
    localIntent.setFlags(1073741824);
    paramContext.startActivity(localIntent);
  }

  static String b(UserFeedbackActivity paramUserFeedbackActivity)
  {
    return paramUserFeedbackActivity.h;
  }

  static String b(UserFeedbackActivity paramUserFeedbackActivity, String paramString)
  {
    paramUserFeedbackActivity.h = paramString;
    return paramString;
  }

  // ERROR //
  private static void b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: invokestatic 211	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   5: getstatic 69	com/whatsapp/UserFeedbackActivity:z	[Ljava/lang/String;
    //   8: bipush 17
    //   10: aaload
    //   11: invokevirtual 110	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   14: ifeq +161 -> 175
    //   17: new 213	java/io/File
    //   20: dup
    //   21: new 213	java/io/File
    //   24: dup
    //   25: getstatic 217	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   28: invokevirtual 221	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   31: getstatic 69	com/whatsapp/UserFeedbackActivity:z	[Ljava/lang/String;
    //   34: bipush 16
    //   36: aaload
    //   37: invokespecial 224	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   40: getstatic 69	com/whatsapp/UserFeedbackActivity:z	[Ljava/lang/String;
    //   43: bipush 18
    //   45: aaload
    //   46: invokespecial 224	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   49: astore_1
    //   50: getstatic 227	com/whatsapp/App:c	Ljava/io/File;
    //   53: invokevirtual 230	java/io/File:exists	()Z
    //   56: ifne +10 -> 66
    //   59: getstatic 227	com/whatsapp/App:c	Ljava/io/File;
    //   62: invokevirtual 233	java/io/File:mkdirs	()Z
    //   65: pop
    //   66: new 213	java/io/File
    //   69: dup
    //   70: getstatic 227	com/whatsapp/App:c	Ljava/io/File;
    //   73: getstatic 69	com/whatsapp/UserFeedbackActivity:z	[Ljava/lang/String;
    //   76: bipush 18
    //   78: aaload
    //   79: invokespecial 224	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   82: astore_2
    //   83: new 235	com/whatsapp/pf
    //   86: dup
    //   87: getstatic 239	com/whatsapp/App:B	Lcom/whatsapp/w5;
    //   90: aload_2
    //   91: invokespecial 242	com/whatsapp/pf:<init>	(Lcom/whatsapp/w5;Ljava/io/File;)V
    //   94: invokestatic 248	java/nio/channels/Channels:newChannel	(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    //   97: astore 6
    //   99: aload 6
    //   101: astore 4
    //   103: new 250	java/io/FileInputStream
    //   106: dup
    //   107: aload_1
    //   108: invokespecial 253	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   111: invokevirtual 257	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   114: astore_0
    //   115: aload_0
    //   116: aload 4
    //   118: invokestatic 262	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   121: aload_0
    //   122: ifnull +7 -> 129
    //   125: aload_0
    //   126: invokevirtual 267	java/nio/channels/FileChannel:close	()V
    //   129: aload 4
    //   131: ifnull +44 -> 175
    //   134: aload 4
    //   136: invokeinterface 270 1 0
    //   141: goto +34 -> 175
    //   144: aload_0
    //   145: ifnull +7 -> 152
    //   148: aload_0
    //   149: invokevirtual 267	java/nio/channels/FileChannel:close	()V
    //   152: aload 4
    //   154: ifnull +10 -> 164
    //   157: aload 4
    //   159: invokeinterface 270 1 0
    //   164: aload_3
    //   165: athrow
    //   166: astore 5
    //   168: goto +7 -> 175
    //   171: astore_3
    //   172: goto -28 -> 144
    //   175: return
    //   176: astore_3
    //   177: aconst_null
    //   178: astore 4
    //   180: goto -36 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   125	166	166	java/io/IOException
    //   103	121	171	finally
    //   83	99	176	finally
  }

  static HashMap c(UserFeedbackActivity paramUserFeedbackActivity)
  {
    return paramUserFeedbackActivity.g;
  }

  static String d(UserFeedbackActivity paramUserFeedbackActivity)
  {
    return paramUserFeedbackActivity.i;
  }

  protected void d(String paramString)
  {
    this.f = paramString;
    if (App.f == 2)
      b();
    new zb(this).execute(new String[0]);
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 200:
    case 201:
    case 202:
    }
    while (true)
    {
      return localObject;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296337));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296339).setPositiveButton(2131296288, new n4(this)).setNegativeButton(2131296268, new m4(this)).create();
      continue;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(this).setTitle(2131296327);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = getString(2131296328);
      localObject = localBuilder.setMessage(getString(2131296338, arrayOfObject)).setNeutralButton(2131296270, new o4(this)).create();
    }
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
    case 201:
    }
    while (true)
    {
      return;
      if (this.i != null)
      {
        ((AlertDialog)paramDialog).setMessage(this.i);
        if (!DialogToastListActivity.f);
      }
      else
      {
        g5.d(z[0]);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.UserFeedbackActivity
 * JD-Core Version:    0.6.1
 */