package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class m7
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  m7(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(30);
    VerifySms.n(this.a);
  }
}