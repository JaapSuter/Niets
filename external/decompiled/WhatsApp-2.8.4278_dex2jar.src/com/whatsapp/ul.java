package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ul
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  ul(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(11);
    String str = this.a.Qb.a();
    Conversation.b(this.a, str, true);
    Conversation.e(this.a, false);
  }
}