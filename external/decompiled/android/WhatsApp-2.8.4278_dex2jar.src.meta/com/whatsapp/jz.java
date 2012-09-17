package com.whatsapp;

import java.security.MessageDigest;

public class jz
  implements i1
{
  MessageDigest a;

  public jz(MessageDigest paramMessageDigest)
  {
    this.a = paramMessageDigest;
  }

  public void a()
  {
    this.a.reset();
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.a.update(paramArrayOfByte);
  }

  public byte[] b()
  {
    return this.a.digest();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.jz
 * JD-Core Version:    0.6.1
 */