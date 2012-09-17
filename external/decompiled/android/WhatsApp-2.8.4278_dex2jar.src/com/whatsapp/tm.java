package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class tm
  implements View.OnClickListener
{
  final Conversation a;

  tm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    j5.b(4, this.a);
    Conversation.y(this.a).setVisibility(8);
    Conversation.q = false;
  }
}