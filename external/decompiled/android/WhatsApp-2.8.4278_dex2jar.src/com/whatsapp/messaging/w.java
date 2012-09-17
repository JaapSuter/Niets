package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.g5;
import com.whatsapp.gz;
import com.whatsapp.hz;
import com.whatsapp.j2;
import com.whatsapp.ju;
import com.whatsapp.qw;
import com.whatsapp.sz;
import com.whatsapp.vw;

class w extends v
{
  private static final String[] z;
  final n a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "ScK3\020\\|R7ZY!H&QO!W*L_kU&M\004mI&^_k\\1P^~X+^_".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "ScK3\020\\|R7ZY!H&QO!W*L_kU&M\004o_'OJ|O*\\B~Z-KX".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "ScK3\020\\|R7ZY!H&QO!W*L_kU&M\004|^.P]kK\"M_gX*OJ`O0".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 63;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 43;
        continue;
        m = 14;
        continue;
        m = 59;
        continue;
        m = 67;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 43;
      continue;
      i3 = 14;
      continue;
      i3 = 59;
      continue;
      i3 = 67;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 43;
      continue;
      i7 = 14;
      continue;
      i7 = 59;
      continue;
      i7 = 67;
    }
  }

  w(n paramn)
  {
  }

  public void a()
  {
    n.d(this.a).sendEmptyMessage(0);
  }

  protected void a(gz paramgz)
  {
    n.g(this.a).obtainMessage(28, paramgz).sendToTarget();
  }

  protected void a(hz paramhz)
  {
    n.g(this.a).obtainMessage(27, paramhz).sendToTarget();
  }

  public void a(j2 paramj2)
  {
    n.g(this.a).obtainMessage(3, paramj2).sendToTarget();
  }

  public void a(ju paramju)
  {
    g5.d(z[0]);
    n.u(this.a).obtainMessage(13, paramju).sendToTarget();
  }

  public void a(qw paramqw)
  {
    n.l(this.a).obtainMessage(36, paramqw).sendToTarget();
  }

  public void a(sz paramsz)
  {
    n.k(this.a).obtainMessage(7, paramsz).sendToTarget();
  }

  public void a(vw paramvw)
  {
    n.l(this.a).obtainMessage(35, paramvw).sendToTarget();
  }

  public void a(String paramString)
  {
    n.e(this.a).obtainMessage(1, paramString).sendToTarget();
  }

  protected void a(String[] paramArrayOfString)
  {
    n.g(this.a).obtainMessage(29, paramArrayOfString).sendToTarget();
  }

  public void b()
  {
    n.p(this.a).sendEmptyMessage(11);
  }

  public void b(ju paramju)
  {
    g5.d(z[1]);
    n.u(this.a).obtainMessage(14, paramju).sendToTarget();
  }

  public void b(sz paramsz)
  {
    n.l(this.a).obtainMessage(8, paramsz).sendToTarget();
  }

  public void b(String paramString)
  {
    n.f(this.a).obtainMessage(2, paramString).sendToTarget();
  }

  public void c()
  {
    n.q(this.a).sendEmptyMessage(24);
  }

  public void c(ju paramju)
  {
    g5.d(z[2]);
    n.u(this.a).obtainMessage(34, paramju).sendToTarget();
  }

  protected void c(sz paramsz)
  {
    n.l(this.a).obtainMessage(31, paramsz).sendToTarget();
  }

  public void c(String paramString)
  {
    n.h(this.a).obtainMessage(4, paramString).sendToTarget();
  }

  public void d()
  {
    n.r(this.a).sendEmptyMessage(25);
  }

  public void d(ju paramju)
  {
    n.u(this.a).obtainMessage(16, paramju).sendToTarget();
  }

  protected void d(sz paramsz)
  {
    n.l(this.a).obtainMessage(32, paramsz).sendToTarget();
  }

  public void d(String paramString)
  {
    n.i(this.a).obtainMessage(5, paramString).sendToTarget();
  }

  public void e()
  {
    n.s(this.a).sendEmptyMessage(26);
  }

  public void e(String paramString)
  {
    n.j(this.a).obtainMessage(6, paramString).sendToTarget();
  }

  public void f()
  {
    n.t(this.a).sendEmptyMessage(30);
  }

  public void f(String paramString)
  {
    n.m(this.a).obtainMessage(9, paramString).sendToTarget();
  }

  public void g()
  {
    n.u(this.a).obtainMessage(20).sendToTarget();
  }

  public void g(String paramString)
  {
    n.n(this.a).obtainMessage(10, paramString).sendToTarget();
  }

  public void h()
  {
    n.u(this.a).obtainMessage(21).sendToTarget();
  }

  public void h(String paramString)
  {
    n.o(this.a).obtainMessage(12, paramString).sendToTarget();
  }

  public void i()
  {
    n.u(this.a).obtainMessage(23).sendToTarget();
  }

  public void i(String paramString)
  {
    n.u(this.a).obtainMessage(15, paramString).sendToTarget();
  }

  public void j(String paramString)
  {
    n.u(this.a).obtainMessage(17, paramString).sendToTarget();
  }

  public void k(String paramString)
  {
    n.u(this.a).obtainMessage(18, paramString).sendToTarget();
  }

  public void l(String paramString)
  {
    n.u(this.a).obtainMessage(19, paramString).sendToTarget();
  }

  public void m(String paramString)
  {
    n.u(this.a).obtainMessage(22, paramString).sendToTarget();
  }

  public void n(String paramString)
  {
    n.v(this.a).obtainMessage(33, paramString).sendToTarget();
  }
}