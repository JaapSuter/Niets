package com.whatsapp;

import android.os.Handler;

class w8 extends Thread
{
  final eo a;

  w8(eo parameo)
  {
  }

  public void run()
  {
    App.b(this.a.a);
    Conversations.e(this.a.a).post(new fo(this));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.w8
 * JD-Core Version:    0.6.1
 */