package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class nm
  implements View.OnLongClickListener
{
  final Conversation a;

  nm(Conversation paramConversation)
  {
  }

  public boolean onLongClick(View paramView)
  {
    this.a.U = true;
    Conversation.y(this.a).setVisibility(8);
    this.a.V.setVisibility(0);
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nm
 * JD-Core Version:    0.6.1
 */