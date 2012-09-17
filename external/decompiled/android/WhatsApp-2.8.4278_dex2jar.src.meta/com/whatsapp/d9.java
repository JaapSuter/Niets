package com.whatsapp;

import java.util.ArrayList;
import java.util.HashMap;

final class d9 extends Thread
{
  private static final String[] z;
  final HashMap a;
  final HashMap b;
  final vp c;
  final ArrayList d;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "h0-\030".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "p,&\013\rp,&\013co9g\003Gf%\027\004Kp!".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "p,&\013\re4!\004Wq0g\tNoz-\020Kp!".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
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
        m = 34;
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
        m = 3;
        continue;
        m = 85;
        continue;
        m = 72;
        continue;
        m = 104;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 34;
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
      i3 = 3;
      continue;
      i3 = 85;
      continue;
      i3 = 72;
      continue;
      i3 = 104;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 34;
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
      i7 = 3;
      continue;
      i7 = 85;
      continue;
      i7 = 72;
      continue;
      i7 = 104;
    }
  }

  d9(HashMap paramHashMap1, HashMap paramHashMap2, vp paramvp, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    boolean bool = true;
    try
    {
      zq.a(this.a.values(), z[1], z[0]);
      App.Me localMe = App.bb;
      HashMap localHashMap = this.b;
      vp localvp = this.c;
      if (this.d.size() == 0);
      while (true)
      {
        yp.a(localMe, localHashMap, localvp, bool);
        return;
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        g5.b(z[2], localException);
        if (this.c != null)
          this.c.a();
        tp.b(false);
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.d9
 * JD-Core Version:    0.6.1
 */