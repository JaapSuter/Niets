package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class om
  implements View.OnClickListener
{
  final Conversation a;

  om(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.i(this.a, true);
  }
}