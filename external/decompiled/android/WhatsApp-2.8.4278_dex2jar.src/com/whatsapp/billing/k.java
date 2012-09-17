package com.whatsapp.billing;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;

public abstract class k
{
  private static final Class[] b = arrayOfClass;
  private final Handler a;

  static
  {
    Class[] arrayOfClass = new Class[5];
    arrayOfClass[0] = IntentSender.class;
    arrayOfClass[1] = Intent.class;
    arrayOfClass[2] = Integer.TYPE;
    arrayOfClass[3] = Integer.TYPE;
    arrayOfClass[4] = Integer.TYPE;
  }

  public abstract void a(b paramb, String paramString1, int paramInt, long paramLong, String paramString2);

  void b(b paramb, String paramString1, int paramInt, long paramLong, String paramString2)
  {
    this.a.post(new l(this, paramb, paramString1, paramInt, paramLong, paramString2));
  }
}