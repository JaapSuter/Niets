package com.whatsapp;

import android.os.Handler;
import java.util.Stack;

public class ow
{
  private static final String[] z;
  private p9 a = new p9(this);
  private Stack<sz> b = new Stack();
  public boolean c;
  private Handler d = new Handler();
  private Runnable e = new pw(this);

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "a_BMjmORKocMHHdm^\tVn_RPba_IQ".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "a_BMjmORKocMHHdm^\tWmHR".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "a_BMjmORKocMHHdm^\tWcJ".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "a_BMjmORKocMHHdm^\tU~iOC\004".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 11;
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
        m = 12;
        continue;
        m = 58;
        continue;
        m = 38;
        continue;
        m = 36;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 11;
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
      i3 = 12;
      continue;
      i3 = 58;
      continue;
      i3 = 38;
      continue;
      i3 = 36;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 11;
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
      i7 = 12;
      continue;
      i7 = 58;
      continue;
      i7 = 38;
      continue;
      i7 = 36;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 11;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 12;
      continue;
      i11 = 58;
      continue;
      i11 = 38;
      continue;
      i11 = 36;
    }
  }

  public ow()
  {
    this.a.setPriority(1);
    this.a.start();
  }

  static Stack a(ow paramow)
  {
    return paramow.b;
  }

  public void a()
  {
    g5.b(z[2]);
    this.d.removeCallbacks(this.e);
    this.a.interrupt();
    synchronized (this.b)
    {
      this.b.clear();
      return;
    }
  }

  public void a(sz paramsz)
  {
    synchronized (this.b)
    {
      g5.b(z[3] + paramsz.j);
      MediaData localMediaData = (MediaData)paramsz.t;
      localMediaData.transferring = true;
      localMediaData.progress = 0L;
      this.b.add(paramsz);
      this.c = paramsz.v;
      if (!paramsz.v)
      {
        this.b.notifyAll();
        if (!DialogToastListActivity.f);
      }
      else
      {
        c();
      }
      App.z.a(paramsz, false, -1);
      return;
    }
  }

  public void b()
  {
    g5.b(z[1]);
    this.c = false;
    this.d.removeCallbacks(this.e);
    synchronized (this.b)
    {
      this.b.notifyAll();
      return;
    }
  }

  public void c()
  {
    g5.b(z[0]);
    this.d.removeCallbacks(this.e);
    this.d.postDelayed(this.e, 15000L);
  }
}