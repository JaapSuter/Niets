package com.whatsapp;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Handler;
import android.os.Message;

class cd extends Handler
{
  final i9 a;

  cd(i9 parami9)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool1 = false;
    int i = yq.e;
    sz localsz = null;
    if ((paramMessage.what != 5) && (paramMessage.what != 6) && (paramMessage.what != 7) && (paramMessage.what != 8))
      localsz = (sz)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 3:
    case 2:
    case 4:
    case 9:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      return;
      try
      {
        if (paramMessage.arg1 == 5);
        for (boolean bool2 = true; ; bool2 = false)
        {
          gq localgq = fq.b(localsz, bool2);
          if (localgq != null)
            bool1 = true;
          g5.b(bool1);
          if (localgq.a)
          {
            if (localgq.b)
            {
              Message localMessage13 = Message.obtain(fq.F(), 4, paramMessage.arg1, paramMessage.arg2, localsz);
              fq.F().sendMessage(localMessage13);
              if (i == 0);
            }
            else
            {
              Message localMessage12 = Message.obtain(fq.F(), 5, paramMessage.arg1, paramMessage.arg2, localsz);
              fq.F().sendMessage(localMessage12);
              if (i == 0);
            }
          }
          else if (localgq.c)
          {
            Message localMessage11 = Message.obtain(fq.F(), 3, localsz);
            fq.F().sendMessage(localMessage11);
          }
          if (i == 0)
            break;
          fq.i(localsz);
          if ((i == 0) || (!fq.e(localsz, paramMessage.arg1)))
            break;
          Message localMessage10 = Message.obtain(fq.G(), 2, paramMessage.arg1, paramMessage.arg2, localsz);
          fq.G().sendMessage(localMessage10);
          if (i == 0)
            break;
          String str4 = localsz.b.a;
          Message localMessage8 = Message.obtain(fq.H(), 1, str4);
          fq.H().sendMessage(localMessage8);
          fq.a(this.a.b, localsz);
          Message localMessage9 = Message.obtain(fq.H(), 2, str4);
          fq.H().sendMessage(localMessage9);
          if (i == 0)
            break;
          String str3 = localsz.b.a;
          fq.a(this.a.b);
          Message localMessage7 = Message.obtain(fq.H(), 2, str3);
          fq.H().sendMessage(localMessage7);
          if (i == 0)
            break;
          String str2 = (String)paramMessage.obj;
          Message localMessage5 = Message.obtain(fq.H(), 1, str2);
          fq.H().sendMessage(localMessage5);
          if (fq.a(this.a.b, str2))
          {
            Message localMessage6 = Message.obtain(fq.H(), 2, str2);
            fq.H().sendMessage(localMessage6);
          }
          if (i == 0)
            break;
          String str1 = (String)paramMessage.obj;
          Message localMessage3 = Message.obtain(fq.H(), 1, str1);
          fq.H().sendMessage(localMessage3);
          if (fq.b(this.a.b, str1))
          {
            Message localMessage4 = Message.obtain(fq.H(), 2, str1);
            fq.H().sendMessage(localMessage4);
          }
          if (i == 0)
            break;
          fq.b(this.a.b);
          Message localMessage2 = Message.obtain(fq.H(), 6);
          fq.H().sendMessage(localMessage2);
          if (i == 0)
            break;
          fq.c(this.a.b);
          Message localMessage1 = Message.obtain(fq.H(), 7);
          fq.H().sendMessage(localMessage1);
          break;
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        fq.y();
        throw localSQLiteDatabaseCorruptException;
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.cd
 * JD-Core Version:    0.6.1
 */