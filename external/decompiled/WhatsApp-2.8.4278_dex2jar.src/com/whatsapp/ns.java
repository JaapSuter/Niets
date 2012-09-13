package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class ns
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final EULA a;

  static
  {
    char[] arrayOfChar = "z��&!Dr\nl:Eo\013,'\005z\r6:Du@\024\032nL".toCharArray();
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
      m = 43;
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
      m = 27;
      continue;
      m = 110;
      continue;
      m = 66;
      continue;
      m = 83;
    }
  }

  ns(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(10);
    Intent localIntent = new Intent(z);
    localIntent.setData(k4.a());
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}