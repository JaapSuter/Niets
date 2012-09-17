package com.whatsapp;

public class rn
{
  public String a;
  public int b;
  public String c;

  public rn(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }

  public rn(String paramString1, int paramInt, String paramString2)
  {
    this(paramString1, paramInt);
    this.c = paramString2;
  }

  public String toString()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.rn
 * JD-Core Version:    0.6.1
 */