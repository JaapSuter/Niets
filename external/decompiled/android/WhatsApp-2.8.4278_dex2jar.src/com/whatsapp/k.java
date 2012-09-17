package com.whatsapp;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

class k extends Observable<lq>
{
  private k()
  {
  }

  k(h9 paramh9)
  {
    this();
  }

  public void a(sz paramsz)
  {
    int i = yq.e;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((lq)localIterator.next()).a(paramsz);
    }
    while (i == 0);
  }

  public void a(sz paramsz, int paramInt)
  {
    int i = yq.e;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((lq)localIterator.next()).a(paramsz, paramInt);
    }
    while (i == 0);
  }

  public void a(String paramString)
  {
    int i = yq.e;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((lq)localIterator.next()).a(paramString);
    }
    while (i == 0);
  }

  public void b(sz paramsz)
  {
    int i = yq.e;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((lq)localIterator.next()).b(paramsz);
    }
    while (i == 0);
  }

  public void b(sz paramsz, int paramInt)
  {
    int i = yq.e;
    Iterator localIterator = this.mObservers.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      ((lq)localIterator.next()).b(paramsz, paramInt);
    }
    while (i == 0);
  }
}