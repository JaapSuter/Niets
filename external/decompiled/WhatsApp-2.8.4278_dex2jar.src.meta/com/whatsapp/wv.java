package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.maps.MyLocationOverlay;

class wv
  implements View.OnClickListener
{
  final LocationPicker a;

  wv(LocationPicker paramLocationPicker)
  {
  }

  public void onClick(View paramView)
  {
    LocationPicker.d(this.a).runOnFirstFix(new xv(this));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.wv
 * JD-Core Version:    0.6.1
 */