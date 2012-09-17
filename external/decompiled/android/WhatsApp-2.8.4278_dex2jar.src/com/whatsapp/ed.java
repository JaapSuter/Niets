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