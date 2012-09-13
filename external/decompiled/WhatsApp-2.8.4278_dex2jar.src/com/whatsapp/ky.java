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