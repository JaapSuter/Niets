package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class xj
  implements DialogInterface.OnCancelListener
{
  final ContactPicker a;

  xj(ContactPicker paramContactPicker)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(1);
  }
}