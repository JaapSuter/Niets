package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class nw
  implements LocationListener
{
  final mb a;

  nw(mb parammb)
  {
  }

  public void onLocationChanged(Location paramLocation)
  {
    this.a.m = paramLocation;
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