package com.whatsapp;

class xr
{
  String a;
  String b;
  yr c;

  public xr(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramString1;
    this.c = new yr(paramString2, paramString3);
    this.b = paramString4;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (paramObject == null);
    while (true)
    {
      return bool;
      if (this.c.hashCode() == ((xr)paramObject).c.hashCode())
        bool = true;
    }
  }

  public int hashCode()
  {
    return this.c.hashCode();
  }

  public String toString()
  {
    return this.c.a;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xr
 * JD-Core Version:    0.6.1
 */