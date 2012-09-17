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