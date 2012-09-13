package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lw
  implements DialogInterface.OnClickListener
{
  final Main a;

  lw(Main paramMain)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(2);
    this.a.finish();
  }
}