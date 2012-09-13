package com.whatsapp;

import android.location.Location;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.maps.MyLocationOverlay;

class uv
  implements View.OnClickListener
{
  final LocationPicker a;

  uv(LocationPicker paramLocationPicker)
  {
  }

  public void onClick(View paramView)
  {
    Location localLocation = LocationPicker.d(this.a).getLastFix();
    if ((localLocation != null) && (localLocation.getAccuracy() > 200.0F))
      localLocation = null;
    App.a(this.a, LocationPicker.g(this.a), localLocation);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uv
 * JD-Core Version:    0.6.1
 */