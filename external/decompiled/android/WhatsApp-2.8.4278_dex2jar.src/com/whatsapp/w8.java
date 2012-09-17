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