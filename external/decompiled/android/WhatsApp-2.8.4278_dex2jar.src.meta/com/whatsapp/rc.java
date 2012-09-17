package com.whatsapp;

import android.os.Handler;
import android.os.Message;

final class rc extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null)
      App.e(paramMessage.obj.toString());
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rc
 * JD-Core Version:    0.6.1
 */