package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class gm
  implements View.OnClickListener
{
  final Conversation a;

  gm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    this.a.showDialog(11);
  }
}