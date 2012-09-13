package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ty
  implements View.OnClickListener
{
  final PopupNotification a;

  ty(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(View paramView)
  {
    PopupNotification.i(this.a);
  }
}