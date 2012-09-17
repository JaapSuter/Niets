package com.whatsapp;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

class gn
  implements View.OnClickListener
{
  final Conversation a;

  gn(Conversation paramConversation)
  {
  }

  public void onClick(View paramView)
  {
    this.a.Ib.setTranscriptMode(2);
    this.a.Ib.setFastScrollEnabled(false);
    Conversation.l(this.a).sendEmptyMessageDelayed(0, 1000L);
    if (Conversation.m(this.a).a())
    {
      this.a.V.setVisibility(8);
      this.a.U = false;
    }
  }
}