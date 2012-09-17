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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fm
 * JD-Core Version:    0.6.1
 */