package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class z6
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  z6(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(4);
    VerifySms.n(this.a);
  }
}