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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hn
 * JD-Core Version:    0.6.1
 */