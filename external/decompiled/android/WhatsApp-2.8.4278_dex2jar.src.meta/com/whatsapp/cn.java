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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cn
 * JD-Core Version:    0.6.1
 */