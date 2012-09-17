package com.whatsapp;

class k8 extends Thread
{
  private static final String z;
  final mc a;

  static
  {
    char[] arrayOfChar = "*\005ooV0\017^~|7\022hbnv\017ucy\006\bi~l8\030".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 9;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 89;
      continue;
      m = 124;
      continue;
      m = 1;
      continue;
      m = 12;
    }
  }

  k8(mc parammc)
  {
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    while (true)
    {
      if (g.b > 0)
        g.b = -1 + g.b;
      try
      {
        Thread.sleep(g.a);
        label26: if (g.b > 3)
        {
          g.b = 2;
          if (!bool);
        }
        else
        {
          g.a = 5000;
        }
        if (!g.e)
          continue;
        g5.c(z);
        g.d = false;
        g.e = false;
        while (true)
        {
          return;
          g.d = false;
          if (g.e)
          {
            g5.c(z);
            g.e = false;
          }
          else if (!tp.a)
          {
            g.c = 0;
            int i = tp.a(false);
            if ((i == 0) || (i == 3))
            {
              App.lc.c(false);
              if (!bool);
            }
            else if (i == 1)
            {
              App.lc.b(false);
            }
          }
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label26;
      }
    }
  }
}