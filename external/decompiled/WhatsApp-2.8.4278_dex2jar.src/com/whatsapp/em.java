package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class em
  implements View.OnClickListener
{
  final Conversation a;

  em(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.y(this.a).setVisibility(8);
    this.a.V.setVisibility(8);
    if (Conversation.k(this.a))
    {
      GroupChatInfo.a(this.a.Qb, this.a);
      if (!DialogToastListActivity.f);
    }
    else
    {
      ContactInfo.a(this.a.Qb, this.a);
    }
  }
}