package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class qx
  implements DialogInterface.OnClickListener
{
  final MultipleContactPicker a;

  qx(MultipleContactPicker paramMultipleContactPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(108);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qx
 * JD-Core Version:    0.6.1
 */