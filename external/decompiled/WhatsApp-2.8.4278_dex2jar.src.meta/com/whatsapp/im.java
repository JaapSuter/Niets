package com.whatsapp;

import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.Iterator;

class im
  implements View.OnTouchListener
{
  final Conversation a;

  im(Conversation paramConversation)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = DialogToastListActivity.f;
    if ((paramMotionEvent.getAction() == 1) && (Conversation.o(this.a).size() > 0))
    {
      if (Conversation.p(this.a))
      {
        this.a.Pb.getCursor().requery();
        Conversation.c(this.a, false);
        if (!bool);
      }
      else
      {
        Iterator localIterator = Conversation.o(this.a).iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          sz localsz = (sz)localIterator.next();
          if (!localsz.b.b)
            Conversation.b(this.a, localsz);
        }
        while (!bool);
        this.a.Pb.notifyDataSetChanged();
        Conversation.q(this.a);
      }
      Conversation.o(this.a).clear();
    }
    return false;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.im
 * JD-Core Version:    0.6.1
 */