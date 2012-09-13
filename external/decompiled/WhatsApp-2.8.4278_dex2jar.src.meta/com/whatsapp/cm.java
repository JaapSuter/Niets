package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class cm
  implements View.OnClickListener
{
  final Conversation a;

  cm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.x(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cm
 * JD-Core Version:    0.6.1
 */