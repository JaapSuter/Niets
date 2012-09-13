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