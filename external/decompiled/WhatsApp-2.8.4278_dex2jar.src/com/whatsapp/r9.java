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