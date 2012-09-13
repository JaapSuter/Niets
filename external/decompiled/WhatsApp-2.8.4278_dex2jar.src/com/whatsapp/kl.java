package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class kl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  kl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Conversation.t(this.a);
    this.a.removeDialog(106);
  }
}