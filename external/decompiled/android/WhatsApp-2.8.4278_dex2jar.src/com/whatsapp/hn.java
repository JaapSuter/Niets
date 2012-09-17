package com.whatsapp;

import android.widget.ListView;

class hn
  implements Runnable
{
  final Conversation a;

  hn(Conversation paramConversation)
  {
  }

  public void run()
  {
    this.a.Ib.setFastScrollEnabled(false);
    this.a.Ib.setTranscriptMode(2);
    this.a.Pb.notifyDataSetChanged();
  }
}