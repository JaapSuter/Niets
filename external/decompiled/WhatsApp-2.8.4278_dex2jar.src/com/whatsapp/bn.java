package com.whatsapp;

import android.widget.ListView;

class bn
  implements Runnable
{
  final int a;
  final Conversation b;

  bn(Conversation paramConversation, int paramInt)
  {
  }

  public void run()
  {
    this.b.Ib.setTranscriptMode(0);
    int i = ue.a(this.b.Pb);
    if (Conversation.r(this.b) != null)
      i++;
    this.b.Ib.setSelectionFromTop(i, this.a);
    Conversation.l(this.b, false);
    Conversation.m(this.b, false);
  }
}