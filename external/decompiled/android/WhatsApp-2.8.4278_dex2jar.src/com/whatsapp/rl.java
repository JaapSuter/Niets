package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  rl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(10);
    Conversation.a(this.a, this.a.Qb, true, 4, 6);
  }
}