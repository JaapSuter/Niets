package com.whatsapp;

import android.app.Activity;
import android.os.Handler;
import java.util.ArrayList;

final class t8 extends Thread
{
  final zq a;
  final boolean b;
  final Handler c;
  final Activity d;
  final int e;
  final int f;

  t8(zq paramzq, boolean paramBoolean, Handler paramHandler, Activity paramActivity, int paramInt1, int paramInt2)
  {
  }

  public void run()
  {
    ArrayList localArrayList = App.z.a(this.a.b, this.b);
    this.c.post(new kn(this, localArrayList));
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.t8
 * JD-Core Version:    0.6.1
 */