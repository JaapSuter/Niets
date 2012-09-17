package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class d2
  implements DialogInterface.OnClickListener
{
  final RegisterPhone a;

  d2(RegisterPhone paramRegisterPhone)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(22);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d2
 * JD-Core Version:    0.6.1
 */