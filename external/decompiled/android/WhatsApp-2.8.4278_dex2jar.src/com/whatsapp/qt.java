package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class qt
  implements DialogInterface.OnClickListener
{
  final GroupChatInfo a;

  qt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(6);
    GroupChatInfo.a(this.a, this.a.E.b);
  }
}