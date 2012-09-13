package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class pm
  implements View.OnClickListener
{
  final Conversation a;

  pm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.i(this.a, false);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pm
 * JD-Core Version:    0.6.1
 */