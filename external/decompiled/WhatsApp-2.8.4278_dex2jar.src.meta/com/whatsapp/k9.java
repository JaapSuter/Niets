package com.whatsapp;

import java.util.Vector;

class k9 extends Thread
{
  final String a;
  final GroupChatInfo b;

  k9(GroupChatInfo paramGroupChatInfo, String paramString)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      Vector localVector = new Vector();
      localVector.add(this.a);
      App.b(new ju(this.b.i, null, localVector, 14));
      label44: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label44;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.k9
 * JD-Core Version:    0.6.1
 */