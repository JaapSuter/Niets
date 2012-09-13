package com.whatsapp;

class n8 extends Thread
{
  final zq a;
  final BlockList b;

  n8(BlockList paramBlockList, zq paramzq)
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