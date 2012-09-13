package com.whatsapp;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public class at
{
  private static final String[] z;
  final URL a;
  final File b;
  final int c;
  final int d;
  final ct e;
  LinkedList<dt> f = new LinkedList();

  static
  {
    String[] arrayOfString = new String[15];
    char[] arrayOfChar1 = "6,'l\006Y\001</6U\0348m\001U\033!m\034\006O.m��QB,c\006]Thl\023Q\nu ".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "6".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "6Be".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label744;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "_\021bB".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label832;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "1S\001<g\034HB\034{\002YUhc\002L\003!a\023H\006'l]S\f<g\006\021\034<p\027]\002E\b".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label920;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "P1e".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1008;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "P1eE\b".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1096;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "_\026@b\017x".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1184;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "1S\001<g\034HB\fk\001L��;k\006U��&8RZ��:o_X\016<cI\034\001)o\027\001M.k\036YMsd\033P\n&c\037YRj".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1272;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "\037I\003<k\002]\035<-\024S\035%/\026]\033)9\020S\032&f\023N\026uz+F5\021".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1360;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "\024U\003-w\002P��)f]R��:g\001L��&q\027".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1448;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "1S\001<g\034HB\032c\034[\nr\"\020E\033-qR".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1536;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "_\021\027\021x(ebB".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1624;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "\ne\025\022[".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label1712;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "1S\001<g\034HB\034{\002Y".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label1800;
        arrayOfString[14] = new String(arrayOfChar15).intern();
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
        m = 2;
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
        m = 60;
        continue;
        m = 111;
        continue;
        m = 72;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 2;
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
      i3 = 60;
      continue;
      i3 = 111;
      continue;
      i3 = 72;
    }
    label744: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 2;
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
      i7 = 60;
      continue;
      i7 = 111;
      continue;
      i7 = 72;
    }
    label832: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 2;
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
      i11 = 60;
      continue;
      i11 = 111;
      continue;
      i11 = 72;
    }
    label920: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 2;
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
      i15 = 60;
      continue;
      i15 = 111;
      continue;
      i15 = 72;
    }
    label1008: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 2;
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
      i19 = 114;
      continue;
      i19 = 60;
      continue;
      i19 = 111;
      continue;
      i19 = 72;
    }
    label1096: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 2;
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
      i23 = 114;
      continue;
      i23 = 60;
      continue;
      i23 = 111;
      continue;
      i23 = 72;
    }
    label1184: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 2;
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
      i27 = 114;
      continue;
      i27 = 60;
      continue;
      i27 = 111;
      continue;
      i27 = 72;
    }
    label1272: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 2;
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
      i31 = 114;
      continue;
      i31 = 60;
      continue;
      i31 = 111;
      continue;
      i31 = 72;
    }
    label1360: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 2;
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
      i35 = 114;
      continue;
      i35 = 60;
      continue;
      i35 = 111;
      continue;
      i35 = 72;
    }
    label1448: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 2;
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
      i39 = 114;
      continue;
      i39 = 60;
      continue;
      i39 = 111;
      continue;
      i39 = 72;
    }
    label1536: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 2;
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
      i43 = 114;
      continue;
      i43 = 60;
      continue;
      i43 = 111;
      continue;
      i43 = 72;
    }
    label1624: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 2;
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
      i47 = 114;
      continue;
      i47 = 60;
      continue;
      i47 = 111;
      continue;
      i47 = 72;
    }
    label1712: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 2;
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
      i51 = 114;
      continue;
      i51 = 60;
      continue;
      i51 = 111;
      continue;
      i51 = 72;
    }
    label1800: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 2;
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
      i55 = 114;
      continue;
      i55 = 60;
      continue;
      i55 = 111;
      continue;
      i55 = 72;
    }
  }

  public at(URL paramURL, File paramFile, int paramInt1, int paramInt2, ct paramct)
  {
    this.a = paramURL;
    this.b = paramFile;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramct;
  }

  public at(URL paramURL, File paramFile, int paramInt, ct paramct)
  {
    this(paramURL, paramFile, 0, paramInt, paramct);
  }

  static void a(OutputStream paramOutputStream, String paramString)
    throws IOException
  {
    boolean bool = DialogToastListActivity.f;
    StringReader localStringReader = new StringReader(paramString);
    try
    {
      do
      {
        int i = localStringReader.read();
        if (i == -1)
          break;
        paramOutputStream.write((char)i);
      }
      while (!bool);
      paramOutputStream.flush();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g5.d(localException);
    }
  }

  public void a(String paramString1, String paramString2)
  {
    this.f.add(new dt(this, paramString1, paramString2));
  }

  public boolean a()
    throws IOException, HttpException, Exception
  {
    boolean bool1 = DialogToastListActivity.f;
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(z[12]).append(z[8]).append(this.b.getName()).append(z[5]).append(z[4]);
    if (this.c != 0)
      localStringBuilder1.append(z[11] + this.c + z[7]);
    localStringBuilder1.append(z[1]);
    String str1 = localStringBuilder1.toString();
    StringBuilder localStringBuilder2 = new StringBuilder();
    Iterator localIterator = this.f.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      dt localdt = (dt)localIterator.next();
      localStringBuilder2.append(z[2]).append(z[13]).append(z[0]).append(localdt.a).append(z[6]).append(localdt.b);
    }
    while (!bool1);
    localStringBuilder2.append(z[2]).append(z[13]).append(z[3]);
    String str2 = localStringBuilder2.toString();
    long l = str1.length() + this.b.length() + str2.length() - this.c;
    hab localhab = new hab(this, new bt(this, str1, str2), l);
    eq localeq = eq.b(this.a.toString());
    localeq.a(localhab);
    localeq.a(z[14], z[9]);
    try
    {
      localHttpResponse = localeq.a();
      if (localHttpResponse == null)
      {
        g5.c(z[10]);
        bool2 = false;
        return bool2;
      }
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      while (true)
      {
        HttpResponse localHttpResponse;
        boolean bool2 = false;
        continue;
        if (Thread.currentThread().isInterrupted())
        {
          bool2 = false;
        }
        else if (this.e != null)
        {
          this.e.a(EntityUtils.toString(localHttpResponse.getEntity()));
          bool2 = true;
        }
        else
        {
          bool2 = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.at
 * JD-Core Version:    0.6.1
 */