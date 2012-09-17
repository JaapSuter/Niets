package com.whatsapp;

public class bg extends Exception
{
  String a;

  public bg()
  {
  }

  public bg(String paramString)
  {
    super(paramString);
  }

  public bg(String paramString1, String paramString2)
  {
    super(paramString1);
    this.a = paramString2;
  }

  public String a()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.bg
 * JD-Core Version:    0.6.1
 */