package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class mm
  implements View.OnClickListener
{
  final Conversation a;

  mm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    if (Conversation.m(this.a).a())
      this.a.h.hideSoftInputFromWindow(this.a.Jb.getWindowToken(), 0);
    if (this.a.V.getVisibility() != 0)
    {
      this.a.V.setVisibility(0);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.V.setVisibility(8);
      this.a.U = false;
    }
    if (Conversation.y(this.a).getVisibility() != 8)
      Conversation.y(this.a).setVisibility(8);
  }
}