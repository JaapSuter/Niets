package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class fl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  fl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(111);
  }
}