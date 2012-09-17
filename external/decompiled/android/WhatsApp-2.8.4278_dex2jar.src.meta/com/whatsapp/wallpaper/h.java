package com.whatsapp.wallpaper;

import android.os.Handler;

class h
  implements Runnable
{
  final float a;
  final long b;
  final float c;
  final float d;
  final float e;
  final float f;
  final ImageViewTouchBase g;

  h(ImageViewTouchBase paramImageViewTouchBase, float paramFloat1, long paramLong, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
  {
  }

  public void run()
  {
    long l = System.currentTimeMillis();
    float f1 = Math.min(this.a, (float)(l - this.b));
    float f2 = this.c + f1 * this.d;
    this.g.a(f2, this.e, this.f);
    if (f1 < this.a)
      this.g.mHandler.post(this);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.h
 * JD-Core Version:    0.6.1
 */