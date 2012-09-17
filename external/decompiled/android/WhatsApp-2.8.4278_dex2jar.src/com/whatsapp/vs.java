package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class vs
  implements DialogInterface.OnClickListener
{
  final EULA a;

  vs(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(3);
  }
}