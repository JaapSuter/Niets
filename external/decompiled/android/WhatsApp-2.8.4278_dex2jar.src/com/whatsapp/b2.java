package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class b2
  implements DialogInterface.OnClickListener
{
  final RegisterPhone a;

  b2(RegisterPhone paramRegisterPhone)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegisterPhone.a(0);
    this.a.removeDialog(21);
  }
}