package com.whatsapp;

import android.os.Handler;
import android.os.Message;

final class qc extends Handler
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "\r\037Z82\f\022\034)8\021\016])#\f".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\030\bS?'_W\03482\031\bY9?_\031S$#\036\031H9".toCharArray();
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
        m = 87;
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
        m = 127;
        continue;
        m = 122;
        continue;
        m = 60;
        continue;
        m = 74;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 87;
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
      i3 = 127;
      continue;
      i3 = 122;
      continue;
      i3 = 60;
      continue;
      i3 = 74;
    }
  }

  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      App.d(z[1]);
      if (!DialogToastListActivity.f);
    }
    else
    {
      App.w.j();
      App.d(z[0]);
    }
    App.m();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qc
 * JD-Core Version:    0.6.1
 */