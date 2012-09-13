package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.view.View;

class uc extends Handler
{
  final BroadcastMessageComposer a;

  uc(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
      this.a.r.setVisibility(0);
  }
}