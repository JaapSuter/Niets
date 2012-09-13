package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class vj
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final ContactPicker a;

  static
  {
    char[] arrayOfChar = "TK_\025RTP".toCharArray();
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
      m = 51;
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
      m = 55;
      continue;
      m = 36;
      continue;
      m = 49;
      continue;
      m = 97;
    }
  }

  vj(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra(z, ContactPicker.r(this.a).b);
    this.a.setResult(-1, localIntent);
    this.a.removeDialog(0);
    this.a.finish();
  }
}