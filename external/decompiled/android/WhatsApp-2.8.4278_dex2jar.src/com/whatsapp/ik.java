package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ik
  implements View.OnClickListener
{
  final ContactPicker a;

  ik(ContactPicker paramContactPicker)
  {
  }

  public void onClick(View paramView)
  {
    this.a.onSearchRequested();
  }
}