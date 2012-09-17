package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class ImageViewTouchBase extends ImageView
{
  static final float SCALE_RATE = 1.25F;
  public static boolean a;
  protected Matrix mBaseMatrix = new Matrix();
  protected final k mBitmapDisplayed = new k(null);
  public Matrix mDisplayMatrix = new Matrix();
  protected Handler mHandler = new Handler();
  protected int mLastXTouchPos;
  protected int mLastYTouchPos;
  private final float[] mMatrixValues = new float[9];
  protected float mMaxZoom;
  private Runnable mOnLayoutRunnable = null;
  private i mRecycler;
  protected Matrix mSuppMatrix = new Matrix();
  int mThisHeight = -1;
  int mThisWidth = -1;
  private float maxProperScale = 3.0F;

  public ImageViewTouchBase(Context paramContext)
  {
    super(paramContext);
    b();
  }

  public ImageViewTouchBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }

  private void a(Bitmap paramBitmap, int paramInt)
  {
    super.setImageBitmap(paramBitmap);
    Drawable localDrawable = getDrawable();
    if (localDrawable != null)
    {
      localDrawable.setDither(true);
      localDrawable.setFilterBitmap(true);
    }
    Bitmap localBitmap = this.mBitmapDisplayed.b();
    this.mBitmapDisplayed.a(paramBitmap);
    this.mBitmapDisplayed.a(paramInt);
    if ((localBitmap != null) && (localBitmap != paramBitmap) && (this.mRecycler != null))
      this.mRecycler.a(localBitmap);
  }

  private void a(k paramk, Matrix paramMatrix)
  {
    float f1 = getWidth();
    float f2 = getHeight();
    float f3 = paramk.f();
    float f4 = paramk.e();
    paramMatrix.reset();
    float f5 = Math.min(Math.min(f1 / f3, this.maxProperScale), Math.min(f2 / f4, this.maxProperScale));
    paramMatrix.postConcat(paramk.c());
    paramMatrix.postScale(f5, f5);
    paramMatrix.postTranslate((f1 - f3 * f5) / 2.0F, (f2 - f4 * f5) / 2.0F);
  }

  private void b()
  {
    setScaleType(ImageView.ScaleType.MATRIX);
  }

  protected float a(Matrix paramMatrix)
  {
    return a(paramMatrix, 0);
  }

  protected float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.mMatrixValues);
    return this.mMatrixValues[paramInt];
  }

  public void a()
  {
    a(null, true);
  }

  public void a(float paramFloat)
  {
    this.maxProperScale = paramFloat;
  }

  protected void a(float paramFloat1, float paramFloat2)
  {
    this.mSuppMatrix.postTranslate(paramFloat1, paramFloat2);
  }

  protected void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > this.mMaxZoom)
      paramFloat1 = this.mMaxZoom;
    float f = paramFloat1 / c();
    this.mSuppMatrix.postScale(f, f, paramFloat2, paramFloat3);
    setImageMatrix(d());
    a(true, true);
  }

  protected void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = (paramFloat1 - c()) / paramFloat4;
    float f2 = c();
    long l = System.currentTimeMillis();
    this.mHandler.post(new h(this, paramFloat4, l, f2, f1, paramFloat2, paramFloat3));
  }

  public void a(Bitmap paramBitmap, boolean paramBoolean)
  {
    a(new k(paramBitmap), paramBoolean);
  }

  public void a(i parami)
  {
    this.mRecycler = parami;
  }

  public void a(k paramk, boolean paramBoolean)
  {
    if (getWidth() <= 0)
      this.mOnLayoutRunnable = new g(this, paramk, paramBoolean);
    while (true)
    {
      return;
      if (paramk.b() != null)
      {
        a(paramk, this.mBaseMatrix);
        a(paramk.b(), paramk.a());
        if (!a);
      }
      else
      {
        this.mBaseMatrix.reset();
        super.setImageBitmap(null);
      }
      if (paramBoolean)
        this.mSuppMatrix.reset();
      setImageMatrix(d());
      this.mMaxZoom = e();
    }
  }

  protected void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = a;
    if (this.mBitmapDisplayed.b() == null)
      return;
    Matrix localMatrix = d();
    RectF localRectF = new RectF(0.0F, 0.0F, this.mBitmapDisplayed.b().getWidth(), this.mBitmapDisplayed.b().getHeight());
    localMatrix.mapRect(localRectF);
    float f1 = localRectF.height();
    float f2 = localRectF.width();
    float f5;
    label115: float f3;
    if (paramBoolean2)
    {
      int j = getHeight();
      if (f1 < j)
      {
        f5 = (j - f1) / 2.0F - localRectF.top;
        if (bool)
          if (localRectF.top > 0.0F)
          {
            f5 = -localRectF.top;
            if (!bool);
          }
          else if (localRectF.bottom < j)
          {
            f3 = getHeight() - localRectF.bottom;
          }
      }
    }
    while (true)
    {
      int i;
      if (paramBoolean1)
      {
        i = getWidth();
        if (f2 < i)
        {
          f4 = (i - f2) / 2.0F - localRectF.left;
          if (bool)
            label201: if (localRectF.left > 0.0F)
            {
              f4 = -localRectF.left;
              if (!bool);
            }
            else if (localRectF.right >= i);
        }
      }
      for (float f4 = i - localRectF.right; ; f4 = 0.0F)
      {
        a(f4, f3);
        setImageMatrix(d());
        break;
        f4 = 0.0F;
        break label201;
      }
      f3 = f5;
      continue;
      f5 = 0.0F;
      break label115;
      f3 = 0.0F;
    }
  }

  protected void b(float paramFloat)
  {
    a(paramFloat, getWidth() / 2.0F, getHeight() / 2.0F);
  }

  public void b(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 != 0.0F) || (paramFloat2 != 0.0F))
    {
      a(paramFloat1, paramFloat2);
      setImageMatrix(d());
    }
  }

  public float c()
  {
    return a(this.mSuppMatrix);
  }

  public Matrix d()
  {
    this.mDisplayMatrix.set(this.mBaseMatrix);
    this.mDisplayMatrix.postConcat(this.mSuppMatrix);
    return this.mDisplayMatrix;
  }

  protected float e()
  {
    float f = 1.0F;
    if (this.mBitmapDisplayed.b() == null);
    while (true)
    {
      return f;
      f = Math.max(f, 4.0F * Math.max(this.mBitmapDisplayed.f() / this.mThisWidth, this.mBitmapDisplayed.e() / this.mThisHeight));
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (c() > 1.0F))
      b(1.0F);
    for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mThisWidth = (paramInt3 - paramInt1);
    this.mThisHeight = (paramInt4 - paramInt2);
    Runnable localRunnable = this.mOnLayoutRunnable;
    if (localRunnable != null)
    {
      this.mOnLayoutRunnable = null;
      localRunnable.run();
    }
    if (this.mBitmapDisplayed.b() != null)
    {
      a(this.mBitmapDisplayed, this.mBaseMatrix);
      setImageMatrix(d());
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      super.setImageBitmap(paramBitmap);
      if (!a);
    }
    else
    {
      a(paramBitmap, true);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.ImageViewTouchBase
 * JD-Core Version:    0.6.1
 */