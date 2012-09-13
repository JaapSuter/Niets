package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class ri
  implements DialogInterface.OnDismissListener
{
  final BroadcastMessageComposer a;

  ri(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    eg.b(System.currentTimeMillis());
    this.a.removeDialog(3);
  }
}