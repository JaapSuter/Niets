package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

class rw
  implements View.OnClickListener
{
  final MediaGallery a;

  rw(MediaGallery paramMediaGallery)
  {
  }

  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    int j = MediaGallery.a(this.a).size();
    Iterator localIterator = MediaGallery.a(this.a).iterator();
    int k = j;
    sz localsz2;
    do
    {
      if (!localIterator.hasNext())
        break;
      localsz2 = (sz)localIterator.next();
      k--;
    }
    while (localsz2.b.hashCode() != i);
    for (sz localsz1 = localsz2; ; localsz1 = null)
    {
      MediaData localMediaData = (MediaData)localsz1.t;
      if (localMediaData.file == null)
        localMediaData.file = App.a(localsz1);
      this.a.startActivity(MediaView.a(localsz1, MediaGallery.b(this.a), this.a));
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rw
 * JD-Core Version:    0.6.1
 */