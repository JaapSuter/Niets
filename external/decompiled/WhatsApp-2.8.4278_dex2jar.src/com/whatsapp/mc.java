package com.whatsapp;

import android.os.Handler;
import android.os.Message;

final class mc extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    k8 localk8 = new k8(this);
    localk8.setPriority(1);
    localk8.start();
  }
}