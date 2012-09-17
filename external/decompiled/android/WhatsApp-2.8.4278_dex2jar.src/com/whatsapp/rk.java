package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rk
  implements DialogInterface.OnClickListener
{
  final ContactPickerHelp a;

  rk(ContactPickerHelp paramContactPickerHelp)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(3);
  }
}