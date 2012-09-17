package com.whatsapp;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class be extends GestureDetector.SimpleOnGestureListener
{
  final GalleryView a;

  be(GalleryView paramGalleryView)
  {
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool;
    try
    {
      if (Math.abs(paramMotionEvent1.getY() - paramMotionEvent2.getY()) > 250.0F)
      {
        bool = false;
      }
      else if ((paramMotionEvent1.getX() - paramMotionEvent2.getX() > 120.0F) && (Math.abs(paramFloat1) > 200.0F))
      {
        if ((GalleryView.a(this.a) != 1) && (!((TouchImageView)this.a.getChildAt(GalleryView.b(this.a))).d) && (GalleryView.b(this.a) < -1 + this.a.getChildCount()))
        {
          this.a.c(1 + GalleryView.b(this.a));
          bool = true;
          break label222;
        }
      }
      else if ((paramMotionEvent2.getX() - paramMotionEvent1.getX() > 120.0F) && (Math.abs(paramFloat1) > 200.0F) && (GalleryView.a(this.a) != 1) && (!((TouchImageView)this.a.getChildAt(GalleryView.b(this.a))).d) && (GalleryView.b(this.a) > 0))
      {
        this.a.c(-1 + GalleryView.b(this.a));
        bool = true;
      }
    }
    catch (Exception localException)
    {
      bool = false;
    }
    label222: return bool;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.be
 * JD-Core Version:    0.6.1
 */