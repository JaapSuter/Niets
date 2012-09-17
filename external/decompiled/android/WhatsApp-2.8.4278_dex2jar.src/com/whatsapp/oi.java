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