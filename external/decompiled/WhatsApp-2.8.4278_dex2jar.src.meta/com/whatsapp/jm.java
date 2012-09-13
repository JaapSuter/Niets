package com.whatsapp;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class jm
  implements View.OnKeyListener
{
  final Conversation a;

  jm(Conversation paramConversation)
  {
  }

  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    if ((Conversation.r) && (paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66) && (paramKeyEvent.getAction() == i))
      Conversation.j(this.a);
    while (true)
    {
      return i;
      int j = 0;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.jm
 * JD-Core Version:    0.6.1
 */