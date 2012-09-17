package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ts
  implements DialogInterface.OnClickListener
{
  final EULA a;

  ts(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(0);
  }
}