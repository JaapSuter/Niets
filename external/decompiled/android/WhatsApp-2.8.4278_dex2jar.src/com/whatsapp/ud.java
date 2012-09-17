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