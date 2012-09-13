package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.Vector;

class dab extends TimerTask
{
  private static final String z;
  ju a;

  static
  {
    char[] arrayOfChar = "\017\027��9$\005\002\035c3\032\n\032<\013\032��\03691\033\021@8=\005����9 G\021\026<1R".toCharArray();
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
      m = 84;
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
      m = 104;
      continue;
      m = 101;
      continue;
      m = 111;
      continue;
      m = 76;
    }
  }

  public dab(ju paramju)
  {
    this.a = paramju;
  }

  public void run()
  {
    boolean bool = DialogToastListActivity.f;
    g5.b(z + this.a.e);
    if (this.a.h)
      return;
    this.a.g = true;
    switch (this.a.e)
    {
    default:
    case 14:
    case 34:
    case 16:
    }
    while (true)
    {
      eu.p.remove(this.a.b);
      break;
      Iterator localIterator = this.a.d.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        String str = (String)localIterator.next();
        eu.b(this.a.b, str);
      }
      while (!bool);
      Message localMessage3 = eu.o.obtainMessage(10, this.a.b);
      eu.o.sendMessage(localMessage3);
      if (bool)
      {
        Message localMessage2 = eu.o.obtainMessage(14, this.a.b);
        eu.o.sendMessage(localMessage2);
        if (bool)
        {
          if (Conversations.a())
            Conversations.b().a(this.a.b, false);
          Message localMessage1 = eu.o.obtainMessage(9, this.a.b);
          eu.o.sendMessage(localMessage1);
        }
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.dab
 * JD-Core Version:    0.6.1
 */