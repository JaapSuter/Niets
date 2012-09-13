package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class xk
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  xk(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Conversation.d(this.a, 0);
    App.z.c(this.a.Qb.b);
    this.a.removeDialog(0);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xk
 * JD-Core Version:    0.6.1
 */