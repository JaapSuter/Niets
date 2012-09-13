package com.whatsapp;

import android.app.NotificationManager;
import android.os.Handler;
import android.os.Message;

class xc extends Handler
{
  final Conversation a;

  xc(Conversation paramConversation)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (!App.u)
    {
      App.a(false, false);
      if (Conversation.E(this.a))
        App.gb.cancel(1);
      Conversation.j(this.a, false);
      Conversation.k(this.a, true);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xc
 * JD-Core Version:    0.6.1
 */