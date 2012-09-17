package com.whatsapp;

import android.os.AsyncTask;

class v extends AsyncTask<Void, Void, Void>
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "PWP\007{ACA\\k_HTAh\036BRZaC\007".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "PWP\007{ACA\\k_HTAhH\bRMhCBS@!TURG|".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
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
        m = 14;
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
        m = 49;
        continue;
        m = 39;
        continue;
        m = 32;
        continue;
        m = 40;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 14;
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
      i3 = 49;
      continue;
      i3 = 39;
      continue;
      i3 = 32;
      continue;
      i3 = 40;
    }
  }

  v(App paramApp)
  {
  }

  protected Void a(Void[] paramArrayOfVoid)
  {
    try
    {
      App.w.a(gp.a);
      return null;
    }
    catch (Exception localException)
    {
      while (true)
        g5.c(z[0] + localException.toString());
    }
  }

  protected void a(Void paramVoid)
  {
    try
    {
      App.a(true, true, true);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g5.a(z[1], localException);
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v
 * JD-Core Version:    0.6.1
 */