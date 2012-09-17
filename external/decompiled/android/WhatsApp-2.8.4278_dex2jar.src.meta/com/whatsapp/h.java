package com.whatsapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabaseCorruptException;

class h extends CursorWrapper
{
  private sq a;

  public h(Cursor paramCursor, sq paramsq)
  {
    super(paramCursor);
    this.a = paramsq;
  }

  public void deactivate()
  {
    super.deactivate();
  }

  public int getCount()
  {
    try
    {
      int i = super.getCount();
      return i;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      fq.y();
      throw localSQLiteDatabaseCorruptException;
    }
  }

  public boolean requery()
  {
    if (this.a != null)
      this.a.a();
    Boolean localBoolean = Boolean.valueOf(super.requery());
    if (this.a != null)
      this.a.b();
    return localBoolean.booleanValue();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.h
 * JD-Core Version:    0.6.1
 */