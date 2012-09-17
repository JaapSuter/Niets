package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class mt
  implements View.OnClickListener
{
  final GroupChatInfo a;

  mt(GroupChatInfo paramGroupChatInfo)
  {
  }

  public void onClick(View paramView)
  {
    this.a.showDialog(50);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.mt
 * JD-Core Version:    0.6.1
 */