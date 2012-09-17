package com.whatsapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import java.util.List;

class k3
  implements Preference.OnPreferenceClickListener
{
  private static final String[] z;
  final Settings a;

  static
  {
    String[] arrayOfString = new String[11];
    char[] arrayOfChar1 = "'1TBfav".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\t=YIf<%".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "-3X\013t&=AVb>,\033Lm:9[Q-/?ALl rf`W\021\013tiO\036\035e`Q".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label592;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "-3ZIj<5F".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label680;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "n \025".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label768;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "/2QWl'8\033Lm:9[Q-+$AWb`\025{lW\007\035yzJ��\bpkW\035".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label856;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "-3X\013t&=AVb>,\033Lm:9[Q-/?ALl rg`P\013\bjrB\002\020edS\013\016".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label944;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "-3X\013t&=AVb>,\033Lm:9[Q-/?ALl rq`E\017\tyq\\\031\035yiS\017\fpw".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label1032;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "!.\\@m:=ALl ".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1120;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "/2QWl'8\033Lm:9[Q-/?ALl rr`W\021\037zkW\013\022a".toCharArray();
        int i32 = arrayOfChar10.length;
        i33 = 0;
        if (i32 > i33)
          break label1208;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        arrayOfChar11 = "-3X\013k:?\033Do,)X".toCharArray();
        int i36 = arrayOfChar11.length;
        i37 = 0;
        if (i36 > i37)
          break label1296;
        arrayOfString[10] = new String(arrayOfChar11).intern();
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
        m = 3;
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
        m = 78;
        continue;
        m = 92;
        continue;
        m = 53;
        continue;
        m = 37;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 3;
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
      i3 = 78;
      continue;
      i3 = 92;
      continue;
      i3 = 53;
      continue;
      i3 = 37;
    }
    label592: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 3;
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
      i7 = 78;
      continue;
      i7 = 92;
      continue;
      i7 = 53;
      continue;
      i7 = 37;
    }
    label680: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 3;
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
      i11 = 78;
      continue;
      i11 = 92;
      continue;
      i11 = 53;
      continue;
      i11 = 37;
    }
    label768: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 3;
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
      i15 = 78;
      continue;
      i15 = 92;
      continue;
      i15 = 53;
      continue;
      i15 = 37;
    }
    label856: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 3;
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
      i19 = 78;
      continue;
      i19 = 92;
      continue;
      i19 = 53;
      continue;
      i19 = 37;
    }
    label944: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 3;
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
      i23 = 78;
      continue;
      i23 = 92;
      continue;
      i23 = 53;
      continue;
      i23 = 37;
    }
    label1032: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 3;
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
      i27 = 78;
      continue;
      i27 = 92;
      continue;
      i27 = 53;
      continue;
      i27 = 37;
    }
    label1120: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 3;
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
      i31 = 78;
      continue;
      i31 = 92;
      continue;
      i31 = 53;
      continue;
      i31 = 37;
    }
    label1208: int i34 = arrayOfChar10[i33];
    int i35;
    switch (i33 % 5)
    {
    default:
      i35 = 3;
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
      i35 = 78;
      continue;
      i35 = 92;
      continue;
      i35 = 53;
      continue;
      i35 = 37;
    }
    label1296: int i38 = arrayOfChar11[i37];
    int i39;
    switch (i37 % 5)
    {
    default:
      i39 = 3;
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
      i39 = 78;
      continue;
      i39 = 92;
      continue;
      i39 = 53;
      continue;
      i39 = 37;
    }
  }

  k3(Settings paramSettings)
  {
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    boolean bool = DialogToastListActivity.f;
    Intent localIntent1 = new Intent(z[9], null);
    localIntent1.setType(z[0]);
    List localList = App.hb.queryIntentActivities(localIntent1, 0);
    int i = localList.size();
    int k;
    for (int j = 0; ; j = k)
    {
      if (j < i)
      {
        ActivityInfo localActivityInfo = ((ResolveInfo)localList.get(j)).activityInfo;
        g5.b(localActivityInfo.applicationInfo.packageName + z[4] + localActivityInfo.name);
        if (((localActivityInfo.name.contains(z[3])) && (localActivityInfo.name.contains(z[1]))) || (localActivityInfo.name.contains(z[10])))
        {
          localIntent1.setComponent(new ComponentName(localActivityInfo.applicationInfo.packageName, localActivityInfo.name));
          localIntent1.putExtra(z[8], this.a.getResources().getConfiguration().orientation);
          if (!bool);
        }
        else
        {
          k = j + 1;
          if (!bool)
            continue;
        }
      }
      Intent localIntent2 = new Intent(z[2], null);
      localIntent2.putExtra(z[8], this.a.getResources().getConfiguration().orientation);
      Intent localIntent3 = new Intent(z[7], null);
      Parcelable[] arrayOfParcelable = new Parcelable[3];
      arrayOfParcelable[0] = localIntent1;
      arrayOfParcelable[1] = localIntent2;
      arrayOfParcelable[2] = localIntent3;
      Intent localIntent4 = Intent.createChooser(new Intent(z[6], null), this.a.getString(2131296580));
      localIntent4.putExtra(z[5], arrayOfParcelable);
      this.a.startActivityForResult(localIntent4, 17);
      return true;
    }
  }
}