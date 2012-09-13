package com.whatsapp;

public class yr
{
  String a;
  String b;

  public yr(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (paramObject == null);
    while (true)
    {
      return bool;
      if (hashCode() == paramObject.hashCode())
        bool = true;
    }
  }

  public int hashCode()
  {
    return this.a.hashCode() + this.b.hashCode();
  }

  public String toString()
  {
    return this.a + "-" + this.b;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.yr
 * JD-Core Version:    0.6.1
 */