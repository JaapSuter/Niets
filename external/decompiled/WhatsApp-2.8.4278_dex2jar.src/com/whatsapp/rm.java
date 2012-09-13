package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class rm
  implements View.OnClickListener
{
  final Conversation a;

  rm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (Conversation.y(this.a).getVisibility() != 8)
    {
      Conversation.y(this.a).setVisibility(8);
      if (!bool);
    }
    else if (App.g(this.a.Qb.b))
    {
      this.a.showDialog(106);
      if (!bool);
    }
    else
    {
      Conversation.y(this.a).setVisibility(0);
    }
    if (this.a.V.getVisibility() == 0)
      this.a.V.setVisibility(8);
  }
}