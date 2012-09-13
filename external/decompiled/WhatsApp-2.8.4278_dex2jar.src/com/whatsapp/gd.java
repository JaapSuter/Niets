package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import com.google.android.maps.MapView;

class gd extends Handler
{
  final MapView a;
  final hf b;

  gd(hf paramhf, MapView paramMapView)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    if (hf.a(this.b) == hf.b(this.b))
    {
      hf.a(this.b, hf.c(this.b));
      if (!DialogToastListActivity.f);
    }
    else
    {
      hf.a(this.b, hf.b(this.b));
    }
    this.a.invalidate(hf.a(this.b).getBounds());
    sendEmptyMessageDelayed(0, 500L);
  }
}