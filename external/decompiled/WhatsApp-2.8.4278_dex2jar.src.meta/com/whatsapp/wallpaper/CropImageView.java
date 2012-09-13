package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends ImageViewTouchBase
{
  boolean cropByOutputSize;
  boolean isRecycle = false;
  ArrayList<f> mHighlightViews = new ArrayList();
  float mLastX;
  float mLastY;
  int mMotionEdge;
  f mMotionHighlightView = null;

  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a(MotionEvent paramMotionEvent)
  {
    boolean bool = ImageViewTouchBase.a;
    clearFocus();
    int j;
    for (int i = 0; ; i = j)
    {
      if (i < this.mHighlightViews.size())
      {
        f localf = (f)this.mHighlightViews.get(i);
        if (localf.a(paramMotionEvent.getX(), paramMotionEvent.getY()) != 1)
        {
          if (!localf.b())
          {
            localf.a(true);
            localf.e();
            if (!bool);
          }
        }
        else
        {
          j = i + 1;
          if (!bool)
            continue;
        }
      }
      invalidate();
      return;
    }
  }

  private void a(f paramf)
  {
    Rect localRect = paramf.d;
    int i = Math.max(0, getLeft() - localRect.left);
    int j = Math.min(0, getRight() - localRect.right);
    int k = Math.max(0, getTop() - localRect.top);
    int m = Math.min(0, getBottom() - localRect.bottom);
    if (i != 0)
      if (k == 0)
        break label98;
    while (true)
    {
      if ((i != 0) || (k != 0))
        b(i, k);
      return;
      i = j;
      break;
      label98: k = m;
    }
  }

  private void b(f paramf)
  {
    Rect localRect = paramf.d;
    float f1 = localRect.width();
    float f2 = localRect.height();
    float f3 = getWidth();
    float f4 = getHeight();
    float f5 = Math.max(1.0F, Math.min(0.6F * (f3 / f1), 0.6F * (f4 / f2)) * c());
    if (Math.abs(f5 - c()) / f5 > 0.1D)
    {
      float[] arrayOfFloat = new float[2];
      arrayOfFloat[0] = paramf.f.centerX();
      arrayOfFloat[1] = paramf.f.centerY();
      getImageMatrix().mapPoints(arrayOfFloat);
      a(f5, arrayOfFloat[0], arrayOfFloat[1], 300.0F);
    }
    a(paramf);
  }

  protected void a(float paramFloat1, float paramFloat2)
  {
    boolean bool = ImageViewTouchBase.a;
    super.a(paramFloat1, paramFloat2);
    int j;
    for (int i = 0; ; i = j)
      if (i < this.mHighlightViews.size())
      {
        f localf = (f)this.mHighlightViews.get(i);
        localf.g.postTranslate(paramFloat1, paramFloat2);
        localf.e();
        j = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }

  protected void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = ImageViewTouchBase.a;
    super.a(paramFloat1, paramFloat2, paramFloat3);
    Iterator localIterator = this.mHighlightViews.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      f localf = (f)localIterator.next();
      localf.g.set(getImageMatrix());
      localf.e();
    }
    while (!bool);
  }

  public void c(f paramf)
  {
    this.mHighlightViews.add(paramf);
    invalidate();
  }

  public void clearFocus()
  {
    boolean bool = ImageViewTouchBase.a;
    int j;
    for (int i = 0; ; i = j)
      if (i < this.mHighlightViews.size())
      {
        f localf = (f)this.mHighlightViews.get(i);
        localf.a(false);
        localf.e();
        j = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    boolean bool = ImageViewTouchBase.a;
    if (!this.isRecycle)
      super.onDraw(paramCanvas);
    int j;
    for (int i = 0; ; i = j)
      if (i < this.mHighlightViews.size())
      {
        ((f)this.mHighlightViews.get(i)).a(paramCanvas);
        j = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = ImageViewTouchBase.a;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.mBitmapDisplayed.b() != null)
    {
      Iterator localIterator = this.mHighlightViews.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        f localf = (f)localIterator.next();
        localf.g.set(getImageMatrix());
        localf.e();
        if (localf.b)
          b(localf);
      }
      while (!bool);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = ImageViewTouchBase.a;
    CropImage localCropImage = (CropImage)getContext();
    if (localCropImage.n);
    while (true)
    {
      return bool1;
      switch (paramMotionEvent.getAction())
      {
      default:
        label56: switch (paramMotionEvent.getAction())
        {
        default:
          label88: bool1 = true;
        case 1:
        case 3:
        case 2:
        }
        break;
      case 0:
      case 1:
      case 2:
      }
    }
    label189: int n;
    for (int k = 0; ; k = n)
    {
      c localc;
      if (k < this.mHighlightViews.size())
      {
        f localf2 = (f)this.mHighlightViews.get(k);
        int m = localf2.a(paramMotionEvent.getX(), paramMotionEvent.getY());
        if (m != 1)
        {
          this.mMotionEdge = m;
          this.mMotionHighlightView = localf2;
          this.mLastX = paramMotionEvent.getX();
          this.mLastY = paramMotionEvent.getY();
          f localf3 = this.mMotionHighlightView;
          if (m != 32)
            break label289;
          localc = c.b;
          localf3.a(localc);
          a(paramMotionEvent);
          if (!bool2);
        }
        else
        {
          n = k + 1;
          if (!bool2)
            continue;
        }
      }
      if (!bool2)
        break label56;
      label289: int j;
      for (int i = 0; ; i = j)
      {
        if (i < this.mHighlightViews.size())
        {
          f localf1 = (f)this.mHighlightViews.get(i);
          localCropImage.r = localf1;
          if (localf1.b())
          {
            localf1.a(false);
            localf1.e();
            invalidate();
            b(localf1);
            bool1 = true;
            break;
            localc = c.c;
            break label189;
          }
          j = i + 1;
          if (!bool2)
            continue;
        }
        if (this.mMotionHighlightView != null)
        {
          b(this.mMotionHighlightView);
          this.mMotionHighlightView.a(c.a);
        }
        this.mMotionHighlightView = null;
        if ((!bool2) || (this.mMotionHighlightView == null))
          break label56;
        this.mMotionHighlightView.a(this.mMotionEdge, paramMotionEvent.getX() - this.mLastX, paramMotionEvent.getY() - this.mLastY);
        this.mLastX = paramMotionEvent.getX();
        this.mLastY = paramMotionEvent.getY();
        a(this.mMotionHighlightView);
        break label56;
        a(true, true);
        if ((!bool2) || (c() != 1.0F))
          break label88;
        a(true, true);
        break label88;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.CropImageView
 * JD-Core Version:    0.6.1
 */