package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageManager;

class c4
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final SmsDefaultAppWarning a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "?y\033dH4w\0029^,f".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "/{\005.Z:w\003&K=f\006=^.x\037$Xsd\0239Z(".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 63;
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
        m = 92;
        continue;
        m = 22;
        continue;
        m = 118;
        continue;
        m = 74;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 63;
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
      i3 = 92;
      continue;
      i3 = 22;
      continue;
      i3 = 118;
      continue;
      i3 = 74;
    }
  }

  c4(SmsDefaultAppWarning paramSmsDefaultAppWarning)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    g5.b(z[1]);
    App.hb.clearPackagePreferredActivities(z[0]);
    this.a.finish();
  }
}