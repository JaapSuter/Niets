package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class fl
  implements DialogInterface.OnClickListener
{
  final Conversation a;

  fl(Conversation paramConversation)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.removeDialog(111);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fl
 * JD-Core Version:    0.6.1
 */