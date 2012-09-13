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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ty
 * JD-Core Version:    0.6.1
 */