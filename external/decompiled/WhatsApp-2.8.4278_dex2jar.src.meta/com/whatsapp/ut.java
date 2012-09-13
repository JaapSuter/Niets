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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ut
 * JD-Core Version:    0.6.1
 */