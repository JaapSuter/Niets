package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class qm
  implements View.OnClickListener
{
  final Conversation a;

  qm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.B(this.a);
  }
}