package com.whatsapp;

import com.google.android.maps.MyLocationOverlay;

class tv
  implements Runnable
{
  final LocationPicker a;

  tv(LocationPicker paramLocationPicker)
  {
  }

  public void run()
  {
    LocationPicker.e(this.a).b(LocationPicker.d(this.a).getMyLocation());
  }
}