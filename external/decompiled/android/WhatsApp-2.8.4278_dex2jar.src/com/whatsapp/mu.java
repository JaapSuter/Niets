package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.maps.MyLocationOverlay;

class mu
  implements View.OnClickListener
{
  final GroupChatMap a;

  mu(GroupChatMap paramGroupChatMap)
  {
  }

  public void onClick(View paramView)
  {
    GroupChatMap.a(this.a, -1);
    GroupChatMap.a(this.a).runOnFirstFix(new nu(this));
  }
}