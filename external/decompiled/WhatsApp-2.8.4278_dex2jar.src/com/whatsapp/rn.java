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