package com.whatsapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class pf extends OutputStream
{
  private static final String z;
  final File a;
  final File b;
  final FileOutputStream c;
  boolean d;

  static
  {
    char[] arrayOfChar = "aFivWUJkr\024B{j3\037FFiv\035".toCharArray();
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
      m = 121;
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
      m = 39;
      continue;
      m = 47;
      continue;
      m = 5;
      continue;
      m = 19;
    }
  }

  public pf(w5 paramw5, File paramFile)
    throws IOException, FileNotFoundException
  {
    this(paramw5, paramFile, false);
  }

  // ERROR //
  public pf(w5 paramw5, File paramFile, boolean paramBoolean)
    throws IOException, FileNotFoundException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 43	java/io/OutputStream:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 45	com/whatsapp/pf:d	Z
    //   9: aload_0
    //   10: aload_1
    //   11: invokevirtual 50	com/whatsapp/w5:c	()Ljava/io/File;
    //   14: putfield 52	com/whatsapp/pf:a	Ljava/io/File;
    //   17: aload_0
    //   18: aload_2
    //   19: putfield 54	com/whatsapp/pf:b	Ljava/io/File;
    //   22: aload_0
    //   23: new 56	java/io/FileOutputStream
    //   26: dup
    //   27: aload_0
    //   28: getfield 52	com/whatsapp/pf:a	Ljava/io/File;
    //   31: invokespecial 59	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   34: putfield 61	com/whatsapp/pf:c	Ljava/io/FileOutputStream;
    //   37: iload_3
    //   38: iconst_1
    //   39: if_icmpne +54 -> 93
    //   42: aload_0
    //   43: getfield 54	com/whatsapp/pf:b	Ljava/io/File;
    //   46: invokevirtual 67	java/io/File:exists	()Z
    //   49: ifeq +44 -> 93
    //   52: aconst_null
    //   53: astore 4
    //   55: new 69	java/io/FileInputStream
    //   58: dup
    //   59: aload_0
    //   60: getfield 54	com/whatsapp/pf:b	Ljava/io/File;
    //   63: invokespecial 70	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   66: astore 5
    //   68: aload 5
    //   70: invokevirtual 74	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   73: aload_0
    //   74: getfield 61	com/whatsapp/pf:c	Ljava/io/FileOutputStream;
    //   77: invokevirtual 75	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   80: invokestatic 80	com/whatsapp/s4:a	(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    //   83: aload 5
    //   85: ifnull +8 -> 93
    //   88: aload 5
    //   90: invokevirtual 83	java/io/FileInputStream:close	()V
    //   93: return
    //   94: astore 8
    //   96: aload_0
    //   97: getfield 61	com/whatsapp/pf:c	Ljava/io/FileOutputStream;
    //   100: invokevirtual 84	java/io/FileOutputStream:close	()V
    //   103: aload 8
    //   105: athrow
    //   106: astore 9
    //   108: aload 4
    //   110: ifnull +8 -> 118
    //   113: aload 4
    //   115: invokevirtual 83	java/io/FileInputStream:close	()V
    //   118: aload 9
    //   120: athrow
    //   121: astore 11
    //   123: aconst_null
    //   124: astore 5
    //   126: aload 5
    //   128: ifnull -35 -> 93
    //   131: goto -43 -> 88
    //   134: astore 10
    //   136: aload 5
    //   138: astore 4
    //   140: aload 10
    //   142: astore 9
    //   144: goto -36 -> 108
    //   147: astore 7
    //   149: aload 5
    //   151: astore 4
    //   153: aload 7
    //   155: astore 8
    //   157: goto -61 -> 96
    //   160: astore 6
    //   162: goto -36 -> 126
    //
    // Exception table:
    //   from	to	target	type
    //   55	68	94	java/io/IOException
    //   55	68	106	finally
    //   96	106	106	finally
    //   55	68	121	java/io/FileNotFoundException
    //   68	83	134	finally
    //   68	83	147	java/io/IOException
    //   68	83	160	java/io/FileNotFoundException
  }

  public void close()
    throws IOException
  {
    try
    {
      if (!this.d)
      {
        this.d = true;
        this.c.close();
        this.b.delete();
        if (!this.a.renameTo(this.b))
          throw new IOException(z);
      }
    }
    finally
    {
    }
  }

  public void flush()
    throws IOException
  {
    this.c.flush();
  }

  public void write(int paramInt)
    throws IOException
  {
    this.c.write(paramInt);
  }

  public void write(byte[] paramArrayOfByte)
    throws IOException
  {
    this.c.write(paramArrayOfByte);
  }

  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, IndexOutOfBoundsException
  {
    this.c.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}