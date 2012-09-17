package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class pu
  implements View.OnClickListener
{
  final GroupChatMap a;

  pu(GroupChatMap paramGroupChatMap)
  {
  }

  public void onClick(View paramView)
  {
    GroupChatMap.d(this.a);
    if (GroupChatMap.e(this.a) < -1)
      GroupChatMap.a(this.a, -1 + GroupChatMap.f(this.a).size());
    GroupChatMap.g(this.a);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.pu
 * JD-Core Version:    0.6.1
 */