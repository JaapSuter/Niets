package com.whatsapp;

final class l8 extends Thread
{
  final zq a;

  l8(zq paramzq)
  {
  }

  public void run()
  {
    try
    {
      yp.a(App.bb, this.a, null);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.d(localException);
        App.w.f(this.a, null);
      }
    }
  }
}