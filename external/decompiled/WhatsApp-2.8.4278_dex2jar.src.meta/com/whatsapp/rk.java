package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rk
  implements DialogInterface.OnClickListener
{
  final ContactPickerHelp a;

  rk(ContactPickerHelp paramContactPickerHelp)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(3);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rk
 * JD-Core Version:    0.6.1
 */