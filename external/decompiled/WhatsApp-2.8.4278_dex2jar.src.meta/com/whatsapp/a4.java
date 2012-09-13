package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class a4
  implements DialogInterface.OnCancelListener
{
  final SmsDefaultAppWarning a;

  a4(SmsDefaultAppWarning paramSmsDefaultAppWarning)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a4
 * JD-Core Version:    0.6.1
 */