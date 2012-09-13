package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class oi
  implements DialogInterface.OnClickListener
{
  final BroadcastMediaPicker a;

  oi(BroadcastMediaPicker paramBroadcastMediaPicker)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.oi
 * JD-Core Version:    0.6.1
 */