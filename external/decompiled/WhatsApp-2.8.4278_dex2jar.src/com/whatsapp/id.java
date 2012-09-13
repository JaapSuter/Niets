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