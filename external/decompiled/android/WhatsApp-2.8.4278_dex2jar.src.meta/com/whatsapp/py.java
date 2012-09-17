package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class py
  implements DialogInterface.OnDismissListener
{
  final PopupNotification a;

  py(PopupNotification paramPopupNotification)
  {
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    eg.b(System.currentTimeMillis());
    this.a.removeDialog(3);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.py
 * JD-Core Version:    0.6.1
 */