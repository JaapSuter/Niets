package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xx
  implements View.OnClickListener
{
  final OverlayAlert a;

  xx(OverlayAlert paramOverlayAlert)
  {
  }

  public void onClick(View paramView)
  {
    this.a.finish();
  }
}