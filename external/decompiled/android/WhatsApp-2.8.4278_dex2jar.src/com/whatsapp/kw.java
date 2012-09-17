package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class kw
  implements DialogInterface.OnClickListener
{
  final Main a;

  kw(Main paramMain)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(1);
    this.a.finish();
  }
}