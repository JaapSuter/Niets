package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Canvas;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import java.util.ArrayList;

class ff extends ItemizedOverlay<OverlayItem>
{
  final GroupChatMap a;

  public ff(GroupChatMap paramGroupChatMap)
  {
    super(boundCenter(App.Mb.getResources().getDrawable(2130838499)));
  }

  public void a()
  {
    populate();
  }

  protected OverlayItem createItem(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    sz localsz = (sz)GroupChatMap.f(this.a).get(paramInt);
    OverlayItem localOverlayItem = new OverlayItem(new GeoPoint((int)(1000000.0D * localsz.q), (int)(1000000.0D * localsz.r)), "", "");
    if (3600000L + localsz.i > System.currentTimeMillis())
    {
      localOverlayItem.setMarker(boundCenter(App.Mb.getResources().getDrawable(2130838499)));
      if (!bool);
    }
    else if (43200000L + localsz.i > System.currentTimeMillis())
    {
      localOverlayItem.setMarker(boundCenter(App.Mb.getResources().getDrawable(2130838500)));
      if (!bool);
    }
    else
    {
      localOverlayItem.setMarker(boundCenter(App.Mb.getResources().getDrawable(2130838501)));
    }
    return localOverlayItem;
  }

  public void draw(Canvas paramCanvas, MapView paramMapView, boolean paramBoolean)
  {
    if (paramBoolean);
    while (true)
    {
      return;
      super.draw(paramCanvas, paramMapView, paramBoolean);
    }
  }

  public int size()
  {
    return GroupChatMap.f(this.a).size();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ff
 * JD-Core Version:    0.6.1
 */