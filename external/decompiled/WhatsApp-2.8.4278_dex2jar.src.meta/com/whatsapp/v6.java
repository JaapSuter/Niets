package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class v6
  implements DialogInterface.OnClickListener
{
  final VerifyNumber a;

  v6(VerifyNumber paramVerifyNumber)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(109);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v6
 * JD-Core Version:    0.6.1
 */