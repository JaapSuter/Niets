package com.whatsapp;

public class i5
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "'\n\03091w\005\02500=\021\030%b".toCharArray();
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
      arrayOfChar2 = "'\n\03091w\005\02500=\021\030%m{\005Q".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "'\n\03091w\005\02500=\021\030%m}\036\005u".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = ".}\f\002{8{\033".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 85;
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
        m = 66;
        continue;
        m = 18;
        continue;
        m = 107;
        continue;
        m = 113;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 85;
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
      i3 = 66;
      continue;
      i3 = 18;
      continue;
      i3 = 107;
      continue;
      i3 = 113;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 85;
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
      i7 = 66;
      continue;
      i7 = 18;
      continue;
      i7 = 107;
      continue;
      i7 = 113;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 85;
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
      i11 = 66;
      continue;
      i11 = 18;
      continue;
      i11 = 107;
      continue;
      i11 = 113;
    }
  }

  // ERROR //
  public static java.io.File a(java.util.ArrayList<java.io.File> paramArrayList)
  {
    // Byte code:
    //   0: getstatic 42	com/whatsapp/g5:n	I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnull +16 -> 21
    //   8: getstatic 48	com/whatsapp/App:c	Ljava/io/File;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: invokevirtual 54	java/util/ArrayList:size	()I
    //   18: ifne +7 -> 25
    //   21: aconst_null
    //   22: astore_2
    //   23: aload_2
    //   24: areturn
    //   25: new 56	java/io/File
    //   28: dup
    //   29: getstatic 48	com/whatsapp/App:c	Ljava/io/File;
    //   32: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   35: iconst_3
    //   36: aaload
    //   37: invokespecial 59	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   40: astore_3
    //   41: new 61	java/util/zip/ZipOutputStream
    //   44: dup
    //   45: new 63	java/io/BufferedOutputStream
    //   48: dup
    //   49: new 65	java/io/FileOutputStream
    //   52: dup
    //   53: aload_3
    //   54: invokespecial 68	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   57: invokespecial 71	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   60: invokespecial 72	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   63: astore 4
    //   65: sipush 16384
    //   68: newarray byte
    //   70: astore 12
    //   72: aload_0
    //   73: invokevirtual 76	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   76: astore 13
    //   78: aload 13
    //   80: invokeinterface 82 1 0
    //   85: ifeq +96 -> 181
    //   88: aload 13
    //   90: invokeinterface 86 1 0
    //   95: checkcast 56	java/io/File
    //   98: astore 16
    //   100: new 88	java/io/BufferedInputStream
    //   103: dup
    //   104: new 90	java/io/FileInputStream
    //   107: dup
    //   108: aload 16
    //   110: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   113: sipush 16384
    //   116: invokespecial 94	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   119: astore 6
    //   121: aload 4
    //   123: new 96	java/util/zip/ZipEntry
    //   126: dup
    //   127: aload 16
    //   129: invokevirtual 99	java/io/File:getName	()Ljava/lang/String;
    //   132: invokespecial 102	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   135: invokevirtual 106	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   138: aload 6
    //   140: aload 12
    //   142: iconst_0
    //   143: sipush 16384
    //   146: invokevirtual 110	java/io/BufferedInputStream:read	([BII)I
    //   149: istore 17
    //   151: iload 17
    //   153: bipush 255
    //   155: if_icmpeq +17 -> 172
    //   158: aload 4
    //   160: aload 12
    //   162: iconst_0
    //   163: iload 17
    //   165: invokevirtual 114	java/util/zip/ZipOutputStream:write	([BII)V
    //   168: iload_1
    //   169: ifeq -31 -> 138
    //   172: aload 6
    //   174: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   177: iload_1
    //   178: ifeq -100 -> 78
    //   181: iconst_0
    //   182: ifeq +7 -> 189
    //   185: aconst_null
    //   186: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   189: aload_3
    //   190: astore_2
    //   191: aload 4
    //   193: ifnull -170 -> 23
    //   196: aload 4
    //   198: invokevirtual 118	java/util/zip/ZipOutputStream:close	()V
    //   201: goto -178 -> 23
    //   204: astore 14
    //   206: new 120	java/lang/StringBuilder
    //   209: dup
    //   210: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   213: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   216: iconst_2
    //   217: aaload
    //   218: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload 14
    //   223: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   226: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   235: aconst_null
    //   236: astore_2
    //   237: goto -214 -> 23
    //   240: astore 5
    //   242: aconst_null
    //   243: astore 4
    //   245: aconst_null
    //   246: astore 6
    //   248: new 120	java/lang/StringBuilder
    //   251: dup
    //   252: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   255: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   258: iconst_0
    //   259: aaload
    //   260: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload 5
    //   265: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   268: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   277: aload 6
    //   279: ifnull +8 -> 287
    //   282: aload 6
    //   284: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   287: aload 4
    //   289: ifnull +8 -> 297
    //   292: aload 4
    //   294: invokevirtual 118	java/util/zip/ZipOutputStream:close	()V
    //   297: aconst_null
    //   298: astore_2
    //   299: goto -276 -> 23
    //   302: astore 7
    //   304: aconst_null
    //   305: astore 4
    //   307: aconst_null
    //   308: astore 6
    //   310: aload 6
    //   312: ifnull +8 -> 320
    //   315: aload 6
    //   317: invokevirtual 117	java/io/BufferedInputStream:close	()V
    //   320: aload 4
    //   322: ifnull +8 -> 330
    //   325: aload 4
    //   327: invokevirtual 118	java/util/zip/ZipOutputStream:close	()V
    //   330: aload 7
    //   332: athrow
    //   333: astore 9
    //   335: new 120	java/lang/StringBuilder
    //   338: dup
    //   339: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   342: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   345: iconst_1
    //   346: aaload
    //   347: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: aload 9
    //   352: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   355: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   364: goto -44 -> 320
    //   367: astore 8
    //   369: new 120	java/lang/StringBuilder
    //   372: dup
    //   373: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   376: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   379: iconst_2
    //   380: aaload
    //   381: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: aload 8
    //   386: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   389: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   398: goto -68 -> 330
    //   401: astore 11
    //   403: new 120	java/lang/StringBuilder
    //   406: dup
    //   407: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   410: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   413: iconst_1
    //   414: aaload
    //   415: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: aload 11
    //   420: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   423: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   429: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   432: goto -145 -> 287
    //   435: astore 10
    //   437: new 120	java/lang/StringBuilder
    //   440: dup
    //   441: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   444: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   447: iconst_2
    //   448: aaload
    //   449: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: aload 10
    //   454: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   457: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   463: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   466: goto -169 -> 297
    //   469: astore 15
    //   471: new 120	java/lang/StringBuilder
    //   474: dup
    //   475: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   478: getstatic 32	com/whatsapp/i5:z	[Ljava/lang/String;
    //   481: iconst_1
    //   482: aaload
    //   483: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: aload 15
    //   488: invokevirtual 129	java/io/IOException:toString	()Ljava/lang/String;
    //   491: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   497: invokestatic 133	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   500: aconst_null
    //   501: astore_2
    //   502: goto -311 -> 191
    //   505: astore 7
    //   507: aconst_null
    //   508: astore 6
    //   510: goto -200 -> 310
    //   513: astore 7
    //   515: goto -205 -> 310
    //   518: astore 5
    //   520: aconst_null
    //   521: astore 6
    //   523: goto -275 -> 248
    //   526: astore 5
    //   528: goto -280 -> 248
    //
    // Exception table:
    //   from	to	target	type
    //   196	201	204	java/io/IOException
    //   41	65	240	java/io/IOException
    //   41	65	302	finally
    //   315	320	333	java/io/IOException
    //   325	330	367	java/io/IOException
    //   282	287	401	java/io/IOException
    //   292	297	435	java/io/IOException
    //   185	189	469	java/io/IOException
    //   65	121	505	finally
    //   121	177	513	finally
    //   248	277	513	finally
    //   65	121	518	java/io/IOException
    //   121	177	526	java/io/IOException
  }
}