package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class y1
  implements DialogInterface.OnClickListener
{
  final RegisterName a;

  y1(RegisterName paramRegisterName)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegisterName.a(this.a);
    this.a.removeDialog(1);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.y1
 * JD-Core Version:    0.6.1
 */