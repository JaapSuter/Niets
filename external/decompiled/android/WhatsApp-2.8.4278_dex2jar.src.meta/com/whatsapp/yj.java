package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class yj
  implements DialogInterface.OnClickListener
{
  final ContactPicker a;

  yj(ContactPicker paramContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.startActivity(ContactPicker.s(this.a));
    this.a.removeDialog(1);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yj
 * JD-Core Version:    0.6.1
 */