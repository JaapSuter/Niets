package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class fm
  implements View.OnClickListener
{
  final Conversation a;

  fm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    if (!App.g(this.a.Qb.b))
    {
      this.a.showDialog(1);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Conversation.t(this.a);
    }
  }
}