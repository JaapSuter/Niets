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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qy
 * JD-Core Version:    0.6.1
 */