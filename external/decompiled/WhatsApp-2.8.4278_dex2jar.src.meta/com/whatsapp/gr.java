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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.gr
 * JD-Core Version:    0.6.1
 */