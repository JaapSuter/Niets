package com.whatsapp;

class cn
  implements Runnable
{
  final Conversation a;

  cn(Conversation paramConversation)
  {
  }

  public void run()
  {
    Conversation.b(this.a, null);
  }
}