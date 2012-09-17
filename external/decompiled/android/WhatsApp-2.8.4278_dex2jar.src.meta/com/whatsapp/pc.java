package com.whatsapp;

import android.media.AsyncPlayer;
import android.os.Handler;
import android.os.Message;

final class pc extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    App.oc.stop();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pc
 * JD-Core Version:    0.6.1
 */