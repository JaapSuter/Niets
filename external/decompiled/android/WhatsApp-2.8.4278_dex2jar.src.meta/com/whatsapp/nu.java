package com.whatsapp;

import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;

class nu
  implements Runnable
{
  final mu a;

  nu(mu parammu)
  {
  }

  public void run()
  {
    GroupChatMap.b(this.a.a).getController().animateTo(GroupChatMap.a(this.a.a).getMyLocation());
    GroupChatMap.b(this.a.a).getController().setZoom(17);
    this.a.a.runOnUiThread(new ou(this));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nu
 * JD-Core Version:    0.6.1
 */