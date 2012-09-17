package com.whatsapp.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class k
{
  private Bitmap a;
  private int b;

  public k(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
    this.b = 0;
  }

  public k(Bitmap paramBitmap, int paramInt)
  {
    this.a = paramBitmap;
    this.b = (paramInt % 360);
  }

  public int a()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public void a(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
  }

  public Bitmap b()
  {
    return this.a;
  }

  public Matrix c()
  {
    Matrix localMatrix = new Matrix();
    if (this.b != 0)
    {
      int i = this.a.getWidth() / 2;
      int j = this.a.getHeight() / 2;
      localMatrix.preTranslate(-i, -j);
      localMatrix.postRotate(this.b);
      localMatrix.postTranslate(f() / 2, e() / 2);
    }
    return localMatrix;
  }

  public boolean d()
  {
    if (this.b / 90 % 2 != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int e()
  {
    if (d());
    for (int i = this.a.getWidth(); ; i = this.a.getHeight())
      return i;
  }

  public int f()
  {
    if (d());
    for (int i = this.a.getHeight(); ; i = this.a.getWidth())
      return i;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.k
 * JD-Core Version:    0.6.1
 */