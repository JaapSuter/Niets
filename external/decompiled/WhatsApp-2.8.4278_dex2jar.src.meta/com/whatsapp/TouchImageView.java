package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageView.ScaleType;
import com.whatsapp.wallpaper.ImageViewTouchBase;
import com.whatsapp.wallpaper.k;

public class TouchImageView extends ImageViewTouchBase
{
  private static float l;
  public static int m;
  public static float n;
  public static Rect o;
  public static Rect p;
  public static Paint q;
  private static final String[] z;
  float b;
  float c;
  boolean d = false;
  int e = 0;
  long f;
  boolean g = true;
  boolean h = false;
  boolean i = false;
  boolean j = true;
  j4 k;
  private long r;
  private Handler s = new ud(this);
  protected boolean t;
  public float u = 1.0F;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "9HgoJ,U.tN".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "<W".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "(\007}pK(Uk!W$Fid\001".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label320;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        l = 3.0F;
        m = 0;
        n = -1.0F;
        q = new Paint();
        q.setColor(-16777216);
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 62;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        i2++;
        break;
        i4 = 73;
        continue;
        i4 = 39;
        continue;
        i4 = 14;
        continue;
        i4 = 1;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 62;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 73;
      continue;
      i8 = 39;
      continue;
      i8 = 14;
      continue;
      i8 = 1;
    }
    label320: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 62;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 73;
      continue;
      i12 = 39;
      continue;
      i12 = 14;
      continue;
      i12 = 1;
    }
  }

  public TouchImageView(Context paramContext)
  {
    super(paramContext);
    this.k = j4.a(paramContext);
    a(new h4(this));
  }

  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.k = j4.a(paramContext);
    a(new i4(this));
  }

  private float b(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX(0) - paramMotionEvent.getX(1);
    float f2 = paramMotionEvent.getY(0) - paramMotionEvent.getY(1);
    return FloatMath.sqrt(f1 * f1 + f2 * f2);
  }

  static long b(TouchImageView paramTouchImageView)
  {
    return paramTouchImageView.r;
  }

  private boolean c()
  {
    if (getWidth() > getHeight());
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public Bitmap a()
  {
    return this.mBitmapDisplayed.b();
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    super.a(paramFloat1, paramFloat2);
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super.a(paramFloat1, paramFloat2, paramFloat3);
  }

  public void a(int paramInt)
  {
    this.j = false;
    setScaleType(ImageView.ScaleType.CENTER);
    if (paramInt == 2)
    {
      setImageResource(2130837510);
      if (!DialogToastListActivity.f);
    }
    else
    {
      setImageResource(2130837509);
    }
  }

  public void a(TouchImageView paramTouchImageView)
  {
    Matrix localMatrix = paramTouchImageView.mSuppMatrix;
    boolean bool;
    if (!localMatrix.isIdentity())
    {
      bool = true;
      this.d = bool;
      if (!localMatrix.isIdentity())
        break label32;
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label32: this.mSuppMatrix.set(localMatrix);
      a(true, true);
    }
  }

  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public boolean a(MotionEvent paramMotionEvent)
  {
    boolean bool1 = DialogToastListActivity.f;
    boolean bool2;
    switch (paramMotionEvent.getAction())
    {
    case 3:
    case 4:
    case 5:
    default:
      bool2 = false;
    case 0:
    case 1:
    case 6:
      while (true)
      {
        return bool2;
        this.e = (1 + this.e);
        this.b = paramMotionEvent.getX();
        this.c = paramMotionEvent.getY();
        bool2 = false;
        continue;
        g5.d(z[1]);
        this.f = System.currentTimeMillis();
        bool2 = false;
        continue;
        g5.d(z[0]);
        bool2 = false;
      }
    case 2:
    }
    this.e = 0;
    if (paramMotionEvent.getPointerCount() > 1)
    {
      this.d = true;
      m = 1;
      if (!bool1);
    }
    else
    {
      if (m == 1)
      {
        this.b = paramMotionEvent.getX();
        this.c = paramMotionEvent.getY();
      }
      m = 2;
      n = -1.0F;
    }
    RectF localRectF;
    float f5;
    label280: float f6;
    if ((this.d) && (!this.h) && (this.mBitmapDisplayed.b() != null))
      if (m != 1)
      {
        Matrix localMatrix = d();
        localRectF = new RectF(0.0F, 0.0F, this.mBitmapDisplayed.b().getWidth(), this.mBitmapDisplayed.b().getHeight());
        localMatrix.mapRect(localRectF);
        float f4 = localRectF.height();
        if (localRectF.width() >= getWidth())
          break label619;
        f5 = 0.0F;
        if (f4 >= getHeight())
          break label633;
        f6 = 0.0F;
        label294: if (f5 > 0.0F)
        {
          if (f5 + localRectF.left <= 0.0F)
            break label666;
          f5 = Math.abs(localRectF.left);
          if (!bool1)
            break label666;
        }
        if ((f5 >= 0.0F) || (f5 + localRectF.right >= getWidth()))
          break label666;
      }
    label666: for (float f7 = getWidth() - localRectF.right; ; f7 = f5)
    {
      float f8;
      if (f6 > 0.0F)
        if (f6 + localRectF.top > 0.0F)
        {
          f8 = Math.abs(localRectF.top);
          if (!bool1);
        }
      while (true)
      {
        if ((f8 < 0.0F) && (f8 + localRectF.bottom < getHeight()));
        for (f8 = getHeight() - localRectF.bottom; ; f8 = f6)
        {
          b(f7, f8);
          if (bool1)
            if (n == -1.0F)
            {
              n = b(paramMotionEvent);
              if (!bool1);
            }
            else if (n > 10.0F)
            {
              float f1 = b(paramMotionEvent);
              float f2 = 1.0F + 2.0F * (f1 / n - 1.0F) / 3.0F;
              float f3 = c();
              if (f3 * f2 > this.u)
              {
                c(f2);
                if (!bool1);
              }
              else
              {
                c(1.0F / f3);
                ((GalleryView)getParent()).e();
                this.d = false;
              }
              n = f1;
              this.s.sendEmptyMessageDelayed(0, 50L);
              this.r = System.currentTimeMillis();
              if (!bool1);
            }
            else
            {
              n = b(paramMotionEvent);
            }
          this.b = paramMotionEvent.getX();
          this.c = paramMotionEvent.getY();
          if (this.d)
          {
            bool2 = true;
            break;
            label619: f5 = paramMotionEvent.getX() - this.b;
            break label280;
            label633: f6 = paramMotionEvent.getY() - this.c;
            break label294;
          }
          bool2 = false;
          break;
        }
        f8 = f6;
      }
    }
  }

  public boolean b()
  {
    boolean bool = false;
    if (this.mBitmapDisplayed.b() != null)
    {
      this.mBitmapDisplayed.b().recycle();
      this.mBitmapDisplayed.a(null);
      bool = true;
    }
    setImageBitmap(null);
    return bool;
  }

  public void c(float paramFloat)
  {
    this.mSuppMatrix.postScale(paramFloat, paramFloat, getWidth() / 2, getHeight() / 2);
    setImageMatrix(d());
    a(true, true);
  }

  protected void c(float paramFloat1, float paramFloat2)
  {
    a(paramFloat1, getWidth() / 2, getHeight() / 2, paramFloat2);
  }

  public void d()
  {
    boolean bool = DialogToastListActivity.f;
    if ((!this.d) && (this.mBitmapDisplayed.b() != null))
    {
      if (this.u < this.mMaxZoom)
      {
        int i1 = this.mBitmapDisplayed.b().getWidth();
        int i2 = this.mBitmapDisplayed.b().getHeight();
        int i3 = getWidth();
        int i4 = getHeight();
        float f1;
        if ((!c()) && (i1 > i2))
        {
          float f3 = i2 * i3 / i1;
          f1 = i4 / f3;
          if (!bool);
        }
        else if ((!c()) && (i2 > i1))
        {
          f1 = l;
          if (!bool);
        }
        else if ((c()) && (i1 > i2))
        {
          f1 = l;
          if (!bool);
        }
        else if ((c()) && (i2 > i1))
        {
          float f2 = i1 * i4 / i2;
          f1 = i3 / f2;
          if (!bool);
        }
        else
        {
          f1 = l;
          g5.d(z[2]);
        }
        c(f1, 250.0F);
        this.d = true;
        if (!bool);
      }
    }
    else
    {
      c(this.u, 250.0F);
      this.d = false;
    }
    this.e = 0;
  }

  public void e()
  {
    this.d = false;
    this.mSuppMatrix.reset();
    setImageMatrix(d());
  }

  public void f()
  {
    this.j = false;
    setScaleType(ImageView.ScaleType.CENTER);
    setImageResource(2130837517);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.h)
    {
      Paint localPaint = new Paint();
      localPaint.setDither(true);
      Bitmap localBitmap = ((BitmapDrawable)getResources().getDrawable(2130838561)).getBitmap();
      Matrix localMatrix = new Matrix(getImageMatrix());
      if (this.mBitmapDisplayed.b() != null)
      {
        float[] arrayOfFloat = new float[2];
        arrayOfFloat[0] = this.mBitmapDisplayed.f() / 2;
        arrayOfFloat[1] = this.mBitmapDisplayed.e() / 2;
        localMatrix.mapPoints(arrayOfFloat);
        paramCanvas.drawBitmap(localBitmap, getPaddingLeft() + arrayOfFloat[0] - localBitmap.getWidth() / 2, getHeight() / 2 - localBitmap.getHeight() / 2, localPaint);
      }
    }
    if ((this.t) && (!this.d) && (MediaView.M != 2))
    {
      if (p == null)
        p = new Rect(MediaView.B.getWidth() - this.k.jb, 0, MediaView.B.getWidth(), MediaView.B.getHeight());
      if (o == null)
        o = new Rect(0, 0, this.k.jb, MediaView.B.getHeight());
      paramCanvas.drawRect(p, q);
      paramCanvas.drawRect(o, q);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.mBitmapDisplayed.b() != null);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.d = false;
    super.setImageBitmap(paramBitmap);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.TouchImageView
 * JD-Core Version:    0.6.1
 */