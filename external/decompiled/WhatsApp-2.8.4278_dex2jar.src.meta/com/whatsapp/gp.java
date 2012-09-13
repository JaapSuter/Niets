package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDiskIOException;
import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class gp
{
  public static final ArrayList<String> a;
  private static final hq b;
  private static final uk c;
  private static final Comparator<String> d;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[22];
    char[] arrayOfChar1 = "g\003\026\024\031i\022\002\020\003g\0231<\005r\006\021'".toCharArray();
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
      arrayOfChar2 = "a\n".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "c\n\023:\007".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label1049;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "g\t\026!\004o\003\\:\005r\002\034'Eg\004\006:\004hI!\026%B8?\006'R.\"\037.".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label1141;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "g\t\026!\004o\003\\:\005r\002\034'Ec\037\006!\n(4'\021!C$&".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label1233;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "g\t\026!\004o\003\\:\005r\002\034'Ec\037\006!\n(37\013?".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label1325;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "\006\0347\016~I\0372\002j".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1417;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "g\t\026!\004o\003\\>\no\013".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1509;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "e\b\034%\016t\024\023'\002i\t\001|\030c\t\026~\016k\006\033?K".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1601;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "&\033R".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1693;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "k\006\033?\017t\b\0337".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1785;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "g\t\026!\004o\003\\:\005r\002\034'Ec\037\006!\n(4&\001.G*".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1877;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "`\024\0218Em^".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1969;
        arrayOfString[12] = new String(arrayOfChar13).intern();
        arrayOfChar14 = "n\b\006>\no\013".toCharArray();
        int i48 = arrayOfChar14.length;
        i49 = 0;
        if (i48 > i49)
          break label2061;
        arrayOfString[13] = new String(arrayOfChar14).intern();
        arrayOfChar15 = "r\002\n'D,".toCharArray();
        int i52 = arrayOfChar15.length;
        i53 = 0;
        if (i52 > i53)
          break label2153;
        arrayOfString[14] = new String(arrayOfChar15).intern();
        arrayOfChar16 = "&JLs".toCharArray();
        int i56 = arrayOfChar16.length;
        i57 = 0;
        if (i56 > i57)
          break label2245;
        arrayOfString[15] = new String(arrayOfChar16).intern();
        arrayOfChar17 = "e\b\034%\016t\024\023'\002i\t\001>\ftH��6\033j\006\0216\bi\t\0062\br]".toCharArray();
        int i60 = arrayOfChar17.length;
        i61 = 0;
        if (i60 > i61)
          break label2337;
        arrayOfString[16] = new String(arrayOfChar17).intern();
        arrayOfChar18 = "e\b\034%\006a\025]4\016r\004\035=\035c\025\0012\037o\b\0340\004h\023\0230\037)����<\036v\004\0322\037)\r\0337Kk\016\001>\nr\004\032sC".toCharArray();
        int i64 = arrayOfChar18.length;
        i65 = 0;
        if (i64 > i65)
          break label2429;
        arrayOfString[17] = new String(arrayOfChar18).intern();
        arrayOfChar19 = "e\b\034%\006a\025]4\016r\004\035=\035c\025\0012\037o\b\0340\004h\023\0230\037)\r\0337Kk\016\001>\nr\004\032sC".toCharArray();
        int i68 = arrayOfChar19.length;
        i69 = 0;
        if (i68 > i69)
          break label2521;
        arrayOfString[18] = new String(arrayOfChar19).intern();
        arrayOfChar20 = "*G".toCharArray();
        int i72 = arrayOfChar20.length;
        i73 = 0;
        if (i72 > i73)
          break label2613;
        arrayOfString[19] = new String(arrayOfChar20).intern();
        arrayOfChar21 = "e\b\034%\016t\024\023'\002i\t] \016h\003\0256\037A\025\035&\033O\t\024<Q&".toCharArray();
        int i76 = arrayOfChar21.length;
        i77 = 0;
        if (i76 > i77)
          break label2705;
        arrayOfString[20] = new String(arrayOfChar21).intern();
        arrayOfChar22 = "e\b\034%\006a\025]0\031c\006\0066KgG\025!\004s\027R0\003g\023R0\004h\023\0230\037".toCharArray();
        int i80 = arrayOfChar22.length;
        i81 = 0;
        if (i80 > i81)
          break label2797;
        arrayOfString[21] = new String(arrayOfChar22).intern();
        z = arrayOfString;
        a = new ArrayList();
        b = new iq();
        c = new hp();
        d = new ip();
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 107;
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
        m = 6;
        continue;
        m = 103;
        continue;
        m = 114;
        continue;
        m = 83;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 107;
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
      i3 = 6;
      continue;
      i3 = 103;
      continue;
      i3 = 114;
      continue;
      i3 = 83;
    }
    label1049: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 107;
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
      i7 = 6;
      continue;
      i7 = 103;
      continue;
      i7 = 114;
      continue;
      i7 = 83;
    }
    label1141: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 107;
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
      i11 = 6;
      continue;
      i11 = 103;
      continue;
      i11 = 114;
      continue;
      i11 = 83;
    }
    label1233: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 107;
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
      i15 = 6;
      continue;
      i15 = 103;
      continue;
      i15 = 114;
      continue;
      i15 = 83;
    }
    label1325: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 107;
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
      i19 = 6;
      continue;
      i19 = 103;
      continue;
      i19 = 114;
      continue;
      i19 = 83;
    }
    label1417: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 107;
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
      i23 = 6;
      continue;
      i23 = 103;
      continue;
      i23 = 114;
      continue;
      i23 = 83;
    }
    label1509: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 107;
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
      i27 = 6;
      continue;
      i27 = 103;
      continue;
      i27 = 114;
      continue;
      i27 = 83;
    }
    label1601: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 107;
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
      i31 = 6;
      continue;
      i31 = 103;
      continue;
      i31 = 114;
      continue;
      i31 = 83;
    }
    label1693: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 107;
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
      i35 = 6;
      continue;
      i35 = 103;
      continue;
      i35 = 114;
      continue;
      i35 = 83;
    }
    label1785: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 107;
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
      i39 = 6;
      continue;
      i39 = 103;
      continue;
      i39 = 114;
      continue;
      i39 = 83;
    }
    label1877: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 107;
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
      i43 = 6;
      continue;
      i43 = 103;
      continue;
      i43 = 114;
      continue;
      i43 = 83;
    }
    label1969: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 107;
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
      i47 = 6;
      continue;
      i47 = 103;
      continue;
      i47 = 114;
      continue;
      i47 = 83;
    }
    label2061: int i50 = arrayOfChar14[i49];
    int i51;
    switch (i49 % 5)
    {
    default:
      i51 = 107;
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
      i51 = 6;
      continue;
      i51 = 103;
      continue;
      i51 = 114;
      continue;
      i51 = 83;
    }
    label2153: int i54 = arrayOfChar15[i53];
    int i55;
    switch (i53 % 5)
    {
    default:
      i55 = 107;
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
      i55 = 6;
      continue;
      i55 = 103;
      continue;
      i55 = 114;
      continue;
      i55 = 83;
    }
    label2245: int i58 = arrayOfChar16[i57];
    int i59;
    switch (i57 % 5)
    {
    default:
      i59 = 107;
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
      i59 = 6;
      continue;
      i59 = 103;
      continue;
      i59 = 114;
      continue;
      i59 = 83;
    }
    label2337: int i62 = arrayOfChar17[i61];
    int i63;
    switch (i61 % 5)
    {
    default:
      i63 = 107;
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
      i63 = 6;
      continue;
      i63 = 103;
      continue;
      i63 = 114;
      continue;
      i63 = 83;
    }
    label2429: int i66 = arrayOfChar18[i65];
    int i67;
    switch (i65 % 5)
    {
    default:
      i67 = 107;
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
      i67 = 6;
      continue;
      i67 = 103;
      continue;
      i67 = 114;
      continue;
      i67 = 83;
    }
    label2521: int i70 = arrayOfChar19[i69];
    int i71;
    switch (i69 % 5)
    {
    default:
      i71 = 107;
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
      i71 = 6;
      continue;
      i71 = 103;
      continue;
      i71 = 114;
      continue;
      i71 = 83;
    }
    label2613: int i74 = arrayOfChar20[i73];
    int i75;
    switch (i73 % 5)
    {
    default:
      i75 = 107;
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
      i75 = 6;
      continue;
      i75 = 103;
      continue;
      i75 = 114;
      continue;
      i75 = 83;
    }
    label2705: int i78 = arrayOfChar21[i77];
    int i79;
    switch (i77 % 5)
    {
    default:
      i79 = 107;
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
      i79 = 6;
      continue;
      i79 = 103;
      continue;
      i79 = 114;
      continue;
      i79 = 83;
    }
    label2797: int i82 = arrayOfChar22[i81];
    int i83;
    switch (i81 % 5)
    {
    default:
      i83 = 107;
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
      i83 = 6;
      continue;
      i83 = 103;
      continue;
      i83 = 114;
      continue;
      i83 = 83;
    }
  }

  public static zq a(String paramString)
  {
    try
    {
      if (!eu.f(paramString))
      {
        localzq = App.w.a(paramString, null);
        if (!localzq.b.equals(paramString))
          g5.d(z[18] + paramString + z[19] + localzq.b + ")");
      }
      else
      {
        localzq = App.w.c(paramString);
        if (localzq != null)
        {
          if (((localzq.b().contains(localzq.b.substring(0, localzq.b.lastIndexOf("@")))) || (localzq.j == null) || (localzq.j.length() == 0)) && (!localzq.p()))
          {
            g5.d(z[20] + localzq.b);
            App.l(paramString);
          }
          if (localzq.b.equals(paramString))
            break label289;
          g5.d(z[17] + paramString + z[19] + localzq.b + ")");
        }
      }
    }
    catch (SQLiteDiskIOException localSQLiteDiskIOException)
    {
      b5.a(2131296976);
      throw localSQLiteDiskIOException;
    }
    g5.d(z[21]);
    zq localzq = new zq(paramString);
    App.y.a(paramString, System.currentTimeMillis());
    App.w.a(localzq, null);
    if (!zq.c(paramString))
      App.l(paramString);
    label289: return localzq;
  }

  public static void a()
  {
    App.a(c);
    App.z.a(b);
    App.x.a(b);
  }

  public static void a(Activity paramActivity, zq paramzq, ArrayList<Uri> paramArrayList)
  {
    boolean bool = DialogToastListActivity.f;
    Intent localIntent1 = new Intent(z[3]).setType(z[14]);
    String str1 = z[4];
    App localApp1 = App.Mb;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = paramzq.b();
    Intent localIntent2 = localIntent1.putExtra(str1, localApp1.getString(2131296531, arrayOfObject1));
    String str2 = z[5];
    App localApp2 = App.Mb;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = paramzq.b();
    Intent localIntent3 = localIntent2.putExtra(str2, localApp2.getString(2131296532, arrayOfObject2)).putParcelableArrayListExtra(z[11], paramArrayList);
    List localList = App.hb.queryIntentActivities(localIntent3, 0);
    ArrayList localArrayList = new ArrayList();
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
        String str3 = localActivityInfo.applicationInfo.packageName;
        g5.b(z[8] + str3 + z[9] + localActivityInfo.name);
        if ((str3.contains(z[1])) || (str3.contains(z[2])) || (str3.contains(z[12])) || (str3.contains(z[10])) || (str3.contains(z[13])) || (str3.contains(z[7])) || (str3.contains(z[6])))
          localArrayList.add(new Pair(localResolveInfo, localIntent3));
      }
      while (!bool);
    }
    new a(paramActivity, 2131296501, localArrayList).show();
  }

  public static void a(String paramString1, String paramString2, String paramString3)
  {
    g5.b(z[16] + paramString1 + z[15] + paramString2);
    synchronized (a)
    {
      a.remove(paramString1);
      a.add(0, paramString2);
      App.m();
      return;
    }
  }

  private static int b(String paramString)
  {
    return Collections.binarySearch(a, paramString, d);
  }

  public static zq b(String paramString1, String paramString2, String paramString3)
  {
    g5.b(z[0]);
    zq localzq = new zq(paramString1);
    localzq.h = paramString2;
    localzq.j = paramString3;
    localzq.a = 1;
    App.w.a(localzq);
    return localzq;
  }

  public static void b()
  {
    synchronized (a)
    {
      a.clear();
      return;
    }
  }

  private static int c(String paramString)
  {
    int i = b(paramString);
    if (i < 0)
      synchronized (a)
      {
        a.add(-1 + -i, paramString);
        i = -1 + -i;
      }
    return i;
  }

  public static void c()
  {
    App.y.a();
  }

  private static int d(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    int i = -1;
    int j = 0;
    if (j < a.size())
    {
      if (((String)a.get(j)).equals(paramString));
      do
      {
        synchronized (a)
        {
          a.remove(j);
          i = j;
        }
        break;
        int k = j + 1;
      }
      while (!bool);
    }
    return i;
  }

  public static boolean e(String paramString)
  {
    if (a.indexOf(paramString) >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static int f(String paramString)
  {
    return d(paramString);
  }

  static int g(String paramString)
  {
    return c(paramString);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.gp
 * JD-Core Version:    0.6.1
 */