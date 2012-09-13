package com.whatsapp;

import android.os.Handler;

final class zh
  implements Runnable
{
  final zq a;

  zh(zq paramzq)
  {
  }

  public void run()
  {
    boolean bool1 = true;
    boolean bool2;
    if ((this.a.o == -1) && (this.a.p == -1))
    {
      bool2 = bool1;
      if ((this.a.o != 0) || (this.a.p != 0))
        break label120;
    }
    while (true)
    {
      this.a.i();
      this.a.a(-1, -1);
      App.T.b(this.a.b);
      App.U.b(this.a.b);
      if (!bool2)
        App.Jb.post(new ai(this, bool1));
      return;
      bool2 = false;
      break;
      label120: bool1 = false;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.zh
 * JD-Core Version:    0.6.1
 */