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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.tv
 * JD-Core Version:    0.6.1
 */