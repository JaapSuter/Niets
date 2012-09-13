package com.whatsapp;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

public class j extends Observable<hq>
{
  public void a(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((hq)localIterator.next()).a(paramString);
    }
    while (!bool);
  }

  public void b(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((hq)localIterator.next()).b(paramString);
    }
    while (!bool);
  }

  public void c(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((hq)localIterator.next()).c(paramString);
    }
    while (!bool);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.j
 * JD-Core Version:    0.6.1
 */