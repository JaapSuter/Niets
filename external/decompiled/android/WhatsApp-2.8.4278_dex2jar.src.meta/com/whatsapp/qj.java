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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qj
 * JD-Core Version:    0.6.1
 */