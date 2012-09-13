package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class po
  implements DialogInterface.OnClickListener
{
  private static final String z;
  final Conversations a;

  static
  {
    char[] arrayOfChar = "`<*s\033q %q\027l=7*\ff!!b\027p'!w".toCharArray();
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
      m = 126;
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
      m = 3;
      continue;
      m = 83;
      continue;
      m = 68;
      continue;
      m = 5;
    }
  }

  po(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    g5.b(z);
    this.a.removeDialog(110);
    OverlayAlert.a(this.a);
    this.a.finish();
  }
}