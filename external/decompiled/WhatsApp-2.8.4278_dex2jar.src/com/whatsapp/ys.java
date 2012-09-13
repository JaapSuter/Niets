package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ys
  implements DialogInterface.OnClickListener
{
  final EULA a;

  ys(EULA paramEULA)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.showDialog(5);
  }
}