package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class dp
  implements DialogInterface.OnDismissListener
{
  final Conversations a;

  dp(Conversations paramConversations)
  {
  }

  public void onDismiss(DialogInterface paramDialogInterface)
  {
    eg.b(System.currentTimeMillis());
    this.a.removeDialog(2);
  }
}