package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class ed extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    if (!App.u)
      App.mb();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ed
 * JD-Core Version:    0.6.1
 */