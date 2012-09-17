package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class v3
  implements DialogInterface.OnClickListener
{
  final Settings a;

  v3(Settings paramSettings)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(12);
  }
}