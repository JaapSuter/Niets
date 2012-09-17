package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

class n extends BitmapDrawable
{
  private int a;
  private Paint b;
  final cb c;

  n(cb paramcb, Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }

  public void draw(Canvas paramCanvas)
  {
    if (this.b == null)
    {
      this.b = new Paint();
      this.b.setAntiAlias(true);
      this.b.setStyle(Paint.Style.FILL_AND_STROKE);
      this.b.setStrokeJoin(Paint.Join.ROUND);
      this.b.setStrokeCap(Paint.Cap.ROUND);
      this.b.setStrokeWidth(1.1F);
      this.b.setColor(-1712291840);
    }
    super.draw(paramCanvas);
    if (this.a == 16842919)
    {
      float f = j4.a(App.Mb.getApplicationContext()).L;
      paramCanvas.drawRoundRect(new RectF(getBounds()), f, f, this.b);
    }
  }

  public boolean isStateful()
  {
    return true;
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    boolean bool2 = DialogToastListActivity.f;
    int i = this.a;
    this.a = 16842921;
    int j = paramArrayOfInt.length;
    int k = 0;
    do
    {
      if (k >= j)
        break;
      int m = paramArrayOfInt[k];
      if (m == 16842919)
      {
        this.a = 16842919;
        if (!bool2)
          break;
      }
      if (m == 16842908)
        this.a = 16842908;
      k++;
    }
    while (!bool2);
    if (i != this.a)
    {
      invalidateSelf();
      bool1 = true;
    }
    return bool1;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.n
 * JD-Core Version:    0.6.1
 */