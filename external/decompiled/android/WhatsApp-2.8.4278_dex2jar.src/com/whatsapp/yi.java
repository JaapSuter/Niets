package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

class yi
  implements View.OnClickListener
{
  final BroadcastMessageComposer a;

  yi(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(View paramView)
  {
    if (this.a.r.getVisibility() != 0)
    {
      BroadcastMessageComposer.b(this.a);
      BroadcastMessageComposer.c(this.a).sendEmptyMessageDelayed(0, 150L);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.r.setVisibility(8);
      BroadcastMessageComposer.d(this.a);
      this.a.p = false;
    }
  }
}