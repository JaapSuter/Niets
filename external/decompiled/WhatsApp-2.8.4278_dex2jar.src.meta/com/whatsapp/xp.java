package com.whatsapp;

import android.os.Handler;
import java.io.File;
import java.util.HashMap;

public class xp
{
  private static boolean a;
  static File b;
  static File c;
  static boolean d;
  private static final Thread e;
  private static Thread f;
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "\004%4}H\t#2}QO74}W\024k!pW\005%$e\b\0230!nQ\005 ".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\003+.hD\00303".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\001*$nJ\t \037J\0160!Q\023".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label385;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\004%4}H\t#2}QO-.uQ\004&".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label477;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\t*)ha\"k%nW\0176".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label569;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        z = arrayOfString;
        a = false;
        d = false;
        e = new f9();
        f = null;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 37;
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
        m = 96;
        continue;
        m = 68;
        continue;
        m = 64;
        continue;
        m = 28;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 37;
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
      i3 = 96;
      continue;
      i3 = 68;
      continue;
      i3 = 64;
      continue;
      i3 = 28;
    }
    label385: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 37;
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
      i7 = 96;
      continue;
      i7 = 68;
      continue;
      i7 = 64;
      continue;
      i7 = 28;
    }
    label477: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 37;
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
      i11 = 96;
      continue;
      i11 = 68;
      continue;
      i11 = 64;
      continue;
      i11 = 28;
    }
    label569: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 37;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 96;
      continue;
      i15 = 68;
      continue;
      i15 = 64;
      continue;
      i15 = 28;
    }
  }

  public static void a()
  {
    if ((a) || (d))
    {
      g5.b(z[0]);
      if (yq.e == 0);
    }
    else
    {
      e.start();
      d = true;
    }
  }

  static boolean a(boolean paramBoolean)
  {
    a = paramBoolean;
    return paramBoolean;
  }

  public static void b()
  {
    a = true;
  }

  public static void c()
  {
    if (!a)
    {
      f = new g9();
      f.start();
    }
  }

  public static boolean d()
  {
    if (!a);
    try
    {
      e.join();
      if (f != null)
        f.join();
      return a;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        Thread.currentThread().interrupt();
    }
  }

  public static boolean e()
  {
    boolean bool = true;
    if (f != null)
      if (f.getState() != Thread.State.TERMINATED);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (e.getState() != Thread.State.TERMINATED)
        bool = false;
    }
  }

  public static boolean f()
  {
    return a;
  }

  private static boolean g()
  {
    boolean bool = true;
    try
    {
      g5.b(z[3]);
      tp.a = true;
      eu.h = true;
      eu.j = true;
      App.w.a(null);
      HashMap localHashMap = new HashMap();
      int i = App.w.e();
      tp.a(localHashMap, App.ib);
      yp.a(App.bb, localHashMap);
      App.w.a(localHashMap, null);
      App.Ib.sendEmptyMessage(1);
      localHashMap.clear();
      tp.a = false;
      App.lc.b(true);
      g.a(i);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.b(z[4], localException);
        bool = false;
      }
    }
  }

  public static void h()
  {
    int i = 0;
    int j = yq.e;
    b = App.Mb.getDir(z[1], 0);
    c = new File(App.Mb.getFilesDir(), z[2]);
    if (b.exists())
    {
      File[] arrayOfFile = b.listFiles();
      if (arrayOfFile != null)
      {
        int k = arrayOfFile.length;
        do
        {
          if (i >= k)
            break;
          arrayOfFile[i].delete();
          i++;
        }
        while (j == 0);
      }
      b.delete();
    }
    if (c.exists())
      c.delete();
  }

  public static void i()
  {
    a = false;
    d = false;
  }

  static boolean j()
  {
    return g();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xp
 * JD-Core Version:    0.6.1
 */