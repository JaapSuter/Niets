package com.whatsapp;

import android.os.Handler;
import android.os.Message;

class md extends Handler
{
  final MediaView a;

  md(MediaView paramMediaView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (this.a.O > 200)
    {
      MediaView localMediaView1 = this.a;
      localMediaView1.O -= 10 * MediaView.h(this.a, this.a.P);
      MediaView localMediaView2 = this.a;
      localMediaView2.P = (1 + localMediaView2.P);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.a.O = 200;
    }
    MediaView.g(this.a, paramMessage.what);
    this.a.Q.sendEmptyMessageDelayed(paramMessage.what, this.a.O);
  }
}