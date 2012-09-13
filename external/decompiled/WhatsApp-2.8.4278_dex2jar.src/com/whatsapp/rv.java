package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class rv
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final LocationPicker a;

  static
  {
    char[] arrayOfChar = "_>iY1W4#X;J$dE9M~Ad\035\004Dd\020a\003B~\f}\025Rx\033j\004De\031m".toCharArray();
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
      m = 94;
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
      m = 62;
      continue;
      m = 80;
      continue;
      m = 13;
      continue;
      m = 43;
    }
  }

  rv(LocationPicker paramLocationPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivityForResult(new Intent(z), 0);
    this.a.removeDialog(2);
  }
}