package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.view.View.OnLongClickListener;

class zi
  implements View.OnLongClickListener
{
  final BroadcastMessageComposer a;

  zi(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public boolean onLongClick(View paramView)
  {
    this.a.p = true;
    BroadcastMessageComposer.b(this.a);
    BroadcastMessageComposer.c(this.a).sendEmptyMessageDelayed(0, 150L);
    return true;
  }
}