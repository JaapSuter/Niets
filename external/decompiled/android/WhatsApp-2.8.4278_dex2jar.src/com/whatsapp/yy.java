package com.whatsapp;

import java.util.HashMap;

public class yy
{
  private HashMap<String, az> a = new HashMap();

  public long a(String paramString)
  {
    az localaz = (az)this.a.get(paramString);
    if (localaz == null);
    for (long l = 0L; ; l = localaz.b)
      return l;
  }

  public void a()
  {
    this.a.clear();
  }

  public void a(String paramString, long paramLong)
  {
    az localaz = (az)this.a.get(paramString);
    if (localaz == null)
    {
      localaz = new az(this, null);
      this.a.put(paramString, localaz);
    }
    localaz.b = paramLong;
    localaz.c = 0L;
  }

  public void a(String paramString, boolean paramBoolean)
  {
    az localaz1 = (az)this.a.get(paramString);
    az localaz2;
    if (localaz1 == null)
    {
      localaz2 = new az(this, null);
      this.a.put(paramString, localaz2);
    }
    for (az localaz3 = localaz2; ; localaz3 = localaz1)
    {
      if (paramBoolean);
      for (long l = 1L; ; l = System.currentTimeMillis())
      {
        localaz3.b = l;
        return;
      }
    }
  }

  public void b(String paramString, boolean paramBoolean)
  {
    az localaz = (az)this.a.get(paramString);
    if (localaz == null)
    {
      localaz = new az(this, null);
      this.a.put(paramString, localaz);
    }
    if (paramBoolean)
    {
      localaz.c = System.currentTimeMillis();
      if (!DialogToastListActivity.f);
    }
    else
    {
      localaz.c = 0L;
    }
  }

  public boolean b(String paramString)
  {
    az localaz = (az)this.a.get(paramString);
    boolean bool;
    if (localaz == null)
      bool = false;
    while (true)
    {
      return bool;
      if (localaz.b == 1L)
        bool = true;
      else
        bool = false;
    }
  }

  public void c(String paramString, boolean paramBoolean)
  {
    az localaz = (az)this.a.get(paramString);
    if (localaz == null)
      localaz = new az(this, null);
    localaz.a = paramBoolean;
  }

  public boolean c(String paramString)
  {
    az localaz = (az)this.a.get(paramString);
    boolean bool;
    if (localaz == null)
      bool = false;
    while (true)
    {
      return bool;
      if ((localaz.c != 0L) && (60000L + localaz.c > System.currentTimeMillis()))
        bool = true;
      else
        bool = false;
    }
  }

  public boolean d(String paramString)
  {
    az localaz = (az)this.a.get(paramString);
    if (localaz == null);
    for (boolean bool = false; ; bool = localaz.a)
      return bool;
  }
}