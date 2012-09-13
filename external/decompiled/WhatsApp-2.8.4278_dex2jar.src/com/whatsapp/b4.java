package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

class b4
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final SmsDefaultAppWarning a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "Z\017C4-O\003E<<H\022@')[\fY>/\006\f_p)J\026Y&!]\013U#".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Z\017C4-O\003E<<H\022@')[\fY>/\006\021]#".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "H\fT\"'@\006\0369&]\007^$fH\001D9'GLc\025\006m6".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
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
        m = 72;
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
        m = 41;
        continue;
        m = 98;
        continue;
        m = 48;
        continue;
        m = 80;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 72;
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
      i3 = 41;
      continue;
      i3 = 98;
      continue;
      i3 = 48;
      continue;
      i3 = 80;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 72;
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
      i7 = 41;
      continue;
      i7 = 98;
      continue;
      i7 = 48;
      continue;
      i7 = 80;
    }
  }

  b4(SmsDefaultAppWarning paramSmsDefaultAppWarning)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(0);
    Intent localIntent = new Intent(z[2]);
    localIntent.setData(this.a.getIntent().getData());
    List localList = App.hb.queryIntentActivities(localIntent, 0);
    if (!localList.isEmpty())
    {
      g5.b(z[1]);
      ActivityInfo localActivityInfo = ((ResolveInfo)localList.get(0)).activityInfo;
      localIntent.setClassName(localActivityInfo.packageName, localActivityInfo.name);
      this.a.startActivity(localIntent);
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.d(z[0]);
    }
    this.a.finish();
  }
}