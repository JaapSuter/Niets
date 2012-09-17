package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bo
  implements DialogInterface.OnClickListener
{
  final Conversations a;

  bo(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.showDialog(6);
    new v8(this).start();
  }
}