package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class uj
  implements DialogInterface.OnCancelListener
{
  final ContactPicker a;

  uj(ContactPicker paramContactPicker)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(0);
  }
}