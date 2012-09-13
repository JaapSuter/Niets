package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class kl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  kl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Conversation.t(this.a);
    this.a.removeDialog(106);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.kl
 * JD-Core Version:    0.6.1
 */