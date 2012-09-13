package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ps
  implements DialogInterface.OnClickListener
{
  final EULA a;

  ps(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.showDialog(7);
  }
}