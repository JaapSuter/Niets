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