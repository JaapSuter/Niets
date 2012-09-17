package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class no
  implements DialogInterface.OnClickListener
{
  final zq a;
  final Conversations b;

  no(Conversations paramConversations, zq paramzq)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(12);
    Conversation.a(this.b, this.a, true, 5, 9);
  }
}