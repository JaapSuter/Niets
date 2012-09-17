package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;

public class hf extends MyLocationOverlay
{
  private Point a = new Point();
  private Point b = new Point();
  private Paint c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  private Handler g;

  public hf(Context paramContext, MapView paramMapView)
  {
    super(paramContext, paramMapView);
    this.d = paramContext.getResources().getDrawable(2130838497);
    this.e = paramContext.getResources().getDrawable(2130838498);
    this.f = this.d;
    this.c = new Paint();
    this.c.setAntiAlias(true);
    this.c.setStrokeWidth(2.0F);
    this.g = new gd(this, paramMapView);
    this.g.sendEmptyMessageDelayed(0, 500L);
  }

  static Drawable a(hf paramhf)
  {
    return paramhf.f;
  }

  static Drawable a(hf paramhf, Drawable paramDrawable)
  {
    paramhf.f = paramDrawable;
    return paramDrawable;
  }

  static Drawable b(hf paramhf)
  {
    return paramhf.d;
  }

  static Drawable c(hf paramhf)
  {
    return paramhf.e;
  }

  public void disableMyLocation()
  {
    super.disableMyLocation();
    this.g.removeMessages(0);
  }

  protected void drawMyLocation(Canvas paramCanvas, MapView paramMapView, Location paramLocation, GeoPoint paramGeoPoint, long paramLong)
  {
    int i = this.f.getIntrinsicWidth();
    int j = this.f.getIntrinsicHeight();
    Projection localProjection = paramMapView.getProjection();
    double d1 = paramLocation.getLatitude();
    double d2 = paramLocation.getLongitude();
    float f1 = paramLocation.getAccuracy();
    float[] arrayOfFloat = new float[1];
    Location.distanceBetween(d1, d2, d1, d2 + 1.0D, arrayOfFloat);
    float f2 = arrayOfFloat[0];
    localProjection.toPixels(new GeoPoint((int)(d1 * 1000000.0D), (int)(1000000.0D * (d2 - f1 / f2))), this.b);
    localProjection.toPixels(paramGeoPoint, this.a);
    int k = this.a.x - this.b.x;
    this.c.setColor(-10066177);
    this.c.setStyle(Paint.Style.STROKE);
    paramCanvas.drawCircle(this.a.x, this.a.y, k, this.c);
    this.c.setColor(409364223);
    this.c.setStyle(Paint.Style.FILL);
    paramCanvas.drawCircle(this.a.x, this.a.y, k, this.c);
    this.f.setBounds(this.a.x - i / 2, this.a.y - j / 2, this.a.x + i / 2, this.a.y + j / 2);
    this.f.draw(paramCanvas);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hf
 * JD-Core Version:    0.6.1
 */