package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class ak
  implements DialogInterface.OnCancelListener
{
  final ContactPicker a;

  ak(ContactPicker paramContactPicker)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ak
 * JD-Core Version:    0.6.1
 */