package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yj
  implements DialogInterface.OnClickListener
{
  final ContactPicker a;

  yj(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivity(ContactPicker.s(this.a));
    this.a.removeDialog(1);
    this.a.finish();
  }
}