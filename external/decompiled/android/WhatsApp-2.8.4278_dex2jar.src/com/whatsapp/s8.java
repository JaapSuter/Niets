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