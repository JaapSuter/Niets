package com.whatsapp;

import android.telephony.TelephonyManager;

public class u4
{
  static String a;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "8a`.9[#".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "8a`.9qb.p/+U&r{p6 y($r\"j5gs\030u8$p5s1$b/y|t~(r9*".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = ",ly)y".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label328;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "8a`.9qb.p/+r\"j5gs.xsad5s.$".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label416;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        z = arrayOfString;
        a = null;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 28;
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
        m = 92;
        continue;
        m = 4;
        continue;
        m = 22;
        continue;
        m = 71;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 28;
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
      i3 = 92;
      continue;
      i3 = 4;
      continue;
      i3 = 22;
      continue;
      i3 = 71;
    }
    label328: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 28;
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
      i7 = 92;
      continue;
      i7 = 4;
      continue;
      i7 = 22;
      continue;
      i7 = 71;
    }
    label416: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 28;
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
      i11 = 92;
      continue;
      i11 = 4;
      continue;
      i11 = 22;
      continue;
      i11 = 71;
    }
  }

  public static String a()
  {
    TelephonyManager localTelephonyManager;
    if (a == null)
    {
      App localApp = App.Mb;
      App.Mb.getApplicationContext();
      localTelephonyManager = (TelephonyManager)localApp.getSystemService(z[2]);
    }
    try
    {
      a = localTelephonyManager.getDeviceId();
      if (a == null)
        a = b();
      return a;
    }
    catch (Exception localException)
    {
      while (true)
        g5.c(z[3] + localException.toString());
    }
  }

  // ERROR //
  private static String b()
  {
    // Byte code:
    //   0: new 84	java/io/File
    //   3: dup
    //   4: getstatic 44	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   7: invokevirtual 88	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   10: getstatic 34	com/whatsapp/u4:z	[Ljava/lang/String;
    //   13: iconst_0
    //   14: aaload
    //   15: invokespecial 91	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   18: invokevirtual 95	java/io/File:exists	()Z
    //   21: ifeq +39 -> 60
    //   24: new 97	java/io/ObjectInputStream
    //   27: dup
    //   28: getstatic 44	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   31: getstatic 34	com/whatsapp/u4:z	[Ljava/lang/String;
    //   34: iconst_0
    //   35: aaload
    //   36: invokevirtual 101	com/whatsapp/App:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   39: invokespecial 104	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   42: astore 5
    //   44: aload 5
    //   46: invokevirtual 108	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   49: checkcast 12	java/lang/String
    //   52: astore_1
    //   53: aload 5
    //   55: invokevirtual 111	java/io/ObjectInputStream:close	()V
    //   58: aload_1
    //   59: areturn
    //   60: getstatic 34	com/whatsapp/u4:z	[Ljava/lang/String;
    //   63: iconst_1
    //   64: aaload
    //   65: invokestatic 114	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   68: aconst_null
    //   69: astore_1
    //   70: goto -12 -> 58
    //   73: astore_3
    //   74: aconst_null
    //   75: astore_1
    //   76: aload_3
    //   77: astore 4
    //   79: aload 4
    //   81: invokestatic 117	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   84: goto -26 -> 58
    //   87: astore_0
    //   88: aconst_null
    //   89: astore_1
    //   90: aload_0
    //   91: astore_2
    //   92: aload_2
    //   93: invokestatic 117	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   96: goto -38 -> 58
    //   99: astore_2
    //   100: goto -8 -> 92
    //   103: astore 4
    //   105: goto -26 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   0	53	73	java/lang/ClassNotFoundException
    //   60	68	73	java/lang/ClassNotFoundException
    //   0	53	87	java/io/IOException
    //   60	68	87	java/io/IOException
    //   53	58	99	java/io/IOException
    //   53	58	103	java/lang/ClassNotFoundException
  }
}