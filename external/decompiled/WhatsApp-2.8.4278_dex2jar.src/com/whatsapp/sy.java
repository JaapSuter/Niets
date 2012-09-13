package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class sy
  implements View.OnClickListener
{
  final PopupNotification a;

  sy(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(View paramView)
  {
    PopupNotification.h(this.a);
  }
}