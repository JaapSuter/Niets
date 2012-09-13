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