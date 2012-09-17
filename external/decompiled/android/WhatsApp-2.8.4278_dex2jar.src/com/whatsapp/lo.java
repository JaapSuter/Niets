package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class lo
  implements DialogInterface.OnClickListener
{
  final Conversations a;

  lo(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(11);
  }
}