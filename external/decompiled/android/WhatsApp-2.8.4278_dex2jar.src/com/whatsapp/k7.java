package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class k7
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  k7(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(7);
    VerifySms.n(this.a);
  }
}