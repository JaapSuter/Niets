package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

class ky
  implements Runnable
{
  final PopupNotification a;

  ky(PopupNotification paramPopupNotification)
  {
  }

  public void run()
  {
    View localView = PopupNotification.b(this.a).getChildAt(PopupNotification.a(this.a, 0));
    if (App.ub());
    for (int i = 1; ; i = -1)
    {
      TranslateAnimation localTranslateAnimation = new TranslateAnimation(i * -localView.getWidth() / 2, 0.0F, 0.0F, 0.0F);
      localTranslateAnimation.setDuration(PopupNotification.j());
      localTranslateAnimation.setFillAfter(true);
      localView.startAnimation(localTranslateAnimation);
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ky
 * JD-Core Version:    0.6.1
 */