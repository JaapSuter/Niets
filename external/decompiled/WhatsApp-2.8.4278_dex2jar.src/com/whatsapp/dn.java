package com.whatsapp;

class dn
  implements Runnable
{
  final Conversation a;

  dn(Conversation paramConversation)
  {
  }

  public void run()
  {
    Conversation.b(this.a, Conversation.F(this.a));
  }
}