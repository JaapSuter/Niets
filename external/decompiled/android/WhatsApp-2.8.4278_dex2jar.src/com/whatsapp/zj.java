package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class zj
  implements DialogInterface.OnClickListener
{
  final ContactPicker a;

  zj(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(1);
  }
}