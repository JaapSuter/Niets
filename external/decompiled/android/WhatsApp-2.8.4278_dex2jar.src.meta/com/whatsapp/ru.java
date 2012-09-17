package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ru
  implements View.OnClickListener
{
  final GroupChatMap a;

  ru(GroupChatMap paramGroupChatMap)
  {
  }

  public void onClick(View paramView)
  {
    GoogleMapView localGoogleMapView = GroupChatMap.b(this.a);
    if (!GroupChatMap.b(this.a).isSatellite());
    for (boolean bool = true; ; bool = false)
    {
      localGoogleMapView.setSatellite(bool);
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ru
 * JD-Core Version:    0.6.1
 */