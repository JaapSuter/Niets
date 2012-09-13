package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;

class n6
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final VerifyMessageStoreListActivity a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "m\007]Bgb\017\\Lro\r]Nmr\021[\004er\003CDf4\017JOhz\001NYeu\r[Mnn\fKJrp\020J_sbMJSu~\020AJmh\026N_d&".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "v\rZEu~\006".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "v\rZEu~\006pYn".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
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
        m = 1;
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
        m = 27;
        continue;
        m = 98;
        continue;
        m = 47;
        continue;
        m = 43;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 1;
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
      i3 = 27;
      continue;
      i3 = 98;
      continue;
      i3 = 47;
      continue;
      i3 = 43;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 1;
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
      i7 = 27;
      continue;
      i7 = 98;
      continue;
      i7 = 47;
      continue;
      i7 = 43;
    }
  }

  n6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(102);
    String str = Environment.getExternalStorageState();
    if ((!str.equals(z[1])) && (!str.equals(z[2])))
    {
      g5.a(z[0] + Environment.getExternalStorageState());
      this.a.showDialog(102);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.b();
    }
  }
}