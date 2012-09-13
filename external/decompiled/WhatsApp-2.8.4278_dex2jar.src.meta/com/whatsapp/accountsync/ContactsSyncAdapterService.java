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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.accountsync.ContactsSyncAdapterService
 * JD-Core Version:    0.6.1
 */