package com.whatsapp;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Timer;

public class j2
  implements wz, Runnable
{
  public static HashMap<String, j2> a;
  public static Handler b;
  private static Timer c;
  static ArrayList<k2> m;
  private static final String[] z;
  public String d;
  public Activity e;
  public int f;
  public Long g;
  public boolean h = false;
  public boolean i = false;
  public boolean j = false;
  public Hashtable<String, String> k;
  private gab l;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "\nL6~#\fE\007i4\034\\=h%2O9r=\bMx!q".toCharArray();
    int n = arrayOfChar1.length;
    int i1 = 0;
    char[] arrayOfChar2;
    int i5;
    char[] arrayOfChar3;
    int i9;
    if (n <= i1)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "MUx".toCharArray();
      int i4 = arrayOfChar2.length;
      i5 = 0;
      if (i4 <= i5)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\nL6~#\fE\007i4\034\\=h%2Z-x2\bZ+4".toCharArray();
        int i8 = arrayOfChar3.length;
        i9 = 0;
        if (i8 > i9)
          break label329;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        a = new HashMap();
        b = new rd();
        c = new Timer();
        m = new ArrayList();
      }
    }
    else
    {
      int i2 = arrayOfChar1[i1];
      int i3;
      switch (i1 % 5)
      {
      default:
        i3 = 81;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i1] = (char)(i3 ^ i2);
        i1++;
        break;
        i3 = 109;
        continue;
        i3 = 41;
        continue;
        i3 = 88;
        continue;
        i3 = 27;
      }
    }
    int i6 = arrayOfChar2[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 81;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 109;
      continue;
      i7 = 41;
      continue;
      i7 = 88;
      continue;
      i7 = 27;
    }
    label329: int i10 = arrayOfChar3[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 81;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 109;
      continue;
      i11 = 41;
      continue;
      i11 = 88;
      continue;
      i11 = 27;
    }
  }

  public j2(Activity paramActivity, String paramString, int paramInt, Hashtable<String, String> paramHashtable, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramActivity;
    this.f = paramInt;
    this.h = paramBoolean;
    this.k = paramHashtable;
    if (paramString == null)
    {
      this.g = Long.valueOf(System.currentTimeMillis());
      a.put("" + this.g, this);
      if (!DialogToastListActivity.f);
    }
    else
    {
      a.put(paramString, this);
    }
    if (paramInt == 3)
    {
      this.l = new gab(this);
      c.schedule(this.l, 20000L);
    }
  }

  private void a()
  {
    if (this.d == null);
    for (j2 localj2 = (j2)a.remove(this.g); ; localj2 = (j2)a.remove(this.d))
    {
      if (localj2 != null)
        localj2.l.cancel();
      return;
    }
  }

  static void a(j2 paramj2)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = m.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((k2)localIterator.next()).a(paramj2);
    }
    while (!bool);
  }

  static void a(k2 paramk2)
  {
    m.add(paramk2);
  }

  static void b(k2 paramk2)
  {
    m.remove(paramk2);
  }

  public void a(int paramInt)
  {
    g5.b(z[0] + paramInt + z[1] + this.d + z[1] + this.f);
    switch (this.f)
    {
    default:
    case 3:
    }
    while (true)
    {
      Message localMessage = b.obtainMessage(0, this);
      b.sendMessage(localMessage);
      a();
      return;
      if ((this.e != null) && (!this.e.isFinishing()))
        this.e.removeDialog(107);
    }
  }

  public void run()
  {
    g5.b(z[2] + this.f);
    this.j = true;
    if ((this.e != null) && (!this.e.isFinishing()))
      this.e.removeDialog(107);
    if (this.f == 3)
      if (this.h)
      {
        App.yb.put(this.d, this.d);
        if (!DialogToastListActivity.f);
      }
      else
      {
        App.yb.remove(this.d);
      }
    Message localMessage = b.obtainMessage(0, this);
    b.sendMessage(localMessage);
    a();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j2
 * JD-Core Version:    0.6.1
 */