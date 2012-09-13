package com.whatsapp;

import java.io.IOException;
import java.util.Vector;

class h0 extends xz
{
  final Runnable a;
  final wz b;
  final qz c;

  h0(qz paramqz, Runnable paramRunnable, wz paramwz)
  {
  }

  public void a(int paramInt)
  {
    if (this.b != null)
      this.b.a(paramInt);
  }

  public void a(c1 paramc1, String paramString)
    throws bg, IOException
  {
    Vector localVector = new Vector();
    qz.a(this.c, paramc1, localVector);
    this.c.k.b(localVector);
    if (this.a != null)
      this.a.run();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.h0
 * JD-Core Version:    0.6.1
 */