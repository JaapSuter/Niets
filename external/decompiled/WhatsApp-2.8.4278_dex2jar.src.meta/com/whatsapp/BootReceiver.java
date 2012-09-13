package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

public class BootReceiver extends BroadcastReceiver
{
  private static final String z;

  static
  {
    char[] arrayOfChar = "'kN\021i'pI\te0}".toCharArray();
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
      m = 12;
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
      m = 68;
      continue;
      m = 4;
      continue;
      m = 32;
      continue;
      m = 127;
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    App localApp;
    if (App.Mb != null)
    {
      App.c(App.Mb, 0);
      boolean bool1 = ((ConnectivityManager)App.Mb.getSystemService(z)).getBackgroundDataSetting();
      localApp = App.Mb;
      if (bool1)
        break label49;
    }
    label49: for (boolean bool2 = true; ; bool2 = false)
    {
      App.c(localApp, bool2);
      return;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.BootReceiver
 * JD-Core Version:    0.6.1
 */