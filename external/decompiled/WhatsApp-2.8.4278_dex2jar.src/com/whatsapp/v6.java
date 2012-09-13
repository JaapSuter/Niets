package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class v6
  implements DialogInterface.OnClickListener
{
  final VerifyNumber a;

  v6(VerifyNumber paramVerifyNumber)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(109);
  }
}