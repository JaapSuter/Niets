package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class rt
  implements DialogInterface.OnClickListener
{
  final GroupChatInfo a;

  rt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(6);
  }
}