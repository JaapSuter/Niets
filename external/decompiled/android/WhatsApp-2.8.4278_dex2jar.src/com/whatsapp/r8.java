package com.whatsapp;

class r8 extends Thread
{
  final yk a;

  r8(yk paramyk)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.a(this.a.a, Conversation.s(this.a.a), this.a.a.Qb.b);
      label39: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label39;
    }
  }
}