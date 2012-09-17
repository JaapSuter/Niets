package com.whatsapp;

class q8 extends Thread
{
  final zq a;
  final ContactPicker b;

  q8(ContactPicker paramContactPicker, zq paramzq)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      App.a(this.b, false, this.a.b);
      label21: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label21;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.q8
 * JD-Core Version:    0.6.1
 */