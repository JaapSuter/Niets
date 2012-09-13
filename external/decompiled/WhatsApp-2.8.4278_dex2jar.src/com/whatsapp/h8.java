package com.whatsapp;

import android.os.Process;

class h8 extends Thread
{
  final Advanced a;

  h8(Advanced paramAdvanced)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(2000L);
      label6: Process.killProcess(Process.myPid());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label6;
    }
  }
}