package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class q3
  implements DialogInterface.OnClickListener
{
  final Settings a;

  q3(Settings paramSettings)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      e4.c();
      this.a.b();
    }
  }
}