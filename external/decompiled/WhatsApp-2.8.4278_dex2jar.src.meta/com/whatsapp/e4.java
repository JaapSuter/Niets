package com.whatsapp;

import android.os.Handler;
import java.io.File;
import java.io.IOException;

public class e4
{
  public static Statistics.Data a;
  private static File b;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "\0013*)G\036?\"!R\03396`C��$72\006Z\005,!R\033%,)E\001x\034!R\023".toCharArray();
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
      arrayOfChar2 = "\001\"94O\001\"1#U".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\001\"94O\001\"1#UR".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\027$*/TR:7!B\0338?`U\0067,)U\006?;3\006\024?4%".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\027$*/TR%96O\0341x3R\023\"13R\0335+`@\033:=".toCharArray();
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
        m = 38;
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
        m = 114;
        continue;
        m = 86;
        continue;
        m = 88;
        continue;
        m = 64;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 38;
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
      i3 = 114;
      continue;
      i3 = 86;
      continue;
      i3 = 88;
      continue;
      i3 = 64;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 38;
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
      i7 = 114;
      continue;
      i7 = 86;
      continue;
      i7 = 88;
      continue;
      i7 = 64;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 38;
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
      i11 = 114;
      continue;
      i11 = 86;
      continue;
      i11 = 88;
      continue;
      i11 = 64;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 38;
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
      i15 = 114;
      continue;
      i15 = 86;
      continue;
      i15 = 88;
      continue;
      i15 = 64;
    }
  }

  public static void a(long paramLong, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      return;
      Statistics.Data localData3 = a;
      localData3.rx_media_bytes = (paramLong + localData3.rx_media_bytes);
      if (bool)
      {
        Statistics.Data localData2 = a;
        localData2.rx_cold_sync_bytes = (paramLong + localData2.rx_cold_sync_bytes);
        if (bool)
        {
          Statistics.Data localData1 = a;
          localData1.rx_message_service_bytes = (paramLong + localData1.rx_message_service_bytes);
        }
      }
    }
  }

  public static void a(sz paramsz)
  {
    long l1 = System.currentTimeMillis() - paramsz.i;
    if (l1 > 1000L)
    {
      Statistics.Data localData3 = a;
      long l2 = l1 + a.rx_offline_delay * a.rx_offline_msgs;
      Statistics.Data localData4 = a;
      long l3 = 1L + localData4.rx_offline_msgs;
      localData4.rx_offline_msgs = l3;
      localData3.rx_offline_delay = (l2 / l3);
    }
    if (paramsz.l == 0)
    {
      Statistics.Data localData2 = a;
      localData2.rx_text_msgs = (1L + localData2.rx_text_msgs);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Statistics.Data localData1 = a;
      localData1.rx_media_msgs = (1L + localData1.rx_media_msgs);
    }
  }

  public static void a(File paramFile)
  {
    b = new File(paramFile, z[1]);
    try
    {
      boolean bool2 = a();
      bool1 = bool2;
      Handler localHandler = new Handler();
      localHandler.postDelayed(new f4(localHandler), 900000L);
      if (!bool1)
        a = new Statistics.Data(false);
      g5.b(z[2] + a.toString());
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.b(z[3], localIOException);
        boolean bool1 = false;
      }
    }
  }

  // ERROR //
  public static boolean a()
    throws IOException
  {
    // Byte code:
    //   0: getstatic 99	com/whatsapp/e4:b	Ljava/io/File;
    //   3: invokevirtual 146	java/io/File:exists	()Z
    //   6: ifeq +122 -> 128
    //   9: aconst_null
    //   10: astore_1
    //   11: new 148	java/io/ObjectInputStream
    //   14: dup
    //   15: new 150	java/io/FileInputStream
    //   18: dup
    //   19: getstatic 99	com/whatsapp/e4:b	Ljava/io/File;
    //   22: invokespecial 152	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   25: invokespecial 155	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   28: astore_2
    //   29: aload_2
    //   30: invokevirtual 159	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   33: checkcast 49	com/whatsapp/Statistics$Data
    //   36: putstatic 47	com/whatsapp/e4:a	Lcom/whatsapp/Statistics$Data;
    //   39: aload_2
    //   40: ifnull +7 -> 47
    //   43: aload_2
    //   44: invokevirtual 162	java/io/ObjectInputStream:close	()V
    //   47: iconst_1
    //   48: istore_0
    //   49: iload_0
    //   50: ireturn
    //   51: astore_3
    //   52: aconst_null
    //   53: astore_2
    //   54: getstatic 38	com/whatsapp/e4:z	[Ljava/lang/String;
    //   57: iconst_0
    //   58: aaload
    //   59: aload_3
    //   60: invokestatic 164	com/whatsapp/g5:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   63: getstatic 99	com/whatsapp/e4:b	Ljava/io/File;
    //   66: invokevirtual 167	java/io/File:delete	()Z
    //   69: pop
    //   70: aload_2
    //   71: ifnull +7 -> 78
    //   74: aload_2
    //   75: invokevirtual 162	java/io/ObjectInputStream:close	()V
    //   78: iconst_0
    //   79: istore_0
    //   80: goto -31 -> 49
    //   83: astore 6
    //   85: getstatic 38	com/whatsapp/e4:z	[Ljava/lang/String;
    //   88: iconst_0
    //   89: aaload
    //   90: aload 6
    //   92: invokestatic 164	com/whatsapp/g5:a	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: getstatic 99	com/whatsapp/e4:b	Ljava/io/File;
    //   98: invokevirtual 167	java/io/File:delete	()Z
    //   101: pop
    //   102: aload_1
    //   103: ifnull +7 -> 110
    //   106: aload_1
    //   107: invokevirtual 162	java/io/ObjectInputStream:close	()V
    //   110: iconst_0
    //   111: istore_0
    //   112: goto -63 -> 49
    //   115: astore 4
    //   117: aload_1
    //   118: ifnull +7 -> 125
    //   121: aload_1
    //   122: invokevirtual 162	java/io/ObjectInputStream:close	()V
    //   125: aload 4
    //   127: athrow
    //   128: iconst_0
    //   129: istore_0
    //   130: goto -81 -> 49
    //   133: astore 4
    //   135: aload_2
    //   136: astore_1
    //   137: goto -20 -> 117
    //   140: astore 6
    //   142: aload_2
    //   143: astore_1
    //   144: goto -59 -> 85
    //   147: astore_3
    //   148: goto -94 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   11	29	51	java/lang/ClassNotFoundException
    //   11	29	83	java/io/InvalidClassException
    //   11	29	115	finally
    //   85	102	115	finally
    //   29	39	133	finally
    //   54	70	133	finally
    //   29	39	140	java/io/InvalidClassException
    //   29	39	147	java/lang/ClassNotFoundException
  }

  // ERROR //
  public static void b()
    throws IOException
  {
    // Byte code:
    //   0: new 169	java/io/ObjectOutputStream
    //   3: dup
    //   4: new 171	com/whatsapp/pf
    //   7: dup
    //   8: getstatic 177	com/whatsapp/App:C	Lcom/whatsapp/w5;
    //   11: getstatic 99	com/whatsapp/e4:b	Ljava/io/File;
    //   14: invokespecial 180	com/whatsapp/pf:<init>	(Lcom/whatsapp/w5;Ljava/io/File;)V
    //   17: invokespecial 183	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   20: astore_0
    //   21: aload_0
    //   22: getstatic 47	com/whatsapp/e4:a	Lcom/whatsapp/Statistics$Data;
    //   25: invokevirtual 187	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   28: aload_0
    //   29: ifnull +7 -> 36
    //   32: aload_0
    //   33: invokevirtual 188	java/io/ObjectOutputStream:close	()V
    //   36: return
    //   37: astore_1
    //   38: aconst_null
    //   39: astore_0
    //   40: aload_0
    //   41: ifnull +7 -> 48
    //   44: aload_0
    //   45: invokevirtual 188	java/io/ObjectOutputStream:close	()V
    //   48: aload_1
    //   49: athrow
    //   50: astore_1
    //   51: goto -11 -> 40
    //
    // Exception table:
    //   from	to	target	type
    //   0	21	37	finally
    //   21	28	50	finally
  }

  public static void b(long paramLong, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      return;
      Statistics.Data localData3 = a;
      localData3.tx_media_bytes = (paramLong + localData3.tx_media_bytes);
      if (bool)
      {
        Statistics.Data localData2 = a;
        localData2.tx_cold_sync_bytes = (paramLong + localData2.tx_cold_sync_bytes);
        if (bool)
        {
          Statistics.Data localData1 = a;
          localData1.tx_message_service_bytes = (paramLong + localData1.tx_message_service_bytes);
        }
      }
    }
  }

  public static void b(sz paramsz)
  {
    if (paramsz.l == 0)
    {
      Statistics.Data localData2 = a;
      localData2.tx_text_msgs = (1L + localData2.tx_text_msgs);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Statistics.Data localData1 = a;
      localData1.tx_media_msgs = (1L + localData1.tx_media_msgs);
    }
  }

  public static void c()
  {
    a = new Statistics.Data(true);
    try
    {
      b();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.b(z[4], localIOException);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.e4
 * JD-Core Version:    0.6.1
 */