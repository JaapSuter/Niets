package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class wj
  implements DialogInterface.OnClickListener
{
  final ContactPicker a;

  wj(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(0);
  }
}