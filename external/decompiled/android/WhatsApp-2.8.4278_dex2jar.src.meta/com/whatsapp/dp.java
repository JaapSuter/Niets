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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dp
 * JD-Core Version:    0.6.1
 */