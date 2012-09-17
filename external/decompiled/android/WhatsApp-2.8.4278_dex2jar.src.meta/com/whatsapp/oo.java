package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

class oo
  implements View.OnClickListener
{
  final Conversations a;

  oo(Conversations paramConversations)
  {
  }

  public void onClick(View paramView)
  {
    Conversations.c(this.a).setVisibility(8);
    this.a.r.setText("");
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.oo
 * JD-Core Version:    0.6.1
 */