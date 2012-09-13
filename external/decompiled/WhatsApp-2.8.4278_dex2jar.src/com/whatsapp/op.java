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