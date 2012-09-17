package com.whatsapp;

final class op
{
  public final String a;
  public final String b;

  public op(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null))
      throw new NullPointerException();
    this.a = paramString1;
    this.b = paramString2;
  }

  public String toString()
  {
    return this.a + " " + this.b;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.op
 * JD-Core Version:    0.6.1
 */