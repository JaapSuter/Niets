package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;

public class GalleryView extends ViewGroup
  implements GestureDetector.OnDoubleTapListener
{
  private static final int INVALID_POINTER = -1;
  private static final int INVALID_SCREEN = -1;
  private static final int SNAP_VELOCITY = 250;
  private static final int SWIPE_MAX_OFF_PATH = 250;
  private static final int SWIPE_MIN_DISTANCE = 120;
  private static final int SWIPE_THRESHOLD_VELOCITY = 200;
  private static final int TAB_INDICATOR_HEIGHT_PCT = 2;
  private static final int TOUCH_STATE_REST = 0;
  private static final int TOUCH_STATE_SCROLLING = 1;
  private static final String[] z;
  private boolean allowLongPress;
  private RectF bar;
  Bitmap bitmap;
  private Canvas canvas;
  private int currentScreen;
  private int defaultScreen = 0;
  private gt eventCallback;
  private GestureDetector gestureDetector;
  private boolean hasTabIndicator;
  private int lastMeasuredWidth;
  private float lastMotionX;
  private float lastMotionY;
  private ht load;
  private gw lockHandler;
  boolean locked;
  private int mActivePointerId = -1;
  private int mMaximumVelocity;
  private int mScreenWidth;
  private it mScrollInterpolator;
  private VelocityTracker mVelocityTracker;
  private int nextScreen = -1;
  private Paint paint;
  public Scroller scroller;
  private RectF selectedTab;
  private Paint selectedTabPaint;
  private Paint tabIndicatorBackgroundPaint;
  private int touchSlop;
  private int touchState = 0;
  private Bitmap wallpaper;
  private int wallpaperHeight;
  private boolean wallpaperLoaded;
  private float wallpaperOffset;
  private int wallpaperWidth;

  static
  {
    String[] arrayOfString = new String[9];
    char[] arrayOfChar1 = "dzVrNk9OiSlwKcS%}PqO".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    char[] arrayOfChar8;
    int i25;
    char[] arrayOfChar9;
    int i29;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "fxJaIq9^&Bdw\\cM%mPsBm9ZpDkm".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "C_\016?\020<(\006".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label516;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "bxSjDw``pH`n\020hNZzJtS`wKYWl|H)".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label604;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "bxSjDw`\022pH`n\020iNh#".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label692;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "bxSjDw`IoDr6PhL`xLsS`6\037qHamWKDdjJtDViZe\033".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label780;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "RvMmRux\\c\001fxQ&NkuF&C`9JuDa9Vh\001@A~EuI@\037kNa|\021".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label868;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "LwKcSf|OrDa9^&Ujl\\n\001`oZhU%4\037Sq".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label956;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "dzKoNkFOiHkmZt~avHh".toCharArray();
        int i28 = arrayOfChar9.length;
        i29 = 0;
        if (i28 > i29)
          break label1044;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 33;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 5;
        continue;
        m = 25;
        continue;
        m = 63;
        continue;
        m = 6;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 5;
      continue;
      i3 = 25;
      continue;
      i3 = 63;
      continue;
      i3 = 6;
    }
    label516: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 5;
      continue;
      i7 = 25;
      continue;
      i7 = 63;
      continue;
      i7 = 6;
    }
    label604: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 5;
      continue;
      i11 = 25;
      continue;
      i11 = 63;
      continue;
      i11 = 6;
    }
    label692: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 5;
      continue;
      i15 = 25;
      continue;
      i15 = 63;
      continue;
      i15 = 6;
    }
    label780: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 5;
      continue;
      i19 = 25;
      continue;
      i19 = 63;
      continue;
      i19 = 6;
    }
    label868: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 5;
      continue;
      i23 = 25;
      continue;
      i23 = 63;
      continue;
      i23 = 6;
    }
    label956: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 5;
      continue;
      i27 = 25;
      continue;
      i27 = 63;
      continue;
      i27 = 6;
    }
    label1044: int i30 = arrayOfChar9[i29];
    int i31;
    switch (i29 % 5)
    {
    default:
      i31 = 33;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i29] = (char)(i31 ^ i30);
      i29++;
      break;
      i31 = 5;
      continue;
      i31 = 25;
      continue;
      i31 = 63;
      continue;
      i31 = 6;
    }
  }

  public GalleryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public GalleryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    this.gestureDetector = new GestureDetector(new be(this));
    this.gestureDetector.setOnDoubleTapListener(this);
  }

  static int a(GalleryView paramGalleryView)
  {
    return paramGalleryView.touchState;
  }

  static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2, Context paramContext)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int k;
    int m;
    if ((i < paramInt1) || (j < paramInt2))
    {
      k = Integer.valueOf(z[2], 16).intValue();
      if (i >= paramInt1)
        break label113;
      m = paramInt1;
      if (j >= paramInt2)
        break label120;
    }
    label113: label120: for (int n = paramInt2; ; n = j)
    {
      Bitmap localBitmap = Bitmap.createBitmap(m, n, Bitmap.Config.RGB_565);
      Canvas localCanvas = new Canvas(localBitmap);
      localCanvas.drawColor(k);
      localCanvas.drawBitmap(paramBitmap, paramInt1 - i / 2.0F, paramInt2 - j / 2.0F, null);
      paramBitmap = localBitmap;
      return paramBitmap;
      m = i;
      break;
    }
  }

  private void a()
  {
    this.mScrollInterpolator = new it();
    this.scroller = new Scroller(getContext(), this.mScrollInterpolator);
    this.currentScreen = this.defaultScreen;
    this.paint = new Paint();
    this.paint.setDither(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.touchSlop = localViewConfiguration.getScaledTouchSlop();
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.selectedTabPaint = new Paint();
    this.selectedTabPaint.setColor(-65536);
    this.selectedTabPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    this.tabIndicatorBackgroundPaint = new Paint();
    this.tabIndicatorBackgroundPaint.setColor(-7829368);
    this.tabIndicatorBackgroundPaint.setStyle(Paint.Style.FILL);
    this.lockHandler = new ft(this);
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    int i;
    int j;
    Scroller localScroller;
    int k;
    if (paramInt != this.currentScreen)
    {
      i = 1;
      this.nextScreen = paramInt;
      View localView = getFocusedChild();
      if ((localView != null) && (i != 0) && (localView == getChildAt(this.currentScreen)))
        localView.clearFocus();
      j = paramInt * getWidth() - getScrollX();
      localScroller = this.scroller;
      k = getScrollX();
      if (!paramBoolean)
        break label120;
    }
    label120: for (int m = 0; ; m = 2 * Math.abs(j))
    {
      localScroller.startScroll(k, 0, j, 0, m);
      if (this.eventCallback != null)
        this.eventCallback.a(paramInt);
      invalidate();
      return;
      i = 0;
      break;
    }
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
    if (i == -1);
    label149: label153: 
    while (true)
    {
      return;
      float f1 = paramMotionEvent.getX(i);
      float f2 = paramMotionEvent.getY(i);
      int j = (int)Math.abs(f1 - this.lastMotionX);
      int k = (int)Math.abs(f2 - this.lastMotionY);
      int m;
      if (j > this.touchSlop)
      {
        m = 1;
        label66: if (k <= this.touchSlop)
          break label149;
      }
      for (int n = 1; ; n = 0)
      {
        if ((m == 0) && (n == 0))
          break label153;
        if ((m != 0) && (n == 0))
        {
          this.touchState = 1;
          this.lastMotionX = f1;
        }
        if (!this.allowLongPress)
          break;
        this.allowLongPress = false;
        View localView = getChildAt(this.currentScreen);
        if (localView == null)
          break;
        localView.cancelLongPress();
        break;
        m = 0;
        break label66;
      }
    }
  }

  static int b(GalleryView paramGalleryView)
  {
    return paramGalleryView.currentScreen;
  }

  private void b(MotionEvent paramMotionEvent)
  {
    int i = (0xFF00 & paramMotionEvent.getAction()) >> 8;
    if (paramMotionEvent.getPointerId(i) == this.mActivePointerId)
      if (i != 0)
        break label72;
    label72: for (int j = 1; ; j = 0)
    {
      this.lastMotionX = paramMotionEvent.getX(j);
      this.lastMotionY = paramMotionEvent.getY(j);
      this.mActivePointerId = paramMotionEvent.getPointerId(j);
      if (this.mVelocityTracker != null)
        this.mVelocityTracker.clear();
      return;
    }
  }

  private void c()
  {
    int i;
    int m;
    if (this.hasTabIndicator)
    {
      i = getMeasuredWidth();
      int j = getMeasuredHeight();
      this.bar = new RectF(0.0F, 0.0F, i, j * 2 / 100);
      int k = getScrollX() / getChildCount();
      this.selectedTab = new RectF(k, 0.0F, k + i / getChildCount(), j * 2 / 100);
      m = j * 2;
    }
    try
    {
      this.bitmap = Bitmap.createBitmap(i, m / 100, Bitmap.Config.ARGB_8888);
      this.canvas = new Canvas(this.bitmap);
      this.canvas.drawRoundRect(this.bar, 0.0F, 0.0F, this.tabIndicatorBackgroundPaint);
      this.canvas.drawRoundRect(this.selectedTab, 5.0F, 5.0F, this.selectedTabPaint);
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        g5.d(z[4] + localOutOfMemoryError);
    }
  }

  private void c(MotionEvent paramMotionEvent)
  {
    boolean bool = DialogToastListActivity.f;
    int i = paramMotionEvent.findPointerIndex(this.mActivePointerId);
    if (i == -1);
    while (true)
    {
      return;
      float f = paramMotionEvent.getX(i);
      int j = (int)(this.lastMotionX - f);
      this.lastMotionX = f;
      if (this.eventCallback != null)
        this.eventCallback.a();
      if (j < 0)
      {
        if (getScrollX() > 0)
        {
          scrollBy(Math.max(-getScrollX(), j), 0);
          if (!bool);
        }
        else if (this.eventCallback == null);
      }
      else if (j > 0)
      {
        int k = getChildAt(-1 + getChildCount()).getRight() - getScrollX() - getWidth();
        if (k > 0)
        {
          scrollBy(Math.min(k, j), 0);
          if (!bool)
            break label159;
        }
        label159: if ((this.eventCallback != null) && (!bool));
      }
      else
      {
        awakenScrollBars();
      }
    }
  }

  private void d()
  {
    int i = getWidth();
    c((getScrollX() + i / 2) / i);
  }

  public void a(int paramInt)
  {
    if (paramInt == 0)
      paramInt = getWidth();
    this.mScreenWidth = paramInt;
  }

  public void a(int paramInt1, int paramInt2)
  {
    a(paramInt2);
    if (!this.scroller.isFinished())
      this.scroller.abortAnimation();
    this.currentScreen = Math.max(0, Math.min(paramInt1, getChildCount()));
    scrollTo(paramInt2 * this.currentScreen, 0);
    if (this.eventCallback != null)
      this.eventCallback.a(paramInt1);
    invalidate();
  }

  public void a(gt paramgt)
  {
    this.eventCallback = paramgt;
  }

  public void a(boolean paramBoolean)
  {
    this.hasTabIndicator = paramBoolean;
  }

  int b()
  {
    return this.currentScreen;
  }

  public void b(int paramInt)
  {
    a(paramInt, this.mScreenWidth);
  }

  public void c(int paramInt)
  {
    a(paramInt, false);
  }

  public void computeScroll()
  {
    if (this.scroller.computeScrollOffset())
    {
      scrollTo(this.scroller.getCurrX(), this.scroller.getCurrY());
      postInvalidate();
      if (!DialogToastListActivity.f);
    }
    else if (this.nextScreen != -1)
    {
      this.currentScreen = Math.max(0, Math.min(this.nextScreen, -1 + getChildCount()));
      this.nextScreen = -1;
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    boolean bool = DialogToastListActivity.f;
    if (this.wallpaper != null)
    {
      float f = getScrollX() * this.wallpaperOffset;
      if (f + this.wallpaperWidth < getRight() - getLeft())
        f = getRight() - getLeft() - this.wallpaperWidth;
      paramCanvas.drawBitmap(this.wallpaper, f, (getBottom() - getTop() - this.wallpaperHeight) / 2, this.paint);
    }
    if ((this.touchState != 1) && (this.nextScreen == -1));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        View localView = getChildAt(this.currentScreen);
        if (localView != null)
        {
          drawChild(paramCanvas, localView, getDrawingTime());
          if (!bool);
        }
        else
        {
          g5.d(z[3] + this.currentScreen);
          if (this.eventCallback != null)
            this.eventCallback.b();
        }
        if (!bool);
      }
      else
      {
        long l = getDrawingTime();
        if ((this.nextScreen >= 0) && (this.nextScreen < getChildCount()) && (Math.abs(this.currentScreen - this.nextScreen) == 1))
        {
          drawChild(paramCanvas, getChildAt(this.currentScreen), l);
          drawChild(paramCanvas, getChildAt(this.nextScreen), l);
          if (!bool);
        }
        else
        {
          int j = getChildCount();
          int k = 0;
          do
          {
            if (k >= j)
              break;
            drawChild(paramCanvas, getChildAt(k), l);
            k++;
          }
          while (!bool);
        }
      }
      if (this.hasTabIndicator)
      {
        c();
        paramCanvas.drawBitmap(this.bitmap, getScrollX(), 98 * getMeasuredHeight() / 100, this.paint);
      }
      return;
    }
  }

  public boolean dispatchUnhandledMove(View paramView, int paramInt)
  {
    boolean bool = true;
    if (paramInt == 17)
    {
      if (b() <= 0)
        break label61;
      c(-1 + b());
    }
    while (true)
    {
      return bool;
      if ((paramInt == 66) && (b() < -1 + getChildCount()))
        c(1 + b());
      else
        label61: bool = super.dispatchUnhandledMove(paramView, paramInt);
    }
  }

  public void e()
  {
    this.locked = false;
  }

  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (this.eventCallback != null)
      this.eventCallback.a(this.lockHandler);
    return false;
  }

  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    boolean bool = DialogToastListActivity.f;
    if (this.locked);
    int k;
    do
    {
      return i;
      k = paramMotionEvent.getAction();
    }
    while ((k == 2) && (this.touchState != 0));
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    if (((getChildAt(this.currentScreen) instanceof TouchImageView)) && (paramMotionEvent.getPointerCount() > i) && (!((TouchImageView)getChildAt(this.currentScreen)).i) && (!((TouchImageView)getChildAt(this.currentScreen)).h))
    {
      ((TouchImageView)getChildAt(this.currentScreen)).d = i;
      TouchImageView.m = i;
      this.locked = i;
    }
    label180: int j;
    switch (k)
    {
    case 4:
    default:
    case 2:
    case 0:
      while (true)
        if (this.touchState == 0)
        {
          j = 0;
          break;
          if (TouchImageView.m == j)
          {
            if (this.eventCallback != null)
            {
              this.eventCallback.a(paramMotionEvent);
              if (!bool);
            }
          }
          else
          {
            a(paramMotionEvent);
            if (bool)
            {
              float f1 = paramMotionEvent.getX();
              float f2 = paramMotionEvent.getY();
              this.lastMotionX = f1;
              this.lastMotionY = f2;
              this.allowLongPress = j;
              this.mActivePointerId = paramMotionEvent.getPointerId(0);
              if (!this.scroller.isFinished())
                break label359;
            }
          }
        }
    case 1:
    case 3:
    case 6:
    case 5:
    }
    label359: for (int m = 0; ; m = j)
    {
      this.touchState = m;
      if (!bool)
        break label180;
      g5.c(z[7]);
      this.mActivePointerId = -1;
      this.allowLongPress = false;
      if (this.mVelocityTracker != null)
      {
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
      }
      this.touchState = 0;
      if (!bool)
        break label180;
      b(paramMotionEvent);
      if (!bool)
        break label180;
      g5.d(z[8]);
      break label180;
      break;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = DialogToastListActivity.f;
    int i = getChildCount();
    int j = 0;
    int k = 0;
    do
    {
      if (j >= i)
        break;
      View localView = getChildAt(j);
      if (localView.getVisibility() != 8)
      {
        int m = localView.getMeasuredWidth();
        localView.layout(k, 0, k + m, localView.getMeasuredHeight());
        k += m;
      }
      j++;
    }
    while (!bool);
    if (this.load != null)
      this.load.a();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = DialogToastListActivity.f;
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824)
      g5.d(z[5] + paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    if (k != 1073741824)
      throw new IllegalStateException(z[6]);
    int m = getChildCount();
    int i3;
    for (int n = 0; ; n = i3)
    {
      int i1;
      if (n < m)
      {
        if (this.hasTabIndicator)
        {
          i1 = 98;
          int i2 = View.MeasureSpec.makeMeasureSpec(i1 * j / 100, k);
          getChildAt(n).measure(paramInt1, i2);
          i3 = n + 1;
          if (!bool)
            continue;
        }
      }
      else
      {
        if (this.wallpaperLoaded)
        {
          this.wallpaperLoaded = false;
          this.wallpaper = a(this.wallpaper, i, j, getContext());
          this.wallpaperWidth = this.wallpaper.getWidth();
          this.wallpaperHeight = this.wallpaper.getHeight();
        }
        if (this.wallpaperWidth <= i)
          break label289;
      }
      label289: for (float f = m * i - this.wallpaperWidth / (m - 1 * i); ; f = 1.0F)
      {
        this.wallpaperOffset = f;
        if (this.lastMeasuredWidth != i)
        {
          this.lastMeasuredWidth = i;
          scrollTo(i * this.currentScreen, 0);
          a(i);
        }
        c();
        invalidate();
        return;
        i1 = 100;
        break;
      }
    }
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (this.eventCallback != null)
      this.eventCallback.b(0);
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = DialogToastListActivity.f;
    this.gestureDetector.onTouchEvent(paramMotionEvent);
    if (this.mVelocityTracker == null)
      this.mVelocityTracker = VelocityTracker.obtain();
    this.mVelocityTracker.addMovement(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    float f = paramMotionEvent.getX();
    switch (i)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 6:
    case 5:
    }
    while (true)
    {
      return true;
      if (this.locked)
      {
        if (this.eventCallback != null)
          this.eventCallback.a(paramMotionEvent);
      }
      else if (this.touchState != 0)
      {
        if (!this.scroller.isFinished())
          this.scroller.abortAnimation();
        this.lastMotionX = f;
        this.mActivePointerId = paramMotionEvent.getPointerId(0);
        if (bool)
          if (this.locked)
          {
            if (this.eventCallback != null)
              this.eventCallback.a(paramMotionEvent);
          }
          else if (this.touchState == 1)
          {
            c(paramMotionEvent);
            if (!bool);
          }
          else if ((onInterceptTouchEvent(paramMotionEvent)) && (this.touchState == 1))
          {
            c(paramMotionEvent);
            if (bool)
            {
              System.currentTimeMillis();
              if (this.eventCallback != null);
              VelocityTracker localVelocityTracker = this.mVelocityTracker;
              localVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
              int j = (int)localVelocityTracker.getXVelocity();
              if ((this.touchState == 1) && (!this.locked))
              {
                if ((j > 250) && (this.currentScreen > 0))
                {
                  c(-1 + this.currentScreen);
                  if (!bool);
                }
                else if ((j < -250) && (this.currentScreen < -1 + getChildCount()))
                {
                  c(1 + this.currentScreen);
                  if (!bool);
                }
                else
                {
                  d();
                }
                if (this.mVelocityTracker != null)
                {
                  this.mVelocityTracker.recycle();
                  this.mVelocityTracker = null;
                }
              }
              this.touchState = 0;
              this.mActivePointerId = -1;
              if ((bool) && (!this.locked))
              {
                g5.c(z[1]);
                this.touchState = 0;
                this.mActivePointerId = -1;
                if ((bool) && (!this.locked))
                {
                  TouchImageView.m = 2;
                  TouchImageView.n = -1.0F;
                  b(paramMotionEvent);
                  if (bool)
                    g5.d(z[0]);
                }
              }
            }
          }
      }
    }
  }

  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    boolean bool = DialogToastListActivity.f;
    int i = getChildCount();
    int j = 0;
    do
    {
      if (j >= i)
        break;
      getChildAt(j).setOnLongClickListener(paramOnLongClickListener);
      j++;
    }
    while (!bool);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.GalleryView
 * JD-Core Version:    0.6.1
 */