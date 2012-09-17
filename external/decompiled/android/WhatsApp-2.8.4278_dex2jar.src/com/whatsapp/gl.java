package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class gl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  gl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(112);
  }
}