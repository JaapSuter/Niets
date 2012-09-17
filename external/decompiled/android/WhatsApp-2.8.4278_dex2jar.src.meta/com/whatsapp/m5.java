package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class m5
{
  private static final HashMap<String, Integer> c;
  private static final m5 d;
  public static BitmapFactory.Options e;
  private static final String[] z;
  private HashMap<uz, SoftReference<Bitmap>> a = new HashMap();
  private bab<uz, Bitmap> b;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "[=rfb\037${tjPq`tWf',cW3|eb\035=vrtS7v/b\\3|en\\7)".toCharArray();
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
      arrayOfChar2 = "[=rfb\037${tjPq`tWf',cW3|eb\035=vrtS7v/cS$r;".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\023q3sbQ)pmbVp~dtA1td'[>3if@43bfQ8v".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label364;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "[=rfb\037${tjPq`tWf',cW3|eb\0355ash@".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label452;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        z = arrayOfString;
        c = new HashMap();
        d = new m5(50);
        e = new BitmapFactory.Options();
        e.inDither = true;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 7;
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
        m = 50;
        continue;
        m = 80;
        continue;
        m = 19;
        continue;
        m = 1;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 7;
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
      i3 = 50;
      continue;
      i3 = 80;
      continue;
      i3 = 19;
      continue;
      i3 = 1;
    }
    label364: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 7;
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
      i7 = 50;
      continue;
      i7 = 80;
      continue;
      i7 = 19;
      continue;
      i7 = 1;
    }
    label452: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 7;
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
      i11 = 50;
      continue;
      i11 = 80;
      continue;
      i11 = 19;
      continue;
      i11 = 1;
    }
  }

  private m5(int paramInt)
  {
    this.b = new cab(this, paramInt);
  }

  // ERROR //
  private Bitmap a(sz paramsz)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual 84	com/whatsapp/sz:a	()Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifne +11 -> 19
    //   11: aconst_null
    //   12: astore 4
    //   14: aload_0
    //   15: monitorexit
    //   16: aload 4
    //   18: areturn
    //   19: aload_0
    //   20: getfield 74	com/whatsapp/m5:b	Lcom/whatsapp/bab;
    //   23: aload_1
    //   24: getfield 87	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   27: invokevirtual 93	com/whatsapp/bab:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: checkcast 95	android/graphics/Bitmap
    //   33: astore 4
    //   35: aload 4
    //   37: ifnull +11 -> 48
    //   40: aload 4
    //   42: invokevirtual 98	android/graphics/Bitmap:isRecycled	()Z
    //   45: ifeq -31 -> 14
    //   48: aload 4
    //   50: ifnull +19 -> 69
    //   53: aload 4
    //   55: invokevirtual 98	android/graphics/Bitmap:isRecycled	()Z
    //   58: ifeq +11 -> 69
    //   61: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   64: iconst_2
    //   65: aaload
    //   66: invokestatic 103	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   69: aload_0
    //   70: getfield 67	com/whatsapp/m5:a	Ljava/util/HashMap;
    //   73: aload_1
    //   74: getfield 87	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   77: invokevirtual 104	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast 106	java/lang/ref/SoftReference
    //   83: astore 5
    //   85: aload 5
    //   87: ifnull +379 -> 466
    //   90: aload 5
    //   92: invokevirtual 109	java/lang/ref/SoftReference:get	()Ljava/lang/Object;
    //   95: checkcast 95	android/graphics/Bitmap
    //   98: astore 6
    //   100: aload 6
    //   102: ifnull +11 -> 113
    //   105: aload 6
    //   107: invokevirtual 98	android/graphics/Bitmap:isRecycled	()Z
    //   110: ifeq +349 -> 459
    //   113: aload 5
    //   115: ifnull +15 -> 130
    //   118: aload_0
    //   119: getfield 67	com/whatsapp/m5:a	Ljava/util/HashMap;
    //   122: aload_1
    //   123: getfield 87	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   126: invokevirtual 112	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   129: pop
    //   130: aload_1
    //   131: getfield 116	com/whatsapp/sz:h	I
    //   134: ifne +175 -> 309
    //   137: aload_1
    //   138: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   141: ifnull +312 -> 453
    //   144: aload_1
    //   145: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   148: invokevirtual 122	java/lang/String:length	()I
    //   151: ifle +302 -> 453
    //   154: aload_1
    //   155: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   158: invokestatic 127	wb:a	(Ljava/lang/String;)[B
    //   161: astore 12
    //   163: aload 12
    //   165: ifnull +282 -> 447
    //   168: aload 12
    //   170: iconst_0
    //   171: aload 12
    //   173: arraylength
    //   174: getstatic 60	com/whatsapp/m5:e	Landroid/graphics/BitmapFactory$Options;
    //   177: invokestatic 133	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   180: astore 13
    //   182: aload 13
    //   184: astore 4
    //   186: aload_0
    //   187: getfield 74	com/whatsapp/m5:b	Lcom/whatsapp/bab;
    //   190: aload_1
    //   191: getfield 87	com/whatsapp/sz:b	Lcom/whatsapp/uz;
    //   194: aload 4
    //   196: invokevirtual 137	com/whatsapp/bab:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: goto -186 -> 14
    //   203: astore 8
    //   205: new 139	java/lang/StringBuilder
    //   208: dup
    //   209: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   212: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   215: iconst_0
    //   216: aaload
    //   217: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: aload_1
    //   221: getfield 116	com/whatsapp/sz:h	I
    //   224: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   227: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokestatic 103	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   233: aload_1
    //   234: getfield 116	com/whatsapp/sz:h	I
    //   237: ifne +54 -> 291
    //   240: aload_1
    //   241: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   244: ifnull +47 -> 291
    //   247: new 139	java/lang/StringBuilder
    //   250: dup
    //   251: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   254: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   257: iconst_1
    //   258: aaload
    //   259: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload_1
    //   263: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   266: iconst_0
    //   267: bipush 100
    //   269: aload_1
    //   270: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   273: invokevirtual 122	java/lang/String:length	()I
    //   276: invokestatic 156	java/lang/Math:min	(II)I
    //   279: invokevirtual 160	java/lang/String:substring	(II)Ljava/lang/String;
    //   282: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: invokestatic 103	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   291: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   294: iconst_3
    //   295: aaload
    //   296: aload 8
    //   298: invokestatic 163	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   301: goto -287 -> 14
    //   304: astore_2
    //   305: aload_0
    //   306: monitorexit
    //   307: aload_2
    //   308: athrow
    //   309: aload_1
    //   310: invokevirtual 166	com/whatsapp/sz:c	()[B
    //   313: astore 11
    //   315: aload 11
    //   317: astore 12
    //   319: goto -156 -> 163
    //   322: astore 9
    //   324: aload 9
    //   326: astore 10
    //   328: aconst_null
    //   329: astore 4
    //   331: new 139	java/lang/StringBuilder
    //   334: dup
    //   335: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   338: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   341: iconst_0
    //   342: aaload
    //   343: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_1
    //   347: getfield 116	com/whatsapp/sz:h	I
    //   350: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   353: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: invokestatic 103	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   359: aload_1
    //   360: getfield 116	com/whatsapp/sz:h	I
    //   363: ifne +54 -> 417
    //   366: aload_1
    //   367: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   370: ifnull +47 -> 417
    //   373: new 139	java/lang/StringBuilder
    //   376: dup
    //   377: invokespecial 140	java/lang/StringBuilder:<init>	()V
    //   380: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   383: iconst_1
    //   384: aaload
    //   385: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: aload_1
    //   389: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   392: iconst_0
    //   393: bipush 100
    //   395: aload_1
    //   396: invokevirtual 118	com/whatsapp/sz:b	()Ljava/lang/String;
    //   399: invokevirtual 122	java/lang/String:length	()I
    //   402: invokestatic 156	java/lang/Math:min	(II)I
    //   405: invokevirtual 160	java/lang/String:substring	(II)Ljava/lang/String;
    //   408: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   414: invokestatic 103	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   417: getstatic 44	com/whatsapp/m5:z	[Ljava/lang/String;
    //   420: iconst_3
    //   421: aaload
    //   422: aload 10
    //   424: invokestatic 163	com/whatsapp/g5:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   427: goto -413 -> 14
    //   430: astore 10
    //   432: goto -101 -> 331
    //   435: astore 7
    //   437: aload 7
    //   439: astore 8
    //   441: aconst_null
    //   442: astore 4
    //   444: goto -239 -> 205
    //   447: aconst_null
    //   448: astore 4
    //   450: goto -436 -> 14
    //   453: aconst_null
    //   454: astore 12
    //   456: goto -293 -> 163
    //   459: aload 6
    //   461: astore 4
    //   463: goto -449 -> 14
    //   466: aconst_null
    //   467: astore 6
    //   469: goto -369 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   186	200	203	java/lang/ArrayIndexOutOfBoundsException
    //   2	7	304	finally
    //   19	130	304	finally
    //   130	182	304	finally
    //   186	200	304	finally
    //   205	301	304	finally
    //   309	315	304	finally
    //   331	427	304	finally
    //   130	182	322	java/lang/StringIndexOutOfBoundsException
    //   309	315	322	java/lang/StringIndexOutOfBoundsException
    //   186	200	430	java/lang/StringIndexOutOfBoundsException
    //   130	182	435	java/lang/ArrayIndexOutOfBoundsException
    //   309	315	435	java/lang/ArrayIndexOutOfBoundsException
  }

  static HashMap a(m5 paramm5)
  {
    return paramm5.a;
  }

  private void a(String paramString)
  {
    while (true)
    {
      int i;
      try
      {
        i = g5.n;
        Iterator localIterator2;
        if (paramString == null);else
        {
          Iterator localIterator1 = this.b.entrySet().iterator();
          if (localIterator1.hasNext())
          {
            Map.Entry localEntry2 = (Map.Entry)localIterator1.next();
            if (!paramString.equals(((uz)localEntry2.getKey()).a))
              break label205;
            if (localEntry2.getValue() != null)
              ((Bitmap)localEntry2.getValue()).recycle();
            localIterator1.remove();
            break label205;
          }
          localIterator2 = this.a.entrySet().iterator();
        }
        if (!localIterator2.hasNext())
          continue;
        Map.Entry localEntry1 = (Map.Entry)localIterator2.next();
        if (paramString.equals(((uz)localEntry1.getKey()).a))
        {
          Bitmap localBitmap = (Bitmap)((SoftReference)localEntry1.getValue()).get();
          if (localBitmap != null)
            localBitmap.recycle();
          localIterator2.remove();
        }
        if (i == 0)
          continue;
        continue;
      }
      finally
      {
      }
      label205: if (i == 0);
    }
  }

  public static Bitmap b(sz paramsz)
  {
    return d.a(paramsz);
  }

  public static void b(String paramString)
  {
    synchronized (d)
    {
      Integer localInteger = (Integer)c.get(paramString);
      if (localInteger == null)
      {
        c.put(paramString, Integer.valueOf(1));
        if (g5.n == 0);
      }
      else
      {
        c.put(paramString, Integer.valueOf(1 + localInteger.intValue()));
      }
      return;
    }
  }

  public static void c(String paramString)
  {
    synchronized (d)
    {
      Integer localInteger = (Integer)c.get(paramString);
      if (localInteger != null)
        if (localInteger.intValue() == 1)
        {
          c.remove(paramString);
          d.a(paramString);
          if (g5.n == 0);
        }
        else
        {
          c.put(paramString, Integer.valueOf(-1 + localInteger.intValue()));
        }
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.m5
 * JD-Core Version:    0.6.1
 */