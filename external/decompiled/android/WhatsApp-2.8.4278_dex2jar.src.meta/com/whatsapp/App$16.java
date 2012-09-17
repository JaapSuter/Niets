package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class App$16 extends BroadcastReceiver
{
  final App a;

  App$16(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (g5.b())
    {
      Thread localThread = new Thread(new th(this));
      localThread.setPriority(1);
      localThread.start();
    }
    g5.d();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.16
 * JD-Core Version:    0.6.1
 */