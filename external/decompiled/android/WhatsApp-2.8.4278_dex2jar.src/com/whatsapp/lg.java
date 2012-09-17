package com.whatsapp;

import android.view.View.OnClickListener;

class lg
  implements View.OnClickListener
{
  private static final String[] z;
  final Advanced a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "h\024R\t.g\024EPzd[q4.h\032P\024".toCharArray();
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
      arrayOfChar2 = "G\024E\003".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "|\023C\004}j\013R^bd\034".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "f\024W\036zn\037".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "X?\002\023oy\037\002\036a[C\006ob\027C\022bnTP\025oo\002".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
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
        m = 14;
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
        m = 11;
        continue;
        m = 123;
        continue;
        m = 34;
        continue;
        m = 112;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 14;
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
      i3 = 11;
      continue;
      i3 = 123;
      continue;
      i3 = 34;
      continue;
      i3 = 112;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 14;
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
      i7 = 11;
      continue;
      i7 = 123;
      continue;
      i7 = 34;
      continue;
      i7 = 112;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 14;
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
      i11 = 11;
      continue;
      i11 = 123;
      continue;
      i11 = 34;
      continue;
      i11 = 112;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 14;
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
      i15 = 11;
      continue;
      i15 = 123;
      continue;
      i15 = 34;
      continue;
      i15 = 112;
    }
  }

  lg(Advanced paramAdvanced)
  {
  }

  // ERROR //
  public void onClick(android.view.View paramView)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 38	com/whatsapp/lg:z	[Ljava/lang/String;
    //   5: iconst_0
    //   6: aaload
    //   7: invokestatic 53	com/whatsapp/App:d	(Ljava/lang/String;)V
    //   10: invokestatic 58	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   13: getstatic 38	com/whatsapp/lg:z	[Ljava/lang/String;
    //   16: iconst_3
    //   17: aaload
    //   18: invokevirtual 62	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   21: ifeq +132 -> 153
    //   24: new 64	java/io/File
    //   27: dup
    //   28: new 64	java/io/File
    //   31: dup
    //   32: getstatic 68	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   35: invokevirtual 72	com/whatsapp/App:getFilesDir	()Ljava/io/File;
    //   38: getstatic 38	com/whatsapp/lg:z	[Ljava/lang/String;
    //   41: iconst_1
    //   42: aaload
    //   43: invokespecial 75	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: getstatic 38	com/whatsapp/lg:z	[Ljava/lang/String;
    //   49: iconst_2
    //   50: aaload
    //   51: invokespecial 75	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   54: astore_3
    //   55: getstatic 79	com/whatsapp/App:c	Ljava/io/File;
    //   58: invokevirtual 83	java/io/File:exists	()Z
    //   61: ifne +10 -> 71
    //   64: getstatic 79	com/whatsapp/App:c	Ljava/io/File;
    //   67: invokevirtual 86	java/io/File:mkdirs	()Z
    //   70: pop
    //   71: new 64	java/io/File
    //   74: dup
    //   75: getstatic 79	com/whatsapp/App:c	Ljava/io/File;
    //   78: getstatic 38	com/whatsapp/lg:z	[Ljava/lang/String;
    //   81: iconst_2
    //   82: aaload
    //   83: invokespecial 75	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   86: astore 4
    //   88: new 88	com/whatsapp/pf
    //   91: dup
    //   92: getstatic 92	com/whatsapp/App:B	Lcom/whatsapp/w5;
    //   95: aload 4
    //   97: invokespecial 95	com/whatsapp/pf:<init>	(Lcom/whatsapp/w5;Ljava/io/File;)V
    //   100: invokestatic 101	java/nio/channels/Channels:newChannel	(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    //   103: astore 8
    //   105: aload 8
    //   107: astore 6
    //   109: new 103	java/io/FileInputStream
    //   112: dup
    //   113: aload_3
    //   114: invokespecial 106	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   117: invokevirtual 110	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   120: astore_2
    //   121: aload_2
    //   122: aload 6
    //   124: invokestatic 115	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   127: aload_2
    //   128: ifnull +7 -> 135
    //   131: aload_2
    //   132: invokevirtual 120	java/nio/channels/FileChannel:close	()V
    //   135: aload 6
    //   137: ifnull +10 -> 147
    //   140: aload 6
    //   142: invokeinterface 123 1 0
    //   147: getstatic 129	com/whatsapp/DialogToastListActivity:f	Z
    //   150: ifeq +11 -> 161
    //   153: getstatic 38	com/whatsapp/lg:z	[Ljava/lang/String;
    //   156: iconst_4
    //   157: aaload
    //   158: invokestatic 53	com/whatsapp/App:d	(Ljava/lang/String;)V
    //   161: return
    //   162: astore 5
    //   164: aconst_null
    //   165: astore 6
    //   167: aload_2
    //   168: ifnull +7 -> 175
    //   171: aload_2
    //   172: invokevirtual 120	java/nio/channels/FileChannel:close	()V
    //   175: aload 6
    //   177: ifnull +10 -> 187
    //   180: aload 6
    //   182: invokeinterface 123 1 0
    //   187: aload 5
    //   189: athrow
    //   190: astore 7
    //   192: goto -45 -> 147
    //   195: astore 5
    //   197: goto -30 -> 167
    //
    // Exception table:
    //   from	to	target	type
    //   88	105	162	finally
    //   131	147	190	java/io/IOException
    //   171	190	190	java/io/IOException
    //   109	127	195	finally
  }
}