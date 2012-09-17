package com.whatsapp;

import java.util.HashMap;

public class c5<E>
{
  private HashMap<E, Long> a;
  private long b;

  public c5(long paramLong)
  {
    this.b = paramLong;
    this.a = new HashMap();
  }

  public void a()
  {
    try
    {
      this.a.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean a(E paramE)
  {
    try
    {
      Long localLong = (Long)this.a.get(paramE);
      if (localLong != null)
      {
        long l1 = localLong.longValue() + this.b;
        long l2 = System.currentTimeMillis();
        if (l1 <= l2);
      }
      for (boolean bool = false; ; bool = true)
      {
        return bool;
        this.a.put(paramE, Long.valueOf(System.currentTimeMillis()));
      }
    }
    finally
    {
    }
  }

  public boolean b()
  {
    try
    {
      boolean bool = this.a.isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean b(E paramE)
  {
    try
    {
      Object localObject2 = this.a.remove(paramE);
      if (localObject2 != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }
}