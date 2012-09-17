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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ri
 * JD-Core Version:    0.6.1
 */