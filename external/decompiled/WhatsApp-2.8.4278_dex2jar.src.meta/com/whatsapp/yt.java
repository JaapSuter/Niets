package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class yt
  implements View.OnClickListener
{
  final GroupChatInfo a;

  yt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(View paramView)
  {
    this.a.showDialog(2);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yt
 * JD-Core Version:    0.6.1
 */