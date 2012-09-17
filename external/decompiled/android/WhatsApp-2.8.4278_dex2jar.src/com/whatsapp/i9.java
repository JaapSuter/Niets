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