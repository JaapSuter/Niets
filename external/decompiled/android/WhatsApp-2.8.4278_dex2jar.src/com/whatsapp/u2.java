package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class u2
  implements DialogInterface.OnClickListener
{
  final Settings a;

  u2(Settings paramSettings)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(18);
  }
}