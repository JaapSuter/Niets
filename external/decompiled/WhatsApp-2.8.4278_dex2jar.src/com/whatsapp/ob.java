package com.whatsapp;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;

public class ob extends AsyncTask<OutputStream, Long, yf>
{
  private static final String[] z;
  private final sz a;
  private final MediaData b;
  private String c;
  private long d;
  private Activity e;
  private boolean f;

  static
  {
    String[] arrayOfString = new String[17];
    char[] arrayOfChar1 = "\004\0248\002r\r\036+\005\006\0208Dz\007^9\031a\006\003|".toCharArray();
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
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    char[] arrayOfChar10;
    int i33;
    char[] arrayOfChar11;
    int i37;
    char[] arrayOfChar12;
    int i41;
    char[] arrayOfChar13;
    int i45;
    char[] arrayOfChar14;
    int i49;
    char[] arrayOfChar15;
    int i53;
    char[] arrayOfChar16;
    int i57;
    char[] arrayOfChar17;
    int i61;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\004\0248\002r\r\036+\005\006\0208D|\034\005s\016a\033\036.K".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "I\004.\007.".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label821;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\004\0248\002r\r\036+\005\006\0208Dv\033\0033\0313".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label913;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\001\005(\0333\032\005=\037f\032L".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1005;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "\032\005=\037f\032Lh['".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1097;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\004\0248\002r\r\036+\005\006\0208Dz\007\002)\ru��\0225\016}\035./\033r\n\024s".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1189;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "G\034,X".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1281;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "\036\031=\037`\b\001,E}\f\005s\035=\031\031,TzT".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1373;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\004\036*".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1465;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\n\020:".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1557;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "GB;\033".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1649;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "\036\031=\037`\b\001,E}\f\005s\n=\031\031,TzT".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1741;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\036\031=\037`\b\001,E}\f\005".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1833;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "F\025s".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label1925;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "\004\0248\002r\r\036+\005\006\0208Df\033\035s\005|D\0313\030g".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2017;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "\004\0248\002r\r\036+\005\006\0208Df\033\035s\016a\033\036.K".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2109;
        arrayOfString[16] = new String(arrayOfChar17).intern();
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
        m = 19;
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
        m = 105;
        continue;
        m = 113;
        continue;
        m = 92;
        continue;
        m = 107;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 19;
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
      i3 = 105;
      continue;
      i3 = 113;
      continue;
      i3 = 92;
      continue;
      i3 = 107;
    }
    label821: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 19;
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
      i7 = 105;
      continue;
      i7 = 113;
      continue;
      i7 = 92;
      continue;
      i7 = 107;
    }
    label913: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 19;
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
      i11 = 105;
      continue;
      i11 = 113;
      continue;
      i11 = 92;
      continue;
      i11 = 107;
    }
    label1005: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 19;
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
      i15 = 105;
      continue;
      i15 = 113;
      continue;
      i15 = 92;
      continue;
      i15 = 107;
    }
    label1097: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 105;
      continue;
      i19 = 113;
      continue;
      i19 = 92;
      continue;
      i19 = 107;
    }
    label1189: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 105;
      continue;
      i23 = 113;
      continue;
      i23 = 92;
      continue;
      i23 = 107;
    }
    label1281: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 105;
      continue;
      i27 = 113;
      continue;
      i27 = 92;
      continue;
      i27 = 107;
    }
    label1373: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 105;
      continue;
      i31 = 113;
      continue;
      i31 = 92;
      continue;
      i31 = 107;
    }
    label1465: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i33] = (char)(i35 ^ i34);
      i33++;
      break;
      i35 = 105;
      continue;
      i35 = 113;
      continue;
      i35 = 92;
      continue;
      i35 = 107;
    }
    label1557: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar11[i37] = (char)(i39 ^ i38);
      i37++;
      break;
      i39 = 105;
      continue;
      i39 = 113;
      continue;
      i39 = 92;
      continue;
      i39 = 107;
    }
    label1649: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar12[i41] = (char)(i43 ^ i42);
      i41++;
      break;
      i43 = 105;
      continue;
      i43 = 113;
      continue;
      i43 = 92;
      continue;
      i43 = 107;
    }
    label1741: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar13[i45] = (char)(i47 ^ i46);
      i45++;
      break;
      i47 = 105;
      continue;
      i47 = 113;
      continue;
      i47 = 92;
      continue;
      i47 = 107;
    }
    label1833: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar14[i49] = (char)(i51 ^ i50);
      i49++;
      break;
      i51 = 105;
      continue;
      i51 = 113;
      continue;
      i51 = 92;
      continue;
      i51 = 107;
    }
    label1925: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar15[i53] = (char)(i55 ^ i54);
      i53++;
      break;
      i55 = 105;
      continue;
      i55 = 113;
      continue;
      i55 = 92;
      continue;
      i55 = 107;
    }
    label2017: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar16[i57] = (char)(i59 ^ i58);
      i57++;
      break;
      i59 = 105;
      continue;
      i59 = 113;
      continue;
      i59 = 92;
      continue;
      i59 = 107;
    }
    label2109: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar17[i61] = (char)(i63 ^ i62);
      i61++;
      break;
      i63 = 105;
      continue;
      i63 = 113;
      continue;
      i63 = 92;
      continue;
      i63 = 107;
    }
  }

  public ob(sz paramsz, Activity paramActivity)
  {
    this.a = paramsz;
    this.b = ((MediaData)paramsz.t);
    try
    {
      URL localURL = new URL(paramsz.j);
      if ((localURL.getHost() == null) || (localURL.getHost().length() == 0))
      {
        g5.d(z[15]);
        this.f = true;
      }
      if (this.c == null)
        this.c = a(paramsz.j);
      this.e = paramActivity;
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.c(z[16] + paramsz.j + " " + localException.toString());
        this.f = true;
        if (this.c == null)
          this.c = a(paramsz.j);
      }
    }
    finally
    {
      if (this.c == null)
        this.c = a(paramsz.j);
    }
  }

  private static long a()
  {
    StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
    return localStatFs.getBlockSize() * localStatFs.getAvailableBlocks();
  }

  private static String a(String paramString)
  {
    if (a(paramString, z[9]))
    {
      paramString = (paramString.substring(0, -4 + paramString.length()) + z[11]).replaceAll(z[13], z[8]);
      if (!DialogToastListActivity.f);
    }
    else if (a(paramString, z[10]))
    {
      paramString = (paramString.substring(0, -4 + paramString.length()) + z[7]).replaceAll(z[13], z[12]);
    }
    return paramString;
  }

  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool = false;
    if (paramString1.length() < paramString2.length());
    while (true)
    {
      return bool;
      bool = paramString1.regionMatches(true, paramString1.length() - paramString2.length(), paramString2, 0, paramString2.length());
    }
  }

  public static boolean b(String paramString)
  {
    if ((paramString != null) && (paramString.contains(z[14])));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  // ERROR //
  public yf a(OutputStream[] paramArrayOfOutputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 109	com/whatsapp/ob:f	Z
    //   4: ifeq +11 -> 15
    //   7: getstatic 183	com/whatsapp/yf:e	Lcom/whatsapp/yf;
    //   10: astore 12
    //   12: aload 12
    //   14: areturn
    //   15: aload_1
    //   16: iconst_0
    //   17: aaload
    //   18: astore_2
    //   19: aconst_null
    //   20: astore_3
    //   21: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   24: astore 4
    //   26: sipush 1024
    //   29: newarray byte
    //   31: astore 15
    //   33: new 187	org/apache/http/params/BasicHttpParams
    //   36: dup
    //   37: invokespecial 188	org/apache/http/params/BasicHttpParams:<init>	()V
    //   40: astore 16
    //   42: aload 16
    //   44: sipush 15000
    //   47: invokestatic 194	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   50: aload 16
    //   52: sipush 30000
    //   55: invokestatic 197	org/apache/http/params/HttpConnectionParams:setSoTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   58: aload 16
    //   60: getstatic 202	com/whatsapp/App:n	Ljava/lang/String;
    //   63: invokestatic 208	org/apache/http/params/HttpProtocolParams:setUserAgent	(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
    //   66: new 210	org/apache/http/impl/client/DefaultHttpClient
    //   69: dup
    //   70: aload 16
    //   72: invokespecial 213	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/params/HttpParams;)V
    //   75: new 215	org/apache/http/client/methods/HttpGet
    //   78: dup
    //   79: aload_0
    //   80: getfield 111	com/whatsapp/ob:c	Ljava/lang/String;
    //   83: invokespecial 216	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   86: invokevirtual 220	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   89: astore 17
    //   91: aload 17
    //   93: invokeinterface 226 1 0
    //   98: invokeinterface 231 1 0
    //   103: istore 18
    //   105: iload 18
    //   107: sipush 200
    //   110: if_icmpeq +165 -> 275
    //   113: new 178	java/io/IOException
    //   116: dup
    //   117: new 118	java/lang/StringBuilder
    //   120: dup
    //   121: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   124: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   127: iconst_4
    //   128: aaload
    //   129: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: iload 18
    //   134: invokevirtual 234	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   137: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokespecial 235	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   143: athrow
    //   144: astore 10
    //   146: aload 10
    //   148: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   151: astore 11
    //   153: new 118	java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   160: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   163: iconst_3
    //   164: aaload
    //   165: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: aload 11
    //   170: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   176: iconst_2
    //   177: aaload
    //   178: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: aload_0
    //   182: getfield 111	com/whatsapp/ob:c	Ljava/lang/String;
    //   185: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   194: aload 11
    //   196: ifnull +705 -> 901
    //   199: aload 11
    //   201: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   204: iconst_5
    //   205: aaload
    //   206: invokevirtual 175	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   209: ifeq +692 -> 901
    //   212: getstatic 238	com/whatsapp/yf:d	Lcom/whatsapp/yf;
    //   215: astore 12
    //   217: aload_3
    //   218: ifnull +7 -> 225
    //   221: aload_3
    //   222: invokevirtual 243	java/io/InputStream:close	()V
    //   225: aload_2
    //   226: ifnull -214 -> 12
    //   229: aload_2
    //   230: invokevirtual 246	java/io/OutputStream:close	()V
    //   233: goto -221 -> 12
    //   236: astore 13
    //   238: new 118	java/lang/StringBuilder
    //   241: dup
    //   242: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   245: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   248: iconst_1
    //   249: aaload
    //   250: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: aload 13
    //   255: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   258: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   264: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   267: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   270: astore 12
    //   272: goto -260 -> 12
    //   275: aload 17
    //   277: invokeinterface 250 1 0
    //   282: astore 19
    //   284: aload_0
    //   285: aload 19
    //   287: invokeinterface 255 1 0
    //   292: putfield 257	com/whatsapp/ob:d	J
    //   295: invokestatic 259	com/whatsapp/ob:a	()J
    //   298: lstore 20
    //   300: lload 20
    //   302: aload_0
    //   303: getfield 257	com/whatsapp/ob:d	J
    //   306: lcmp
    //   307: ifge +136 -> 443
    //   310: new 118	java/lang/StringBuilder
    //   313: dup
    //   314: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   317: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   320: bipush 6
    //   322: aaload
    //   323: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: getstatic 263	com/whatsapp/App:Mb	Lcom/whatsapp/App;
    //   329: lload 20
    //   331: invokestatic 269	android/text/format/Formatter:formatFileSize	(Landroid/content/Context;J)Ljava/lang/String;
    //   334: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   340: invokestatic 271	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   343: getstatic 273	com/whatsapp/yf:c	Lcom/whatsapp/yf;
    //   346: astore 12
    //   348: iconst_0
    //   349: ifeq +7 -> 356
    //   352: aconst_null
    //   353: invokevirtual 243	java/io/InputStream:close	()V
    //   356: aload_2
    //   357: ifnull -345 -> 12
    //   360: aload_2
    //   361: invokevirtual 246	java/io/OutputStream:close	()V
    //   364: goto -352 -> 12
    //   367: astore 33
    //   369: new 118	java/lang/StringBuilder
    //   372: dup
    //   373: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   376: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   379: iconst_1
    //   380: aaload
    //   381: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: aload 33
    //   386: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   389: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   398: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   401: pop
    //   402: goto -390 -> 12
    //   405: astore 35
    //   407: new 118	java/lang/StringBuilder
    //   410: dup
    //   411: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   414: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   417: iconst_0
    //   418: aaload
    //   419: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: aload 35
    //   424: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   427: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   433: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   436: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   439: pop
    //   440: goto -84 -> 356
    //   443: new 275	com/whatsapp/lf
    //   446: dup
    //   447: aload 19
    //   449: invokeinterface 279 1 0
    //   454: iconst_0
    //   455: invokespecial 282	com/whatsapp/lf:<init>	(Ljava/io/InputStream;I)V
    //   458: astore 22
    //   460: lconst_0
    //   461: lstore 23
    //   463: aload 22
    //   465: aload 15
    //   467: iconst_0
    //   468: aload 15
    //   470: arraylength
    //   471: invokevirtual 286	java/io/InputStream:read	([BII)I
    //   474: istore 25
    //   476: iload 25
    //   478: iflt +167 -> 645
    //   481: aload_2
    //   482: aload 15
    //   484: iconst_0
    //   485: iload 25
    //   487: invokevirtual 290	java/io/OutputStream:write	([BII)V
    //   490: lload 23
    //   492: iload 25
    //   494: i2l
    //   495: ladd
    //   496: lstore 23
    //   498: iconst_1
    //   499: anewarray 292	java/lang/Long
    //   502: astore 28
    //   504: aload 28
    //   506: iconst_0
    //   507: lload 23
    //   509: invokestatic 296	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   512: aastore
    //   513: aload_0
    //   514: aload 28
    //   516: invokevirtual 300	com/whatsapp/ob:publishProgress	([Ljava/lang/Object;)V
    //   519: invokestatic 306	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   522: invokevirtual 310	java/lang/Thread:isInterrupted	()Z
    //   525: ifeq -62 -> 463
    //   528: invokestatic 306	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   531: invokevirtual 313	java/lang/Thread:interrupt	()V
    //   534: aload 22
    //   536: invokevirtual 243	java/io/InputStream:close	()V
    //   539: aload_2
    //   540: invokevirtual 246	java/io/OutputStream:close	()V
    //   543: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   546: astore 12
    //   548: aload 22
    //   550: ifnull +8 -> 558
    //   553: aload 22
    //   555: invokevirtual 243	java/io/InputStream:close	()V
    //   558: aload_2
    //   559: ifnull -547 -> 12
    //   562: aload_2
    //   563: invokevirtual 246	java/io/OutputStream:close	()V
    //   566: goto -554 -> 12
    //   569: astore 29
    //   571: new 118	java/lang/StringBuilder
    //   574: dup
    //   575: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   578: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   581: iconst_1
    //   582: aaload
    //   583: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   586: aload 29
    //   588: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   591: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   594: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   597: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   600: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   603: pop
    //   604: goto -592 -> 12
    //   607: astore 31
    //   609: new 118	java/lang/StringBuilder
    //   612: dup
    //   613: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   616: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   619: iconst_0
    //   620: aaload
    //   621: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   624: aload 31
    //   626: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   629: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   632: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   635: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   638: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   641: pop
    //   642: goto -84 -> 558
    //   645: getstatic 315	com/whatsapp/yf:b	Lcom/whatsapp/yf;
    //   648: astore 12
    //   650: aload 22
    //   652: ifnull +8 -> 660
    //   655: aload 22
    //   657: invokevirtual 243	java/io/InputStream:close	()V
    //   660: aload_2
    //   661: ifnull -649 -> 12
    //   664: aload_2
    //   665: invokevirtual 246	java/io/OutputStream:close	()V
    //   668: goto -656 -> 12
    //   671: astore 26
    //   673: new 118	java/lang/StringBuilder
    //   676: dup
    //   677: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   680: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   683: iconst_1
    //   684: aaload
    //   685: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: aload 26
    //   690: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   693: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   699: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   702: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   705: astore 12
    //   707: goto -695 -> 12
    //   710: astore 27
    //   712: new 118	java/lang/StringBuilder
    //   715: dup
    //   716: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   719: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   722: iconst_0
    //   723: aaload
    //   724: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: aload 27
    //   729: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   732: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   735: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   738: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   741: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   744: astore 12
    //   746: goto -86 -> 660
    //   749: astore 14
    //   751: new 118	java/lang/StringBuilder
    //   754: dup
    //   755: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   758: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   761: iconst_0
    //   762: aaload
    //   763: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: aload 14
    //   768: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   771: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   777: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   780: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   783: astore 12
    //   785: goto -560 -> 225
    //   788: astore 5
    //   790: aload_3
    //   791: ifnull +7 -> 798
    //   794: aload_3
    //   795: invokevirtual 243	java/io/InputStream:close	()V
    //   798: aload_2
    //   799: ifnull +7 -> 806
    //   802: aload_2
    //   803: invokevirtual 246	java/io/OutputStream:close	()V
    //   806: aload 5
    //   808: athrow
    //   809: astore 8
    //   811: new 118	java/lang/StringBuilder
    //   814: dup
    //   815: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   818: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   821: iconst_0
    //   822: aaload
    //   823: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   826: aload 8
    //   828: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   831: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   834: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   837: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   840: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   843: pop
    //   844: goto -46 -> 798
    //   847: astore 6
    //   849: new 118	java/lang/StringBuilder
    //   852: dup
    //   853: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   856: getstatic 71	com/whatsapp/ob:z	[Ljava/lang/String;
    //   859: iconst_1
    //   860: aaload
    //   861: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   864: aload 6
    //   866: invokevirtual 236	java/io/IOException:toString	()Ljava/lang/String;
    //   869: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   872: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   875: invokestatic 131	com/whatsapp/g5:c	(Ljava/lang/String;)V
    //   878: getstatic 185	com/whatsapp/yf:a	Lcom/whatsapp/yf;
    //   881: pop
    //   882: goto -76 -> 806
    //   885: astore 5
    //   887: aload 22
    //   889: astore_3
    //   890: goto -100 -> 790
    //   893: astore 10
    //   895: aload 22
    //   897: astore_3
    //   898: goto -752 -> 146
    //   901: aload 4
    //   903: astore 12
    //   905: goto -688 -> 217
    //
    // Exception table:
    //   from	to	target	type
    //   26	144	144	java/io/IOException
    //   275	348	144	java/io/IOException
    //   443	460	144	java/io/IOException
    //   229	233	236	java/io/IOException
    //   360	364	367	java/io/IOException
    //   352	356	405	java/io/IOException
    //   562	566	569	java/io/IOException
    //   553	558	607	java/io/IOException
    //   664	668	671	java/io/IOException
    //   655	660	710	java/io/IOException
    //   221	225	749	java/io/IOException
    //   26	144	788	finally
    //   146	217	788	finally
    //   275	348	788	finally
    //   443	460	788	finally
    //   794	798	809	java/io/IOException
    //   802	806	847	java/io/IOException
    //   463	548	885	finally
    //   645	650	885	finally
    //   463	548	893	java/io/IOException
    //   645	650	893	java/io/IOException
  }

  public void a(yf paramyf)
  {
    boolean bool1 = false;
    boolean bool2 = DialogToastListActivity.f;
    if (!this.f)
    {
      this.b.transferring = false;
      if (paramyf == yf.b)
        bool1 = true;
      this.b.transferred = bool1;
      if (bool1)
      {
        this.a.m = this.b.file.length();
        j5.a(this.a);
        App.a(new qw(this.a.j));
        if (!bool2);
      }
      else
      {
        this.b.file.delete();
      }
      App.z.a(this.a, true, 3);
    }
    if (this.e != null)
      if (paramyf == yf.a)
      {
        if (!this.e.isFinishing())
        {
          this.e.showDialog(101);
          if (!bool2);
        }
      }
      else if (paramyf == yf.c)
      {
        if (!this.e.isFinishing())
        {
          this.e.showDialog(102);
          if (!bool2);
        }
      }
      else if (paramyf == yf.d)
      {
        if (!this.e.isFinishing())
        {
          this.e.showDialog(111);
          if (!bool2);
        }
      }
      else if ((paramyf == yf.e) && (!this.e.isFinishing()))
        this.e.showDialog(112);
  }

  public void a(Long[] paramArrayOfLong)
  {
    long l = paramArrayOfLong[0].longValue();
    this.b.progress = (l * 100L / this.d);
    App.z.a(this.a, false, -1);
  }

  public void onPreExecute()
  {
    if (this.f);
    while (true)
    {
      return;
      this.b.transferring = true;
      this.b.progress = 0L;
      App.z.a(this.a, false, -1);
    }
  }
}