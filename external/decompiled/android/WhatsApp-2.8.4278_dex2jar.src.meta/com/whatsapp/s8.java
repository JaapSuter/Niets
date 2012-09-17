package com.whatsapp;

class s8 extends Thread
{
  final Conversation a;

  s8(Conversation paramConversation)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.a(this.a, Conversation.s(this.a), this.a.Qb.b);
      label30: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label30;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.s8
 * JD-Core Version:    0.6.1
 */