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