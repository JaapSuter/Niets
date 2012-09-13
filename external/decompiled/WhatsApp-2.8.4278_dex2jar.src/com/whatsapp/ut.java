package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class ut
  implements DialogInterface.OnCancelListener
{
  final GroupChatInfo a;

  ut(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.a.removeDialog(3);
  }
}