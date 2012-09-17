package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Stack;

public class pj
{
  private static int c = -1;
  private static float d = -1.0F;
  private p8 a = null;
  private rj b = new rj(this);

  public pj()
  {
    if (c == -1)
      c = (int)App.Mb.getResources().getDimension(2131361796);
    if (d == -1.0F)
      d = j4.a(App.Mb).L;
  }

  static rj a(pj parampj)
  {
    return parampj.b;
  }

  static int b()
  {
    return c;
  }

  private void b(zq paramzq, ImageView paramImageView)
  {
    sj localsj;
    synchronized (rj.a(this.b))
    {
      this.b.a(paramImageView);
      localsj = new sj(this, paramzq, paramImageView);
    }
    synchronized (rj.a(this.b))
    {
      rj.a(this.b).add(0, localsj);
      rj.a(this.b).notifyAll();
      if (this.a == null)
      {
        this.a = new p8(this);
        this.a.setPriority(4);
        this.a.start();
      }
      return;
      localObject1 = finally;
      throw localObject1;
    }
  }

  static float c()
  {
    return d;
  }

  public void a()
  {
    if (this.a != null)
    {
      this.a.interrupt();
      this.a = null;
    }
  }

  public void a(zq paramzq, ImageView paramImageView)
  {
    String str = paramzq.f();
    if (str == null)
      paramImageView.setImageDrawable(App.Mb.getResources().getDrawable(paramzq.k()));
    while (true)
    {
      return;
      paramImageView.setTag(str);
      SoftReference localSoftReference = (SoftReference)App.wb.get(str);
      if (localSoftReference != null)
      {
        Bitmap localBitmap = (Bitmap)localSoftReference.get();
        if (localBitmap != null)
          paramImageView.setImageBitmap(localBitmap);
      }
      else
      {
        paramImageView.setImageDrawable(App.Mb.getResources().getDrawable(paramzq.k()));
        if (paramzq.n)
          b(paramzq, paramImageView);
      }
    }
  }
}