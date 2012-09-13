package com.whatsapp;

import android.view.View;
import android.widget.ListView;

class en
  implements Runnable
{
  final Conversation a;

  en(Conversation paramConversation)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    int j;
    for (int i = 0; ; i = j)
      if (i < this.a.Ib.getChildCount())
      {
        View localView = this.a.Ib.getChildAt(i);
        if ((localView instanceof ze))
          ((ze)localView).c();
        j = i + 1;
        if (!bool);
      }
      else
      {
        return;
      }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.en
 * JD-Core Version:    0.6.1
 */