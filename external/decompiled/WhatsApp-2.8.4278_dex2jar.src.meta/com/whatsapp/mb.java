package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class mb extends AsyncTask<Void, Void, Boolean>
{
  public static int h;
  private static final String[] z;
  protected final sz a;
  private final MediaData b;
  private final LocationManager c;
  private Location d;
  public int e = h;
  private byte[] f = null;
  bj g;
  LocationListener i;
  LocationListener j;
  int k = 0;
  Location l = null;
  Location m = null;
  boolean n;

  static
  {
    String[] arrayOfString = new String[12];
    char[] arrayOfChar1 = "|\033`,tf\024|'zuUy'~c\b:;".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    char[] arrayOfChar5;
    int i18;
    char[] arrayOfChar6;
    int i22;
    char[] arrayOfChar7;
    int i26;
    char[] arrayOfChar8;
    int i30;
    char[] arrayOfChar9;
    int i34;
    char[] arrayOfChar10;
    int i38;
    char[] arrayOfChar11;
    int i42;
    char[] arrayOfChar12;
    int i46;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "s\033thyx\016})k1\bu+~x\fu,".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "y\016d8!>U})kbTw'tv\026u)kx\t>+t|U})kbUq8r>\td)ox\031})k.\031u&ot\b-".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label633;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "7\ty2~,K'xc M nht\024c'i,\016b=~7\034:vp\016-\"kvWr)ht\026y&~7\027*r}\037-<id\0376%zc\021u:h,\031$tc@b-4MS;rk\037*%ru_'\013".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label725;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "7��'v,".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label817;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "|\033`,tf\024|'zuUv)r}\037tgit\016b1".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label909;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "|\033`,tf\024|'zuUs'zc\tu\004tr\033d!tZ".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label1001;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "v\nc".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1093;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "|\033`,tf\024|'zuUs'zc\tug~c\b:;".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1185;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "|\033`,tf\024|'zuUv!utUu:i~\b0".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1277;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\037d?tc\021".toCharArray();
        int i41 = arrayOfChar11.length;
        i42 = 0;
        if (i41 > i42)
          break label1369;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "}\025s)ox\025~".toCharArray();
        int i45 = arrayOfChar12.length;
        i46 = 0;
        if (i45 > i46)
          break label1461;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        z = arrayOfString;
        h = 15;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 27;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        i2++;
        break;
        i4 = 17;
        continue;
        i4 = 122;
        continue;
        i4 = 16;
        continue;
        i4 = 72;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 17;
      continue;
      i8 = 122;
      continue;
      i8 = 16;
      continue;
      i8 = 72;
    }
    label633: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 17;
      continue;
      i12 = 122;
      continue;
      i12 = 16;
      continue;
      i12 = 72;
    }
    label725: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 17;
      continue;
      i16 = 122;
      continue;
      i16 = 16;
      continue;
      i16 = 72;
    }
    label817: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 17;
      continue;
      i20 = 122;
      continue;
      i20 = 16;
      continue;
      i20 = 72;
    }
    label909: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 17;
      continue;
      i24 = 122;
      continue;
      i24 = 16;
      continue;
      i24 = 72;
    }
    label1001: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 17;
      continue;
      i28 = 122;
      continue;
      i28 = 16;
      continue;
      i28 = 72;
    }
    label1093: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 17;
      continue;
      i32 = 122;
      continue;
      i32 = 16;
      continue;
      i32 = 72;
    }
    label1185: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 17;
      continue;
      i36 = 122;
      continue;
      i36 = 16;
      continue;
      i36 = 72;
    }
    label1277: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 17;
      continue;
      i40 = 122;
      continue;
      i40 = 16;
      continue;
      i40 = 72;
    }
    label1369: int i43 = arrayOfChar11[i42];
    int i44;
    switch (i42 % 5)
    {
    default:
      i44 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i42] = (char)(i44 ^ i43);
      i42++;
      break;
      i44 = 17;
      continue;
      i44 = 122;
      continue;
      i44 = 16;
      continue;
      i44 = 72;
    }
    label1461: int i47 = arrayOfChar12[i46];
    int i48;
    switch (i46 % 5)
    {
    default:
      i48 = 27;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i46] = (char)(i48 ^ i47);
      i46++;
      break;
      i48 = 17;
      continue;
      i48 = 122;
      continue;
      i48 = 16;
      continue;
      i48 = 72;
    }
  }

  public mb(Context paramContext, sz paramsz, bj parambj)
  {
    this.a = paramsz;
    this.b = ((MediaData)paramsz.t);
    this.c = ((LocationManager)paramContext.getSystemService(z[11]));
    this.g = parambj;
    if ((paramsz.q != 0.0D) && (paramsz.r != 0.0D))
    {
      this.d = new Location("");
      this.d.setLatitude(paramsz.q);
      this.d.setLongitude(paramsz.r);
      this.n = true;
    }
  }

  public static byte[] a(double paramDouble1, double paramDouble2)
  {
    return a(paramDouble1, paramDouble2, h);
  }

  public static byte[] a(double paramDouble1, double paramDouble2, int paramInt)
  {
    byte[] arrayOfByte = null;
    Bitmap localBitmap = b(paramDouble1, paramDouble2, paramInt);
    if (localBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 80, localByteArrayOutputStream);
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      localBitmap.recycle();
    }
    return arrayOfByte;
  }

  public static Bitmap b(double paramDouble1, double paramDouble2)
  {
    return b(paramDouble1, paramDouble2, h);
  }

  // ERROR //
  public static Bitmap b(double paramDouble1, double paramDouble2, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 170	org/apache/http/params/BasicHttpParams
    //   6: dup
    //   7: invokespecial 171	org/apache/http/params/BasicHttpParams:<init>	()V
    //   10: astore 6
    //   12: aload 6
    //   14: sipush 15000
    //   17: invokestatic 177	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   20: aload 6
    //   22: sipush 30000
    //   25: invokestatic 180	org/apache/http/params/HttpConnectionParams:setSoTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   28: new 182	org/apache/http/impl/client/DefaultHttpClient
    //   31: dup
    //   32: aload 6
    //   34: invokespecial 185	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/params/HttpParams;)V
    //   37: new 187	org/apache/http/client/methods/HttpGet
    //   40: dup
    //   41: new 189	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   48: getstatic 72	com/whatsapp/mb:z	[Ljava/lang/String;
    //   51: iconst_2
    //   52: aaload
    //   53: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: dload_0
    //   57: invokevirtual 197	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   60: ldc 199
    //   62: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: dload_2
    //   66: invokevirtual 197	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   69: getstatic 72	com/whatsapp/mb:z	[Ljava/lang/String;
    //   72: iconst_4
    //   73: aaload
    //   74: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: bipush 21
    //   79: iconst_1
    //   80: iload 4
    //   82: invokestatic 205	java/lang/Math:max	(II)I
    //   85: invokestatic 208	java/lang/Math:min	(II)I
    //   88: invokevirtual 211	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   91: getstatic 72	com/whatsapp/mb:z	[Ljava/lang/String;
    //   94: iconst_3
    //   95: aaload
    //   96: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: dload_0
    //   100: invokevirtual 197	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   103: ldc 199
    //   105: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: dload_2
    //   109: invokevirtual 197	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   112: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokespecial 215	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   118: invokevirtual 219	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   121: invokeinterface 225 1 0
    //   126: invokeinterface 231 1 0
    //   131: astore 14
    //   133: aload 14
    //   135: astore 9
    //   137: aload 9
    //   139: aconst_null
    //   140: getstatic 236	com/whatsapp/j5:i	Landroid/graphics/BitmapFactory$Options;
    //   143: invokestatic 242	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   146: astore 16
    //   148: aload 16
    //   150: astore 8
    //   152: aload 8
    //   154: ifnull +25 -> 179
    //   157: aload 8
    //   159: invokevirtual 246	android/graphics/Bitmap:getWidth	()I
    //   162: sipush 170
    //   165: if_icmpne +14 -> 179
    //   168: aload 8
    //   170: invokevirtual 249	android/graphics/Bitmap:getHeight	()I
    //   173: sipush 170
    //   176: if_icmpeq +75 -> 251
    //   179: new 168	java/io/IOException
    //   182: dup
    //   183: getstatic 72	com/whatsapp/mb:z	[Ljava/lang/String;
    //   186: iconst_1
    //   187: aaload
    //   188: invokespecial 250	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   191: athrow
    //   192: astore 7
    //   194: new 189	java/lang/StringBuilder
    //   197: dup
    //   198: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   201: getstatic 72	com/whatsapp/mb:z	[Ljava/lang/String;
    //   204: iconst_0
    //   205: aaload
    //   206: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload 7
    //   211: invokevirtual 251	java/io/IOException:toString	()Ljava/lang/String;
    //   214: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: invokestatic 255	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   223: aload 8
    //   225: ifnull +13 -> 238
    //   228: aload 8
    //   230: ifnull +8 -> 238
    //   233: aload 8
    //   235: invokevirtual 165	android/graphics/Bitmap:recycle	()V
    //   238: aload 9
    //   240: ifnull +8 -> 248
    //   243: aload 9
    //   245: invokevirtual 260	java/io/InputStream:close	()V
    //   248: aload 5
    //   250: areturn
    //   251: aload 8
    //   253: bipush 35
    //   255: bipush 35
    //   257: bipush 100
    //   259: bipush 100
    //   261: invokestatic 264	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    //   264: astore 17
    //   266: aload 17
    //   268: astore 5
    //   270: aload 8
    //   272: ifnull +15 -> 287
    //   275: aload 8
    //   277: aload 5
    //   279: if_acmpeq +8 -> 287
    //   282: aload 8
    //   284: invokevirtual 165	android/graphics/Bitmap:recycle	()V
    //   287: aload 9
    //   289: ifnull -41 -> 248
    //   292: aload 9
    //   294: invokevirtual 260	java/io/InputStream:close	()V
    //   297: goto -49 -> 248
    //   300: astore 18
    //   302: goto -54 -> 248
    //   305: astore 13
    //   307: aconst_null
    //   308: astore 8
    //   310: aconst_null
    //   311: astore 9
    //   313: aload 13
    //   315: astore 10
    //   317: aload 8
    //   319: ifnull +13 -> 332
    //   322: aload 8
    //   324: ifnull +8 -> 332
    //   327: aload 8
    //   329: invokevirtual 165	android/graphics/Bitmap:recycle	()V
    //   332: aload 9
    //   334: ifnull +8 -> 342
    //   337: aload 9
    //   339: invokevirtual 260	java/io/InputStream:close	()V
    //   342: aload 10
    //   344: athrow
    //   345: astore 12
    //   347: goto -99 -> 248
    //   350: astore 11
    //   352: goto -10 -> 342
    //   355: astore 15
    //   357: aconst_null
    //   358: astore 8
    //   360: aload 15
    //   362: astore 10
    //   364: goto -47 -> 317
    //   367: astore 10
    //   369: goto -52 -> 317
    //   372: astore 7
    //   374: aconst_null
    //   375: astore 8
    //   377: aconst_null
    //   378: astore 9
    //   380: goto -186 -> 194
    //   383: astore 7
    //   385: aconst_null
    //   386: astore 8
    //   388: goto -194 -> 194
    //
    // Exception table:
    //   from	to	target	type
    //   157	192	192	java/io/IOException
    //   251	266	192	java/io/IOException
    //   292	297	300	java/io/IOException
    //   3	133	305	finally
    //   243	248	345	java/io/IOException
    //   337	342	350	java/io/IOException
    //   137	148	355	finally
    //   157	192	367	finally
    //   194	223	367	finally
    //   251	266	367	finally
    //   3	133	372	java/io/IOException
    //   137	148	383	java/io/IOException
  }

  public Boolean a(Void[] paramArrayOfVoid)
  {
    boolean bool = DialogToastListActivity.f;
    int i2;
    int i1;
    if (this.d == null)
    {
      i2 = 0;
      i1 = 0;
    }
    while (true)
    {
      if ((!this.n) && (i2 < 40));
      try
      {
        Thread.sleep(250L);
        label36: i2++;
        if (this.g == null)
          continue;
        if (!this.g.b())
        {
          i1 = 100 * (i2 * 250) / 15000;
          if (i1 >= 99)
            continue;
          this.g.a(i1);
          if (!bool)
            continue;
        }
        Boolean localBoolean = Boolean.valueOf(false);
        while (true)
        {
          return localBoolean;
          if (this.n)
          {
            this.d = this.l;
            if (!bool);
          }
          else if (this.m != null)
          {
            g5.b(z[6] + this.m.toString());
            this.d = this.m;
            if (!bool);
          }
          else
          {
            g5.b(z[5]);
            localBoolean = Boolean.valueOf(false);
            continue;
            i1 = 0;
          }
          if ((this.g != null) && (i1 < 99))
            this.g.a(99);
          this.f = a(this.d.getLatitude(), this.d.getLongitude(), this.e);
          if (this.g != null)
            this.g.a(100);
          localBoolean = Boolean.valueOf(true);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label36;
      }
    }
  }

  void a()
  {
    if (this.i == null)
      this.i = new mw(this);
    if (this.j == null)
      this.j = new nw(this);
    try
    {
      this.c.requestLocationUpdates(z[7], 1000L, 1.0F, this.i);
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      try
      {
        while (true)
        {
          this.c.requestLocationUpdates(z[10], 1000L, 1.0F, this.j);
          return;
          localIllegalArgumentException1 = localIllegalArgumentException1;
          g5.c(z[9] + localIllegalArgumentException1.toString());
          this.i = null;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        while (true)
        {
          g5.c(z[8] + localIllegalArgumentException2.toString());
          this.j = null;
        }
      }
    }
  }

  public void a(Boolean paramBoolean)
  {
    boolean bool = DialogToastListActivity.f;
    this.b.transferring = false;
    if (paramBoolean.booleanValue())
    {
      this.b.transferred = true;
      MediaData localMediaData = (MediaData)this.a.t;
      this.a.h = 1;
      this.a.a(this.f);
      this.a.t = localMediaData;
      if (this.d != null)
      {
        this.a.q = this.d.getLatitude();
        this.a.r = this.d.getLongitude();
      }
      if (this.g == null)
      {
        App.h(this.a);
        if (!bool);
      }
      else
      {
        this.g.a(this.a);
      }
      if (!bool);
    }
    else
    {
      if (this.g == null)
        App.z.a(this.a, false, -1);
      if (!this.c.isProviderEnabled(z[7]))
        if (this.g == null)
        {
          if ((Conversation.a()) && (Conversation.b().p.equals(this.a.b.a)))
          {
            Conversation.b().showDialog(2);
            if (!bool);
          }
          else
          {
            Conversation.i.add(this.a.b.a);
            if (!bool);
          }
        }
        else
          this.g.a();
    }
    b();
  }

  public void b()
  {
    if (this.c != null)
    {
      if (this.i != null)
      {
        this.c.removeUpdates(this.i);
        this.i = null;
      }
      if (this.j != null)
      {
        this.c.removeUpdates(this.j);
        this.j = null;
      }
    }
  }

  public void onPreExecute()
  {
    a();
    this.b.transferring = true;
    if (this.g == null)
      App.z.a(this.a, false, -1);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mb
 * JD-Core Version:    0.6.1
 */