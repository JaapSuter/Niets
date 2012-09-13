package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class r2
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Settings a;

  static
  {
    char[] arrayOfChar = "BHn}\t_Ji&\001SBo}".toCharArray();
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
      m = 96;
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
      m = 49;
      continue;
      m = 45;
      continue;
      m = 26;
      continue;
      m = 9;
    }
  }

  r2(Settings paramSettings)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(103);
    UserFeedbackActivity.a(this.a, z, Settings.a(this.a), Integer.valueOf(1));
  }
}