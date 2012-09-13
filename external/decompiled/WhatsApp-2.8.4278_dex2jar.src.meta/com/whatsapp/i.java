package com.whatsapp;

import android.database.DataSetObserver;

class i extends DataSetObserver
{
  final Conversation a;

  i(Conversation paramConversation)
  {
  }

  public void onChanged()
  {
    if (App.f >= 1);
  }

  public void onInvalidated()
  {
    Conversation.a(this.a, false);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.i
 * JD-Core Version:    0.6.1
 */