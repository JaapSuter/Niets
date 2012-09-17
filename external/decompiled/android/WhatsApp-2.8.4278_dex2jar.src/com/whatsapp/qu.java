package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class qu
  implements View.OnClickListener
{
  final GroupChatMap a;

  qu(GroupChatMap paramGroupChatMap)
  {
  }

  public void onClick(View paramView)
  {
    GroupChatMap.h(this.a);
    if (GroupChatMap.e(this.a) >= GroupChatMap.f(this.a).size())
      GroupChatMap.a(this.a, -1);
    GroupChatMap.g(this.a);
  }
}