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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.vc
 * JD-Core Version:    0.6.1
 */