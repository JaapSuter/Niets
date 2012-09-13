package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.net.Uri;
import android.widget.ImageView;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MediaGalleryImageView extends ImageView
{
  private static Paint focusPaint;
  static Object lock = new Object();
  private static Paint normalPaint;
  public static ArrayList<tw> taskList = new ArrayList();
  static HashMap<uz, SoftReference<Bitmap>> tempBitmaps = new HashMap();
  boolean debug = false;
  int position;
  private final Rect viewDrawingRect = new Rect();

  public MediaGalleryImageView(Context paramContext)
  {
    super(paramContext);
    j4 localj4 = j4.a(paramContext);
    if (focusPaint == null)
    {
      focusPaint = new Paint();
      focusPaint.setColor(-1712291840);
      focusPaint.setStrokeWidth(3 * localj4.Z);
      focusPaint.setStyle(Paint.Style.STROKE);
      focusPaint.setAntiAlias(true);
    }
    if (normalPaint == null)
    {
      normalPaint = new Paint();
      normalPaint.setColor(2097152000);
      normalPaint.setStrokeWidth(localj4.Z);
      normalPaint.setStyle(Paint.Style.STROKE);
      normalPaint.setAntiAlias(true);
    }
  }

  public static void a()
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = tempBitmaps.values().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      SoftReference localSoftReference = (SoftReference)localIterator.next();
      Bitmap localBitmap = (Bitmap)localSoftReference.get();
      if (localBitmap != null)
      {
        localBitmap.recycle();
        localSoftReference.clear();
      }
    }
    while (!bool);
    tempBitmaps.clear();
  }

  public void a(sz paramsz, int paramInt1, Uri paramUri, int paramInt2)
  {
    synchronized (lock)
    {
      taskList.add(new tw(this, paramsz, paramInt1, paramUri, paramInt2));
      return;
    }
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    getDrawingRect(this.viewDrawingRect);
    if (isPressed())
    {
      paramCanvas.drawRect(this.viewDrawingRect, focusPaint);
      if (!DialogToastListActivity.f);
    }
    else
    {
      paramCanvas.drawRect(this.viewDrawingRect, normalPaint);
    }
  }
}