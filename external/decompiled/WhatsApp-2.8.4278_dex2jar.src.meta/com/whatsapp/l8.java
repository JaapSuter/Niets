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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.l8
 * JD-Core Version:    0.6.1
 */