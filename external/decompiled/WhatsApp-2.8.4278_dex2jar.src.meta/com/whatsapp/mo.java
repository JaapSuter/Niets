package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class mo
  implements DialogInterface.OnClickListener
{
  final zq a;
  final Conversations b;

  mo(Conversations paramConversations, zq paramzq)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(12);
    Conversation.a(this.b, this.a, false, 5, 9);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mo
 * JD-Core Version:    0.6.1
 */