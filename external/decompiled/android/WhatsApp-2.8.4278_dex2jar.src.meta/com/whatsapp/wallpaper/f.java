package com.whatsapp.wallpaper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.App;

class f
{
  View a;
  boolean b;
  private c c = c.a;
  Rect d;
  private RectF e;
  RectF f;
  Matrix g;
  private boolean h = false;
  private float i;
  private boolean j = false;
  private int k;
  private Drawable l;
  private Drawable m;
  private final Paint n = new Paint();
  private final Paint o = new Paint();
  private final Paint p = new Paint();

  public f(View paramView)
  {
    this.a = paramView;
  }

  private void a()
  {
    Resources localResources = this.a.getResources();
    this.l = localResources.getDrawable(2130837560);
    this.m = localResources.getDrawable(2130837559);
  }

  private Rect d()
  {
    RectF localRectF = new RectF(this.f.left, this.f.top, this.f.right, this.f.bottom);
    this.g.mapRect(localRectF);
    return new Rect(Math.round(localRectF.left), Math.round(localRectF.top), Math.round(localRectF.right), Math.round(localRectF.bottom));
  }

  public int a(float paramFloat1, float paramFloat2)
  {
    int i1 = 0;
    boolean bool = ImageViewTouchBase.a;
    Rect localRect = d();
    int i2;
    if (this.j)
    {
      float f1 = paramFloat1 - localRect.centerX();
      float f2 = paramFloat2 - localRect.centerY();
      int i4 = (int)Math.sqrt(f1 * f1 + f2 * f2);
      int i5 = this.d.width() / 2;
      if (Math.abs(i4 - i5) <= 20.0F)
      {
        if (Math.abs(f2) > Math.abs(f1))
        {
          if (f2 < 0.0F)
          {
            i2 = 8;
            if (!bool);
          }
          else
          {
            i2 = 16;
            if (!bool);
          }
        }
        else if (f1 < 0.0F)
        {
          i2 = 2;
          if (!bool);
        }
        else
        {
          i2 = 4;
          if (!bool);
        }
      }
      else
      {
        if ((i4 < i5) && (!bool))
          break label370;
        i2 = 1;
      }
      if (!bool);
    }
    while (true)
    {
      if ((paramFloat2 >= localRect.top - 20.0F) && (paramFloat2 < 20.0F + localRect.bottom));
      for (int i3 = 1; ; i3 = 0)
      {
        if ((paramFloat1 >= localRect.left - 20.0F) && (paramFloat1 < 20.0F + localRect.right))
          i1 = 1;
        if ((Math.abs(localRect.left - paramFloat1) < 20.0F) && (i3 != 0))
          i2 |= 2;
        if ((Math.abs(localRect.right - paramFloat1) < 20.0F) && (i3 != 0))
          i2 |= 4;
        if ((Math.abs(localRect.top - paramFloat2) < 20.0F) && (i1 != 0))
          i2 |= 8;
        if ((Math.abs(localRect.bottom - paramFloat2) < 20.0F) && (i1 != 0))
          i2 |= 16;
        if ((i2 == 1) && (localRect.contains((int)paramFloat1, (int)paramFloat2)))
          i2 = 32;
        return i2;
      }
      label370: i2 = 32;
      break;
      i2 = 1;
    }
  }

  void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    Rect localRect = d();
    if (paramInt == 1);
    do
    {
      return;
      if (paramInt != 32)
        break;
      RectF localRectF = new RectF(localRect);
      localRectF.offset(paramFloat1, paramFloat2);
      Matrix localMatrix = new Matrix();
      if (this.g.invert(localMatrix))
        localMatrix.mapRect(localRectF);
      b(localRectF.left - this.f.left, localRectF.top - this.f.top);
    }
    while (!ImageViewTouchBase.a);
    if ((paramInt & 0x6) == 0)
      paramFloat1 = 0.0F;
    if ((paramInt & 0x18) == 0)
      paramFloat2 = 0.0F;
    float f1 = paramFloat1 * (this.f.width() / localRect.width());
    float f2 = paramFloat2 * (this.f.height() / localRect.height());
    int i1;
    label165: float f3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = -1;
      f3 = f1 * i1;
      if ((paramInt & 0x8) == 0)
        break label205;
    }
    label205: for (int i2 = -1; ; i2 = 1)
    {
      c(f3, f2 * i2);
      break;
      i1 = 1;
      break label165;
    }
  }

  protected void a(Canvas paramCanvas)
  {
    boolean bool = ImageViewTouchBase.a;
    paramCanvas.save();
    Path localPath = new Path();
    Rect localRect2;
    Paint localPaint2;
    if (!b())
    {
      this.p.setColor(-16711936);
      localRect2 = new Rect();
      this.a.getDrawingRect(localRect2);
      if (!b())
        break label552;
      localPaint2 = this.n;
    }
    while (true)
    {
      paramCanvas.drawRect(localRect2, localPaint2);
      paramCanvas.drawRect(this.d, this.p);
      Rect localRect1;
      if (bool)
      {
        localRect1 = new Rect();
        this.a.getDrawingRect(localRect1);
        if (this.j)
        {
          float f1 = this.d.width();
          float f2 = this.d.height();
          localPath.addCircle(this.d.left + f1 / 2.0F, this.d.top + f2 / 2.0F, f1 / 2.0F, Path.Direction.CW);
          this.p.setColor(-1112874);
          if (!bool);
        }
        else
        {
          localPath.addRect(new RectF(this.d), Path.Direction.CW);
          this.p.setColor(-30208);
        }
      }
      try
      {
        paramCanvas.clipPath(localPath, Region.Op.DIFFERENCE);
        if (b());
        for (Paint localPaint1 = this.n; ; localPaint1 = this.o)
        {
          paramCanvas.drawRect(localRect1, localPaint1);
          label245: paramCanvas.restore();
          paramCanvas.drawPath(localPath, this.p);
          if (this.c == c.c)
          {
            int i1 = 1 + this.d.left;
            int i2 = 1 + this.d.right;
            int i3 = 4 + this.d.top;
            int i4 = 3 + this.d.bottom;
            int i5 = this.l.getIntrinsicWidth() / 2;
            int i6 = this.l.getIntrinsicHeight() / 2;
            int i7 = this.m.getIntrinsicHeight() / 2;
            int i8 = this.m.getIntrinsicWidth() / 2;
            int i9 = this.d.left + (this.d.right - this.d.left) / 2;
            int i10 = this.d.top + (this.d.bottom - this.d.top) / 2;
            this.l.setBounds(i1 - i5, i10 - i6, i1 + i5, i10 + i6);
            this.l.draw(paramCanvas);
            this.l.setBounds(i2 - i5, i10 - i6, i2 + i5, i10 + i6);
            this.l.draw(paramCanvas);
            this.m.setBounds(i9 - i8, i3 - i7, i9 + i8, i3 + i7);
            this.m.draw(paramCanvas);
            this.m.setBounds(i9 - i8, i4 - i7, i9 + i8, i4 + i7);
            this.m.draw(paramCanvas);
          }
          return;
          label552: localPaint2 = this.o;
          break;
        }
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        break label245;
      }
    }
  }

  public void a(Matrix paramMatrix, Rect paramRect, RectF paramRectF, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = ImageViewTouchBase.a;
    if (paramBoolean1)
      paramBoolean2 = true;
    this.g = new Matrix(paramMatrix);
    this.f = paramRectF;
    this.e = new RectF(paramRect);
    boolean bool3;
    if ((paramBoolean2) || (paramBoolean3))
    {
      bool3 = true;
      this.h = bool3;
      this.j = paramBoolean1;
      this.k = paramInt;
      this.i = (this.f.width() / this.f.height());
      this.d = d();
      this.n.setARGB(125, 50, 50, 50);
      this.o.setARGB(0, 0, 0, 0);
      this.p.setStrokeWidth(3.0F);
      this.p.setStyle(Paint.Style.STROKE);
      this.p.setAntiAlias(true);
      this.c = c.a;
      a();
      if (App.wc != 0)
        if (!bool2)
          break label191;
    }
    while (true)
    {
      ImageViewTouchBase.a = bool1;
      return;
      bool3 = false;
      break;
      label191: bool1 = true;
    }
  }

  public void a(c paramc)
  {
    if (paramc != this.c)
    {
      this.c = paramc;
      this.a.invalidate();
    }
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  void b(float paramFloat1, float paramFloat2)
  {
    Rect localRect = new Rect(this.d);
    this.f.offset(paramFloat1, paramFloat2);
    this.f.offset(Math.max(0.0F, this.e.left - this.f.left), Math.max(0.0F, this.e.top - this.f.top));
    this.f.offset(Math.min(0.0F, this.e.right - this.f.right), Math.min(0.0F, this.e.bottom - this.f.bottom));
    this.d = d();
    localRect.union(this.d);
    localRect.inset(-10, -10);
    this.a.invalidate(localRect);
  }

  public boolean b()
  {
    return this.b;
  }

  public Rect c()
  {
    return new Rect((int)this.f.left, (int)this.f.top, (int)this.f.right, (int)this.f.bottom);
  }

  void c(float paramFloat1, float paramFloat2)
  {
    boolean bool = ImageViewTouchBase.a;
    if (this.h)
      if (paramFloat1 != 0.0F)
      {
        paramFloat2 = paramFloat1 / this.i;
        if (bool)
          App.wc = 1 + App.wc;
      }
      else if (paramFloat2 != 0.0F)
      {
        paramFloat1 = paramFloat2 * this.i;
      }
    RectF localRectF = new RectF(this.f);
    float f1;
    if ((paramFloat1 > 0.0F) && (localRectF.width() + 2.0F * paramFloat1 > this.e.width()))
    {
      paramFloat1 = (this.e.width() - localRectF.width()) / 2.0F;
      if (this.h)
        f1 = paramFloat1 / this.i;
    }
    for (float f2 = paramFloat1; ; f2 = paramFloat1)
    {
      if ((f1 > 0.0F) && (localRectF.height() + 2.0F * f1 > this.e.height()))
      {
        f1 = (this.e.height() - localRectF.height()) / 2.0F;
        if (this.h)
          f2 = f1 * this.i;
      }
      if (this.k > 0)
      {
        if (localRectF.width() + 2.0F * f2 < this.k)
          f2 = (this.k - localRectF.width()) / 2.0F;
        if (this.h)
          f1 = f2 / this.i;
        if (localRectF.height() + 2.0F * f1 < this.k)
          f1 = (this.k - localRectF.height()) / 2.0F;
        if (this.h)
          f2 = f1 * this.i;
      }
      localRectF.inset(-f2, -f1);
      if (localRectF.width() < 25.0F)
        localRectF.inset(-(25.0F - localRectF.width()) / 2.0F, 0.0F);
      if (this.h);
      for (float f3 = 25.0F / this.i; ; f3 = 25.0F)
      {
        if (localRectF.height() < f3)
          localRectF.inset(0.0F, -(f3 - localRectF.height()) / 2.0F);
        if (localRectF.left < this.e.left)
        {
          localRectF.offset(this.e.left - localRectF.left, 0.0F);
          if (!bool);
        }
        else if (localRectF.right > this.e.right)
        {
          localRectF.offset(-(localRectF.right - this.e.right), 0.0F);
        }
        if (localRectF.top < this.e.top)
        {
          localRectF.offset(0.0F, this.e.top - localRectF.top);
          if (!bool);
        }
        else if (localRectF.bottom > this.e.bottom)
        {
          localRectF.offset(0.0F, -(localRectF.bottom - this.e.bottom));
        }
        this.f.set(localRectF);
        this.d = d();
        this.a.invalidate();
        return;
      }
      f1 = paramFloat2;
    }
  }

  public void e()
  {
    this.d = d();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wallpaper.f
 * JD-Core Version:    0.6.1
 */