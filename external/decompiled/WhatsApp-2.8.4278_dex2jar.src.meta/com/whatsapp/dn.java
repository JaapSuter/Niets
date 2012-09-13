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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dn
 * JD-Core Version:    0.6.1
 */