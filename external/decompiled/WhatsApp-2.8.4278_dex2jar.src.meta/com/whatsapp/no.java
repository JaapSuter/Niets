package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class no
  implements DialogInterface.OnClickListener
{
  final zq a;
  final Conversations b;

  no(Conversations paramConversations, zq paramzq)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.removeDialog(12);
    Conversation.a(this.b, this.a, true, 5, 9);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.no
 * JD-Core Version:    0.6.1
 */