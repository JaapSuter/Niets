package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class d7
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final VerifySms a;

  static
  {
    char[] arrayOfChar = "WkqRCX#uTLBk1".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 33;
      continue;
      m = 14;
      continue;
      m = 3;
      continue;
      m = 59;
    }
  }

  d7(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(27);
    this.a.a(z);
  }
}