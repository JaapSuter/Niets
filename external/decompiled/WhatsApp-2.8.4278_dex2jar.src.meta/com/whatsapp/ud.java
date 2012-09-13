package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class ud extends Handler
{
  final TouchImageView a;

  ud(TouchImageView paramTouchImageView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (System.currentTimeMillis() - 45L >= TouchImageView.b(this.a))
    {
      TouchImageView.m = 2;
      TouchImageView.n = -1.0F;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ud
 * JD-Core Version:    0.6.1
 */