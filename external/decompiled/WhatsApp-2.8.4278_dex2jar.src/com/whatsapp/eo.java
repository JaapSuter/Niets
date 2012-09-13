package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class eo
  implements DialogInterface.OnClickListener
{
  final Conversations a;

  eo(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.showDialog(6);
    new w8(this).start();
  }
}