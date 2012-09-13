package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class zs
  implements DialogInterface.OnCancelListener
{
  final EULA a;

  zs(EULA paramEULA)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(7);
    this.a.showDialog(8);
  }
}