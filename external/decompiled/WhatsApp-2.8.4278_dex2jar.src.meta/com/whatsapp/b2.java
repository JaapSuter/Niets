package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class b2
  implements DialogInterface.OnClickListener
{
  final RegisterPhone a;

  b2(RegisterPhone paramRegisterPhone)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    RegisterPhone.a(0);
    this.a.removeDialog(21);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.b2
 * JD-Core Version:    0.6.1
 */