package com.whatsapp;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.ItemizedOverlay.OnFocusChangeListener;
import com.google.android.maps.OverlayItem;

class bw
  implements ItemizedOverlay.OnFocusChangeListener
{
  final LocationPicker a;
  final gf b;

  bw(gf paramgf, LocationPicker paramLocationPicker)
  {
  }

  public void onFocusChanged(ItemizedOverlay paramItemizedOverlay, OverlayItem paramOverlayItem)
  {
    if (paramOverlayItem == null)
    {
      LocationPicker.a(this.b.a, null);
      LocationPicker.k(this.b.a).notifyDataSetChanged();
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bw
 * JD-Core Version:    0.6.1
 */