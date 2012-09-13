package com.whatsapp;

class r9 extends Thread
{
  final zq a;
  final MultipleContactPicker b;

  r9(MultipleContactPicker paramMultipleContactPicker, zq paramzq)
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
 * Qualified Name:     com.whatsapp.r9
 * JD-Core Version:    0.6.1
 */