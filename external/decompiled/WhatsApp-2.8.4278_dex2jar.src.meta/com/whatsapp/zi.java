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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zi
 * JD-Core Version:    0.6.1
 */