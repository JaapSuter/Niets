package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class yv
  implements View.OnClickListener
{
  final LocationPicker a;

  yv(LocationPicker paramLocationPicker)
  {
  }

  public void onClick(View paramView)
  {
    this.a.onSearchRequested();
  }
}