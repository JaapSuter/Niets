package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class zo
  implements View.OnClickListener
{
  final Conversations a;

  zo(Conversations paramConversations)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a, ContactPicker.class);
    this.a.startActivityForResult(localIntent, 1);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zo
 * JD-Core Version:    0.6.1
 */