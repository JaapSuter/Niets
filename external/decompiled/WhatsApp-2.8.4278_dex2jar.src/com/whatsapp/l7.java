package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class l7
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  l7(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(21);
    VerifySms.n(this.a);
  }
}