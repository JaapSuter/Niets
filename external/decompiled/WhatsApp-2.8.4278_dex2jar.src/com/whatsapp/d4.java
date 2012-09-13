package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

class d4
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final SmsDefaultAppWarning a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "\007\036S<C\033\027Y".toCharArray();
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
      arrayOfChar2 = "\025\035D\021N\035\027\016\nO��\026N\027\017\025\020T\nN\032]s&o0'o".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\007\036S\007D\022\022U\017U\025\003P\024@\006\035I\rF[\032N\025H��\026".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\007\036S\007D\022\022U\017U\025\003P\024@\006\035I\rF[\035OC@\027\007I\025H��\032E\020".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 33;
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
        m = 116;
        continue;
        m = 115;
        continue;
        m = 32;
        continue;
        m = 99;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 33;
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
      i3 = 116;
      continue;
      i3 = 115;
      continue;
      i3 = 32;
      continue;
      i3 = 99;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 33;
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
      i7 = 116;
      continue;
      i7 = 115;
      continue;
      i7 = 32;
      continue;
      i7 = 99;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 33;
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
      i11 = 116;
      continue;
      i11 = 115;
      continue;
      i11 = 32;
      continue;
      i11 = 99;
    }
  }

  d4(SmsDefaultAppWarning paramSmsDefaultAppWarning)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(0);
    Intent localIntent = new Intent(z[1]);
    localIntent.setData(this.a.getIntent().getData());
    List localList = App.hb.queryIntentActivities(localIntent, 0);
    if (!localList.isEmpty())
    {
      g5.b(z[2]);
      ActivityInfo localActivityInfo = ((ResolveInfo)localList.get(0)).activityInfo;
      localIntent.putExtra(z[0], this.a.getString(2131296464));
      localIntent.setClassName(localActivityInfo.packageName, localActivityInfo.name);
      this.a.startActivity(localIntent);
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.d(z[3]);
    }
    this.a.finish();
  }
}