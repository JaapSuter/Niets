package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bk
  implements DialogInterface.OnClickListener
{
  final ContactPicker a;

  bk(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.setResult(-1, ContactPicker.s(this.a));
    this.a.removeDialog(2);
    this.a.finish();
  }
}