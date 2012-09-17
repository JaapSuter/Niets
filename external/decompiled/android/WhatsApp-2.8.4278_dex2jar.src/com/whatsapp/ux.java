package com.whatsapp;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;

public class ux extends tx
{
  private long a;
  private int b;
  private CharSequence c;
  private CharSequence d;
  private CharSequence e;
  private int f;
  private int g;
  private int h;
  private int i;
  private PendingIntent j;
  private long[] k;
  private Context l;

  public ux(Context paramContext)
  {
    this.l = paramContext;
  }

  public Notification a()
  {
    Notification localNotification = new Notification();
    localNotification.when = this.a;
    localNotification.icon = this.b;
    localNotification.contentIntent = this.j;
    localNotification.tickerText = this.c;
    localNotification.ledARGB = this.g;
    localNotification.ledOnMS = this.h;
    localNotification.ledOffMS = this.i;
    localNotification.defaults = this.f;
    localNotification.flags = 0;
    localNotification.vibrate = this.k;
    if ((this.h != 0) && (this.i != 0))
      localNotification.flags = (0x1 | localNotification.flags);
    if ((0x4 & this.f) != 0)
      localNotification.flags = (0x1 | localNotification.flags);
    localNotification.setLatestEventInfo(this.l, this.d, this.e, this.j);
    return localNotification;
  }

  public tx a(int paramInt)
  {
    this.b = paramInt;
    return this;
  }

  public tx a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
    return this;
  }

  public tx a(long paramLong)
  {
    this.a = paramLong;
    return this;
  }

  public tx a(PendingIntent paramPendingIntent)
  {
    this.j = paramPendingIntent;
    return this;
  }

  public tx a(Bitmap paramBitmap)
  {
    return this;
  }

  public tx a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    return this;
  }

  public tx a(long[] paramArrayOfLong)
  {
    this.k = paramArrayOfLong;
    return this;
  }

  public tx b(int paramInt)
  {
    this.f = paramInt;
    return this;
  }

  public tx b(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    return this;
  }

  public tx c(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    return this;
  }
}