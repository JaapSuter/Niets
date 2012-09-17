package com.whatsapp;

import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

final class xh
  implements Runnable
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "IvX|vVmW".toCharArray();
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
      arrayOfChar2 = "_lCuw".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "IlFs`IvX|vVmW?rC,FuiJbGu".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label363;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "IlFs`IvX|vVmW?rC,UstZjFu".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label451;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "IlFs`IvX|vVmW?`]q[b".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label539;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 5;
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
        m = 47;
        continue;
        m = 3;
        continue;
        m = 52;
        continue;
        m = 16;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 5;
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
      i3 = 47;
      continue;
      i3 = 3;
      continue;
      i3 = 52;
      continue;
      i3 = 16;
    }
    label363: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 5;
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
      i7 = 47;
      continue;
      i7 = 3;
      continue;
      i7 = 52;
      continue;
      i7 = 16;
    }
    label451: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 5;
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
      i11 = 47;
      continue;
      i11 = 3;
      continue;
      i11 = 52;
      continue;
      i11 = 16;
    }
    label539: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 5;
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
      i15 = 47;
      continue;
      i15 = 3;
      continue;
      i15 = 52;
      continue;
      i15 = 16;
    }
  }

  public void run()
  {
    PowerManager localPowerManager = (PowerManager)App.Mb.getSystemService(z[1]);
    PowerManager.WakeLock localWakeLock = null;
    if (localPowerManager != null)
      localWakeLock = localPowerManager.newWakeLock(1, z[0]);
    if (localWakeLock != null);
    while (true)
    {
      int i;
      try
      {
        localWakeLock.acquire();
        g5.b(z[3]);
        i = tp.a(true);
        if (i == 1)
        {
          App.lc.b(true);
          App.Mb.b(System.currentTimeMillis());
          if (DialogToastListActivity.f)
          {
            break label183;
            App.lc.c(true);
          }
          else
          {
            if ((localWakeLock != null) && (localWakeLock.isHeld()))
            {
              localWakeLock.release();
              str = z[2];
              g5.b(str);
            }
            return;
          }
        }
      }
      catch (Exception localException)
      {
        g5.a(z[4], localException);
        if ((localWakeLock == null) || (!localWakeLock.isHeld()))
          continue;
        localWakeLock.release();
        String str = z[2];
        continue;
      }
      finally
      {
        if ((localWakeLock != null) && (localWakeLock.isHeld()))
        {
          localWakeLock.release();
          g5.b(z[2]);
        }
      }
      label183: if (i != 0)
        if (i != 3);
    }
  }
}