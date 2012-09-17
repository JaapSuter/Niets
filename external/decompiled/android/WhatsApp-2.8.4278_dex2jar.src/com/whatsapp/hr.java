package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class hr
  implements DialogInterface.OnClickListener
{
  final DeleteAccountConfirmation a;

  hr(DeleteAccountConfirmation paramDeleteAccountConfirmation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(3);
  }
}