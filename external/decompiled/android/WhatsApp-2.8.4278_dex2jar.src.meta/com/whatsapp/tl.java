package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class tl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  tl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(11);
    Conversation.a(this.a, this.a.Qb.b(), true);
    Conversation.e(this.a, false);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tl
 * JD-Core Version:    0.6.1
 */