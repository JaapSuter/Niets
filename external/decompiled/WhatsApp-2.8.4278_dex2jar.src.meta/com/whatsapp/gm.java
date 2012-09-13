package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class gm
  implements View.OnClickListener
{
  final Conversation a;

  gm(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    this.a.showDialog(11);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.gm
 * JD-Core Version:    0.6.1
 */