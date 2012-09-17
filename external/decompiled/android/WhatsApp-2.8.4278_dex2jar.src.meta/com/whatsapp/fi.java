package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

final class fi
  implements ServiceConnection
{
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    App.b(new Messenger(paramIBinder));
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    App.Mb();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fi
 * JD-Core Version:    0.6.1
 */