package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;

public class hz extends gz
  implements wz, d1
{
  private static HashMap<String, hz> j;
  public static Handler l;
  private static final String[] z;
  public boolean f = false;
  private boolean g = false;
  private Long h = Long.valueOf(System.currentTimeMillis());
  private fab i;
  public boolean k;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "*u2\032V6b-\024P.h5\035Q>k8\016\020(b,\tZ)s}\032^3k8\030\037`'".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    if (m <= n)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "z{}".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "*u2\032V6b-\024P.h5\035Q>k8\016\020(b,\tZ)s}\017J9d8\017Lz=}".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label309;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        j = new HashMap();
        l = new nd();
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 63;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 90;
        continue;
        i2 = 7;
        continue;
        i2 = 93;
        continue;
        i2 = 124;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 90;
      continue;
      i6 = 7;
      continue;
      i6 = 93;
      continue;
      i6 = 124;
    }
    label309: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 63;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 90;
      continue;
      i10 = 7;
      continue;
      i10 = 93;
      continue;
      i10 = 124;
    }
  }

  public hz(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    super(paramString, paramArrayOfByte1, paramArrayOfByte2, 0);
    j.put(this.h.toString(), this);
    this.i = new fab(this);
    new Timer().schedule(this.i, 20000L);
  }

  static HashMap a()
  {
    return j;
  }

  static boolean a(hz paramhz)
  {
    return paramhz.g;
  }

  public static boolean a(String paramString)
  {
    boolean bool1 = DialogToastListActivity.f;
    boolean bool2;
    if (paramString == null)
      bool2 = false;
    while (true)
    {
      return bool2;
      Iterator localIterator = j.values().iterator();
      do
      {
        if (!localIterator.hasNext())
          break label61;
        if (paramString.equals(((hz)localIterator.next()).a))
        {
          bool2 = true;
          break;
        }
      }
      while (!bool1);
      label61: bool2 = false;
    }
  }

  static Long b(hz paramhz)
  {
    return paramhz.h;
  }

  public void a(int paramInt)
  {
    g5.b(z[0] + paramInt + z[1] + this.a);
    this.g = true;
    this.i.cancel();
    j.remove(this.h.toString());
    if (!this.k)
      l.obtainMessage(2, paramInt, 0, this.a).sendToTarget();
  }

  public void a(String paramString)
  {
    g5.b(z[2] + paramString + z[1] + this.a);
    this.g = true;
    this.i.cancel();
    j.remove(this.h.toString());
    zq localzq = App.w.a(this.a, null);
    int n;
    if (localzq != null)
    {
      if (paramString != null)
        break label167;
      n = -1;
    }
    try
    {
      while (true)
      {
        localzq.a(n, n);
        label102: if (!this.k)
        {
          if ((this.b == null) && (this.c == null))
          {
            localzq.i();
            if (!DialogToastListActivity.f);
          }
          else
          {
            localzq.a(this.b, this.c);
          }
          localzq.j();
          l.obtainMessage(1, this.a).sendToTarget();
        }
        return;
        label167: int m = Integer.parseInt(paramString);
        n = m;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      break label102;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.hz
 * JD-Core Version:    0.6.1
 */