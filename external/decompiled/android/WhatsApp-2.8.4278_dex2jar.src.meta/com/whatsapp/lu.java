package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;

class lu
  implements View.OnLongClickListener
{
  final GroupChatMap a;

  lu(GroupChatMap paramGroupChatMap)
  {
  }

  public boolean onLongClick(View paramView)
  {
    GroupChatMap.a(this.a, null);
    Object localObject = paramView.getTag();
    if (localObject != null)
    {
      sz localsz = GroupChatMap.a(this.a, localObject.toString());
      if (localsz != null)
      {
        GroupChatMap.a(this.a, App.w.a(localsz.c, null));
        this.a.removeDialog(0);
        this.a.showDialog(0);
      }
    }
    return true;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.lu
 * JD-Core Version:    0.6.1
 */