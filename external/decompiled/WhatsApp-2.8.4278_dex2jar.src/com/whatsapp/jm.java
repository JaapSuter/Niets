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