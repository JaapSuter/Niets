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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.h8
 * JD-Core Version:    0.6.1
 */