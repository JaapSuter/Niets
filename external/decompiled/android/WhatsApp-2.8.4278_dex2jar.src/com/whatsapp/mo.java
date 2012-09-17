package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class mo
  implements DialogInterface.OnClickListener
{
  final zq a;
  final Conversations b;

  mo(Conversations paramConversations, zq paramzq)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(12);
    Conversation.a(this.b, this.a, false, 5, 9);
  }
}