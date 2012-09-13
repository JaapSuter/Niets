package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.location.Location;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Projection;

public class GoogleMapView extends MapView
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener
{
  private int latSpan = 0;
  private jt listener;
  private int lonSpan = 0;
  private GestureDetector mGestureDetector;
  private GeoPoint mapCenter = new GeoPoint(0, 0);

  public GoogleMapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  public GoogleMapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }

  public static Location a(GeoPoint paramGeoPoint)
  {
    Location localLocation = new Location("");
    localLocation.setLatitude(paramGeoPoint.getLatitudeE6() / 1000000.0D);
    localLocation.setLongitude(paramGeoPoint.getLongitudeE6() / 1000000.0D);
    return localLocation;
  }

  public static GeoPoint a(Location paramLocation)
  {
    return new GeoPoint((int)(1000000.0D * paramLocation.getLatitude()), (int)(1000000.0D * paramLocation.getLongitude()));
  }

  private void a()
  {
    this.mGestureDetector = new GestureDetector(this);
    this.mGestureDetector.setOnDoubleTapListener(this);
  }

  public void a(jt paramjt)
  {
    this.listener = paramjt;
  }

  public int b()
  {
    Location localLocation1 = a(getMapCenter());
    Location localLocation2 = a(getProjection().fromPixels(getWidth() / 2, 0));
    Location localLocation3 = a(getProjection().fromPixels(0, getHeight() / 2));
    return (int)Math.min(localLocation1.distanceTo(localLocation2), localLocation1.distanceTo(localLocation3));
  }

  public void b(GeoPoint paramGeoPoint)
  {
    if (paramGeoPoint == null);
    while (true)
    {
      return;
      try
      {
        getController().animateTo(paramGeoPoint);
      }
      catch (Exception localException1)
      {
        try
        {
          getController().setCenter(paramGeoPoint);
        }
        catch (Exception localException2)
        {
        }
      }
    }
  }

  public Location c()
  {
    return a(getMapCenter());
  }

  public void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    if (this.listener != null)
    {
      GeoPoint localGeoPoint = getMapCenter();
      int i = getLatitudeSpan();
      int j = getLongitudeSpan();
      if ((!this.mapCenter.equals(localGeoPoint)) || (this.latSpan != i) || (this.lonSpan != j))
      {
        this.mapCenter = localGeoPoint;
        this.latSpan = i;
        this.lonSpan = j;
        this.listener.a(localGeoPoint, i, j);
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    this.mGestureDetector.onTouchEvent(paramMotionEvent);
    return super.dispatchTouchEvent(paramMotionEvent);
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }

  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    return getController().zoomInFixing((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
  }

  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}