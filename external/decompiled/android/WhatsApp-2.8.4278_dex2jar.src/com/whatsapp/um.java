package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class um
  implements View.OnClickListener
{
  final Conversation a;

  um(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    j5.b(5, this.a);
    Conversation.y(this.a).setVisibility(8);
    Conversation.q = false;
  }
}