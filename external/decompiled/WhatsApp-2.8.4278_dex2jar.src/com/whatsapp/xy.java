package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class xy
  implements View.OnClickListener
{
  final PopupNotification a;

  xy(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(View paramView)
  {
    PopupNotification.j(this.a);
  }
}