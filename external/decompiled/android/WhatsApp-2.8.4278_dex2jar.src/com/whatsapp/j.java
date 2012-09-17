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