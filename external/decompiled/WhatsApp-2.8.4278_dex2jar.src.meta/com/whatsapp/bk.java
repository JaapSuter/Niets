package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bk
  implements DialogInterface.OnClickListener
{
  final ContactPicker a;

  bk(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.setResult(-1, ContactPicker.s(this.a));
    this.a.removeDialog(2);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bk
 * JD-Core Version:    0.6.1
 */