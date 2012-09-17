package com.whatsapp;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;

public abstract class tx
{
  public static tx a(Context paramContext)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT == 15)
      localObject = new wx(paramContext);
    while (true)
    {
      return localObject;
      if (Build.VERSION.SDK_INT >= 11)
        localObject = new vx(paramContext);
      else
        localObject = new ux(paramContext);
    }
  }

  public abstract Notification a();

  public abstract tx a(int paramInt);

  public abstract tx a(int paramInt1, int paramInt2, int paramInt3);

  public abstract tx a(long paramLong);

  public abstract tx a(PendingIntent paramPendingIntent);

  public abstract tx a(Bitmap paramBitmap);

  public abstract tx a(CharSequence paramCharSequence);

  public abstract tx a(long[] paramArrayOfLong);

  public abstract tx b(int paramInt);

  public abstract tx b(CharSequence paramCharSequence);

  public abstract tx c(CharSequence paramCharSequence);
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tx
 * JD-Core Version:    0.6.1
 */