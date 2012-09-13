package com.whatsapp;

import android.location.Location;
import com.google.android.maps.MyLocationOverlay;

class qv
  implements Runnable
{
  final boolean a;
  final Location b;
  final jf c;

  qv(jf paramjf, boolean paramBoolean, Location paramLocation)
  {
  }

  public void run()
  {
    if ((LocationPicker.a(this.c.h) == null) || (this.a))
    {
      LocationPicker.e(this.c.h).b(LocationPicker.d(this.c.h).getMyLocation());
      int i = Math.max((int)this.b.getAccuracy(), 100);
      LocationPicker.a(this.c.h, this.b, i, null, true);
    }
  }
}