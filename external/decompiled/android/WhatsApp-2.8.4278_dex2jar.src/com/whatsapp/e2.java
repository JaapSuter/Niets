package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e2
  implements DialogInterface.OnClickListener
{
  final String a;
  final RegisterPhone b;

  e2(RegisterPhone paramRegisterPhone, String paramString)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(22);
    this.b.a(this.a);
  }
}