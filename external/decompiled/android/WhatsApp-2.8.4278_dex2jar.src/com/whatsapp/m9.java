package com.whatsapp;

import java.util.Vector;

class m9 extends Thread
{
  final zq a;
  final vt b;

  m9(vt paramvt, zq paramzq)
  {
  }

  public void run()
  {
    try
    {
      Thread.sleep(300L);
      Vector localVector = new Vector();
      localVector.add(this.a.b);
      App.b(new ju(this.b.a.i, null, localVector, 14));
      label50: return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label50;
    }
  }
}