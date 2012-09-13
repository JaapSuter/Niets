package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;

class d6
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final VerifyMessageStoreActivity a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\023EO!0\033Ne=+".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\bOH&\"\007GI(7\nEH*k\032C[#+\031\005H*7\nEH*\"\fEW-%\035AO? \013ON !\fXU='\037X^!+\nLU:*\032KI$6\033^H6k\r^[;!C".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\023EO!0\033N".toCharArray();
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
        m = 68;
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
        m = 126;
        continue;
        m = 42;
        continue;
        m = 58;
        continue;
        m = 79;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 68;
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
      i3 = 126;
      continue;
      i3 = 42;
      continue;
      i3 = 58;
      continue;
      i3 = 79;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 68;
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
      i7 = 126;
      continue;
      i7 = 42;
      continue;
      i7 = 58;
      continue;
      i7 = 79;
    }
  }

  d6(VerifyMessageStoreActivity paramVerifyMessageStoreActivity)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(107);
    String str = Environment.getExternalStorageState();
    if ((!str.equals(z[2])) && (!str.equals(z[0])))
    {
      g5.a(z[1] + Environment.getExternalStorageState());
      this.a.showDialog(107);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.c();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d6
 * JD-Core Version:    0.6.1
 */