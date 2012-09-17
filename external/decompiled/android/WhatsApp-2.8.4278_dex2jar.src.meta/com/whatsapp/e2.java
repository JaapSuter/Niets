package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e2
  implements DialogInterface.OnClickListener
{
  final String a;
  final RegisterPhone b;

  e2(RegisterPhone paramRegisterPhone, String paramString)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(22);
    this.b.a(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.e2
 * JD-Core Version:    0.6.1
 */