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