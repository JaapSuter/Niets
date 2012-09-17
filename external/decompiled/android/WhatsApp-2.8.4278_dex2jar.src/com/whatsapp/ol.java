package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ol
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  ol(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(9);
  }
}