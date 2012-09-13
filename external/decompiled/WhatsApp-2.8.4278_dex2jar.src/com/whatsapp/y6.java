package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y6
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  y6(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(23);
    VerifySms.n(this.a);
  }
}