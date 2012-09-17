package com.whatsapp;

import java.io.Serializable;

public class App$Me
  implements Serializable
{
  static final long serialVersionUID = -1952119322404952662L;
  public String cc;
  public String jabber_id;
  public String number;

  App$Me(String paramString1, String paramString2)
  {
    this.cc = paramString1;
    this.number = paramString2;
    this.jabber_id = null;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.App.Me
 * JD-Core Version:    0.6.1
 */