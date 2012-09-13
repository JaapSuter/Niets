package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class vv
  implements AdapterView.OnItemClickListener
{
  final LocationPicker a;

  vv(LocationPicker paramLocationPicker)
  {
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((LocationPicker.a(this.a) == null) || (paramInt >= LocationPicker.a(this.a).size()));
    while (true)
    {
      return;
      App.a(this.a, LocationPicker.g(this.a), (fy)LocationPicker.a(this.a).get(paramInt));
      this.a.finish();
    }
  }
}