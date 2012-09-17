package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.ListView;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

class gf extends ItemizedOverlay<OverlayItem>
{
  final LocationPicker a;

  public gf(LocationPicker paramLocationPicker)
  {
    super(boundCenter(App.Mb.getResources().getDrawable(2130838553)));
    setOnFocusChangeListener(new bw(this, paramLocationPicker));
  }

  public void a()
  {
    setLastFocusedIndex(-1);
    populate();
  }

  protected OverlayItem createItem(int paramInt)
  {
    fy localfy = (fy)LocationPicker.a(this.a).get(paramInt);
    OverlayItem localOverlayItem = new OverlayItem(new GeoPoint((int)(1000000.0D * localfy.e), (int)(1000000.0D * localfy.f)), "", "");
    localOverlayItem.setMarker(boundCenter(App.Mb.getResources().getDrawable(2130838553)));
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

  protected boolean onTap(int paramInt)
  {
    LocationPicker.a(this.a, (fy)LocationPicker.a(this.a).get(paramInt));
    LocationPicker.k(this.a).notifyDataSetChanged();
    if (Build.VERSION.SDK_INT >= 8)
    {
      LocationPicker.n(this.a).smoothScrollToPosition(paramInt);
      if (!DialogToastListActivity.f);
    }
    else
    {
      LocationPicker.n(this.a).setSelection(paramInt);
    }
    return true;
  }

  public int size()
  {
    if (LocationPicker.a(this.a) == null);
    for (int i = 0; ; i = LocationPicker.a(this.a).size())
      return i;
  }
}