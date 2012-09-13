package com.whatsapp;

import java.io.File;

class uh
  implements Thread.UncaughtExceptionHandler
{
  private static final String[] z;
  private final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();
  final App b;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = ":R[CV(TL\"F7_]RW&SV".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ":ry`o\n<lm#\fn}cw\n<{pb\034t8qf\001hqlf\003<~ko\n".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "<Y[WQ&HA\"F7_]RW&SV".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label287;
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
        m = 3;
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
        m = 111;
        continue;
        m = 28;
        continue;
        m = 24;
        continue;
        m = 2;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 3;
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
      i3 = 111;
      continue;
      i3 = 28;
      continue;
      i3 = 24;
      continue;
      i3 = 2;
    }
    label287: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 3;
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
      i7 = 111;
      continue;
      i7 = 28;
      continue;
      i7 = 24;
      continue;
      i7 = 2;
    }
  }

  uh(App paramApp)
  {
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      if ((paramThrowable instanceof SecurityException))
      {
        g5.b(z[2], paramThrowable);
        if ((paramThrowable instanceof g8))
        {
          g8 localg84 = (g8)paramThrowable;
          g5.b(localg84.getMessage(), localg84.a());
          this.a.uncaughtException(paramThread, localg84.a());
          if (!DialogToastListActivity.f);
        }
        else
        {
          localUncaughtExceptionHandler = this.a;
        }
      }
      while (true)
      {
        localUncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
        label78: return;
        g5.b(z[0], paramThrowable);
        try
        {
          App.xb().createNewFile();
          if ((paramThrowable instanceof g8))
          {
            g8 localg83 = (g8)paramThrowable;
            g5.b(localg83.getMessage(), localg83.a());
            this.a.uncaughtException(paramThread, localg83.a());
            if (!DialogToastListActivity.f)
              break label78;
          }
          localUncaughtExceptionHandler = this.a;
        }
        catch (Exception localException2)
        {
          while (true)
            g5.b(z[1], localException2);
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        Thread.UncaughtExceptionHandler localUncaughtExceptionHandler;
        if ((paramThrowable instanceof g8))
        {
          g8 localg82 = (g8)paramThrowable;
          g5.b(localg82.getMessage(), localg82.a());
          this.a.uncaughtException(paramThread, localg82.a());
          if (!DialogToastListActivity.f);
        }
        else
        {
          localUncaughtExceptionHandler = this.a;
        }
      }
    }
    finally
    {
      if ((paramThrowable instanceof g8))
      {
        g8 localg81 = (g8)paramThrowable;
        g5.b(localg81.getMessage(), localg81.a());
        this.a.uncaughtException(paramThread, localg81.a());
        if (!DialogToastListActivity.f);
      }
      else
      {
        this.a.uncaughtException(paramThread, paramThrowable);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uh
 * JD-Core Version:    0.6.1
 */