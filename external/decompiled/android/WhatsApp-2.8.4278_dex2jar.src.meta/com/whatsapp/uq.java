package com.whatsapp;

public class uq
{
  final long a;
  final String b;

  public uq(long paramLong, String paramString)
  {
    this.a = paramLong;
    this.b = paramString;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    uq localuq = (uq)paramObject;
    if (localuq == null);
    while (true)
    {
      return bool;
      if (((this.b == null) || (localuq.b != null)) && ((this.b != null) || (localuq.b == null)))
        if ((this.a == localuq.a) && (this.b == null) && (localuq.b == null))
          bool = true;
        else if (hashCode() == localuq.hashCode())
          bool = true;
    }
  }

  public int hashCode()
  {
    return toString().hashCode();
  }

  public String toString()
  {
    return this.a + ":" + this.b;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.uq
 * JD-Core Version:    0.6.1
 */