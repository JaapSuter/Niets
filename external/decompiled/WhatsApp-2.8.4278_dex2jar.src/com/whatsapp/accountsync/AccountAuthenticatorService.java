package com.whatsapp.accountsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends Service
{
  private static a a;
  private static final String z;

  static
  {
    char[] arrayOfChar = "OFt5gGL>&kMGe)|]\006Q$kA]~3I[\\x\"fZAs&|AZ".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      a = null;
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 8;
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
      m = 46;
      continue;
      m = 40;
      continue;
      m = 16;
      continue;
      m = 71;
    }
  }

  private a a()
  {
    if (a == null)
      a = new a(this);
    return a;
  }

  public IBinder onBind(Intent paramIntent)
  {
    IBinder localIBinder = null;
    if (paramIntent.getAction().equals(z))
      localIBinder = a().getIBinder();
    return localIBinder;
  }
}