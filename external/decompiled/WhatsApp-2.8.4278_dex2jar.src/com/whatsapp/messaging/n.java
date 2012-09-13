package com.whatsapp.messaging;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.k5;
import com.whatsapp.l5;
import com.whatsapp.qz;

public class n extends HandlerThread
{
  private static final String z;
  private final Messenger a;
  private Messenger b;
  private qz c;
  private final l5 d = new l5(true);
  private final k5 e = new k5(true);
  private Handler f;
  private Handler g;
  private Handler h;
  private Handler i;
  private Handler j;
  private Handler k;
  private Handler l;
  private Handler m;
  private Handler n;
  private Handler o;
  private Handler p;
  private Handler q;
  private Handler r;
  private Handler s;
  private Handler t;
  private Handler u;
  private Handler v;
  private Handler w;
  private Handler x;
  private final v y = new w(this);

  static
  {
    char[] arrayOfChar = "me[`-a`Yu\023q".toCharArray();
    int i1 = arrayOfChar.length;
    int i2 = 0;
    if (i1 <= i2)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int i3 = arrayOfChar[i2];
    int i4;
    switch (i2 % 5)
    {
    default:
      i4 = 114;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[i2] = (char)(i4 ^ i3);
      i2++;
      break;
      i4 = 21;
      continue;
      i4 = 8;
      continue;
      i4 = 43;
      continue;
      i4 = 16;
    }
  }

  public n(Messenger paramMessenger)
  {
    super(z);
    this.a = paramMessenger;
  }

  static qz a(n paramn)
  {
    return paramn.c;
  }

  private void a()
  {
    this.d.a();
    this.e.a();
  }

  private void a(Message paramMessage)
  {
    a();
    paramMessage.getTarget().sendMessageAtFrontOfQueue(Message.obtain(paramMessage));
    f.a(this.a, this.c);
  }

  static void a(n paramn, Message paramMessage)
  {
    paramn.a(paramMessage);
  }

  static void a(n paramn, qz paramqz)
  {
    paramn.a(paramqz);
  }

  private void a(qz paramqz)
  {
    this.c = paramqz;
    this.d.b();
    this.e.b();
  }

  static Messenger b(n paramn)
  {
    return paramn.a;
  }

  private void b(Message paramMessage)
  {
    s.a(this.y, paramMessage);
  }

  static void b(n paramn, Message paramMessage)
  {
    paramn.b(paramMessage);
  }

  static void c(n paramn)
  {
    paramn.a();
  }

  static Handler d(n paramn)
  {
    return paramn.f;
  }

  static Handler e(n paramn)
  {
    return paramn.n;
  }

  static Handler f(n paramn)
  {
    return paramn.p;
  }

  static Handler g(n paramn)
  {
    return paramn.g;
  }

  static Handler h(n paramn)
  {
    return paramn.h;
  }

  static Handler i(n paramn)
  {
    return paramn.q;
  }

  static Handler j(n paramn)
  {
    return paramn.r;
  }

  static Handler k(n paramn)
  {
    return paramn.o;
  }

  static Handler l(n paramn)
  {
    return paramn.i;
  }

  static Handler m(n paramn)
  {
    return paramn.j;
  }

  static Handler n(n paramn)
  {
    return paramn.k;
  }

  static Handler o(n paramn)
  {
    return paramn.l;
  }

  static Handler p(n paramn)
  {
    return paramn.s;
  }

  static Handler q(n paramn)
  {
    return paramn.t;
  }

  static Handler r(n paramn)
  {
    return paramn.u;
  }

  static Handler s(n paramn)
  {
    return paramn.v;
  }

  static Handler t(n paramn)
  {
    return paramn.w;
  }

  static Handler u(n paramn)
  {
    return paramn.m;
  }

  static Handler v(n paramn)
  {
    return paramn.x;
  }

  protected void onLooperPrepared()
  {
    l locall1 = new l(this, this.d);
    this.w = locall1;
    this.m = locall1;
    this.l = locall1;
    this.k = locall1;
    this.j = locall1;
    this.i = locall1;
    this.h = locall1;
    this.g = locall1;
    this.f = locall1;
    l locall2 = new l(this, this.e);
    this.x = locall2;
    this.v = locall2;
    this.u = locall2;
    this.t = locall2;
    this.s = locall2;
    this.r = locall2;
    this.q = locall2;
    this.p = locall2;
    this.o = locall2;
    this.n = locall2;
    this.b = new Messenger(new k(this));
    f.a(this.a, this.b);
  }
}