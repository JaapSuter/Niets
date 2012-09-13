package com.whatsapp;

import android.graphics.Bitmap;
import com.whatsapp.wallpaper.i;

class i4
  implements i
{
  final TouchImageView a;

  i4(TouchImageView paramTouchImageView)
  {
  }

  public void a(Bitmap paramBitmap)
  {
    if (this.a.j)
      paramBitmap.recycle();
  }
}