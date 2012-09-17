package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

public class VideoBitmapDrawable extends o
{
  private static Bitmap cameraOverlay;
  private TextPaint textPaint;
  private String videoSize;

  public VideoBitmapDrawable(Context paramContext, Bitmap paramBitmap, String paramString, float paramFloat)
  {
    super(paramContext, paramBitmap, paramFloat, j4.a(paramContext).N);
    this.videoSize = paramString;
    if (cameraOverlay == null)
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inScaled = false;
      cameraOverlay = BitmapFactory.decodeResource(App.Mb.getResources(), 2130837561, localOptions);
      cameraOverlay.setDensity(0);
    }
    this.textPaint = new TextPaint();
    this.textPaint.setAntiAlias(true);
    this.textPaint.setColor(-1);
    this.textPaint.setTextSize(j4.a(paramContext).C);
    this.textPaint.setTypeface(Typeface.DEFAULT_BOLD);
  }

  public void draw(Canvas paramCanvas)
  {
    int i = 0;
    float f1 = 0.0F;
    boolean bool = DialogToastListActivity.f;
    super.draw(paramCanvas);
    Rect localRect = getBounds();
    float f2 = a();
    Path localPath = new Path();
    localPath.moveTo(localRect.left, -17 + localRect.bottom);
    localPath.lineTo(localRect.right, -17 + localRect.bottom);
    localPath.lineTo(localRect.right, localRect.bottom - f2);
    localPath.arcTo(new RectF(localRect.right - 2.0F * f2, localRect.bottom - 2.0F * f2, localRect.right, localRect.bottom), 0.0F, 90.0F);
    localPath.lineTo(f2 + localRect.left, localRect.bottom);
    localPath.arcTo(new RectF(localRect.left, localRect.bottom - 2.0F * f2, localRect.left + f2 * 2.0F, localRect.bottom), 90.0F, 90.0F);
    localPath.lineTo(localRect.left, -17 + localRect.bottom);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setColor(-1728053248);
    paramCanvas.drawPath(localPath, localPaint);
    localPaint.setColor(-16777216);
    paramCanvas.drawBitmap(cameraOverlay, getBounds().left, 1 + (getBounds().bottom - cameraOverlay.getHeight()), localPaint);
    if (this.videoSize != null)
    {
      float[] arrayOfFloat = new float[this.videoSize.length()];
      this.textPaint.getTextWidths(this.videoSize, 0, this.videoSize.length(), arrayOfFloat);
      do
      {
        if (i >= arrayOfFloat.length)
          break;
        f1 += arrayOfFloat[i];
        i++;
      }
      while (!bool);
      int j = (int)Math.ceil(this.textPaint.descent());
      paramCanvas.drawText(this.videoSize, getIntrinsicWidth() - f1 - 2.0F, getIntrinsicHeight() - j, this.textPaint);
    }
  }
}