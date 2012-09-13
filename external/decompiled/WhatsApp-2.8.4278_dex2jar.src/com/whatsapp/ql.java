package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ql
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  ql(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(10);
    Conversation.a(this.a, this.a.Qb, false, 4, 6);
  }
}