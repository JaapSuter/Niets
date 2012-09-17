package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import android.widget.HorizontalScrollView;

final class yc extends Handler
{
  private byte a = 0;
  private HorizontalScrollView b;
  final Conversation c;

  private yc(Conversation paramConversation)
  {
  }

  yc(Conversation paramConversation, vk paramvk)
  {
    this(paramConversation);
  }

  private void b()
  {
    if (this.a != 1);
    while (true)
    {
      return;
      removeMessages(2);
      int i = this.b.getScrollX();
      this.b.scrollBy(2, 0);
      if (i < this.b.getScrollX())
      {
        sendEmptyMessageDelayed(2, (int)(75.0F / j4.a(this.c).d));
        if (!DialogToastListActivity.f);
      }
      else
      {
        this.a = 0;
      }
    }
  }

  public void a()
  {
    this.b = ((HorizontalScrollView)this.c.findViewById(2131558568));
    this.b.computeScroll();
    this.b.scrollTo(0, 0);
    sendEmptyMessageDelayed(1, 2000L);
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      this.a = 1;
      this.b.scrollTo(0, 0);
      b();
      if (bool)
      {
        b();
        if (bool)
          this.b.scrollTo(0, 0);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yc
 * JD-Core Version:    0.6.1
 */