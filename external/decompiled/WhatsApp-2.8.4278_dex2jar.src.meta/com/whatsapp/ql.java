package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ql
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  ql(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(10);
    Conversation.a(this.a, this.a.Qb, false, 4, 6);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ql
 * JD-Core Version:    0.6.1
 */