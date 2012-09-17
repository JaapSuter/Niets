package com.whatsapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ig
  implements View.OnClickListener
{
  private static final String[] z;
  final AccountInfoActivity a;

  static
  {
    String[] arrayOfString = new String[13];
    char[] arrayOfChar1 = "S\001+%*L\017+-".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "X\023!\"`UY".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "_\003!&;P\024o  X\017m:+P\004m(>N@".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label669;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "[\r# \"".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label761;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\036\034b".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label853;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "V\0176$/W\f".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label945;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "_\016&;!W\004l  J\005,=`_\0036 !PN\021\f��z".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label1037;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "_\016&;!W\004l  J\005,=`[\0306;/\0203\027\013\004{#\026".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1129;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "G\001,-+FN/('R".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1221;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "J\005:=aN\f#  ".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1313;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "_\016&;!W\004l$/W\f".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1405;
        arrayOfString[10] = new String(arrayOfChar11).intern();
        arrayOfChar12 = "Y\r".toCharArray();
        int i40 = arrayOfChar12.length;
        i41 = 0;
        if (i40 > i41)
          break label1497;
        arrayOfString[11] = new String(arrayOfChar12).intern();
        arrayOfChar13 = "_\016&;!W\004l  J\005,=`[\0306;/\0204\007\021\032".toCharArray();
        int i44 = arrayOfChar13.length;
        i45 = 0;
        if (i44 > i45)
          break label1589;
        arrayOfString[12] = new String(arrayOfChar13).intern();
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
        m = 78;
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
        m = 62;
        continue;
        m = 96;
        continue;
        m = 66;
        continue;
        m = 73;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 78;
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
      i3 = 62;
      continue;
      i3 = 96;
      continue;
      i3 = 66;
      continue;
      i3 = 73;
    }
    label669: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 78;
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
      i7 = 62;
      continue;
      i7 = 96;
      continue;
      i7 = 66;
      continue;
      i7 = 73;
    }
    label761: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 78;
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
      i11 = 62;
      continue;
      i11 = 96;
      continue;
      i11 = 66;
      continue;
      i11 = 73;
    }
    label853: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 78;
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
      i15 = 62;
      continue;
      i15 = 96;
      continue;
      i15 = 66;
      continue;
      i15 = 73;
    }
    label945: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 78;
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
      i19 = 62;
      continue;
      i19 = 96;
      continue;
      i19 = 66;
      continue;
      i19 = 73;
    }
    label1037: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 78;
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
      i23 = 62;
      continue;
      i23 = 96;
      continue;
      i23 = 66;
      continue;
      i23 = 73;
    }
    label1129: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 78;
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
      i27 = 62;
      continue;
      i27 = 96;
      continue;
      i27 = 66;
      continue;
      i27 = 73;
    }
    label1221: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 78;
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
      i31 = 62;
      continue;
      i31 = 96;
      continue;
      i31 = 66;
      continue;
      i31 = 73;
    }
    label1313: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 78;
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
      i35 = 62;
      continue;
      i35 = 96;
      continue;
      i35 = 66;
      continue;
      i35 = 73;
    }
    label1405: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 78;
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
      i39 = 62;
      continue;
      i39 = 96;
      continue;
      i39 = 66;
      continue;
      i39 = 73;
    }
    label1497: int i42 = arrayOfChar12[i41];
    int i43;
    switch (i41 % 5)
    {
    default:
      i43 = 78;
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
      i43 = 62;
      continue;
      i43 = 96;
      continue;
      i43 = 66;
      continue;
      i43 = 73;
    }
    label1589: int i46 = arrayOfChar13[i45];
    int i47;
    switch (i45 % 5)
    {
    default:
      i47 = 78;
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
      i47 = 62;
      continue;
      i47 = 96;
      continue;
      i47 = 66;
      continue;
      i47 = 73;
    }
  }

  ig(AccountInfoActivity paramAccountInfoActivity)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    String str1 = this.a.getString(2131296830);
    String str2 = this.a.getString(2131296831) + " " + AccountInfoActivity.a(this.a);
    Intent localIntent = new Intent(z[6]).setType(z[9]).putExtra(z[7], str1).putExtra(z[12], str2);
    ArrayList localArrayList = new ArrayList();
    List localList = App.hb.queryIntentActivities(localIntent, 0);
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
        g5.b(z[2] + str3 + z[4] + localActivityInfo.name);
        if ((str3.contains(z[11])) || (str3.contains(z[3])) || (str3.contains(z[1])) || (str3.contains(z[0])) || (str3.contains(z[5])) || (str3.contains(z[10])) || (str3.contains(z[8])))
          localArrayList.add(new Pair(localResolveInfo, localIntent));
      }
      while (!bool);
    }
    if (localArrayList.size() == 0)
    {
      this.a.a(2131296992);
      if (!bool);
    }
    else
    {
      new a(this.a, 2131296501, localArrayList).show();
    }
  }
}