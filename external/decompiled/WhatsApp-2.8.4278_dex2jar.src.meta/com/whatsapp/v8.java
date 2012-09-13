package com.whatsapp;

import android.os.Handler;

class v8 extends Thread
{
  final bo a;

  v8(bo parambo)
  {
  }

  public void run()
  {
    App.a(this.a.a);
    Conversations.e(this.a.a).post(new co(this));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v8
 * JD-Core Version:    0.6.1
 */