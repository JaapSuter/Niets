package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class km
  implements View.OnClickListener
{
  final Conversation a;

  km(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.j(this.a);
  }
}