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