package com.whatsapp;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class ix
  implements View.OnTouchListener
{
  final MediaView a;

  ix(MediaView paramMediaView)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return false;
      this.a.O = 350;
      this.a.P = 0;
      this.a.N = System.currentTimeMillis();
      this.a.Q.sendEmptyMessageDelayed(((Integer)paramView.getTag()).intValue(), this.a.O);
      if (DialogToastListActivity.f)
      {
        this.a.Q.removeMessages(((Integer)paramView.getTag()).intValue());
        if (this.a.O == 350)
          MediaView.g(this.a, ((Integer)paramView.getTag()).intValue());
        this.a.N = 0L;
        this.a.O = 0;
        this.a.P = 0;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ix
 * JD-Core Version:    0.6.1
 */