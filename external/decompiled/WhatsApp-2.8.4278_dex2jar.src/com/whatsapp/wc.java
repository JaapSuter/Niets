package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class wc extends Handler
{
  final Conversation a;

  wc(Conversation paramConversation)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      Conversation.h(this.a);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Conversation.i(this.a);
    }
  }
}