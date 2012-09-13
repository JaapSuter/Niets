package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class cm
  implements View.OnClickListener
{
  final Conversation a;

  cm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.x(this.a);
  }
}