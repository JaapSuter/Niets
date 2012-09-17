package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.Stack;

class p8 extends Thread
{
  final pj a;

  p8(pj parampj)
  {
  }

  public void run()
  {
    try
    {
      if (rj.a(pj.a(this.a)).size() == 0);
      synchronized (rj.a(pj.a(this.a)))
      {
        rj.a(pj.a(this.a)).wait();
        if (rj.a(pj.a(this.a)).size() == 0);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      synchronized (rj.a(pj.a(this.a)))
      {
        boolean bool;
        do
        {
          sj localsj = (sj)rj.a(pj.a(this.a)).pop();
          Bitmap localBitmap = localsj.a.a(pj.b(), pj.c(), true);
          if (localsj.b.getTag().equals(localsj.a.f()))
          {
            qj localqj = new qj(this.a, localBitmap, localsj.b, localsj.a.f());
            ((Activity)localsj.b.getContext()).runOnUiThread(localqj);
          }
          bool = Thread.interrupted();
        }
        while (!bool);
        return;
        localObject2 = finally;
        throw localObject2;
        localInterruptedException = localInterruptedException;
      }
    }
  }
}