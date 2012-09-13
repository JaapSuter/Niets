package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class kd extends Handler
{
  final MediaView a;

  kd(MediaView paramMediaView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (MediaView.o(this.a) != null)
    {
      MediaView.o(this.a).e();
      this.a.a(MediaView.o(this.a), MediaView.o(this.a).a());
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.kd
 * JD-Core Version:    0.6.1
 */