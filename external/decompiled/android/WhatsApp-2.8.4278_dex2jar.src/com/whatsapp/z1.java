package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class z1
  implements DialogInterface.OnClickListener
{
  final RegisterName a;

  z1(RegisterName paramRegisterName)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(109);
  }
}