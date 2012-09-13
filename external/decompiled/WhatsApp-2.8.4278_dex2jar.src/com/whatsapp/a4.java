package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class a4
  implements DialogInterface.OnCancelListener
{
  final SmsDefaultAppWarning a;

  a4(SmsDefaultAppWarning paramSmsDefaultAppWarning)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}