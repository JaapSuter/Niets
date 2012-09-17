package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bo
  implements DialogInterface.OnClickListener
{
  final Conversations a;

  bo(Conversations paramConversations)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.showDialog(6);
    new v8(this).start();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bo
 * JD-Core Version:    0.6.1
 */