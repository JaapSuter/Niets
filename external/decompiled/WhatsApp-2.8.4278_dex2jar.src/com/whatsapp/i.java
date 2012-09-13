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