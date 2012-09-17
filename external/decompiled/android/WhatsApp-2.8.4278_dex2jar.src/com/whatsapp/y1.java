package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y1
  implements DialogInterface.OnClickListener
{
  final RegisterName a;

  y1(RegisterName paramRegisterName)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegisterName.a(this.a);
    this.a.removeDialog(1);
  }
}