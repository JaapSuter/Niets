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