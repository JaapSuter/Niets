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