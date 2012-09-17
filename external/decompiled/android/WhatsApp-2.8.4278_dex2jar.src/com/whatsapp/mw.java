package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class mw
  implements LocationListener
{
  final mb a;

  mw(mb parammb)
  {
  }

  public void onLocationChanged(Location paramLocation)
  {
    mb localmb = this.a;
    localmb.k = (1 + localmb.k);
    this.a.l = paramLocation;
    if ((this.a.k >= 2) || (paramLocation.getAccuracy() < 200.0F))
    {
      this.a.n = true;
      this.a.k = 0;
    }
  }

  public void onProviderDisabled(String paramString)
  {
  }

  public void onProviderEnabled(String paramString)
  {
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }
}