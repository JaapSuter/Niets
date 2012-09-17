package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class gr
  implements DialogInterface.OnClickListener
{
  final DeleteAccountConfirmation a;

  gr(DeleteAccountConfirmation paramDeleteAccountConfirmation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(2);
  }
}