package com.whatsapp;

import android.os.Handler;
import com.whatsapp.accountsync.PerformSyncManager;

class b9 extends Thread
{
  zq a;
  final qp b;

  b9(qp paramqp, zq paramzq)
  {
    this.a = paramzq;
    setPriority(1);
  }

  public void run()
  {
    try
    {
      yp.a(App.bb, this.a, null);
      PerformSyncManager.a(this.a);
      App.Ib.sendEmptyMessage(1);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g5.d(localException);
    }
    finally
    {
      tp.a = false;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.b9
 * JD-Core Version:    0.6.1
 */