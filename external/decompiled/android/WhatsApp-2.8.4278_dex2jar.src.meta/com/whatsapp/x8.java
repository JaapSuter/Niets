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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.x8
 * JD-Core Version:    0.6.1
 */