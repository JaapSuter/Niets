package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.io.Closeable;

public class d5
{
  private static Bitmap a = null;

  public static Bitmap a()
  {
    if (a != null);
    for (Bitmap localBitmap = a; ; localBitmap = a)
    {
      return localBitmap;
      Drawable localDrawable = App.Mb.getResources().getDrawable(2130837516);
      a = Bitmap.createBitmap(localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(a);
      localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
      localDrawable.draw(localCanvas);
    }
  }

  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable == null);
    while (true)
    {
      return;
      try
      {
        paramCloseable.close();
      }
      catch (Throwable localThrowable)
      {
        g5.d(localThrowable.toString());
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d5
 * JD-Core Version:    0.6.1
 */