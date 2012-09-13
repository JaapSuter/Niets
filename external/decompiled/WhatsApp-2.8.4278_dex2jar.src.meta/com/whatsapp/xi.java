package com.whatsapp;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class xi
  implements TextView.OnEditorActionListener
{
  private boolean a = false;
  final BroadcastMessageComposer b;

  xi(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = DialogToastListActivity.f;
    if (paramInt == 6)
    {
      if ((this.b.i.getText().length() > 0) && (!BroadcastMessageComposer.j))
      {
        this.b.n.performClick();
        if (!bool);
      }
      else
      {
        BroadcastMessageComposer.b(this.b);
        if (!bool);
      }
    }
    else if ((paramKeyEvent != null) && (paramKeyEvent.getKeyCode() == 66))
      if (!this.a)
      {
        int i = this.b.i.getSelectionStart();
        int j = this.b.i.getSelectionEnd();
        if (i != this.b.i.length())
        {
          this.b.i.getText().replace(Math.min(i, j), Math.max(i, j), "\n", 0, 1);
          if (!bool);
        }
        else
        {
          this.b.i.append("\n");
        }
        this.a = true;
        if (!bool);
      }
      else
      {
        this.a = false;
      }
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xi
 * JD-Core Version:    0.6.1
 */