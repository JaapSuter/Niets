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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.nw
 * JD-Core Version:    0.6.1
 */