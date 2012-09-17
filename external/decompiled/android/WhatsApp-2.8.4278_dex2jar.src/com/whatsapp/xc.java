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