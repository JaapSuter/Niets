package com.whatsapp;

import android.os.PowerManager.WakeLock;

class ly
  implements Runnable
{
  final PopupNotification a;

  ly(PopupNotification paramPopupNotification)
  {
  }

  public void run()
  {
    if ((PopupNotification.k(this.a) != null) && (PopupNotification.k(this.a).isHeld()))
      PopupNotification.k(this.a).release();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ly
 * JD-Core Version:    0.6.1
 */