package com.whatsapp;

import android.os.Handler;

final class di
  implements Runnable
{
  final zq a;
  final int b;

  di(zq paramzq, int paramInt)
  {
  }

  public void run()
  {
    int i = 0;
    int j;
    if (this.a.o != this.b)
    {
      j = 0;
      if (this.a.p == this.b)
        break label96;
    }
    while (true)
    {
      this.a.a(j, i);
      App.T.b(this.a.b);
      App.U.b(this.a.b);
      App.Jb.post(new ei(this));
      return;
      j = this.a.o;
      break;
      label96: i = this.a.p;
    }
  }
}