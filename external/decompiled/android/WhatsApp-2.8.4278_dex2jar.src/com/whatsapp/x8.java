package com.whatsapp;

class x8 extends Thread
{
  final jo a;

  x8(jo paramjo)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.k(Conversations.l().b);
      label15: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label15;
    }
  }
}