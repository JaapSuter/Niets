package com.whatsapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class h5
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "9\030r".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
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
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 23;
      continue;
      m = 127;
      continue;
      m = 8;
      continue;
      m = 97;
    }
  }

  public static File a(File paramFile)
    throws IOException
  {
    return s4.a(paramFile, z);
  }

  public static ArrayList<File> a(File paramFile, int paramInt)
  {
    return s4.a(paramFile, paramInt, z);
  }

  public static boolean a(File paramFile1, File paramFile2)
  {
    return s4.a(paramFile1, paramFile2);
  }

  // ERROR //
  public static File b(File paramFile1, File paramFile2)
    throws IOException
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokevirtual 52	java/io/File:exists	()Z
    //   6: ifeq +149 -> 155
    //   9: aload_0
    //   10: new 54	java/util/Date
    //   13: dup
    //   14: invokespecial 56	java/util/Date:<init>	()V
    //   17: getstatic 26	com/whatsapp/h5:z	Ljava/lang/String;
    //   20: invokestatic 59	com/whatsapp/s4:a	(Ljava/io/File;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    //   23: astore 4
    //   25: new 48	java/io/File
    //   28: dup
    //   29: aload_0
    //   30: invokevirtual 63	java/io/File:getParentFile	()Ljava/io/File;
    //   33: aload 4
    //   35: invokespecial 66	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   38: astore_3
    //   39: new 68	java/util/zip/GZIPOutputStream
    //   42: dup
    //   43: new 70	java/io/FileOutputStream
    //   46: dup
    //   47: aload_3
    //   48: iconst_1
    //   49: invokespecial 73	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   52: invokespecial 76	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   55: astore 5
    //   57: new 78	java/io/FileInputStream
    //   60: dup
    //   61: aload_1
    //   62: invokespecial 81	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   65: astore 6
    //   67: aload 5
    //   69: invokestatic 87	java/nio/channels/Channels:newChannel	(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    //   72: astore 11
    //   74: aload 11
    //   76: astore 9
    //   78: aload 6
    //   80: invokevirtual 91	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   83: astore 13
    //   85: aload 13
    //   87: astore 8
    //   89: aload 8
    //   91: aload 9
    //   93: invokestatic 94	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   96: aload 8
    //   98: ifnull +8 -> 106
    //   101: aload 8
    //   103: invokevirtual 99	java/nio/channels/FileChannel:close	()V
    //   106: aload 9
    //   108: ifnull +10 -> 118
    //   111: aload 9
    //   113: invokeinterface 102 1 0
    //   118: aload_3
    //   119: invokevirtual 52	java/io/File:exists	()Z
    //   122: ifeq +33 -> 155
    //   125: aload_3
    //   126: areturn
    //   127: astore 10
    //   129: aconst_null
    //   130: astore 9
    //   132: aload_2
    //   133: ifnull +7 -> 140
    //   136: aload_2
    //   137: invokevirtual 99	java/nio/channels/FileChannel:close	()V
    //   140: aload 9
    //   142: ifnull +10 -> 152
    //   145: aload 9
    //   147: invokeinterface 102 1 0
    //   152: aload 10
    //   154: athrow
    //   155: aconst_null
    //   156: astore_3
    //   157: goto -32 -> 125
    //   160: astore 7
    //   162: aconst_null
    //   163: astore 8
    //   165: aconst_null
    //   166: astore 9
    //   168: aload 8
    //   170: ifnull +8 -> 178
    //   173: aload 8
    //   175: invokevirtual 99	java/nio/channels/FileChannel:close	()V
    //   178: aload 9
    //   180: ifnull -62 -> 118
    //   183: goto -72 -> 111
    //   186: astore 10
    //   188: goto -56 -> 132
    //   191: astore 10
    //   193: aload 8
    //   195: astore_2
    //   196: goto -64 -> 132
    //   199: astore 12
    //   201: aconst_null
    //   202: astore 8
    //   204: goto -36 -> 168
    //   207: astore 14
    //   209: goto -41 -> 168
    //
    // Exception table:
    //   from	to	target	type
    //   39	74	127	finally
    //   39	74	160	java/io/FileNotFoundException
    //   78	85	186	finally
    //   89	96	191	finally
    //   78	85	199	java/io/FileNotFoundException
    //   89	96	207	java/io/FileNotFoundException
  }

  public static void b(File paramFile, int paramInt)
  {
    s4.b(paramFile, paramInt, z);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.h5
 * JD-Core Version:    0.6.1
 */