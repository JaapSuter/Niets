package com.whatsapp;

import android.os.Handler;
import com.whatsapp.accountsync.PerformSyncManager;
import java.util.ArrayList;

class a9 extends Thread
{
  zq a;
  final qp b;

  a9(qp paramqp, zq paramzq)
  {
    this.a = paramzq;
    setPriority(1);
  }

  public void run()
  {
    try
    {
      yp.a(App.bb, this.a, null);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(this.a);
      if ((this.a.b != null) && (!qp.a(this.b).c(this.a.b)))
        qp.a(this.b).b(localArrayList, null);
      if (this.a.k)
      {
        PerformSyncManager.a(this.a);
        App.Ib.sendEmptyMessage(1);
        Conversation.e(this.a.b);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.d(localException);
        tp.a = false;
      }
    }
    finally
    {
      tp.a = false;
      g.a(false);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a9
 * JD-Core Version:    0.6.1
 */