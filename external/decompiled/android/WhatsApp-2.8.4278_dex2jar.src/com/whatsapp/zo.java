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