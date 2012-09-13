package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class x6
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  x6(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(22);
    VerifySms.n(this.a);
  }
}