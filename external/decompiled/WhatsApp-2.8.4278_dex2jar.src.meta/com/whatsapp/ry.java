package com.whatsapp;

import android.content.Intent;
import android.media.AsyncPlayer;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;

class ry
  implements View.OnClickListener
{
  final PopupNotification a;

  ry(PopupNotification paramPopupNotification)
  {
  }

  public void onClick(View paramView)
  {
    App.oc.stop();
    Intent localIntent = Conversation.a(gp.a(PopupNotification.c(this.a).b.a));
    String str = PopupNotification.g(this.a).getText().toString().trim();
    if ((PopupNotification.e(this.a) != null) && (str.length() > 0))
      Conversation.m.put(PopupNotification.e(this.a).b, str);
    this.a.startActivity(localIntent);
    this.a.finish();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ry
 * JD-Core Version:    0.6.1
 */