package com.whatsapp;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class am
  implements TextView.OnEditorActionListener
{
  final Conversation a;

  am(Conversation paramConversation)
  {
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    boolean bool = DialogToastListActivity.f;
    if ((paramKeyEvent == null) || (paramInt == 4))
      Conversation.j(this.a);
    while (true)
    {
      return i;
      if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66))
      {
        if (this.a.Tb)
        {
          this.a.Tb = false;
          if (!bool);
        }
        else
        {
          if (Conversation.r)
          {
            Conversation.j(this.a);
            if (!bool);
          }
          else
          {
            int k = this.a.Jb.getSelectionStart();
            int m = this.a.Jb.getSelectionEnd();
            if (k != this.a.Jb.length())
            {
              this.a.Jb.getText().replace(Math.min(k, m), Math.max(k, m), "\n", 0, i);
              if (!bool);
            }
            else
            {
              this.a.Jb.append("\n");
            }
          }
          this.a.Tb = i;
        }
      }
      else
        int j = 0;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.am
 * JD-Core Version:    0.6.1
 */