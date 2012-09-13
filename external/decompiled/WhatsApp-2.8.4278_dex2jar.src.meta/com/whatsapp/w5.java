package com.whatsapp;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class w5
{
  private static final String[] z;
  private final File a;
  private File b = null;
  private boolean c = false;
  private final Lock d = new ReentrantLock();

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "_Fd\026\030\004Qh\025\004R\031q\027\021X\\*\n\005_\031j\003]FQh\n\002R\024".toCharArray();
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
      arrayOfChar2 = "_Fd\026\030\004P`\t\025_Q(\027\025HAw\026\031]Q*\n\005_\031j\003]FQh\n\002R\024".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "FU}E\002N@w\f\025X\024w��\021H\\`\001P\\\\l\t\025\013Ww��\021_]k\002P_Qh\025PO]w".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "FU}E\002N@w\f\025X\024w��\021H\\`\001P\\\\l\t\025\013Yj\023\031ES%\003\031GQ%\021\037\013@w\004\003C".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "FU}E\002N@w\f\025X\024w��\021H\\`\001P\\\\l\t\025\013Ww��\021_]k\002P_Qh\025PM]i��".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label540;
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
        m = 112;
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
        m = 43;
        continue;
        m = 52;
        continue;
        m = 5;
        continue;
        m = 101;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 112;
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
      i3 = 43;
      continue;
      i3 = 52;
      continue;
      i3 = 5;
      continue;
      i3 = 101;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 112;
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
      i7 = 43;
      continue;
      i7 = 52;
      continue;
      i7 = 5;
      continue;
      i7 = 101;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 112;
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
      i11 = 43;
      continue;
      i11 = 52;
      continue;
      i11 = 5;
      continue;
      i11 = 101;
    }
    label540: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 112;
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
      i15 = 43;
      continue;
      i15 = 52;
      continue;
      i15 = 5;
      continue;
      i15 = 101;
    }
  }

  public w5(File paramFile)
  {
    this.a = paramFile;
  }

  private void a()
  {
    if (!this.a.exists())
    {
      this.a.mkdirs();
      if (!this.a.exists())
        this.a.mkdir();
    }
  }

  private void b()
    throws IOException
  {
    while (true)
    {
      int k;
      try
      {
        int i = g5.n;
        a();
        if ((this.b == null) || (!this.b.exists()))
        {
          j = 0;
          this.b = new File(this.a, UUID.randomUUID().toString());
          k = j + 1;
          if ((j < 10) && (!this.b.mkdir()))
          {
            this.b = new File(this.a, UUID.randomUUID().toString());
            if (i == 0)
              break label124;
          }
          if (k > 10)
            throw new IOException(z[2]);
        }
      }
      finally
      {
      }
      return;
      label124: int j = k;
    }
  }

  public static boolean b(File paramFile)
  {
    boolean bool1 = false;
    int i = g5.n;
    if (paramFile.isDirectory());
    try
    {
      File[] arrayOfFile = paramFile.listFiles();
      int k;
      if (arrayOfFile != null)
      {
        int j = arrayOfFile.length;
        k = 0;
        if (k < j)
        {
          boolean bool2 = b(arrayOfFile[k]);
          if (bool2);
        }
      }
      while (true)
      {
        return bool1;
        k++;
        if (i == 0)
          break;
        bool1 = paramFile.delete();
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        g5.d(z[1] + paramFile.getAbsolutePath());
    }
  }

  public void a(File paramFile)
    throws IOException
  {
    int i = g5.n;
    a();
    int j = 0;
    File localFile = new File(this.a, UUID.randomUUID().toString());
    int k;
    if (paramFile.exists())
    {
      k = j + 1;
      if ((j < 10) && (!paramFile.renameTo(localFile)))
      {
        localFile = new File(this.a, UUID.randomUUID().toString());
        if (i == 0)
          break label100;
      }
    }
    while (true)
    {
      if (k > 10)
        throw new IOException(z[3]);
      return;
      label100: j = k;
      break;
      k = j;
    }
  }

  public File c()
    throws IOException
  {
    int i = g5.n;
    b();
    int j = 0;
    File localFile = new File(this.b, UUID.randomUUID().toString());
    while (true)
    {
      int k = j + 1;
      if ((j < 10) && (!localFile.createNewFile()))
      {
        localFile = new File(this.b, UUID.randomUUID().toString());
        if (i == 0);
      }
      else
      {
        if (k > 10)
          throw new IOException(z[4]);
        return localFile;
      }
      j = k;
    }
  }

  public File d()
    throws IOException
  {
    a();
    return this.a;
  }

  // ERROR //
  public void e()
  {
    // Byte code:
    //   0: getstatic 75	com/whatsapp/g5:n	I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield 55	com/whatsapp/w5:a	Ljava/io/File;
    //   8: invokevirtual 61	java/io/File:exists	()Z
    //   11: ifeq +136 -> 147
    //   14: aload_0
    //   15: getfield 53	com/whatsapp/w5:d	Ljava/util/concurrent/locks/Lock;
    //   18: invokeinterface 135 1 0
    //   23: aload_0
    //   24: iconst_1
    //   25: putfield 48	com/whatsapp/w5:c	Z
    //   28: iconst_0
    //   29: anewarray 57	java/io/File
    //   32: astore_3
    //   33: aload_0
    //   34: getfield 55	com/whatsapp/w5:a	Ljava/io/File;
    //   37: invokevirtual 102	java/io/File:listFiles	()[Ljava/io/File;
    //   40: astore 11
    //   42: aload 11
    //   44: astore 5
    //   46: aload 5
    //   48: ifnull +85 -> 133
    //   51: aload 5
    //   53: arraylength
    //   54: istore 6
    //   56: iconst_0
    //   57: istore 7
    //   59: iload 7
    //   61: iload 6
    //   63: if_icmpge +70 -> 133
    //   66: aload 5
    //   68: iload 7
    //   70: aaload
    //   71: astore 8
    //   73: aload_0
    //   74: getfield 46	com/whatsapp/w5:b	Ljava/io/File;
    //   77: ifnull +25 -> 102
    //   80: aload 8
    //   82: invokevirtual 138	java/io/File:getName	()Ljava/lang/String;
    //   85: aload_0
    //   86: getfield 46	com/whatsapp/w5:b	Ljava/io/File;
    //   89: invokevirtual 138	java/io/File:getName	()Ljava/lang/String;
    //   92: invokevirtual 142	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: ifeq +7 -> 102
    //   98: iload_1
    //   99: ifeq +27 -> 126
    //   102: aload_0
    //   103: getfield 53	com/whatsapp/w5:d	Ljava/util/concurrent/locks/Lock;
    //   106: invokeinterface 145 1 0
    //   111: aload 8
    //   113: invokestatic 104	com/whatsapp/w5:b	(Ljava/io/File;)Z
    //   116: pop
    //   117: aload_0
    //   118: getfield 53	com/whatsapp/w5:d	Ljava/util/concurrent/locks/Lock;
    //   121: invokeinterface 135 1 0
    //   126: iinc 7 1
    //   129: iload_1
    //   130: ifeq -71 -> 59
    //   133: aload_0
    //   134: iconst_0
    //   135: putfield 48	com/whatsapp/w5:c	Z
    //   138: aload_0
    //   139: getfield 53	com/whatsapp/w5:d	Ljava/util/concurrent/locks/Lock;
    //   142: invokeinterface 145 1 0
    //   147: return
    //   148: astore 4
    //   150: new 109	java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial 110	java/lang/StringBuilder:<init>	()V
    //   157: getstatic 41	com/whatsapp/w5:z	[Ljava/lang/String;
    //   160: iconst_0
    //   161: aaload
    //   162: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_0
    //   166: getfield 55	com/whatsapp/w5:a	Ljava/io/File;
    //   169: invokevirtual 117	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   172: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokestatic 120	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   181: aload_3
    //   182: astore 5
    //   184: goto -138 -> 46
    //   187: astore 9
    //   189: aload_0
    //   190: getfield 53	com/whatsapp/w5:d	Ljava/util/concurrent/locks/Lock;
    //   193: invokeinterface 135 1 0
    //   198: aload 9
    //   200: athrow
    //   201: astore_2
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield 48	com/whatsapp/w5:c	Z
    //   207: aload_0
    //   208: getfield 53	com/whatsapp/w5:d	Ljava/util/concurrent/locks/Lock;
    //   211: invokeinterface 145 1 0
    //   216: aload_2
    //   217: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   33	42	148	java/lang/OutOfMemoryError
    //   111	117	187	finally
    //   28	33	201	finally
    //   33	42	201	finally
    //   51	111	201	finally
    //   117	126	201	finally
    //   150	201	201	finally
  }

  public void f()
  {
    this.d.lock();
    if (!this.c)
    {
      this.d.unlock();
      new x9(this).start();
      if (g5.n == 0);
    }
    else
    {
      this.d.unlock();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.w5
 * JD-Core Version:    0.6.1
 */