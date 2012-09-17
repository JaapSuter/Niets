package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class st
  implements DialogInterface.OnClickListener
{
  final GroupChatInfo a;

  st(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(4);
  }
}