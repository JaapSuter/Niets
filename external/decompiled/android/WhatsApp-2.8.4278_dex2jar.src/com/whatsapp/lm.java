package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

class lm
  implements AbsListView.OnScrollListener
{
  final Conversation a;

  lm(Conversation paramConversation)
  {
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    Conversation.b(this.a, paramInt1);
    Conversation.b(this.a, false);
    if (paramInt1 + paramInt2 >= this.a.Pb.getCount())
    {
      Conversation.b(this.a, true);
      if (!DialogToastListActivity.f);
    }
    else
    {
      Conversation.b(this.a, false);
      this.a.Ib.setTranscriptMode(0);
    }
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt != 0)
      this.a.Ib.setFastScrollEnabled(true);
    Conversation.c(this.a, paramInt);
  }
}