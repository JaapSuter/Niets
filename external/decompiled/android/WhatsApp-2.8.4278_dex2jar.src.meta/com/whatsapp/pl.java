package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class pl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  pl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(9);
    Conversation.a(this.a, gp.a(this.a.p).a());
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pl
 * JD-Core Version:    0.6.1
 */