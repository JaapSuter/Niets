package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class zv
  implements View.OnClickListener
{
  final LocationPicker a;

  zv(LocationPicker paramLocationPicker)
  {
  }

  public void onClick(View paramView)
  {
    LocationPicker.a(this.a, false);
    LocationPicker.a(this.a, LocationPicker.e(this.a).c(), LocationPicker.e(this.a).b(), null, false);
  }
}