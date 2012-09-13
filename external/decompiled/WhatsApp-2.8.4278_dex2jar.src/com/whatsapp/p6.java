package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;

class p6
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final VerifyMessageStoreListActivity a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\024\nvyx\034\001".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\024\nvyx\034\001\\ec".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\017��q~j��\bpp\r\nqr`\020\026w8h\020\004oxkV\027fdx\026\027fq~\026\bavo\022\020ssy\034\021lr~\013\nqtm\013\001mxx\037\nvyh\030\026hei\r\027z8\r\004wr1".toCharArray();
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
        m = 12;
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
        m = 121;
        continue;
        m = 101;
        continue;
        m = 3;
        continue;
        m = 23;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 12;
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
      i3 = 121;
      continue;
      i3 = 101;
      continue;
      i3 = 3;
      continue;
      i3 = 23;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 12;
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
      i7 = 121;
      continue;
      i7 = 101;
      continue;
      i7 = 3;
      continue;
      i7 = 23;
    }
  }

  p6(VerifyMessageStoreListActivity paramVerifyMessageStoreListActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(107);
    String str = Environment.getExternalStorageState();
    if ((!str.equals(z[0])) && (!str.equals(z[1])))
    {
      g5.a(z[2] + Environment.getExternalStorageState());
      this.a.showDialog(107);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.b();
    }
  }
}