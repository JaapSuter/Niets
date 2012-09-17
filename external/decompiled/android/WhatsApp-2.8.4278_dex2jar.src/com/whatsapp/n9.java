package com.whatsapp;

import android.os.Handler;

class n9 extends Thread
{
  Handler a;

  n9(Handler paramHandler)
  {
    this.a = paramHandler;
  }

  public void run()
  {
    try
    {
      yp.a(App.bb);
      this.a.sendEmptyMessage(1);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        this.a.sendEmptyMessage(0);
    }
  }
}