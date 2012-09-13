package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;

public class p extends BitmapDrawable
{
  private float a;
  private int b;
  private Paint c;
  private CharSequence d;

  public p(Resources paramResources, Bitmap paramBitmap, float paramFloat, CharSequence paramCharSequence)
  {
    super(paramResources, paramBitmap);
    this.a = paramFloat;
    this.d = paramCharSequence;
    this.c = new Paint();
    this.c.setAntiAlias(true);
    this.c.setDither(true);
    this.c.setFilterBitmap(true);
    this.c.setColor(-1);
  }

  public void draw(Canvas paramCanvas)
  {
    boolean bool = DialogToastListActivity.f;
    super.draw(paramCanvas);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    RectF localRectF = new RectF(getBounds());
    if (this.d != null)
    {
      int i = (int)(13.333333F * j4.a(App.Mb.getApplicationContext()).d);
      int j = (int)(2.0F * i);
      Path localPath = new Path();
      localPath.moveTo(localRectF.left, localRectF.bottom - j);
      localPath.lineTo(localRectF.right, localRectF.bottom - j);
      localPath.lineTo(localRectF.right, localRectF.bottom - this.a);
      localPath.arcTo(new RectF(localRectF.right - 2.0F * this.a, localRectF.bottom - 2.0F * this.a, localRectF.right, localRectF.bottom), 0.0F, 90.0F);
      localPath.lineTo(localRectF.left + this.a, localRectF.bottom);
      localPath.arcTo(new RectF(localRectF.left, localRectF.bottom - 2.0F * this.a, localRectF.left + 2.0F * this.a, localRectF.bottom), 90.0F, 90.0F);
      localPath.lineTo(localRectF.left, localRectF.bottom - j);
      localPaint.setStyle(Paint.Style.FILL);
      if (this.b == 16842919)
      {
        localPaint.setColor(-1712291840);
        if (!bool);
      }
      else
      {
        localPaint.setColor(1073741824);
      }
      paramCanvas.drawPath(localPath, localPaint);
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.setAntiAlias(true);
      localTextPaint.setColor(-1);
      localTextPaint.setTextSize(i);
      localTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
      localTextPaint.setTextAlign(Paint.Align.CENTER);
      paramCanvas.drawText(TextUtils.ellipsize(this.d, localTextPaint, localRectF.width() - this.a, TextUtils.TruncateAt.END).toString(), localRectF.left + localRectF.width() / 2.0F, localRectF.bottom - (j - i) / 2, localTextPaint);
    }
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeJoin(Paint.Join.ROUND);
    localPaint.setStrokeCap(Paint.Cap.ROUND);
    localRectF.top = (1.0F + localRectF.top);
    localRectF.bottom = (1.0F + localRectF.bottom);
    localPaint.setStrokeWidth(1.5F);
    localPaint.setColor(-1711276033);
    paramCanvas.drawRoundRect(localRectF, this.a, this.a, localPaint);
    localRectF.top -= 1.0F;
    localRectF.bottom -= 1.0F;
    if (this.b == 16842919)
    {
      localPaint.setColor(-1015808);
      if (!bool);
    }
    else
    {
      localPaint.setColor(1711276032);
    }
    paramCanvas.drawRoundRect(localRectF, this.a, this.a, localPaint);
    localPaint.setStrokeWidth(1.0F);
    localPaint.setAntiAlias(false);
    if (this.b == 16842919)
    {
      localPaint.setColor(871399424);
      if (!bool);
    }
    else
    {
      localPaint.setColor(855638016);
    }
    paramCanvas.drawRoundRect(localRectF, this.a, this.a, localPaint);
  }

  public boolean isStateful()
  {
    return true;
  }

  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool1 = false;
    boolean bool2 = DialogToastListActivity.f;
    int i = this.b;
    this.b = 16842921;
    int j = paramArrayOfInt.length;
    int k = 0;
    do
    {
      if (k >= j)
        break;
      int m = paramArrayOfInt[k];
      if (m == 16842919)
      {
        this.b = 16842919;
        if (!bool2)
          break;
      }
      if (m == 16842908)
        this.b = 16842908;
      k++;
    }
    while (!bool2);
    if (i != this.b)
    {
      invalidateSelf();
      bool1 = true;
    }
    return bool1;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.p
 * JD-Core Version:    0.6.1
 */