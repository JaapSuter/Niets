package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class oy
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final PopupNotification a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "+{6U(q6".toCharArray();
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
      arrayOfChar2 = "2h5I3y6".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "ue:H)}opS(`n0Nhuh*S)z%\bs\003C".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "ui=".toCharArray();
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
        m = 70;
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
        m = 20;
        continue;
        m = 11;
        continue;
        m = 94;
        continue;
        m = 58;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 70;
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
      i3 = 20;
      continue;
      i3 = 11;
      continue;
      i3 = 94;
      continue;
      i3 = 58;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 70;
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
      i7 = 20;
      continue;
      i7 = 11;
      continue;
      i7 = 94;
      continue;
      i7 = 58;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 70;
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
      i11 = 20;
      continue;
      i11 = 11;
      continue;
      i11 = 94;
      continue;
      i11 = 58;
    }
  }

  oy(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    eg.b(System.currentTimeMillis());
    String str1 = App.bb.jabber_id + z[3];
    String str2 = z[0] + App.bb.jabber_id + z[1] + mh.b(str1);
    Intent localIntent = new Intent(z[2]);
    localIntent.setData(Uri.parse(f8.e + str2));
    this.a.startActivity(localIntent);
    this.a.removeDialog(3);
  }
}