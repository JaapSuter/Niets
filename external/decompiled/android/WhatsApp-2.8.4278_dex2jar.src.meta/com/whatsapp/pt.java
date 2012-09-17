package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class pt
  implements DialogInterface.OnClickListener
{
  final GroupChatInfo a;

  pt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pt
 * JD-Core Version:    0.6.1
 */