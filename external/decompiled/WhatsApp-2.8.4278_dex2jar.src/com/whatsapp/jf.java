package com.whatsapp;

import android.content.Context;
import android.location.Location;
import com.google.android.maps.MapView;

class jf extends hf
{
  final LocationPicker h;

  jf(LocationPicker paramLocationPicker, Context paramContext, MapView paramMapView)
  {
    super(paramContext, paramMapView);
  }

  public void onLocationChanged(Location paramLocation)
  {
    super.onLocationChanged(paramLocation);
    boolean bool;
    if (paramLocation != null)
    {
      if ((LocationPicker.a(this.h) == null) || (LocationPicker.a(this.h).a == null) || (!LocationPicker.b(this.h)) || (paramLocation.getAccuracy() >= 200.0F) || (LocationPicker.a(this.h).a.distanceTo(paramLocation) <= 1000.0F))
        break label159;
      bool = true;
      LocationPicker.a(this.h, false);
    }
    while (true)
    {
      LocationPicker.a(this.h, paramLocation);
      if (((LocationPicker.a(this.h) == null) || (bool)) && (((paramLocation.getAccuracy() < 200.0F) && (60000L + paramLocation.getTime() > System.currentTimeMillis())) || (LocationPicker.c(this.h))))
        this.h.runOnUiThread(new qv(this, bool, paramLocation));
      return;
      label159: bool = false;
    }
  }
}