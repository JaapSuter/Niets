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