package com.whatsapp;

import com.google.android.maps.MapController;
import com.google.android.maps.MyLocationOverlay;

class xv
  implements Runnable
{
  final wv a;

  xv(wv paramwv)
  {
  }

  public void run()
  {
    LocationPicker.e(this.a.a).b(LocationPicker.d(this.a.a).getMyLocation());
    LocationPicker.e(this.a.a).getController().setZoom(18);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xv
 * JD-Core Version:    0.6.1
 */