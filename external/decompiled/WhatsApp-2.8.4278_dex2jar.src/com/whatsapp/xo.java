package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xo
  implements View.OnClickListener
{
  final Conversations a;

  xo(Conversations paramConversations)
  {
  }

  public void onClick(View paramView)
  {
    this.a.s = false;
    this.a.onSearchRequested();
  }
}