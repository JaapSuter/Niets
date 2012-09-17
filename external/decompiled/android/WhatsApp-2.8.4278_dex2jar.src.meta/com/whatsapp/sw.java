package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class sw
  implements AbsListView.OnScrollListener
{
  final MediaGallery a;

  sw(MediaGallery paramMediaGallery)
  {
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    MediaGallery.q = paramInt;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.sw
 * JD-Core Version:    0.6.1
 */