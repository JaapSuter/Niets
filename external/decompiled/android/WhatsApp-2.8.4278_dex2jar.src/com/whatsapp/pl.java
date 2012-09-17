package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class pl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  pl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(9);
    Conversation.a(this.a, gp.a(this.a.p).a());
  }
}