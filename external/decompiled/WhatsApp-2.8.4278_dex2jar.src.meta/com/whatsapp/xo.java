package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xo
  implements View.OnClickListener
{
  final Conversations a;

  xo(Conversations paramConversations)
  {
  }

  public void onClick(View paramView)
  {
    this.a.s = false;
    this.a.onSearchRequested();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xo
 * JD-Core Version:    0.6.1
 */