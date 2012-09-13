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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r8
 * JD-Core Version:    0.6.1
 */