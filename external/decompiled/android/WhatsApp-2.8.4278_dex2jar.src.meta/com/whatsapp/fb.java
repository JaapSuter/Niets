package com.whatsapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

class fb extends AsyncTask<Void, Void, Void>
{
  final m a;

  fb(m paramm)
  {
  }

  protected Void a(Void[] paramArrayOfVoid)
  {
    int i = yq.e;
    Cursor localCursor = m.a(this.a).rawQuery(xq.l, null);
    if (localCursor != null);
    try
    {
      do
      {
        if (!localCursor.moveToNext())
          break;
        zq localzq = new zq(localCursor);
        if ((!localzq.o()) && (!localzq.p()) && (localzq.g != null))
        {
          localzq.c();
          App.w.c(localzq, null);
        }
      }
      while (i == 0);
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }

  protected void a(Void paramVoid)
  {
    App.m();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.fb
 * JD-Core Version:    0.6.1
 */