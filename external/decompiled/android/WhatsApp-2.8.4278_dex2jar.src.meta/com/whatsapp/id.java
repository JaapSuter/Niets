package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class id extends Handler
{
  final GroupChatInfo a;

  id(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    App.b = true;
    this.a.q.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.id
 * JD-Core Version:    0.6.1
 */