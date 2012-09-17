package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class os
  implements DialogInterface.OnClickListener
{
  final EULA a;

  os(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(8);
    this.a.j = 0;
  }
}