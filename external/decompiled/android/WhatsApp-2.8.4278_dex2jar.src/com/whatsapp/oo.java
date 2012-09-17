package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

class oo
  implements View.OnClickListener
{
  final Conversations a;

  oo(Conversations paramConversations)
  {
  }

  public void onClick(View paramView)
  {
    Conversations.c(this.a).setVisibility(8);
    this.a.r.setText("");
  }
}