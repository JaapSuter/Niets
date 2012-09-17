package com.whatsapp;

import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

public class q extends Drawable
{
  private int a = 18;
  private int b = 16842921;
  private float c = 3.0F;
  private Paint d = new Paint(1);

  private Path a(float paramFloat1, float paramFloat2)
  {
    Path localPath = new Path();
    int i = (int)(2.0F * j4.a(App.Mb).d);
    localPath.moveTo(paramFloat1 / 2.0F - 2 * this.a / 3, paramFloat2 - this.a);
    localPath.lineTo(paramFloat1 / 2.0F, paramFloat2);
    localPath.lineTo(paramFloat1 / 2.0F + 2 * this.a / 3, paramFloat2 - this.a);
    localPath.lineTo(paramFloat1 - i, paramFloat2 - this.a);
    localPath.arcTo(new RectF(paramFloat1 - i * 2, paramFloat2 - this.a - i * 2, paramFloat1, paramFloat2 - this.a), 90.0F, -90.0F);
    localPath.lineTo(paramFloat1, i);
    localPath.arcTo(new RectF(paramFloat1 - i * 2, 0.0F, paramFloat1, i * 2), 0.0F, -90.0F);
    localPath.lineTo(i, 0.0F);
    localPath.arcTo(new RectF(0.0F, 0.0F, i * 2, i * 2), -90.0F, -90.0F);
    localPath.lineTo(0.0F, paramFloat2 - this.a - i);
    localPath.arcTo(new RectF(0.0F, paramFloat2 - this.a - i * 2, i * 2, paramFloat2 - this.a), -180.0F, -90.0F);
    localPath.close();
    localPath.setFillType(Path.FillType.WINDING);
    return localPath;
  }

  public void a(int paramInt)
  {
    this.a = paramInt;
  }

  public void draw(Canvas paramCanvas)
  {
    this.d.setARGB(255, 0, 0, 0);
    Rect localRect = getBounds();
    int i = localRect.width();
    int j = localRect.height();
    Path localPath = a(i - 2.0F * this.c, j - this.c);
    BlurMaskFilter localBlurMaskFilter = new BlurMaskFilter(this.c, BlurMaskFilter.Blur.NORMAL);
    this.d.setColor(-1724697805);
    this.d.setStyle(Paint.Style.FILL);
    this.d.setMaskFilter(localBlurMaskFilter);
    paramCanvas.translate(this.c, 1.5F * this.c);
    paramCanvas.drawPath(localPath, this.d);
    paramCanvas.translate(-this.c, 1.5F * -this.c);
    paramCanvas.translate(this.c, this.c);
    if (this.b == 16842919)
    {
      LinearGradient localLinearGradient = new LinearGradient(0.0F, 0.0F, 0.0F, j, -11429, -11429, Shader.TileMode.MIRROR);
      this.d.setShader(localLinearGradient);
      this.d.setColor(-16777216);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.d.setColor(-1728053248);
    }
    this.d.setMaskFilter(null);
    paramCanvas.drawPath(localPath, this.d);
    this.d.setShader(null);
    this.d.setStrokeWidth(1.0F);
    this.d.setStyle(Paint.Style.STROKE);
    this.d.setColor(1711276032);
    paramCanvas.translate(-this.c, -this.c);
  }

  public int getOpacity()
  {
    return 0;
  }

  public boolean getPadding(Rect paramRect)
  {
    paramRect.top = (int)this.c;
    paramRect.bottom = this.a;
    paramRect.left = (int)this.c;
    paramRect.right = (int)this.c;
    return true;
  }

  public boolean isStateful()
  {
    return true;
  }

  public void setAlpha(int paramInt)
  {
  }

  public void setColorFilter(ColorFilter paramColorFilter)
  {
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
 * Qualified Name:     com.whatsapp.q
 * JD-Core Version:    0.6.1
 */