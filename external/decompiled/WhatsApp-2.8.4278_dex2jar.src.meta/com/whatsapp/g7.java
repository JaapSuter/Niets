package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class g7
  implements DialogInterface.OnClickListener
{
  final VerifySms a;

  g7(VerifySms paramVerifySms)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(29);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.g7
 * JD-Core Version:    0.6.1
 */