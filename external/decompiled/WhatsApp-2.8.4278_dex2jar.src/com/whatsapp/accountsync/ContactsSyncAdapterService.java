package com.whatsapp.accountsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncAdapterService extends Service
{
  private static b a = null;

  private b a()
  {
    if (a == null)
      a = new b(this);
    return a;
  }

  public IBinder onBind(Intent paramIntent)
  {
    return a().getSyncAdapterBinder();
  }
}