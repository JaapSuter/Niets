package com.whatsapp;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;

public class vx extends tx
{
  private Notification.Builder a;

  public vx(Context paramContext)
  {
    this.a = new Notification.Builder(paramContext);
  }

  public Notification a()
  {
    return this.a.getNotification();
  }

  public tx a(int paramInt)
  {
    this.a.setSmallIcon(paramInt);
    return this;
  }

  public tx a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.setLights(paramInt1, paramInt2, paramInt3);
    return this;
  }

  public tx a(long paramLong)
  {
    this.a.setWhen(paramLong);
    return this;
  }

  public tx a(PendingIntent paramPendingIntent)
  {
    this.a.setContentIntent(paramPendingIntent);
    return this;
  }

  public tx a(Bitmap paramBitmap)
  {
    this.a.setLargeIcon(paramBitmap);
    return this;
  }

  public tx a(CharSequence paramCharSequence)
  {
    this.a.setTicker(paramCharSequence);
    return this;
  }

  public tx a(long[] paramArrayOfLong)
  {
    this.a.setVibrate(paramArrayOfLong);
    return this;
  }

  public tx b(int paramInt)
  {
    this.a.setDefaults(paramInt);
    return this;
  }

  public tx b(CharSequence paramCharSequence)
  {
    this.a.setContentTitle(paramCharSequence);
    return this;
  }

  public tx c(CharSequence paramCharSequence)
  {
    this.a.setContentText(paramCharSequence);
    return this;
  }
}