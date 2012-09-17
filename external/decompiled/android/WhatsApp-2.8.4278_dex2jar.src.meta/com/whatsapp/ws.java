package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class ws
  implements DialogInterface.OnCancelListener
{
  final EULA a;

  ws(EULA paramEULA)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(5);
    this.a.showDialog(6);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ws
 * JD-Core Version:    0.6.1
 */