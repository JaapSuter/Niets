package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class tm
  implements View.OnClickListener
{
  final Conversation a;

  tm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    j5.b(4, this.a);
    Conversation.y(this.a).setVisibility(8);
    Conversation.q = false;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tm
 * JD-Core Version:    0.6.1
 */