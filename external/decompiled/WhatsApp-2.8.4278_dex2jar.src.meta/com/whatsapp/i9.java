package com.whatsapp;

import android.os.Handler;
import android.os.Looper;

class i9 extends Thread
{
  public Handler a;
  final fq b;

  public i9(fq paramfq, String paramString)
  {
    super(paramString);
  }

  public void run()
  {
    Looper.prepare();
    this.a = new cd(this);
    Looper.loop();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.i9
 * JD-Core Version:    0.6.1
 */