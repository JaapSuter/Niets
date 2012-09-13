package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.widget.ListView;

class vc extends Handler
{
  final Conversation a;

  vc(Conversation paramConversation)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
      Conversation.g(this.a);
    this.a.Ib.setTranscriptMode(0);
  }
}