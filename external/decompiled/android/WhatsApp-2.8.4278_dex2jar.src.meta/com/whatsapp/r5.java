package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;

class r5
  implements Runnable
{
  private Bitmap a;
  private ImageView b;
  private String c;
  final q5 d;

  public r5(q5 paramq5, Bitmap paramBitmap, ImageView paramImageView, String paramString)
  {
    this.a = paramBitmap;
    this.b = paramImageView;
    this.c = paramString;
  }

  public void run()
  {
    int i = g5.n;
    if ((this.b.getTag() != null) && (this.b.getTag().equals(this.c)))
      if (this.a != null)
      {
        this.b.setImageBitmap(this.a);
        if (i == 0);
      }
      else if (q5.b(this.d) != 0)
      {
        this.b.setImageResource(q5.b(this.d));
        if (i == 0);
      }
      else
      {
        this.b.setVisibility(8);
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.r5
 * JD-Core Version:    0.6.1
 */