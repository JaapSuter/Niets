package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;

class qj
  implements Runnable
{
  private Bitmap a;
  private ImageView b;
  private String c;
  final pj d;

  public qj(pj parampj, Bitmap paramBitmap, ImageView paramImageView, String paramString)
  {
    this.a = paramBitmap;
    this.b = paramImageView;
    this.c = paramString;
  }

  public void run()
  {
    if ((this.b.getTag() != null) && (this.b.getTag().equals(this.c)) && (this.a != null))
      this.b.setImageBitmap(this.a);
  }
}