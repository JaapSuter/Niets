package com.whatsapp;

import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.HttpException;

public class pb extends AsyncTask<Void, Integer, Boolean>
{
  private static Timer j;
  private static final String[] z;
  private final sz a;
  private final MediaData b;
  private final long c;
  private int d;
  private at e;
  private bj f;
  private boolean g;
  private boolean h = false;
  private a1 i;
  private TimerTask k;

  static
  {
    String[] arrayOfString = new String[9];
    char[] arrayOfChar1 = "*Oju\n2Zbs\n#\005{n\007hO|n\0045\n".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    char[] arrayOfChar4;
    int i12;
    char[] arrayOfChar5;
    int i16;
    char[] arrayOfChar6;
    int i20;
    char[] arrayOfChar7;
    int i24;
    char[] arrayOfChar8;
    int i28;
    char[] arrayOfChar9;
    int i32;
    if (m <= n)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "*Oju\n2Zbs\n#\005{n\007hDa1\003(Yz".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "*C}o\002)M.w\016>Y.u\005g_~p\004&N.n\0164_bh".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label525;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "*Oju\n2Zbs\n#\005}h\n5^!x\002 O}h\0165\n".toCharArray();
        int i11 = arrayOfChar4.length;
        i12 = 0;
        if (i11 > i12)
          break label617;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\024bO1Yr\034".toCharArray();
        int i15 = arrayOfChar5.length;
        i16 = 0;
        if (i15 > i16)
          break label709;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "*Oju\n2Zbs\n#\005mp\0044O.".toCharArray();
        int i19 = arrayOfChar6.length;
        i20 = 0;
        if (i19 > i20)
          break label801;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "*Oju\n2Zbs\n#\005gsF\"X|s\031g".toCharArray();
        int i23 = arrayOfChar7.length;
        i24 = 0;
        if (i23 > i24)
          break label893;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "*Oju\n2Zbs\n#\005fh\0377O|n\0045\n".toCharArray();
        int i27 = arrayOfChar8.length;
        i28 = 0;
        if (i27 > i28)
          break label985;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "*Oju\n2Zbs\n#\005kn\031(X.".toCharArray();
        int i31 = arrayOfChar9.length;
        i32 = 0;
        if (i31 > i32)
          break label1077;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        z = arrayOfString;
        j = new Timer();
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 107;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 71;
        continue;
        i2 = 42;
        continue;
        i2 = 14;
        continue;
        i2 = 28;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 71;
      continue;
      i6 = 42;
      continue;
      i6 = 14;
      continue;
      i6 = 28;
    }
    label525: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 71;
      continue;
      i10 = 42;
      continue;
      i10 = 14;
      continue;
      i10 = 28;
    }
    label617: int i13 = arrayOfChar4[i12];
    int i14;
    switch (i12 % 5)
    {
    default:
      i14 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i12] = (char)(i14 ^ i13);
      i12++;
      break;
      i14 = 71;
      continue;
      i14 = 42;
      continue;
      i14 = 14;
      continue;
      i14 = 28;
    }
    label709: int i17 = arrayOfChar5[i16];
    int i18;
    switch (i16 % 5)
    {
    default:
      i18 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i16] = (char)(i18 ^ i17);
      i16++;
      break;
      i18 = 71;
      continue;
      i18 = 42;
      continue;
      i18 = 14;
      continue;
      i18 = 28;
    }
    label801: int i21 = arrayOfChar6[i20];
    int i22;
    switch (i20 % 5)
    {
    default:
      i22 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i20] = (char)(i22 ^ i21);
      i20++;
      break;
      i22 = 71;
      continue;
      i22 = 42;
      continue;
      i22 = 14;
      continue;
      i22 = 28;
    }
    label893: int i25 = arrayOfChar7[i24];
    int i26;
    switch (i24 % 5)
    {
    default:
      i26 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i24] = (char)(i26 ^ i25);
      i24++;
      break;
      i26 = 71;
      continue;
      i26 = 42;
      continue;
      i26 = 14;
      continue;
      i26 = 28;
    }
    label985: int i29 = arrayOfChar8[i28];
    int i30;
    switch (i28 % 5)
    {
    default:
      i30 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i28] = (char)(i30 ^ i29);
      i28++;
      break;
      i30 = 71;
      continue;
      i30 = 42;
      continue;
      i30 = 14;
      continue;
      i30 = 28;
    }
    label1077: int i33 = arrayOfChar9[i32];
    int i34;
    switch (i32 % 5)
    {
    default:
      i34 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i32] = (char)(i34 ^ i33);
      i32++;
      break;
      i34 = 71;
      continue;
      i34 = 42;
      continue;
      i34 = 14;
      continue;
      i34 = 28;
    }
  }

  public pb(sz paramsz, boolean paramBoolean, bj parambj)
  {
    this.a = paramsz;
    this.b = ((MediaData)paramsz.t);
    this.c = paramsz.m;
    this.d = 0;
    this.f = parambj;
    this.g = paramBoolean;
    paramsz.a = 1;
    this.b.transferring = true;
    this.b.progress = 0L;
    if (this.f == null)
      App.z.a(paramsz, false, -1);
  }

  static a1 a(pb parampb, a1 parama1)
  {
    parampb.i = parama1;
    return parama1;
  }

  static at a(pb parampb, at paramat)
  {
    parampb.e = paramat;
    return paramat;
  }

  // ERROR //
  private static String a(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 130	com/whatsapp/DialogToastListActivity:f	Z
    //   5: istore_2
    //   6: getstatic 64	com/whatsapp/pb:z	[Ljava/lang/String;
    //   9: iconst_4
    //   10: aaload
    //   11: invokestatic 136	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   14: astore 15
    //   16: aload 15
    //   18: astore 4
    //   20: aload 4
    //   22: ifnonnull +40 -> 62
    //   25: aload_1
    //   26: areturn
    //   27: astore_3
    //   28: new 138	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   35: getstatic 64	com/whatsapp/pb:z	[Ljava/lang/String;
    //   38: iconst_3
    //   39: aaload
    //   40: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_3
    //   44: invokevirtual 146	java/security/NoSuchAlgorithmException:toString	()Ljava/lang/String;
    //   47: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   56: aconst_null
    //   57: astore 4
    //   59: goto -39 -> 20
    //   62: sipush 8192
    //   65: newarray byte
    //   67: astore 5
    //   69: new 154	java/io/FileInputStream
    //   72: dup
    //   73: aload_0
    //   74: invokespecial 157	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   77: astore 6
    //   79: aload 6
    //   81: aload 5
    //   83: invokevirtual 163	java/io/InputStream:read	([B)I
    //   86: istore 11
    //   88: iload 11
    //   90: ifle +17 -> 107
    //   93: aload 4
    //   95: aload 5
    //   97: iconst_0
    //   98: iload 11
    //   100: invokevirtual 167	java/security/MessageDigest:update	([BII)V
    //   103: iload_2
    //   104: ifeq -25 -> 79
    //   107: aload 6
    //   109: ifnull +8 -> 117
    //   112: aload 6
    //   114: invokevirtual 170	java/io/InputStream:close	()V
    //   117: new 32	java/lang/String
    //   120: dup
    //   121: aload 4
    //   123: invokevirtual 174	java/security/MessageDigest:digest	()[B
    //   126: invokestatic 179	wb:a	([B)[B
    //   129: invokespecial 182	java/lang/String:<init>	([B)V
    //   132: astore_1
    //   133: goto -108 -> 25
    //   136: astore 12
    //   138: new 138	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   145: getstatic 64	com/whatsapp/pb:z	[Ljava/lang/String;
    //   148: iconst_5
    //   149: aaload
    //   150: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload 12
    //   155: invokevirtual 183	java/io/IOException:toString	()Ljava/lang/String;
    //   158: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   167: goto -50 -> 117
    //   170: astore 14
    //   172: aconst_null
    //   173: astore 6
    //   175: aload 6
    //   177: ifnull -152 -> 25
    //   180: aload 6
    //   182: invokevirtual 170	java/io/InputStream:close	()V
    //   185: goto -160 -> 25
    //   188: astore 8
    //   190: new 138	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   197: getstatic 64	com/whatsapp/pb:z	[Ljava/lang/String;
    //   200: iconst_5
    //   201: aaload
    //   202: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: aload 8
    //   207: invokevirtual 183	java/io/IOException:toString	()Ljava/lang/String;
    //   210: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   219: goto -194 -> 25
    //   222: astore 13
    //   224: aconst_null
    //   225: astore 6
    //   227: aload 13
    //   229: astore 9
    //   231: aload 6
    //   233: ifnull +8 -> 241
    //   236: aload 6
    //   238: invokevirtual 170	java/io/InputStream:close	()V
    //   241: aload 9
    //   243: athrow
    //   244: astore 10
    //   246: new 138	java/lang/StringBuilder
    //   249: dup
    //   250: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   253: getstatic 64	com/whatsapp/pb:z	[Ljava/lang/String;
    //   256: iconst_5
    //   257: aaload
    //   258: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload 10
    //   263: invokevirtual 183	java/io/IOException:toString	()Ljava/lang/String;
    //   266: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: invokestatic 152	com/whatsapp/g5:d	(Ljava/lang/String;)V
    //   275: goto -34 -> 241
    //   278: astore 9
    //   280: goto -49 -> 231
    //   283: astore 7
    //   285: goto -110 -> 175
    //
    // Exception table:
    //   from	to	target	type
    //   6	16	27	java/security/NoSuchAlgorithmException
    //   112	117	136	java/io/IOException
    //   69	79	170	java/io/IOException
    //   180	185	188	java/io/IOException
    //   69	79	222	finally
    //   236	241	244	java/io/IOException
    //   79	103	278	finally
    //   79	103	283	java/io/IOException
  }

  static TimerTask a(pb parampb)
  {
    return parampb.k;
  }

  static void a(pb parampb, String paramString)
  {
    parampb.a(paramString);
  }

  static void a(pb parampb, Object[] paramArrayOfObject)
  {
    parampb.publishProgress(paramArrayOfObject);
  }

  private void a(String paramString)
  {
    vw localvw = new vw(this);
    localvw.a = this.a.b.a;
    localvw.e = this.b.file.length();
    localvw.d = sz.a(this.a.l);
    localvw.b = paramString;
    if (this.a.n == null)
    {
      this.a.n = paramString;
      if (!DialogToastListActivity.f);
    }
    else if (!this.a.n.equals(paramString))
    {
      localvw.c = this.a.n;
    }
    App.a(localvw);
    this.k = new eab(this);
    j.schedule(this.k, 20000L);
  }

  static boolean a(pb parampb, boolean paramBoolean)
  {
    parampb.h = paramBoolean;
    return paramBoolean;
  }

  static MediaData b(pb parampb)
  {
    return parampb.b;
  }

  static String b(File paramFile)
  {
    return a(paramFile);
  }

  static a1 c(pb parampb)
  {
    return parampb.i;
  }

  static at d(pb parampb)
  {
    return parampb.e;
  }

  static sz e(pb parampb)
  {
    return parampb.a;
  }

  public Boolean a(Void[] paramArrayOfVoid)
  {
    Object localObject;
    if (this.e == null)
      localObject = Boolean.valueOf(this.h);
    while (true)
    {
      return localObject;
      try
      {
        Boolean localBoolean = Boolean.valueOf(this.e.a());
        localObject = localBoolean;
      }
      catch (IOException localIOException)
      {
        g5.d(z[6] + localIOException.toString());
        localObject = Boolean.valueOf(false);
      }
      catch (HttpException localHttpException)
      {
        while (true)
          g5.d(z[7] + localHttpException.toString());
      }
      catch (Exception localException)
      {
        while (true)
          g5.d(z[8] + localException.toString());
      }
    }
  }

  public void a()
  {
    new rb(this, this.b.file).execute(new Void[0]);
  }

  public void a(Boolean paramBoolean)
  {
    int m = -1;
    boolean bool = DialogToastListActivity.f;
    this.b.transferring = false;
    if ((paramBoolean.booleanValue()) && (this.h));
    while (true)
    {
      try
      {
        URL localURL = new URL(this.i.c);
        if ((localURL.getHost() == null) || (localURL.getHost().length() == 0))
        {
          g5.d(z[1]);
          App.z.a(this.a, false, -1);
          return;
        }
      }
      catch (Exception localException)
      {
        g5.c(z[0] + localException.toString());
        if ((this.i.b == null) || (this.i.c == null) || (this.i.d == 0L))
        {
          g5.d(z[2]);
          if ((this.f != null) && (!this.f.b()))
            continue;
          App.z.a(this.a, false, m);
          continue;
        }
        this.a.m = this.i.d;
        this.a.j = this.i.c;
        this.a.k = this.i.b;
        this.a.a = 2;
        this.b.transferred = true;
        if (this.g)
          break label273;
      }
      j5.a(this.a);
      if (bool)
        this.a.a = 0;
      label273: if (this.f == null)
      {
        fq localfq = App.z;
        sz localsz = this.a;
        if ((paramBoolean.booleanValue()) && (this.h))
          m = 1;
        localfq.a(localsz, true, m);
        if (!bool);
      }
      else
      {
        this.f.a(this.a);
      }
    }
  }

  public void a(Integer[] paramArrayOfInteger)
  {
    int m = paramArrayOfInteger[0].intValue();
    e4.b(m - this.d, 0);
    this.d = m;
    this.b.progress = (100L * m / this.c);
    if ((this.f != null) && (!this.f.b()))
    {
      this.f.a((int)this.b.progress);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.z.a(this.a, false, -1);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pb
 * JD-Core Version:    0.6.1
 */