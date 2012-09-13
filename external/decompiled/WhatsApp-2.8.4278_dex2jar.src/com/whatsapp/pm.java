package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class pm
  implements View.OnClickListener
{
  final Conversation a;

  pm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.i(this.a, false);
  }
}