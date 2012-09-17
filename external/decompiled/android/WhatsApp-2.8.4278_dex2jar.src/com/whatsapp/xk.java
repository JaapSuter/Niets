package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class xk
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  xk(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Conversation.d(this.a, 0);
    App.z.c(this.a.Qb.b);
    this.a.removeDialog(0);
  }
}