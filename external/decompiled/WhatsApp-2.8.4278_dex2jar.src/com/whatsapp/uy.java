package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashSet;

class uy
  implements View.OnClickListener
{
  final PopupNotification a;

  uy(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(View paramView)
  {
    this.a.findViewById(2131558575).setVisibility(0);
    App.mb();
    if (PopupNotification.c(this.a) != null)
      PopupNotification.d(this.a).add(PopupNotification.c(this.a).b);
    if (PopupNotification.e(this.a) != null)
      PopupNotification.f(this.a).add(PopupNotification.e(this.a).b);
  }
}