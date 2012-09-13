package com.whatsapp;

class p9 extends Thread
{
  private static final String[] z;
  final ow a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\007}b[e\013mr]`\005oh^k\013|)Vk\035vj]e\0168".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\007}b[e\013mr]`\005oh^k\013|)Vk\035vj]e\0168`Sm\006}b\022".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 4;
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
        m = 106;
        continue;
        m = 24;
        continue;
        m = 6;
        continue;
        m = 50;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 4;
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
      i3 = 106;
      continue;
      i3 = 24;
      continue;
      i3 = 6;
      continue;
      i3 = 50;
    }
  }

  p9(ow paramow)
  {
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: getstatic 46	com/whatsapp/DialogToastListActivity:f	Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   8: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   11: invokevirtual 57	java/util/Stack:size	()I
    //   14: ifne +28 -> 42
    //   17: aload_0
    //   18: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   21: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   24: astore 17
    //   26: aload 17
    //   28: monitorenter
    //   29: aload_0
    //   30: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   33: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   36: invokevirtual 62	java/lang/Object:wait	()V
    //   39: aload 17
    //   41: monitorexit
    //   42: ldc2_w 63
    //   45: invokestatic 68	java/lang/Thread:sleep	(J)V
    //   48: aload_0
    //   49: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   52: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   55: invokevirtual 57	java/util/Stack:size	()I
    //   58: ifeq +157 -> 215
    //   61: aload_0
    //   62: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   65: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   68: astore 7
    //   70: aload 7
    //   72: monitorenter
    //   73: aload_0
    //   74: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   77: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   80: invokevirtual 72	java/util/Stack:pop	()Ljava/lang/Object;
    //   83: checkcast 74	com/whatsapp/sz
    //   86: astore 9
    //   88: new 76	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   95: getstatic 30	com/whatsapp/p9:z	[Ljava/lang/String;
    //   98: iconst_0
    //   99: aaload
    //   100: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: aload 9
    //   105: getfield 85	com/whatsapp/sz:j	Ljava/lang/String;
    //   108: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 94	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   117: aload 7
    //   119: monitorexit
    //   120: aload 9
    //   122: getfield 98	com/whatsapp/sz:t	Ljava/lang/Object;
    //   125: checkcast 100	com/whatsapp/MediaData
    //   128: astore 10
    //   130: aload 10
    //   132: aload 9
    //   134: invokestatic 105	com/whatsapp/App:a	(Lcom/whatsapp/sz;)Ljava/io/File;
    //   137: putfield 109	com/whatsapp/MediaData:file	Ljava/io/File;
    //   140: getstatic 114	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   143: astore 11
    //   145: aload 10
    //   147: new 116	com/whatsapp/ob
    //   150: dup
    //   151: aload 9
    //   153: aconst_null
    //   154: invokespecial 119	com/whatsapp/ob:<init>	(Lcom/whatsapp/sz;Landroid/app/Activity;)V
    //   157: putfield 123	com/whatsapp/MediaData:downloader	Lcom/whatsapp/ob;
    //   160: aload 10
    //   162: getfield 123	com/whatsapp/MediaData:downloader	Lcom/whatsapp/ob;
    //   165: astore 14
    //   167: iconst_1
    //   168: anewarray 125	java/io/OutputStream
    //   171: astore 15
    //   173: aload 15
    //   175: iconst_0
    //   176: new 127	com/whatsapp/pf
    //   179: dup
    //   180: getstatic 131	com/whatsapp/App:B	Lcom/whatsapp/w5;
    //   183: aload 10
    //   185: getfield 109	com/whatsapp/MediaData:file	Ljava/io/File;
    //   188: invokespecial 134	com/whatsapp/pf:<init>	(Lcom/whatsapp/w5;Ljava/io/File;)V
    //   191: aastore
    //   192: aload 14
    //   194: aload 15
    //   196: invokevirtual 137	com/whatsapp/ob:a	([Ljava/io/OutputStream;)Lcom/whatsapp/yf;
    //   199: astore 16
    //   201: aload 16
    //   203: astore 13
    //   205: aload 10
    //   207: getfield 123	com/whatsapp/MediaData:downloader	Lcom/whatsapp/ob;
    //   210: aload 13
    //   212: invokevirtual 140	com/whatsapp/ob:a	(Lcom/whatsapp/yf;)V
    //   215: invokestatic 144	java/lang/Thread:interrupted	()Z
    //   218: istore 6
    //   220: iload 6
    //   222: ifeq -218 -> 4
    //   225: return
    //   226: astore 18
    //   228: aload 17
    //   230: monitorexit
    //   231: aload 18
    //   233: athrow
    //   234: astore_2
    //   235: aload_0
    //   236: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   239: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   242: astore_3
    //   243: aload_3
    //   244: monitorenter
    //   245: aload_0
    //   246: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   249: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   252: invokevirtual 147	java/util/Stack:isEmpty	()Z
    //   255: ifne +40 -> 295
    //   258: aload_0
    //   259: getfield 33	com/whatsapp/p9:a	Lcom/whatsapp/ow;
    //   262: invokestatic 51	com/whatsapp/ow:a	(Lcom/whatsapp/ow;)Ljava/util/Stack;
    //   265: invokevirtual 72	java/util/Stack:pop	()Ljava/lang/Object;
    //   268: checkcast 74	com/whatsapp/sz
    //   271: getfield 98	com/whatsapp/sz:t	Ljava/lang/Object;
    //   274: checkcast 100	com/whatsapp/MediaData
    //   277: astore 5
    //   279: aload 5
    //   281: iconst_0
    //   282: putfield 150	com/whatsapp/MediaData:transferring	Z
    //   285: aload 5
    //   287: lconst_0
    //   288: putfield 154	com/whatsapp/MediaData:progress	J
    //   291: iload_1
    //   292: ifeq -47 -> 245
    //   295: aload_3
    //   296: monitorexit
    //   297: goto -72 -> 225
    //   300: astore 4
    //   302: aload_3
    //   303: monitorexit
    //   304: aload 4
    //   306: athrow
    //   307: astore 8
    //   309: aload 7
    //   311: monitorexit
    //   312: aload 8
    //   314: athrow
    //   315: astore 12
    //   317: new 76	java/lang/StringBuilder
    //   320: dup
    //   321: invokespecial 77	java/lang/StringBuilder:<init>	()V
    //   324: getstatic 30	com/whatsapp/p9:z	[Ljava/lang/String;
    //   327: iconst_1
    //   328: aaload
    //   329: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: aload 12
    //   334: invokevirtual 155	java/io/IOException:toString	()Ljava/lang/String;
    //   337: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   343: invokestatic 158	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   346: aload 11
    //   348: astore 13
    //   350: goto -145 -> 205
    //
    // Exception table:
    //   from	to	target	type
    //   29	42	226	finally
    //   228	231	226	finally
    //   4	29	234	java/lang/InterruptedException
    //   42	73	234	java/lang/InterruptedException
    //   120	145	234	java/lang/InterruptedException
    //   145	201	234	java/lang/InterruptedException
    //   205	220	234	java/lang/InterruptedException
    //   231	234	234	java/lang/InterruptedException
    //   312	346	234	java/lang/InterruptedException
    //   245	304	300	finally
    //   73	120	307	finally
    //   309	312	307	finally
    //   145	201	315	java/io/IOException
  }
}