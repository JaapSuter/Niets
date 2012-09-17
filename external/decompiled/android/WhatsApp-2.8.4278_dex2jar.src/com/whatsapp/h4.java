package com.whatsapp;

import android.graphics.Bitmap;
import com.whatsapp.wallpaper.i;

class h4
  implements i
{
  final TouchImageView a;

  h4(TouchImageView paramTouchImageView)
  {
  }

  public void a(Bitmap paramBitmap)
  {
    if (this.a.j)
      paramBitmap.recycle();
  }
}