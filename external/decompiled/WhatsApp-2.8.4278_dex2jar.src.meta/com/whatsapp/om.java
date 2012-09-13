package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class om
  implements View.OnClickListener
{
  final Conversation a;

  om(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    Conversation.i(this.a, true);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.om
 * JD-Core Version:    0.6.1
 */