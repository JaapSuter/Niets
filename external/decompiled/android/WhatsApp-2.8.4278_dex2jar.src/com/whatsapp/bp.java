package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bp
  implements DialogInterface.OnClickListener
{
  final Conversations a;

  bp(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Conversations.d(this.a);
  }
}