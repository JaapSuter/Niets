package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.whatsapp.messaging.MessageService;

class App$15 extends BroadcastReceiver
{
  private static final String[] z;
  final App a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "u\021A\b9t[U��9z\023E\016/\020\032\005;e\025\030\0044p\026[\004>1".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "r\033ZO=~\033P\r??\004E\0169t\007DO=p\004G\022".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "u\021A\b9t[P\0025[Y\016.<\022X\0244u".toCharArray();
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
        m = 90;
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
        m = 17;
        continue;
        m = 116;
        continue;
        m = 55;
        continue;
        m = 97;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 90;
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
      i3 = 17;
      continue;
      i3 = 116;
      continue;
      i3 = 55;
      continue;
      i3 = 97;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 90;
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
      i7 = 17;
      continue;
      i7 = 116;
      continue;
      i7 = 55;
      continue;
      i7 = 97;
    }
  }

  App$15(App paramApp)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Thread localThread = new Thread(new sh(this));
    localThread.setPriority(1);
    localThread.start();
    if (App.Ab())
      new w(null).execute(new Void[0]);
    boolean bool = App.eb.getBackgroundDataSetting();
    g5.b(z[0] + bool);
    if (!bool)
    {
      App.c(paramContext, true);
      App.p(paramContext);
      App.s(z[1]);
      if (!DialogToastListActivity.f);
    }
    else if (!MessageService.C())
    {
      g5.b(z[2]);
      App.p(paramContext);
    }
    if ((App.bb != null) && (App.c(this.a) == 3) && ((App.Mb.hb() < 0L) || (System.currentTimeMillis() - App.Mb.hb() >= 42600000L)))
      App.Bb();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.15
 * JD-Core Version:    0.6.1
 */