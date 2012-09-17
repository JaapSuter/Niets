package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class nm
  implements View.OnLongClickListener
{
  final Conversation a;

  nm(Conversation paramConversation)
  {
  }

  public boolean onLongClick(View paramView)
  {
    this.a.U = true;
    Conversation.y(this.a).setVisibility(8);
    this.a.V.setVisibility(0);
    return true;
  }
}