package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class d2
  implements DialogInterface.OnClickListener
{
  final RegisterPhone a;

  d2(RegisterPhone paramRegisterPhone)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(22);
  }
}