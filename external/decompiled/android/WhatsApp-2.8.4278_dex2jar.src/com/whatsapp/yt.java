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