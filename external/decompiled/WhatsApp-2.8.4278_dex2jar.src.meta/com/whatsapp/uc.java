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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uc
 * JD-Core Version:    0.6.1
 */