package com.whatsapp;

class u8 extends Thread
{
  final String a;
  final Conversations b;

  u8(Conversations paramConversations, String paramString)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.k(this.a);
      label13: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label13;
    }
  }
}