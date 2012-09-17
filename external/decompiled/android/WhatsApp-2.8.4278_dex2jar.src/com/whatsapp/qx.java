package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class qx
  implements DialogInterface.OnClickListener
{
  final MultipleContactPicker a;

  qx(MultipleContactPicker paramMultipleContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(108);
  }
}