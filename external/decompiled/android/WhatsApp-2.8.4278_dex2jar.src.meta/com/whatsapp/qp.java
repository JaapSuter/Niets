package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteTransactionListener;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class qp
{
  private static Map<String, zq> a;
  private static ar c;
  private static final String[] z;
  private xq b;

  static
  {
    String[] arrayOfString = new String[22];
    char[] arrayOfChar1 = "V1\027\tn".toCharArray();
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
    char[] arrayOfChar18;
    int i65;
    char[] arrayOfChar19;
    int i69;
    char[] arrayOfChar20;
    int i73;
    char[] arrayOfChar21;
    int i77;
    char[] arrayOfChar22;
    int i81;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "@1\0247<]>\027\t<F\017\n\f".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "m9\007".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1021;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "G \007\t+W\030\f\004;}%\027+0\\$\002\013+\0357\006\034��\\%\017\004��E1��\0071F1��\034".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1113;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "V1\027\tl".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1205;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "V1\027\tm".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1297;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "[><\0366A9\001\004:m7\021\007*B".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1389;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "Q?\r\034>Q$<\001;\017o".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1481;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "V9\020\0303S)<\006>_5".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1573;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "[>\007\001)Q?\026\006+\0353\f\0351Fp".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1665;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "V1\027\tn\017o".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1757;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "V5\017".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1849;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "V2\n\0069]\016\t1S7\006\032pV5\017\r+W\023\f\006+S3\027\033".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1941;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "a5\021\036:@\020\020F(Z1\027\033>B M\006:F".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2033;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "V%\023\0046Q1\027\r".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2125;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "X9\007".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2217;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "Q?\016F>\\4\021\0076V~\017\t*\\3\013\r-\0341��\0346]>M!\021a\004\"$\023m\003+'\rf\0236<".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2309;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "S>\007\0320[4M\0011F5\r\034qW(\027\032>\034#\013\007-F3\026\034q|\021.-".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2401;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "S>\007\0320[4M\0011F5\r\034qW(\027\032>\034#\013\007-F3\026\034q{\0367-\021f".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2493;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "S>\007\0320[4M\0011F5\r\034qW(\027\032>\034#\013\007-F3\026\034q{\023,&".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2585;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "V9\020\0303S)\r\t2W".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2677;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "D5\021\0336]>".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2769;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        z = arrayOfString;
        a = Collections.synchronizedMap(new HashMap());
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 95;
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
        m = 99;
        continue;
        m = 104;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 95;
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
      i3 = 99;
      continue;
      i3 = 104;
    }
    label1021: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 95;
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
      i7 = 99;
      continue;
      i7 = 104;
    }
    label1113: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 95;
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
      i11 = 99;
      continue;
      i11 = 104;
    }
    label1205: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 95;
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
      i15 = 50;
      continue;
      i15 = 80;
      continue;
      i15 = 99;
      continue;
      i15 = 104;
    }
    label1297: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 95;
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
      i19 = 50;
      continue;
      i19 = 80;
      continue;
      i19 = 99;
      continue;
      i19 = 104;
    }
    label1389: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 95;
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
      i23 = 50;
      continue;
      i23 = 80;
      continue;
      i23 = 99;
      continue;
      i23 = 104;
    }
    label1481: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 95;
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
      i27 = 50;
      continue;
      i27 = 80;
      continue;
      i27 = 99;
      continue;
      i27 = 104;
    }
    label1573: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 95;
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
      i31 = 50;
      continue;
      i31 = 80;
      continue;
      i31 = 99;
      continue;
      i31 = 104;
    }
    label1665: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 95;
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
      i35 = 50;
      continue;
      i35 = 80;
      continue;
      i35 = 99;
      continue;
      i35 = 104;
    }
    label1757: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 95;
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
      i39 = 50;
      continue;
      i39 = 80;
      continue;
      i39 = 99;
      continue;
      i39 = 104;
    }
    label1849: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 95;
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
      i43 = 50;
      continue;
      i43 = 80;
      continue;
      i43 = 99;
      continue;
      i43 = 104;
    }
    label1941: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 95;
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
      i47 = 50;
      continue;
      i47 = 80;
      continue;
      i47 = 99;
      continue;
      i47 = 104;
    }
    label2033: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 95;
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
      i51 = 50;
      continue;
      i51 = 80;
      continue;
      i51 = 99;
      continue;
      i51 = 104;
    }
    label2125: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 95;
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
      i55 = 50;
      continue;
      i55 = 80;
      continue;
      i55 = 99;
      continue;
      i55 = 104;
    }
    label2217: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 95;
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
      i59 = 50;
      continue;
      i59 = 80;
      continue;
      i59 = 99;
      continue;
      i59 = 104;
    }
    label2309: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 95;
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
      i63 = 50;
      continue;
      i63 = 80;
      continue;
      i63 = 99;
      continue;
      i63 = 104;
    }
    label2401: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar18[i65] = (char)(i67 ^ i66);
      i65++;
      break;
      i67 = 50;
      continue;
      i67 = 80;
      continue;
      i67 = 99;
      continue;
      i67 = 104;
    }
    label2493: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar19[i69] = (char)(i71 ^ i70);
      i69++;
      break;
      i71 = 50;
      continue;
      i71 = 80;
      continue;
      i71 = 99;
      continue;
      i71 = 104;
    }
    label2585: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar20[i73] = (char)(i75 ^ i74);
      i73++;
      break;
      i75 = 50;
      continue;
      i75 = 80;
      continue;
      i75 = 99;
      continue;
      i75 = 104;
    }
    label2677: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar21[i77] = (char)(i79 ^ i78);
      i77++;
      break;
      i79 = 50;
      continue;
      i79 = 80;
      continue;
      i79 = 99;
      continue;
      i79 = 104;
    }
    label2769: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 95;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar22[i81] = (char)(i83 ^ i82);
      i81++;
      break;
      i83 = 50;
      continue;
      i83 = 80;
      continue;
      i83 = 99;
      continue;
      i83 = 104;
    }
  }

  public qp(Context paramContext)
  {
    this.b = new xq(paramContext);
  }

  static xq a(qp paramqp)
  {
    return paramqp.b;
  }

  static boolean d(zq paramzq)
  {
    if (a.put(paramzq.b, paramzq) == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static void e(zq paramzq)
  {
    a.remove(paramzq.b);
  }

  public zq a(uq paramuq)
  {
    int i = yq.e;
    while (true)
    {
      zq localzq;
      synchronized (a)
      {
        Iterator localIterator = a.values().iterator();
        if (localIterator.hasNext())
        {
          localzq = (zq)localIterator.next();
          if (!paramuq.equals(localzq.g))
            break label90;
        }
        else
        {
          localzq = this.b.a(paramuq, null);
        }
      }
      return localzq;
      label90: if (i == 0);
    }
  }

  public zq a(zq paramzq, String paramString1, String paramString2, String paramString3)
  {
    this.b.a(paramzq, paramString1, paramString2, paramString3);
    return a(paramString1, null);
  }

  public zq a(String paramString)
  {
    return (zq)a.get(paramString);
  }

  public zq a(String paramString, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    Object localObject;
    if ((!eu.f(paramString)) && (App.c() != null) && (paramString.contains(App.c())))
      localObject = b();
    while (true)
    {
      return localObject;
      localObject = (zq)a.get(paramString);
      if (localObject == null)
      {
        localObject = this.b.a(paramString, paramSQLiteTransactionListener);
        if (localObject == null)
        {
          localObject = new zq(paramString);
          App.y.a(paramString, System.currentTimeMillis());
          this.b.b((zq)localObject, null);
        }
      }
    }
  }

  public ArrayList<zq> a()
  {
    return this.b.c();
  }

  public void a(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.a(paramSQLiteTransactionListener);
  }

  public void a(Uri paramUri, zq paramzq)
  {
    if (a(paramUri, paramzq, new rp(this, paramzq)))
      App.a(App.Mb.getApplicationContext(), 2131296529, 0);
  }

  public void a(zq paramzq)
  {
    this.b.a(paramzq);
  }

  public void a(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.b(paramzq, null);
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zq localzq = a(paramString1, null);
    localzq.h = paramString3;
    if (paramString4 != null)
      localzq.j = paramString4;
    if (!paramString2.contains(App.c()))
      localzq.a = (1 + localzq.a);
    this.b.b(localzq);
  }

  public void a(ArrayList<zq> paramArrayList)
  {
    int i = yq.e;
    this.b.a(paramArrayList, null);
    Iterator localIterator = paramArrayList.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      zq localzq = (zq)localIterator.next();
      localzq.i();
      localzq.j();
      e(localzq);
    }
    while (i == 0);
  }

  public void a(ArrayList<zq> paramArrayList, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.c(paramArrayList, paramSQLiteTransactionListener);
  }

  public void a(Collection<String> paramCollection)
  {
    if (paramCollection.size() > 0)
    {
      HashMap localHashMap = new HashMap();
      this.b.a(paramCollection, localHashMap, null);
      a.putAll(localHashMap);
    }
  }

  public void a(Collection<zq> paramCollection, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    int i = yq.e;
    zq.a(paramCollection, z[12], z[11]);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramCollection.iterator();
    do
    {
      zq localzq;
      do
      {
        if (!localIterator.hasNext())
          break label193;
        localzq = (zq)localIterator.next();
        if (localzq == null)
          break;
      }
      while (((localzq.b != null) && (localzq.b.equals(z[13]))) || ((localzq.o()) && (i == 0)));
      if ((localzq.k) && (!this.b.j(localzq, null)))
      {
        if ((gp.e(localzq.b)) || (App.z.m(localzq.b)))
        {
          if (localzq.g != null)
          {
            this.b.i(localzq, paramSQLiteTransactionListener);
            if (i == 0);
          }
        }
        else
        {
          localArrayList.add(localzq);
          if (i == 0);
        }
      }
      else
        localArrayList.add(localzq);
    }
    while (i == 0);
    label193: if (localArrayList.size() > 0)
      a(localArrayList);
  }

  public void a(HashMap<String, LinkedList<zq>> paramHashMap, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.a(paramHashMap.values(), paramSQLiteTransactionListener);
  }

  // ERROR //
  public boolean a(Uri paramUri, zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    // Byte code:
    //   0: getstatic 121	com/whatsapp/yq:e	I
    //   3: istore 4
    //   5: iconst_3
    //   6: anewarray 17	java/lang/String
    //   9: astore 5
    //   11: aload 5
    //   13: iconst_0
    //   14: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   17: iconst_2
    //   18: aaload
    //   19: aastore
    //   20: aload 5
    //   22: iconst_1
    //   23: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   26: bipush 8
    //   28: aaload
    //   29: aastore
    //   30: aload 5
    //   32: iconst_2
    //   33: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   36: bipush 6
    //   38: aaload
    //   39: aastore
    //   40: iconst_4
    //   41: anewarray 17	java/lang/String
    //   44: astore 6
    //   46: aload 6
    //   48: iconst_0
    //   49: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   52: iconst_1
    //   53: aaload
    //   54: aastore
    //   55: aload 6
    //   57: iconst_1
    //   58: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   61: iconst_0
    //   62: aaload
    //   63: aastore
    //   64: aload 6
    //   66: iconst_2
    //   67: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   70: iconst_5
    //   71: aaload
    //   72: aastore
    //   73: aload 6
    //   75: iconst_3
    //   76: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   79: iconst_4
    //   80: aaload
    //   81: aastore
    //   82: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   85: bipush 7
    //   87: aaload
    //   88: pop
    //   89: aload_2
    //   90: ifnonnull +59 -> 149
    //   93: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   96: iconst_3
    //   97: aaload
    //   98: invokestatic 318	com/whatsapp/g5:b	(Ljava/lang/String;)V
    //   101: iconst_0
    //   102: invokestatic 323	com/whatsapp/tp:a	(Z)I
    //   105: istore 22
    //   107: iload 22
    //   109: ifeq +9 -> 118
    //   112: iload 22
    //   114: iconst_3
    //   115: if_icmpne +15 -> 130
    //   118: getstatic 327	com/whatsapp/App:lc	Lcom/whatsapp/g;
    //   121: iconst_0
    //   122: invokevirtual 332	com/whatsapp/g:c	(Z)V
    //   125: iload 4
    //   127: ifeq +16 -> 143
    //   130: iload 22
    //   132: iconst_1
    //   133: if_icmpne +10 -> 143
    //   136: getstatic 327	com/whatsapp/App:lc	Lcom/whatsapp/g;
    //   139: iconst_0
    //   140: invokevirtual 334	com/whatsapp/g:b	(Z)V
    //   143: iconst_1
    //   144: istore 11
    //   146: iload 11
    //   148: ireturn
    //   149: getstatic 338	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   152: aload_1
    //   153: aload 5
    //   155: aconst_null
    //   156: aconst_null
    //   157: aconst_null
    //   158: invokevirtual 344	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   161: astore 10
    //   163: aload 10
    //   165: ifnonnull +21 -> 186
    //   168: iconst_1
    //   169: istore 11
    //   171: aload 10
    //   173: ifnull -27 -> 146
    //   176: aload 10
    //   178: invokeinterface 349 1 0
    //   183: goto -37 -> 146
    //   186: iconst_0
    //   187: istore 11
    //   189: aload 10
    //   191: invokeinterface 352 1 0
    //   196: ifeq +264 -> 460
    //   199: aload 10
    //   201: iconst_2
    //   202: invokeinterface 356 2 0
    //   207: iconst_1
    //   208: if_icmpne +247 -> 455
    //   211: aload 10
    //   213: iconst_0
    //   214: invokeinterface 360 2 0
    //   219: lstore 12
    //   221: aload 10
    //   223: iconst_1
    //   224: invokeinterface 364 2 0
    //   229: astore 14
    //   231: aload 14
    //   233: ifnull +314 -> 547
    //   236: aload 14
    //   238: invokevirtual 367	java/lang/String:length	()I
    //   241: ifne +6 -> 247
    //   244: goto +303 -> 547
    //   247: iconst_0
    //   248: istore 15
    //   250: aload_2
    //   251: aload 14
    //   253: putfield 237	com/whatsapp/zq:h	Ljava/lang/String;
    //   256: iconst_1
    //   257: anewarray 17	java/lang/String
    //   260: astore 16
    //   262: aload 16
    //   264: iconst_0
    //   265: lload 12
    //   267: invokestatic 373	java/lang/Long:toString	(J)Ljava/lang/String;
    //   270: aastore
    //   271: getstatic 338	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   274: getstatic 379	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   277: aload 6
    //   279: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   282: bipush 7
    //   284: aaload
    //   285: aload 16
    //   287: aconst_null
    //   288: invokevirtual 344	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   291: astore 20
    //   293: aload 20
    //   295: astore 18
    //   297: aload 18
    //   299: ifnull +140 -> 439
    //   302: aload 18
    //   304: invokeinterface 352 1 0
    //   309: ifeq +130 -> 439
    //   312: aload_2
    //   313: new 147	com/whatsapp/uq
    //   316: dup
    //   317: aload 18
    //   319: iconst_0
    //   320: invokeinterface 360 2 0
    //   325: aload 18
    //   327: iconst_1
    //   328: invokeinterface 364 2 0
    //   333: invokestatic 385	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   336: invokespecial 388	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   339: putfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   342: aload_2
    //   343: aload 18
    //   345: iconst_2
    //   346: invokeinterface 356 2 0
    //   351: invokestatic 394	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   354: putfield 397	com/whatsapp/zq:i	Ljava/lang/Integer;
    //   357: aload_2
    //   358: aload 18
    //   360: iconst_3
    //   361: invokeinterface 364 2 0
    //   366: putfield 240	com/whatsapp/zq:j	Ljava/lang/String;
    //   369: iload 15
    //   371: ifeq +14 -> 385
    //   374: aload_2
    //   375: aload_2
    //   376: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   379: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   382: putfield 237	com/whatsapp/zq:h	Ljava/lang/String;
    //   385: aload_2
    //   386: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   389: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   392: ifnull -90 -> 302
    //   395: aload_2
    //   396: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   399: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   402: invokevirtual 367	java/lang/String:length	()I
    //   405: ifle -103 -> 302
    //   408: iconst_1
    //   409: putstatic 400	com/whatsapp/tp:a	Z
    //   412: aload_0
    //   413: getfield 95	com/whatsapp/qp:b	Lcom/whatsapp/xq;
    //   416: aload_2
    //   417: aload_3
    //   418: invokevirtual 402	com/whatsapp/xq:d	(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z
    //   421: pop
    //   422: new 404	com/whatsapp/b9
    //   425: dup
    //   426: aload_0
    //   427: aload_2
    //   428: invokespecial 405	com/whatsapp/b9:<init>	(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V
    //   431: invokevirtual 408	com/whatsapp/b9:start	()V
    //   434: iload 4
    //   436: ifeq -134 -> 302
    //   439: aload 18
    //   441: ifnull +10 -> 451
    //   444: aload 18
    //   446: invokeinterface 349 1 0
    //   451: iload 15
    //   453: istore 11
    //   455: iload 4
    //   457: ifeq -268 -> 189
    //   460: aload 10
    //   462: ifnull -316 -> 146
    //   465: goto -289 -> 176
    //   468: astore 19
    //   470: aconst_null
    //   471: astore 18
    //   473: aload 19
    //   475: invokestatic 411	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   478: aload 18
    //   480: ifnull +78 -> 558
    //   483: aload 18
    //   485: invokeinterface 349 1 0
    //   490: goto +68 -> 558
    //   493: aload 18
    //   495: ifnull +10 -> 505
    //   498: aload 18
    //   500: invokeinterface 349 1 0
    //   505: aload 17
    //   507: athrow
    //   508: astore 8
    //   510: aload 10
    //   512: astore 9
    //   514: aload 9
    //   516: ifnull +10 -> 526
    //   519: aload 9
    //   521: invokeinterface 349 1 0
    //   526: aload 8
    //   528: athrow
    //   529: astore 8
    //   531: aconst_null
    //   532: astore 9
    //   534: goto -20 -> 514
    //   537: astore 17
    //   539: goto -46 -> 493
    //   542: astore 19
    //   544: goto -71 -> 473
    //   547: iconst_1
    //   548: istore 15
    //   550: iload 4
    //   552: ifeq -296 -> 256
    //   555: goto -308 -> 247
    //   558: iload 15
    //   560: istore 11
    //   562: goto -107 -> 455
    //   565: astore 17
    //   567: aconst_null
    //   568: astore 18
    //   570: goto -77 -> 493
    //
    // Exception table:
    //   from	to	target	type
    //   271	293	468	java/lang/Exception
    //   189	271	508	finally
    //   444	451	508	finally
    //   483	508	508	finally
    //   149	163	529	finally
    //   302	434	537	finally
    //   473	478	537	finally
    //   302	434	542	java/lang/Exception
    //   271	293	565	finally
  }

  public int b(String paramString)
  {
    return this.b.b(paramString);
  }

  public ar b()
  {
    if ((c == null) || (!c.b.contains(App.c())))
      c = new ar();
    return c;
  }

  public void b(zq paramzq)
  {
    App.w.b(paramzq, new sp(this, paramzq));
  }

  public void b(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zq localzq = this.b.a(paramString1, null);
    if (localzq == null)
    {
      localzq = new zq(paramString1);
      App.y.a(paramString1, System.currentTimeMillis());
      this.b.b(localzq, null);
    }
    localzq.h = paramString3;
    localzq.j = paramString4;
    localzq.m = paramString2;
    this.b.b(localzq);
  }

  public void b(ArrayList<Pair<String, zq>> paramArrayList)
  {
    this.b.c(paramArrayList);
  }

  public void b(ArrayList<zq> paramArrayList, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.d(paramArrayList, paramSQLiteTransactionListener);
  }

  public void b(HashMap<uq, zq> paramHashMap, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.a(paramHashMap, null);
  }

  // ERROR //
  public boolean b(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    // Byte code:
    //   0: getstatic 121	com/whatsapp/yq:e	I
    //   3: istore_3
    //   4: iconst_4
    //   5: anewarray 17	java/lang/String
    //   8: astore 4
    //   10: aload 4
    //   12: iconst_0
    //   13: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   16: iconst_1
    //   17: aaload
    //   18: aastore
    //   19: aload 4
    //   21: iconst_1
    //   22: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   25: iconst_5
    //   26: aaload
    //   27: aastore
    //   28: aload 4
    //   30: iconst_2
    //   31: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   34: iconst_4
    //   35: aaload
    //   36: aastore
    //   37: aload 4
    //   39: iconst_3
    //   40: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   43: bipush 8
    //   45: aaload
    //   46: aastore
    //   47: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   50: bipush 10
    //   52: aaload
    //   53: pop
    //   54: getstatic 338	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   57: astore 9
    //   59: getstatic 379	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   62: astore 10
    //   64: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   67: bipush 10
    //   69: aaload
    //   70: astore 11
    //   72: iconst_1
    //   73: anewarray 17	java/lang/String
    //   76: astore 12
    //   78: aload 12
    //   80: iconst_0
    //   81: aload_1
    //   82: invokevirtual 439	com/whatsapp/zq:b	()Ljava/lang/String;
    //   85: aastore
    //   86: aload 9
    //   88: aload 10
    //   90: aload 4
    //   92: aload 11
    //   94: aload 12
    //   96: aconst_null
    //   97: invokevirtual 344	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   100: astore 13
    //   102: aload 13
    //   104: astore 7
    //   106: aload 7
    //   108: ifnull +145 -> 253
    //   111: aload 7
    //   113: invokeinterface 352 1 0
    //   118: ifeq +135 -> 253
    //   121: aload 7
    //   123: iconst_3
    //   124: invokeinterface 364 2 0
    //   129: astore 14
    //   131: aload_1
    //   132: new 147	com/whatsapp/uq
    //   135: dup
    //   136: aload 7
    //   138: iconst_0
    //   139: invokeinterface 360 2 0
    //   144: aload_1
    //   145: invokevirtual 439	com/whatsapp/zq:b	()Ljava/lang/String;
    //   148: invokespecial 388	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   151: putfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   154: aload_1
    //   155: aload 7
    //   157: iconst_1
    //   158: invokeinterface 356 2 0
    //   163: invokestatic 394	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   166: putfield 397	com/whatsapp/zq:i	Ljava/lang/Integer;
    //   169: aload_1
    //   170: aload 7
    //   172: iconst_2
    //   173: invokeinterface 364 2 0
    //   178: putfield 240	com/whatsapp/zq:j	Ljava/lang/String;
    //   181: aload 14
    //   183: ifnull +17 -> 200
    //   186: aload 14
    //   188: invokevirtual 367	java/lang/String:length	()I
    //   191: ifle +9 -> 200
    //   194: aload_1
    //   195: aload 14
    //   197: putfield 237	com/whatsapp/zq:h	Ljava/lang/String;
    //   200: aload_1
    //   201: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   204: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   207: ifnull +42 -> 249
    //   210: aload_1
    //   211: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   214: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   217: invokevirtual 367	java/lang/String:length	()I
    //   220: ifle +29 -> 249
    //   223: iconst_1
    //   224: putstatic 400	com/whatsapp/tp:a	Z
    //   227: aload_0
    //   228: getfield 95	com/whatsapp/qp:b	Lcom/whatsapp/xq;
    //   231: aload_1
    //   232: aload_2
    //   233: invokevirtual 402	com/whatsapp/xq:d	(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z
    //   236: pop
    //   237: new 404	com/whatsapp/b9
    //   240: dup
    //   241: aload_0
    //   242: aload_1
    //   243: invokespecial 405	com/whatsapp/b9:<init>	(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V
    //   246: invokevirtual 408	com/whatsapp/b9:start	()V
    //   249: iload_3
    //   250: ifeq -139 -> 111
    //   253: aload 7
    //   255: ifnull +10 -> 265
    //   258: aload 7
    //   260: invokeinterface 349 1 0
    //   265: iconst_1
    //   266: ireturn
    //   267: astore 8
    //   269: aconst_null
    //   270: astore 7
    //   272: aload 8
    //   274: invokestatic 411	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   277: aload 7
    //   279: ifnull -14 -> 265
    //   282: goto -24 -> 258
    //   285: astore 6
    //   287: aconst_null
    //   288: astore 7
    //   290: aload 7
    //   292: ifnull +10 -> 302
    //   295: aload 7
    //   297: invokeinterface 349 1 0
    //   302: aload 6
    //   304: athrow
    //   305: astore 6
    //   307: goto -17 -> 290
    //   310: astore 8
    //   312: goto -40 -> 272
    //
    // Exception table:
    //   from	to	target	type
    //   54	102	267	java/lang/Exception
    //   54	102	285	finally
    //   111	249	305	finally
    //   272	277	305	finally
    //   111	249	310	java/lang/Exception
  }

  public zq c(String paramString)
  {
    zq localzq = (zq)a.get(paramString);
    if (localzq != null);
    while (true)
    {
      return localzq;
      localzq = this.b.a(paramString, null);
    }
  }

  public List<zq> c()
  {
    ArrayList localArrayList = new ArrayList();
    a.clear();
    this.b.b(null);
    synchronized (a)
    {
      localArrayList.addAll(a.values());
      return localArrayList;
    }
  }

  public void c(zq paramzq)
  {
    this.b.b(paramzq);
  }

  public void c(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.c(paramzq, paramSQLiteTransactionListener);
  }

  public void c(ArrayList<zq> paramArrayList)
  {
    this.b.a(paramArrayList);
  }

  public void c(ArrayList<zq> paramArrayList, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.e(paramArrayList, paramSQLiteTransactionListener);
  }

  public ArrayList<zq> d()
  {
    return this.b.c(null);
  }

  public void d(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.f(paramzq, paramSQLiteTransactionListener);
    if (paramzq.a == 1)
      App.Ib.sendEmptyMessage(1);
  }

  public void d(ArrayList<zq> paramArrayList)
  {
    this.b.b(paramArrayList);
  }

  // ERROR //
  public boolean d(String paramString)
  {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray 17	java/lang/String
    //   4: astore_2
    //   5: aload_2
    //   6: iconst_0
    //   7: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   10: iconst_1
    //   11: aaload
    //   12: aastore
    //   13: aload_2
    //   14: iconst_1
    //   15: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   18: iconst_5
    //   19: aaload
    //   20: aastore
    //   21: aload_2
    //   22: iconst_2
    //   23: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   26: iconst_4
    //   27: aaload
    //   28: aastore
    //   29: aload_2
    //   30: iconst_3
    //   31: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   34: bipush 8
    //   36: aaload
    //   37: aastore
    //   38: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   41: bipush 10
    //   43: aaload
    //   44: pop
    //   45: getstatic 338	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   48: astore 7
    //   50: getstatic 379	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   53: astore 8
    //   55: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   58: bipush 10
    //   60: aaload
    //   61: astore 9
    //   63: iconst_1
    //   64: anewarray 17	java/lang/String
    //   67: astore 10
    //   69: aload 10
    //   71: iconst_0
    //   72: aload_1
    //   73: aastore
    //   74: aload 7
    //   76: aload 8
    //   78: aload_2
    //   79: aload 9
    //   81: aload 10
    //   83: aconst_null
    //   84: invokevirtual 344	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   87: astore 11
    //   89: aload 11
    //   91: astore 5
    //   93: aload 5
    //   95: ifnull +127 -> 222
    //   98: aload 5
    //   100: invokeinterface 474 1 0
    //   105: ifeq +117 -> 222
    //   108: aload 5
    //   110: iconst_3
    //   111: invokeinterface 364 2 0
    //   116: astore 12
    //   118: aload 12
    //   120: ifnull +164 -> 284
    //   123: aload 12
    //   125: invokevirtual 367	java/lang/String:length	()I
    //   128: ifne +6 -> 134
    //   131: goto +153 -> 284
    //   134: new 100	com/whatsapp/zq
    //   137: dup
    //   138: new 147	com/whatsapp/uq
    //   141: dup
    //   142: aload 5
    //   144: iconst_0
    //   145: invokeinterface 360 2 0
    //   150: aload_1
    //   151: invokestatic 385	android/telephony/PhoneNumberUtils:stripSeparators	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokespecial 388	com/whatsapp/uq:<init>	(JLjava/lang/String;)V
    //   157: aload 12
    //   159: aload 5
    //   161: iconst_1
    //   162: invokeinterface 356 2 0
    //   167: aload 5
    //   169: iconst_2
    //   170: invokeinterface 364 2 0
    //   175: invokespecial 477	com/whatsapp/zq:<init>	(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V
    //   178: astore 13
    //   180: aload 13
    //   182: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   185: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   188: ifnull +34 -> 222
    //   191: aload 13
    //   193: getfield 145	com/whatsapp/zq:g	Lcom/whatsapp/uq;
    //   196: getfield 398	com/whatsapp/uq:b	Ljava/lang/String;
    //   199: invokevirtual 367	java/lang/String:length	()I
    //   202: ifle +20 -> 222
    //   205: iconst_1
    //   206: putstatic 400	com/whatsapp/tp:a	Z
    //   209: new 479	com/whatsapp/a9
    //   212: dup
    //   213: aload_0
    //   214: aload 13
    //   216: invokespecial 480	com/whatsapp/a9:<init>	(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V
    //   219: invokevirtual 481	com/whatsapp/a9:start	()V
    //   222: aload 5
    //   224: ifnull +10 -> 234
    //   227: aload 5
    //   229: invokeinterface 349 1 0
    //   234: iconst_1
    //   235: ireturn
    //   236: astore 6
    //   238: aconst_null
    //   239: astore 5
    //   241: aload 6
    //   243: invokestatic 411	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   246: aload 5
    //   248: ifnull -14 -> 234
    //   251: goto -24 -> 227
    //   254: astore 4
    //   256: aconst_null
    //   257: astore 5
    //   259: aload 5
    //   261: ifnull +10 -> 271
    //   264: aload 5
    //   266: invokeinterface 349 1 0
    //   271: aload 4
    //   273: athrow
    //   274: astore 4
    //   276: goto -17 -> 259
    //   279: astore 6
    //   281: goto -40 -> 241
    //   284: aload_1
    //   285: astore 12
    //   287: goto -153 -> 134
    //
    // Exception table:
    //   from	to	target	type
    //   45	89	236	java/lang/Exception
    //   45	89	254	finally
    //   98	222	274	finally
    //   241	246	274	finally
    //   98	222	279	java/lang/Exception
  }

  // ERROR //
  public int e()
  {
    // Byte code:
    //   0: getstatic 121	com/whatsapp/yq:e	I
    //   3: istore_1
    //   4: invokestatic 196	java/lang/System:currentTimeMillis	()J
    //   7: pop2
    //   8: iconst_1
    //   9: anewarray 17	java/lang/String
    //   12: astore 4
    //   14: aload 4
    //   16: iconst_0
    //   17: getstatic 75	com/whatsapp/qp:z	[Ljava/lang/String;
    //   20: bipush 21
    //   22: aaload
    //   23: aastore
    //   24: getstatic 338	com/whatsapp/App:ib	Landroid/content/ContentResolver;
    //   27: getstatic 484	android/provider/ContactsContract$RawContacts:CONTENT_URI	Landroid/net/Uri;
    //   30: aload 4
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: invokevirtual 344	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore 9
    //   40: aload 9
    //   42: astore 6
    //   44: aload 6
    //   46: ifnull +100 -> 146
    //   49: iconst_0
    //   50: istore 8
    //   52: aload 6
    //   54: invokeinterface 352 1 0
    //   59: ifeq +24 -> 83
    //   62: aload 6
    //   64: iconst_0
    //   65: invokeinterface 356 2 0
    //   70: istore 10
    //   72: iload 8
    //   74: iload 10
    //   76: iadd
    //   77: istore 8
    //   79: iload_1
    //   80: ifeq -28 -> 52
    //   83: aload 6
    //   85: ifnull +10 -> 95
    //   88: aload 6
    //   90: invokeinterface 349 1 0
    //   95: iload 8
    //   97: ireturn
    //   98: astore 7
    //   100: aconst_null
    //   101: astore 6
    //   103: aload 7
    //   105: invokestatic 411	com/whatsapp/g5:d	(Ljava/lang/Throwable;)V
    //   108: aload 6
    //   110: ifnull +10 -> 120
    //   113: aload 6
    //   115: invokeinterface 349 1 0
    //   120: iconst_0
    //   121: istore 8
    //   123: goto -28 -> 95
    //   126: astore 5
    //   128: aconst_null
    //   129: astore 6
    //   131: aload 6
    //   133: ifnull +10 -> 143
    //   136: aload 6
    //   138: invokeinterface 349 1 0
    //   143: aload 5
    //   145: athrow
    //   146: aload 6
    //   148: ifnull -28 -> 120
    //   151: goto -38 -> 113
    //   154: astore 5
    //   156: goto -25 -> 131
    //   159: astore 7
    //   161: goto -58 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   24	40	98	java/lang/Exception
    //   24	40	126	finally
    //   52	72	154	finally
    //   103	108	154	finally
    //   52	72	159	java/lang/Exception
  }

  public ArrayList<zq> e(String paramString)
  {
    return this.b.d(paramString);
  }

  public void e(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.g(paramzq, paramSQLiteTransactionListener);
  }

  public int f()
  {
    int i = this.b.a();
    g5.b(z[9] + i);
    return i;
  }

  public ArrayList<Long> f(zq paramzq)
  {
    return this.b.c(paramzq);
  }

  public ArrayList<zq> f(String paramString)
  {
    return this.b.e(paramString);
  }

  public void f(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.e(paramzq, paramSQLiteTransactionListener);
  }

  public Intent g(zq paramzq)
  {
    String str = v4.b(paramzq.b());
    Intent localIntent1 = new Intent(App.Mb.getApplicationContext(), Conversation.class);
    localIntent1.addFlags(268435456);
    localIntent1.addFlags(67108864);
    localIntent1.putExtra(z[15], paramzq.b);
    localIntent1.putExtra(z[20], str);
    Intent localIntent2 = new Intent();
    localIntent2.putExtra(z[18], localIntent1);
    localIntent2.putExtra(z[14], false);
    localIntent2.putExtra(z[17], str);
    Bitmap localBitmap = paramzq.a((int)App.Mb.getResources().getDimension(2131361798), j4.a(App.Mb.getApplicationContext()).L, false);
    if (localBitmap == null)
      localBitmap = ((BitmapDrawable)App.Mb.getResources().getDrawable(paramzq.k())).getBitmap();
    localIntent2.putExtra(z[19], localBitmap);
    localIntent2.setAction(z[16]);
    return localIntent2;
  }

  public void g(zq paramzq, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    this.b.h(paramzq, paramSQLiteTransactionListener);
  }

  public boolean g()
  {
    return this.b.d(null);
  }

  public ArrayList<zq> h()
  {
    return this.b.b();
  }

  public void h(zq paramzq)
  {
    App.Mb.getApplicationContext().sendBroadcast(g(paramzq));
  }

  public ArrayList<zq> i()
  {
    return this.b.d();
  }

  public void j()
  {
    a.clear();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qp
 * JD-Core Version:    0.6.1
 */