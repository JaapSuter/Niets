package com.whatsapp;

import android.media.AsyncPlayer;
import android.view.View;
import android.view.View.OnClickListener;

class qy
  implements View.OnClickListener
{
  final PopupNotification a;

  qy(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(View paramView)
  {
    App.oc.stop();
    this.a.finish();
  }
}