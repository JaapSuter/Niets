package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class zm
  implements TextView.OnEditorActionListener
{
  final Conversation a;

  zm(Conversation paramConversation)
  {
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramInt == 3) || ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66) && (paramKeyEvent.getAction() == 0)))
      Conversation.i(this.a, bool);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}