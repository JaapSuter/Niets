package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;

class b6
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final VerifyMessageStoreActivity a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "qu!ANy~".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "qu!ANy~\013]U".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "j&F\\ew'HIhu&J\025xs5CU{59J^u{7NHxt;[\\so:K[oq&JNnc{JBh&A[pi NNy'".toCharArray();
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
        m = 58;
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
        m = 28;
        continue;
        m = 26;
        continue;
        m = 84;
        continue;
        m = 47;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 58;
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
      i3 = 28;
      continue;
      i3 = 26;
      continue;
      i3 = 84;
      continue;
      i3 = 47;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 58;
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
      i7 = 28;
      continue;
      i7 = 26;
      continue;
      i7 = 84;
      continue;
      i7 = 47;
    }
  }

  b6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(102);
    String str = Environment.getExternalStorageState();
    if ((!str.equals(z[0])) && (!str.equals(z[1])))
    {
      g5.a(z[2] + Environment.getExternalStorageState());
      this.a.showDialog(102);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.c();
    }
  }
}