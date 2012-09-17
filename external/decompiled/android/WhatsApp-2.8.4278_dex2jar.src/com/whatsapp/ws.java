package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class ws
  implements DialogInterface.OnCancelListener
{
  final EULA a;

  ws(EULA paramEULA)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(5);
    this.a.showDialog(6);
  }
}