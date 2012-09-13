package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class o extends BitmapDrawable
{
  private float a;
  private float b;
  private Drawable c;
  private Drawable d;
  private Drawable e;
  private int f;
  private Paint g;
  private Rect h;

  public o(Context paramContext, Bitmap paramBitmap)
  {
    this(paramContext, paramBitmap, j4.a(paramContext).M, j4.a(paramContext).N);
  }

  public o(Context paramContext, Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    super(paramContext.getResources(), paramBitmap);
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.h = new Rect(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
    this.g = new Paint();
    this.g.setAntiAlias(true);
    this.g.setDither(true);
    this.g.setFilterBitmap(true);
    this.g.setColor(-1);
    Resources localResources = paramContext.getResources();
    this.c = localResources.getDrawable(2130838491);
    this.e = localResources.getDrawable(2130838492);
    this.d = localResources.getDrawable(2130838493);
  }

  public float a()
  {
    return this.a;
  }

  public void a(float paramFloat)
  {
    this.b = paramFloat;
  }

  public void draw(Canvas paramCanvas)
  {
    if (getBitmap().isRecycled());
    while (true)
    {
      return;
      if (this.a != 0.0F)
        break;
      super.draw(paramCanvas);
    }
    RectF localRectF = new RectF(getBounds());
    int i = paramCanvas.saveLayer(localRectF, null, 31);
    paramCanvas.drawARGB(0, 0, 0, 0);
    paramCanvas.drawRoundRect(localRectF, this.a, this.a, this.g);
    this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    paramCanvas.drawBitmap(getBitmap(), this.h, localRectF, this.g);
    this.g.setXfermode(null);
    paramCanvas.restoreToCount(i);
    Rect localRect1 = new Rect(getBounds());
    Rect localRect2 = new Rect();
    this.c.getPadding(localRect2);
    localRect1.top -= localRect2.top;
    localRect1.bottom += localRect2.bottom;
    localRect1.left -= localRect2.left;
    localRect1.right += localRect2.right;
    Drawable localDrawable;
    if (this.f == 16842919)
      localDrawable = this.e;
    while (true)
    {
      localDrawable.setBounds(localRect1);
      localDrawable.setDither(false);
      localDrawable.draw(paramCanvas);
      break;
      if (this.f == 16842908)
        localDrawable = this.d;
      else
        localDrawable = this.c;
    }
  }

  public int getIntrinsicHeight()
  {
    return (int)(super.getIntrinsicHeight() * this.b);
  }

  public int getIntrinsicWidth()
  {
    return (int)(super.getIntrinsicWidth() * this.b);
  }

  public boolean isStateful()
  {
    return true;
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    boolean bool2 = DialogToastListActivity.f;
    int i = this.f;
    this.f = 16842921;
    int j = paramArrayOfInt.length;
    int k = 0;
    do
    {
      if (k >= j)
        break;
      int m = paramArrayOfInt[k];
      if (m == 16842919)
      {
        this.f = 16842919;
        if (!bool2)
          break;
      }
      if (m == 16842908)
        this.f = 16842908;
      k++;
    }
    while (!bool2);
    if (i != this.f)
    {
      invalidateSelf();
      bool1 = true;
    }
    return bool1;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.o
 * JD-Core Version:    0.6.1
 */