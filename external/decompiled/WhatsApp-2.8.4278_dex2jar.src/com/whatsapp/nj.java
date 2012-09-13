package com.whatsapp;

import android.graphics.Bitmap;

class nj
  implements Runnable
{
  final Bitmap a;
  final y b;

  nj(y paramy, Bitmap paramBitmap)
  {
  }

  public void run()
  {
    if (!this.b.isCancelled())
      ContactInfo.a(this.b.a, this.a);
  }
}