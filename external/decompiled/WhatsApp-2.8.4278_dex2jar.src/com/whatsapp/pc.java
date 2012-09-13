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